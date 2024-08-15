package com.example.q3
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editTextInput: EditText = view.findViewById(R.id.editTextInput)
        val buttonSendSecondFragment: Button =
            view.findViewById(R.id.buttonSendSecondFragment)
        buttonSendSecondFragment.setOnClickListener {
            val inputText = editTextInput.text.toString()
            val activity = activity as? MainActivity
            activity?.onFragmentResult("SecondActivityResult", inputText)
        }
    }
}