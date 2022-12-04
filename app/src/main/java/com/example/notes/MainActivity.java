package com.example.notes;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button saveAge;
    private Button editAgeButton;
    private EditText editAge;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAge = findViewById(R.id.editAge);
        editAge.setOnClickListener(this);

        saveAge = findViewById(R.id.saveAgeButton);
        saveAge.setOnClickListener(this);
        editAgeButton = findViewById(R.id.editAgeButton);
        editAgeButton.setOnClickListener(this);

    }

    public void saveAge(View view) {
        editAge.setCursorVisible(false);
        Snackbar.make(view, "Возраст сохранен", Snackbar.LENGTH_SHORT)
        .setAction("Изменить", v -> {
            editAge.setCursorVisible(true);
            Toast toast = Toast.makeText(getApplicationContext(),
                    "измените возраст", Toast.LENGTH_SHORT);
            toast.show();
        }).show();

    }

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

}