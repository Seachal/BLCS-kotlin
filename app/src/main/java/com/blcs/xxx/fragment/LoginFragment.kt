package com.blcs.xxx.fragment

import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.blcs.common.Base.BaseFragment
import com.blcs.xxx.R
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : BaseFragment(), View.OnClickListener {
    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btn_to_register ->  findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }

    override fun setLayout() = R.layout.fragment_login

    override fun initUI() {
        btn_to_register.setOnClickListener(this)
    }

}