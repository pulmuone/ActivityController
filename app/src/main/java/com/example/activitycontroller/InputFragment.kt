package com.example.activitycontroller

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.activitycontroller.databinding.FragmentInputBinding

class InputFragment : Fragment() {
    private var _binding : FragmentInputBinding?= null
    public val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInputBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.inputButton.setOnClickListener {
            val mainActivity = activity as MainActivity

            mainActivity.value1 = binding.inputEdit1.text.toString()
            mainActivity.value2 = binding.inputEdit2.text.toString()

//            mainActivity.resultFragment.binding.resultText1.text = binding.inputEdit1.text.toString()
//            mainActivity.resultFragment.binding.resultText2.text = binding.inputEdit2.text.toString()

            mainActivity.setFragment("result")
        }
    }

    override fun onResume() {
        super.onResume()

        binding.inputEdit1.setText("")
        binding.inputEdit2.setText("")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.d("test", "onDestroyView")
    }
}