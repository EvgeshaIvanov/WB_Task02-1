
package com.example.secondweeklifecycleapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.secondweeklifecycleapp.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("MyTag", "First fragment - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MyTag", "First fragment - onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(
            inflater,
            container,
            false
        )
        Log.i("MyTag", "First fragment - onCreateView")
        return binding.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("MyTag", "First fragment - onViewCreated")
        binding.changeButton.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.first_fragment_container, SecondFragment())?.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTag", "First fragment - onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag", "First fragment - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag", "First fragment - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag", "First fragment - onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("MyTag", "First fragment - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag", "First fragment - onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("MyTag", "First fragment - onDetach")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("MyTag", "First fragment - onSaveInstanceState")
    }

}