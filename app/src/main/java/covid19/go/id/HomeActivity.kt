package covid19.go.id

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bt1.setOnClickListener {view ->
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
        }
    }
}
