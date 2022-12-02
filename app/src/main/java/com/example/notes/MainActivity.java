package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button saveAge;
    private EditText editAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveAge = findViewById(R.id.saveAge);
        editAge = findViewById(R.id.editAge);

        saveAge.setOnClickListener(View -> {
            editAge.setCursorVisible(false);

            Toast toast = Toast.makeText(getApplicationContext(), "Возраст сохранен", Toast.LENGTH_SHORT);
            toast.show();
        });
    }
}