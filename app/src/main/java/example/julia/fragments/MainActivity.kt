package example.julia.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

lateinit var bottomNavigationMenu: BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)

        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.fragment_1 -> {
                    fragment = FirstFragment()

                }
                R.id.fragment_2 -> {
                    fragment = SecondFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }
        bottomNavigationMenu.selectedItemId = R.id.fragment_1


    fun replaceFragment(fragment: Fragment) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()

        }

    }

    private fun replaceFragment(fragment: Fragment) {

    }


}






