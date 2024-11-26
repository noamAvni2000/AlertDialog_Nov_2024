package com.example.alertdialog_nov_2024;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button buttonShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editText = findViewById(R.id.editText);
        buttonShowDialog = findViewById(R.id.buttonShowDialog);

        // Set up button click listener
        buttonShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create and show the AlertDialog
                showAlertDialog();
            }
        });
    }

    private void showAlertDialog() {
        // Create the AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Wow");
        builder.setMessage("Awesome");

        // Set up positive button
        builder.setPositiveButton("Yes", (dialog, which) -> {
            // Show a Toast with the text entered in the EditText
            String userInput = editText.getText().toString();
            Toast.makeText(MainActivity.this, "You wrote: " + userInput, Toast.LENGTH_SHORT).show();
        });

        // Set up negative button (Cancel)
        builder.setNegativeButton("Cancel", (dialog, which) -> {
            // Do nothing when Cancel is clicked
        });

        // Show the dialog
        builder.show();
    }
}