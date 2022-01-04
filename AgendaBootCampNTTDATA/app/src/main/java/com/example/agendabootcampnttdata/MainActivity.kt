package com.example.agendabootcampnttdata


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.Attendees
import android.provider.CalendarContract.Events.*
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textview.MaterialTextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private val edtName: TextInputEditText by lazy {
        findViewById(R.id.edtName)
    }
    private val edtLocation: TextInputEditText by lazy {
        findViewById(R.id.edtLocation)
    }
    private val edtDescription: TextInputEditText by lazy {
        findViewById(R.id.edtDescription)
    }
    private val btnSetEvent: MaterialButton by lazy {
        findViewById(R.id.btnSetEvent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSetEvent.setOnClickListener {

            if (!(edtName.text.isNullOrEmpty() && edtLocation.text.isNullOrEmpty() && edtDescription.text.isNullOrEmpty())) {

                val intent = Intent(Intent.ACTION_INSERT)
                    .setData(CONTENT_URI)
                    .putExtra(TITLE, edtName.text.toString())
                    .putExtra(EVENT_LOCATION, edtLocation.text.toString())
                    .putExtra(DESCRIPTION, edtDescription.text.toString())
                    .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, System.currentTimeMillis())
                    .putExtra(
                        CalendarContract.EXTRA_EVENT_END_TIME,
                        System.currentTimeMillis() + (60 * 60 * 1000)
                    )
                startActivity(intent)

            } else {
                Toast.makeText(this, "Preencha os campos acima", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


