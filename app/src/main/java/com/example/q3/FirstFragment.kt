package com.example.q3
package com.example.myapp
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.fragment.app.Fragment
class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val spinnerOptions: Spinner = view.findViewById(R.id.spinnerOptions)
        val buttonSendFirstFragment: Button =
            view.findViewById(R.id.buttonSendFirstFragment)
        val options = arrayOf("Option 1", "Option 2", "Option 3")
        val adapter = ArrayAdapter(requireContext(),
            android.R.layout.simple_spinner_item, options)
        spinnerOptions.adapter = adapter
        buttonSendFirstFragment.setOnClickListener {
            val selectedOption = spinnerOptions.selectedItem.toString()
            val activity = activity as? MainActivity
            activity?.onFragmentResult("FirstActivityResult", selectedOption)
        }
    }
}
