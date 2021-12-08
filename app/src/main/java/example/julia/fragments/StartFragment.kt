package example.julia.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class StartFragment : Fragment() {

    lateinit var showToastButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        showToastButton=view.findViewById(R.id.show_toast_button)

        showToastButton.setOnClickListener {
            Toast.makeText(context, "Hello", Toast.LENGTH_LONG).show()
        }



        return view
    }

}




