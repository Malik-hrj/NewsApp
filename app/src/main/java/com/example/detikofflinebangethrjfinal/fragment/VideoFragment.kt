package com.example.detikofflinebangethrjfinal.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.detikofflinebangethrjfinal.R

/**
 * A simple [Fragment] subclass.
 */
class VideoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_video, container, false)
        return view
    }
    fun newInstance(): VideoFragment {
        val fragment = VideoFragment()
        return fragment
    }

}
