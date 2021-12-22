package com.example.agendabootcampnttdata


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.Events.*
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var btnSetEvent = findViewById<MaterialButton>(R.id.btnSetEvent)
    var edtName = findViewById<MaterialTextView>(R.id.edtName)
    var edtLocation = findViewById<MaterialTextView>(R.id.edtLocation)
    var edtDescription = findViewById<MaterialTextView>(R.id.edtDescription)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addEvent()

    }

    private fun addEvent() {
        btnSetEvent.setOnClickListener {

            val intent = Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI)
                .putExtra(TITLE,"Luiz Gonzaga")
                .putExtra(EVENT_LOCATION, "ONLINE")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, System.currentTimeMillis())
                .putExtra(
                    CalendarContract.EXTRA_EVENT_END_TIME,
                    System.currentTimeMillis() + (60 * 60 * 1000)
                )
            startActivity(intent)
        }
    }

}


