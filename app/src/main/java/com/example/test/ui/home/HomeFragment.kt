package com.example.test.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.test.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    val array = arrayOf("Доллар -> Рубль = 1:100", "Евро -> Рубль = 1:105", "Рубль -> Доллар = 100:1")
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val adapter = this.context?.let { ArrayAdapter<String>(it,android.R.layout.simple_list_item_1,array) }
        binding.listvalue.adapter = adapter
        //val adapter = this.context?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, array) }
        //binding.listvalue.adapter = adapter



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}