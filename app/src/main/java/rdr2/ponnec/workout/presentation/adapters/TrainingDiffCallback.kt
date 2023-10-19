package rdr2.ponnec.workout.presentation.adapters

import androidx.recyclerview.widget.DiffUtil
import rdr2.ponnec.workout.presentation.models.TrainingModel

class TrainingDiffCallback : DiffUtil.ItemCallback<TrainingModel>() {
    override fun areItemsTheSame(oldItem: TrainingModel, newItem: TrainingModel): Boolean {
        return oldItem.description == newItem.description
    }

    override fun areContentsTheSame(oldItem: TrainingModel, newItem: TrainingModel): Boolean {
        return oldItem == newItem
    }
}
