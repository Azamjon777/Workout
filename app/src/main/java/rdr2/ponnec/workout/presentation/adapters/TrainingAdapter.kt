package rdr2.ponnec.workout.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import rdr2.ponnec.workout.databinding.TrainingItemLayoutBinding
import rdr2.ponnec.workout.presentation.models.TrainingModel

class TrainingAdapter :
    ListAdapter<TrainingModel, TrainingAdapter.ViewHolder>(TrainingModelDiffCallback()) {

    private var onItemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(training: TrainingModel)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            TrainingItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val training = getItem(position)

        if (training.images.isNotEmpty()) {
            holder.binding.trainingImageView.setImageResource(training.images[0])
        }

        holder.binding.bodyPartsTextView.text = training.bodyParts

        holder.itemView.setOnClickListener {
            val position = holder.adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                onItemClickListener?.onItemClick(training)
            }
        }
    }

    inner class ViewHolder(val binding: TrainingItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)
}
