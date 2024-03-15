package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

String Currency;
    public void ConverttoRupees(View view)
    {
        EditText editText = findViewById(R.id.editTextNumber);
        Double dollerAmount = Double.parseDouble(editText.getText().toString());
        Double Rupees = dollerAmount*82.88;
        Toast.makeText(this, Rupees+" Rupees", Toast.LENGTH_SHORT).show();
     //   Log.i("DollerField",editText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}