package rdr2.ponnec.workout.presentation.models

import java.io.Serializable

data class TrainingModel(
    val bodyParts: String,
    val equipment: String,
    val images: List<Int>,
    val description: String
) : Serializable
