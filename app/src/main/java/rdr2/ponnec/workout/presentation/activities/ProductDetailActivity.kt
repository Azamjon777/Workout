package rdr2.ponnec.workout.presentation.activities

import android.app.Dialog
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import rdr2.ponnec.workout.R
import rdr2.ponnec.workout.databinding.ActivityProductDetailBinding
import rdr2.ponnec.workout.presentation.models.TrainingModel

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent

        if (intent.hasExtra("item")) {
            val trainingModel = intent.getSerializableExtra("item") as TrainingModel

            binding.img1.setImageResource(trainingModel.images[0])
            binding.img2.setImageResource(trainingModel.images[1])
            binding.img3.setImageResource(trainingModel.images[2])
            binding.img4.setImageResource(trainingModel.images[3])

            binding.tvBodyPart.text = trainingModel.bodyParts
            binding.tvEquipment.text = trainingModel.equipment
            binding.tvDesc.text = trainingModel.description

            binding.back.setOnClickListener {
                finish()
            }
            binding.img1.setOnClickListener {
                openImageDialog(trainingModel.images[0])
            }

            binding.img2.setOnClickListener {
                openImageDialog(trainingModel.images[1])
            }

            binding.img3.setOnClickListener {
                openImageDialog(trainingModel.images[2])
            }

            binding.img4.setOnClickListener {
                openImageDialog(trainingModel.images[3])
            }
        }
    }
    private fun openImageDialog(imageResId: Int) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.dialog_image)

        val imageView = dialog.findViewById<ImageView>(R.id.dialogImageView)
        imageView.setImageResource(imageResId)

        imageView.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}