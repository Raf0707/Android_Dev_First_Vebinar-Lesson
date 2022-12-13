package com.example.notes;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.notes.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    //implements View.OnClickListener {
    //private Button saveAge;
    //private Button editAgeButton;
    //private EditText editAge;
    //private View view;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*
        editAge = findViewById(R.id.editAge);
        editAge.setOnClickListener(this);

        saveAge = findViewById(R.id.saveAgeButton);
        saveAge.setOnClickListener(this);
        editAgeButton = findViewById(R.id.editAgeButton);
        editAgeButton.setOnClickListener(this);

         */


        binding.helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloVim(view);
            }
        });


        binding.helloButton.setOnClickListener(view -> {
            helloVim(view);
        });

        binding.saveAgeButton.setOnClickListener(view -> {
            saveAge(view);
        });

        binding.editAgeButton.setOnClickListener(view -> {
            binding.editAge.setCursorVisible(true);
        });

    }

    public void saveAge(View view) {
        binding.editAge.setCursorVisible(false);
        Snackbar.make(view, "Возраст сохранен", Snackbar.LENGTH_SHORT)
        .setAction("Изменить", v -> {
            binding.editAge.setCursorVisible(true);
            Toast toast = Toast.makeText(getApplicationContext(),
                    "измените возраст", Toast.LENGTH_SHORT);
            toast.show();
        }).show();

    }

    public void helloVim(View view) {
        Snackbar.make(view, "Hello, Vim", Snackbar.LENGTH_SHORT)
                .show();
    }

    /*
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.saveAgeButton:
                saveAge(view);
                break;
            case R.id.editAgeButton:
                editAge.setCursorVisible(true);
                break;
            case R.id.editAge:
                editAge.setCursorVisible(true);
                break;
        }
    }

     */

}