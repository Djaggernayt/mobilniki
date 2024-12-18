package com.example.test

import android.app.DatePickerDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import java.util.Calendar


class Registration : AppCompatActivity() {

    var sex: Array<String> = arrayOf("Мужской", "Женский")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        var spin = findViewById<Spinner>(R.id.spinner)
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sex)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spin.setAdapter(adapter)


    }
    fun ClickDate(view: View)
    {
        var dates = findViewById<EditText>(R.id.enter_birthday)
        val newFragment = DatePickerFragment()
        newFragment.show(supportFragmentManager, "datePicker")
        dates.hint = Date.day+ ". " + Date.month+ ". " + Date.year
    }
    class DatePickerFragment : DialogFragment(), DatePickerDialog.OnDateSetListener {

        var year = 0
        var month = 0
        var day = 0
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

            val c = Calendar.getInstance()
            year = c.get(Calendar.YEAR)
            month = c.get(Calendar.MONTH)
            day = c.get(Calendar.DAY_OF_MONTH)


            return DatePickerDialog(requireContext(), this, year, month, day)

        }

        override fun onStop() {
            super.onStop()
        }
        override fun onCancel(dialog: DialogInterface) {

            super.onCancel(dialog)

        }

        override fun onDateSet(view: DatePicker, year: Int, month: Int, day: Int) {
            val c = Calendar.getInstance()
            Date.year = c.get(Calendar.YEAR).toString()
            Date.month = c.get(Calendar.MONTH).toString()
            Date.day = c.get(Calendar.DAY_OF_MONTH).toString()
        }
    }
    object Date{
        var year = ""
        var month = ""
        var day = ""
    }

}