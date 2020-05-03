package arb.test.toggle.button

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton.setOnClickListener {
            if (toggleButton.isChecked) main.setBackgroundColor(Color.DKGRAY)
            else main.setBackgroundColor(Color.WHITE)
        }
    }
}
