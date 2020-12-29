package com.example.activitycontroller

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.activitycontroller.databinding.FragmentInputBinding
import com.example.activitycontroller.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    private var _binding : FragmentResultBinding?= null
    public val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(inflater, container, false)

        return binding.root

        //return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainActivity = activity as MainActivity
        binding.resultText1.text = mainActivity.value1
        binding.resultText2.text = mainActivity.value2
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.d("test", "onDestroyView")
    }
}