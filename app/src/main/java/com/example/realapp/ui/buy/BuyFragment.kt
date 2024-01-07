package com.example.realapp.ui.buy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.realapp.databinding.FragmentBuyBinding

class BuyFragment : Fragment() {

    private var _binding: FragmentBuyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val buyViewModel =
            ViewModelProvider(this).get(BuyViewModel::class.java)

        _binding = FragmentBuyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBuy
        buyViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    class BuyViewModal {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}