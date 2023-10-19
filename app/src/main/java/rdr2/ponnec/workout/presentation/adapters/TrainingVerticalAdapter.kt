package rdr2.ponnec.workout.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import rdr2.ponnec.workout.databinding.TrainingItemLayoutSmallBinding
import rdr2.ponnec.workout.presentation.models.TrainingModel

class TrainingVerticalAdapter :
    ListAdapter<TrainingModel, TrainingVerticalAdapter.TrainingViewHolder>(TrainingModelDiffCallback()) {

    private var onItemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(training: TrainingModel)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        onItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainingViewHolder {
        val binding = TrainingItemLayoutSmallBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TrainingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TrainingViewHolder, position: Int) {
        val training = getItem(position)
        holder.bind(training)

        holder.itemView.setOnClickListener {
            val position = holder.adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                onItemClickListener?.onItemClick(training)
            }
        }
    }

    inner class TrainingViewHolder(private val binding: TrainingItemLayoutSmallBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(training: TrainingModel) {
            binding.bodyPartsTextViewSmall.text = training.bodyParts
            binding.equipmentTextViewSmall.text = training.equipment

            if (training.images.isNotEmpty()) {
                val imageResource = training.images[0]
                binding.trainingImageViewSmall.setImageResource(imageResource)
            }
        }
    }
}
