package example.julia.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var switchFragmentButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchFragmentButton = findViewById(R.id.switch_fragments_button)


        val startFragment = StartFragment()
        val endFragment = EndFragment()

        switchFragmentButton.setOnClickListener {
            val fragment =
                when (supportFragmentManager.findFragmentById(R.id.fragment_container)) {
                    is StartFragment -> endFragment
                    is EndFragment -> startFragment
                    else -> startFragment
                }

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }



    }




}

