package app.bo.com.ucb.exampleactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener {
//            val intent  = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}