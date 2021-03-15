package tw.edu.pu.o1083029.hello2021gege

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv: TextView =findViewById<TextView>(R.id.txv)
        txv.text = "Hello Athena"
    }
}