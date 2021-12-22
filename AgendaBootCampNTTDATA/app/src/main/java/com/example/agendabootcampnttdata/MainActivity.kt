package com.example.agendabootcampnttdata


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.provider.CalendarContract.Events.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSetEvent = findViewById<Button>(R.id.btnSetEvent)
        btnSetEvent.setOnClickListener {

            val intent = Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI)
                .putExtra(TITLE, "Bootcamp everis")
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

