package com.example.prescription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        // Access Intent and get detail message to put returnPrescriptionMessage()'s info into
        Intent intent = getIntent();
//        intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message = "Hello, " + returnPrescriptionMessage();
        TextView textView = findViewById(R.id.detailMessage);
        textView.setText(message);
    }

    private String returnPrescriptionMessage() {
        // Code from 3/24/20 at 4:20 p.m.
//        EditText firstName = (EditText) findViewById(R.id.firstName);
////        String first = firstName.getText().toString();
//        String selectedPharmacy = getString(R.string.pharmacy);
//        String selectedPrescription = getString(R.string.prescriptions);
//        String selectedDate = getString(R.string.datepicker);
//        String selectedTime = getString(R.string.time_display);
//        String detailMessage = (firstName + " your prescription " + selectedPrescription + " will be ready at "
//                + selectedPharmacy + " on " + selectedDate + " at " + selectedTime);
//        return detailMessage;

        // Code from 3/24/20 at 11:04 a.m. and updated
        //EditText firstName = (EditText) findViewById(R.id.firstName);

        String first = getString(R.string.firstName);

        //String first = (String) firstName.getText().toString();

        // Get selected item from Pharmacy Spinner
        Spinner pharmacySpinner = (Spinner) findViewById(R.id.pharmacySpinner);
        String selectedPharmacy = pharmacySpinner.getSelectedItem().toString();
        Spinner prescriptionSpinner = (Spinner) findViewById(R.id.prescriptionSpinner);
        String selectedPrescription = prescriptionSpinner.getSelectedItem().toString();
        TextView dateTextView = findViewById(R.id.selectedDate);
        String selectedDate = dateTextView.getText().toString();
        TextView timeTextView = findViewById(R.id.selectedTime);
        String selectedTime = timeTextView.getText().toString();
        String detailMessage = selectedPharmacy;
        return detailMessage;

        // What should be displayed
//        String detailMessage = first + " your prescription: " + selectedPrescription + " will be ready at "
//                + selectedPharmacy + " on " + selectedDate + " at " + selectedTime;
//        return detailMessage;
    }
}