package pub.gll.testmaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import pub.gll.gtoollib.ext.gone

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.mTV).gone()
    }
}