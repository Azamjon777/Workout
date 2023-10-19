package rdr2.ponnec.workout.presentation.fragments

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import rdr2.ponnec.workout.databinding.FragmentAllCategoriesBinding
import rdr2.ponnec.workout.presentation.activities.ProductDetailActivity
import rdr2.ponnec.workout.presentation.adapters.TrainingVerticalAdapter
import rdr2.ponnec.workout.presentation.models.TrainingModel
import rdr2.ponnec.workout.viewmodel.TrainingViewModel
import rdr2.ponnec.workout.viewmodel.TrainingViewModelFactory

class AllCategoriesFragment : Fragment() {
    private lateinit var binding: FragmentAllCategoriesBinding
    private lateinit var viewModel: TrainingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            TrainingViewModelFactory(requireContext())
        )[TrainingViewModel::class.java]

        val verticalAdapter = TrainingVerticalAdapter()
        val trainingList = viewModel.getTrainingList()
        verticalAdapter.setOnItemClickListener(object :
            TrainingVerticalAdapter.OnItemClickListener {
            override fun onItemClick(training: TrainingModel) {
            }
        })

        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerView.adapter = verticalAdapter

        verticalAdapter.submitList(trainingList)
        verticalAdapter.setOnItemClickListener(object :
            TrainingVerticalAdapter.OnItemClickListener {
            override fun onItemClick(training: TrainingModel) {
                openDetailActivity(training)
            }
        })
        val searchEditText = binding.editTextSearch

        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val searchText = s.toString().trim()
                val filteredList = filterList(trainingList, searchText)
                verticalAdapter.submitList(filteredList)
            }
        })
        binding.back.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    private fun openDetailActivity(training: TrainingModel) {
        val intent = Intent(requireActivity(), ProductDetailActivity::class.java)
        intent.putExtra("item", training)
        startActivity(intent)
    }

    private fun filterList(
        originalList: List<TrainingModel>,
        searchText: String
    ): List<TrainingModel> {
        return originalList.filter { training ->
            training.bodyParts.contains(searchText, ignoreCase = true) ||
                    training.equipment.contains(searchText, ignoreCase = true)
        }
    }
}