package com.example.app2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;
    Button greetButton, clearButton;
    TextView greetingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        greetButton = findViewById(R.id.greetButton);
        clearButton = findViewById(R.id.clearButton); // Initialize clearButton
        greetingTextView = findViewById(R.id.greetingTextView);

        greetButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            if (!name.isEmpty()) {
                String greetingMessage = "Hello, " + name + "!";
                greetingTextView.setText(greetingMessage);
            }
        });

        clearButton.setOnClickListener(v -> greetingTextView.setText(""));
    }
}
