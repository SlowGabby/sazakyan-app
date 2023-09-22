package com.example.sazakyanapp
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    private lateinit var Binding : FragmentSignupBinding
    private lateinit var userName : EditText
    private lateinit var passWord : EditText
    private lateinit var checkPassword : EditText
    private lateinit var confirmBtn : Button
    private lateinit var db : DBHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        userName.findViewById<EditText>(R.id.etName)
        passWord.findViewById<EditText>(R.id.etPassword)
        checkPassword.findViewById<EditText>(R.id.etConPassword)
        confirmBtn.findViewById<Button>(R.id.confirmBtn)
        db = DBHelper(this)

        confirmBtn.setOnClickListener {

            val userNameText = userName.text.toString()
            val passWordText = passWord.text.toString()
            val checkPassword = checkPassword.text.toString()
            val saveData = db.insertData(userNameText, passWordText)

            if (TextUtils.isEmpty(userNameText) || TextUtils.isEmpty(passWordText) || TextUtils.isEmpty(checkPassword)) {

                Toast.makeText(SignupFragment().context, "Add Username, Password and Check Password", Toast.LENGTH_SHORT).show()

            } else {

                if (passWordText.equals(checkPassword)) {
                    if (saveData == true) {
                        Toast.makeText(SignupFragment().context, "Signup Successfully", Toast.LENGTH_SHORT).show()
                        findNavController().navigate(SignupFragmentDirections.actionSignupFragmentToCarsFragment())
                    } else {
                        Toast.makeText(SignupFragment().context, "User Exists", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(SignupFragment().context, "Password not matched", Toast.LENGTH_SHORT).show()
                }
            }

        }


        Binding = FragmentSignupBinding.inflate(inflater, container, false)

        Binding.confirmBtn.setOnClickListener {

            findNavController().navigate(SignupFragmentDirections.actionSignupFragmentToCarsFragment())

        }

        return Binding.root

    }

}