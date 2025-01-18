package com.a24639_a25269.notas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.a24639_a25269.notas.databinding.FragmentLoginBinding
import com.a24639_a25269.notas.databinding.FragmentRegisterBinding


class LoginFragment : Fragment() {


    private var _binding: FragmentLoginBinding? = null
    private  val binging get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding =  FragmentLoginBinding.inflate(inflater, container, false)
        return binging.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }


}