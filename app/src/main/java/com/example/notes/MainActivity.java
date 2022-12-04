package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button saveAge;
    private Button editAgeButton;
    private EditText editAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveAge = findViewById(R.id.saveAge);
        editAge = findViewById(R.id.editAge);

        saveAge.setOnClickListener(View -> {
            editAge.setCursorVisible(false);

            /*
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Возраст сохранен", Toast.LENGTH_SHORT);
            toast.show();

             */

        });

        editAgeButton = findViewById(R.id.editAgeButton);
        editAgeButton.setOnClickListener(View -> {
            editAge.setCursorVisible(true);
            /*
            Toast toast = Toast.makeText(getApplicationContext(),
                    "измените возраст", Toast.LENGTH_SHORT);
            toast.show();

             */

        });

    }

    public void saveAge(View view) {
        Snackbar.make(view, "Возраст сохранен", Snackbar.LENGTH_LONG).show();
        //.setAction("Изменить", v -> {

        //}).show();

    }
}