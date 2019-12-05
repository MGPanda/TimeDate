package com.example.timedate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void time(View view) {
        DialogFragment df = new TimePickerFragment();
        df.show(getSupportFragmentManager(), "timePicker");
    }
    public void date(View view) {
        DialogFragment df = new DatePickerFragment();
        df.show(getSupportFragmentManager(), "datePicker");
    }
}
