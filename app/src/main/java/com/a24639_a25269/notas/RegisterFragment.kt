package com.a24639_a25269.notas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.a24639_a25269.notas.databinding.FragmentRegisterBinding
import com.a24639_a25269.notas.models.UserRequest
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : Fragment() {


    private var _binding: FragmentRegisterBinding? = null
    private val binging get() = _binding!!
    private val authViewModel by viewModels<AuthViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        binging.btnSignUp.setOnClickListener{

            authViewModel.registerUser(UserRequest("test@gmail.com", "1234","admin") )
            //findNavController().navigate(R.id.action_registerFragment_to_mainFragment2)
        }
        binging.btnLogin.setOnClickListener {
           findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
        return binging.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
 }

}