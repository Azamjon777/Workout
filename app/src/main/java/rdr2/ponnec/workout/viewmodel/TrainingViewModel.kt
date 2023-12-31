package rdr2.ponnec.workout.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import rdr2.ponnec.workout.R
import rdr2.ponnec.workout.presentation.models.TrainingModel

class TrainingViewModel(private val context: Context) : ViewModel() {
    private val trainingList: List<TrainingModel> = createChestWorkouts()

    fun getTrainingList(): List<TrainingModel> {
        return trainingList
    }

    private fun createChestWorkouts(): List<TrainingModel> {
        return listOf(
            TrainingModel(
                context.getString(R.string.chest_dumbbell_press),
                context.getString(R.string.dumbbells),
                listOf(
                    R.drawable.chest_dumbbell_1,
                    R.drawable.chest_dumbbell_2,
                    R.drawable.chest_dumbbell_3,
                    R.drawable.chest_dumbbell_4
                ),
                context.getString(R.string.desc1)
            ),
            TrainingModel(
                context.getString(R.string.chest_barbell_bench_press),
                context.getString(R.string.barbell),
                listOf(
                    R.drawable.chest_barbell_1,
                    R.drawable.chest_barbell_2,
                    R.drawable.chest_barbell_3,
                    R.drawable.chest_barbell_4
                ),
                context.getString(R.string.desc2)
            ),
            TrainingModel(
                context.getString(R.string.chest_machine_press),
                context.getString(R.string.machine),
                listOf(
                    R.drawable.chest_machine_1,
                    R.drawable.chest_machine_2,
                    R.drawable.chest_machine_3,
                    R.drawable.chest_machine_4
                ),
                context.getString(R.string.desc3)
            ),
            TrainingModel(
                context.getString(R.string.crunches),
                context.getString(R.string.none),
                listOf(
                    R.drawable.chest_crunch_1,
                    R.drawable.chest_crunch_2,
                    R.drawable.chest_crunch_3,
                    R.drawable.chest_crunch_4
                ),
                context.getString(R.string.desc4)
            ),
            TrainingModel(
                context.getString(R.string.chest_band_fly_s),
                context.getString(R.string.resistance_band),
                listOf(
                    R.drawable.chest_band_1,
                    R.drawable.chest_band_2,
                    R.drawable.chest_band_3,
                    R.drawable.chest_band_4
                ),
                context.getString(R.string.desc5)
            ),
            TrainingModel(
                context.getString(R.string.dumbbell_squats),
                context.getString(R.string.dumbbells),
                listOf(
                    R.drawable.leg_dumbbell_1,
                    R.drawable.leg_dumbbell_2,
                    R.drawable.leg_dumbbell_3,
                    R.drawable.leg_dumbbell_4
                ),
                context.getString(R.string.desc6)
            ),
            TrainingModel(
                context.getString(R.string.leg_press_on_machine),
                context.getString(R.string.machine),
                listOf(
                    R.drawable.leg_press_1,
                    R.drawable.leg_press_2,
                    R.drawable.leg_press_3,
                    R.drawable.leg_press_4
                ),
                context.getString(R.string.desc7)
            ),
            TrainingModel(
                context.getString(R.string.dumbbell_lunges),
                context.getString(R.string.dumbbells),
                listOf(
                    R.drawable.leg_lunge_1,
                    R.drawable.leg_lunge_2,
                    R.drawable.leg_lunge_3,
                    R.drawable.leg_lunge_4
                ),
                context.getString(R.string.desc8)
            ),
            TrainingModel(
                context.getString(R.string.leg_extension_on_machine),
                context.getString(R.string.machine),
                listOf(
                    R.drawable.leg_extension_1,
                    R.drawable.leg_extension_2,
                    R.drawable.leg_extension_3,
                    R.drawable.leg_extension_4
                ),
                context.getString(R.string.desc9)
            ),
            TrainingModel(
                context.getString(R.string.dead_lift),
                context.getString(R.string.barbell),
                listOf(
                    R.drawable.deadlift_1,
                    R.drawable.deadlift_2,
                    R.drawable.deadlift_3,
                    R.drawable.deadlift_4
                ),
                context.getString(R.string.desc10)
            ),
            TrainingModel(
                context.getString(R.string.pull_ups),
                context.getString(R.string.bar),
                listOf(
                    R.drawable.back_pullup_1,
                    R.drawable.back_pullup_2,
                    R.drawable.back_pullup_3,
                    R.drawable.back_pullup_4
                ),
                context.getString(R.string.desc11)
            ),
            TrainingModel(
                context.getString(R.string.dead_lift),
                context.getString(R.string.barbell),
                listOf(
                    R.drawable.back_deadlift_1,
                    R.drawable.back_deadlift_2,
                    R.drawable.back_deadlift_3,
                    R.drawable.back_deadlift_4
                ),
                context.getString(R.string.desc12)
            ),
            TrainingModel(
                context.getString(R.string.lat_pull_down),
                context.getString(R.string.machine),
                listOf(
                    R.drawable.back_latpulldown_1,
                    R.drawable.back_latpulldown_2,
                    R.drawable.back_latpulldown_3,
                    R.drawable.back_latpulldown_4
                ),
                context.getString(R.string.desc13)
            ),
            TrainingModel(
                context.getString(R.string.hyper_extension),
                context.getString(R.string.machine),
                listOf(
                    R.drawable.back_hyperextension_1,
                    R.drawable.back_hyperextension_2,
                    R.drawable.back_hyperextension_3,
                    R.drawable.back_hyperextension_4
                ),
                context.getString(R.string.desc14)
            ),
            TrainingModel(
                context.getString(R.string.bent_over_barbell_row),
                context.getString(R.string.barbell),
                listOf(
                    R.drawable.back_bentoverrow_1,
                    R.drawable.back_bentoverrow_2,
                    R.drawable.back_bentoverrow_3,
                    R.drawable.back_bentoverrow_4
                ),
                context.getString(R.string.desc15)
            ), TrainingModel(
                context.getString(R.string.barbell_shoulder_press),
                context.getString(R.string.barbell),
                listOf(
                    R.drawable.shoulder_barbellpress_1,
                    R.drawable.shoulder_barbellpress_2,
                    R.drawable.shoulder_barbellpress_3,
                    R.drawable.shoulder_barbellpress_4
                ),
                context.getString(R.string.desc16)
            ),
            TrainingModel(
                context.getString(R.string.standing_dumbbell_press),
                context.getString(R.string.dumbbells),
                listOf(
                    R.drawable.shoulder_dumbbellpress_1,
                    R.drawable.shoulder_dumbbellpress_2,
                    R.drawable.shoulder_dumbbellpress_3,
                    R.drawable.shoulder_dumbbellpress_4
                ),
                context.getString(R.string.desc17)
            ),
            TrainingModel(
                context.getString(R.string.lateral_raises_with_dumbbells),
                context.getString(R.string.dumbbells),
                listOf(
                    R.drawable.shoulder_lateralraise_1,
                    R.drawable.shoulder_lateralraise_2,
                    R.drawable.shoulder_lateralraise_3,
                    R.drawable.shoulder_lateralraise_4
                ),
                context.getString(R.string.desc18)
            ),
            TrainingModel(
                context.getString(R.string.upright_rows_with_barbell),
                context.getString(R.string.barbell),
                listOf(
                    R.drawable.shoulder_uprightrow_1,
                    R.drawable.shoulder_uprightrow_2,
                    R.drawable.shoulder_uprightrow_3,
                    R.drawable.shoulder_uprightrow_4
                ),
                context.getString(R.string.desc19)
            ),
            TrainingModel(
                context.getString(R.string.dumbbell_lateral_raises),
                context.getString(R.string.dumbbells),
                listOf(
                    R.drawable.shoulder_dumbbellfly_1,
                    R.drawable.shoulder_dumbbellfly_2,
                    R.drawable.shoulder_dumbbellfly_3,
                    R.drawable.shoulder_dumbbellfly_4
                ),
                context.getString(R.string.desc20)
            ),
            TrainingModel(
                context.getString(R.string.pull_ups),
                context.getString(R.string.pull_up_bar),
                listOf(
                    R.drawable.arm_pullup_1,
                    R.drawable.arm_pullup_2,
                    R.drawable.arm_pullup_3,
                    R.drawable.arm_pullup_4
                ),
                context.getString(R.string.desc21)
            ),
            TrainingModel(
                context.getString(R.string.push_ups),
                context.getString(R.string.floor),
                listOf(
                    R.drawable.arm_pushup_1,
                    R.drawable.arm_pushup_2,
                    R.drawable.arm_pushup_3,
                    R.drawable.arm_pushup_4
                ),
                context.getString(R.string.desc22)
            ),
            TrainingModel(
                context.getString(R.string.hammer_curls),
                context.getString(R.string.dumbbells),
                listOf(
                    R.drawable.arm_hammercurls_1,
                    R.drawable.arm_hammercurls_2,
                    R.drawable.arm_hammercurls_3,
                    R.drawable.arm_hammercurls_4
                ),
                context.getString(R.string.desc23)
            ),
            TrainingModel(
                context.getString(R.string.triceps_press),
                context.getString(R.string.machine),
                listOf(
                    R.drawable.arm_tricep_1,
                    R.drawable.arm_tricep_2,
                    R.drawable.arm_tricep_3,
                    R.drawable.arm_tricep_4
                ),
                context.getString(R.string.desc24)
            ),
            TrainingModel(
                context.getString(R.string.arm_extensions),
                context.getString(R.string.machine),
                listOf(
                    R.drawable.arm_armextension_1,
                    R.drawable.arm_armextension_2,
                    R.drawable.arm_armextension_3,
                    R.drawable.arm_armextension_4
                ),
                context.getString(R.string.desc25)
            )
        )
    }
}
