package rdr2.ponnec.workout.presentation.adapters

import androidx.recyclerview.widget.DiffUtil
import rdr2.ponnec.workout.presentation.models.TrainingModel

class TrainingModelDiffCallback : DiffUtil.ItemCallback<TrainingModel>() {
    override fun areItemsTheSame(oldItem: TrainingModel, newItem: TrainingModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: TrainingModel, newItem: TrainingModel): Boolean {
        return oldItem == newItem
    }
}