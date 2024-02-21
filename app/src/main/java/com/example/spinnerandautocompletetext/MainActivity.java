package com.example.spinnerandautocompletetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    AutoCompleteTextView actxtView;
    ArrayList<String> language = new ArrayList<>();
    ArrayList<String> cities = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);

        //spinner
        cities.add("Solan");
        cities.add("Shimla");
        cities.add("Kullu");
        cities.add("Mandi");
        cities.add("Sirmaur");
        cities.add("Kandaghat");
        cities.add("Waknaghat");
        cities.add("Dharmpur");
        cities.add("Shoghi");
        // passing three arguments first context, second layout for view , 3rd Array object
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, cities);
        spinner.setAdapter(spinnerAdapter);

        //Auto Complete Text view
        language.add("C");
        language.add("C++");
        language.add("C#");
        language.add("Java");
        language.add("Python");
        language.add("PHP");
        language.add("JavaScript");
        language.add("Kotlin");
        language.add("Flutter");
        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, language);
        actxtView.setAdapter(actvAdapter);
        // threshold is use to after how many letter words suggested
        // so here after one character simmilar words suggested
        actxtView.setThreshold(1);

    }
}