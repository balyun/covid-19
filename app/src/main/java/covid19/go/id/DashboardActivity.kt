package covid19.go.id

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btn1.setOnClickListener {view ->
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {view ->
            val intent = Intent(this, GejalaActivity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {view ->
            val intent = Intent(this, PerlindunganActivity::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {view ->
            val intent = Intent(this, PencegahanActivity::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {view ->
            val intent = Intent(this, HandActivity::class.java)
            startActivity(intent)
        }
    }
}
