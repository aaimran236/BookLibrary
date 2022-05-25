package com.example.booklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    EditText title_input,author_input,pages_input;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        title_input=findViewById(R.id.title_input);
        author_input=findViewById(R.id.author_input);
        pages_input=findViewById(R.id.pages_input);
        button=findViewById(R.id.buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper databaseHelper=new DatabaseHelper(AddActivity.this);
                databaseHelper.addBook(title_input.getText().toString().trim(),
                        author_input.getText().toString().trim(),Integer.parseInt(pages_input.getText().toString().trim()));
            }
        });
    }
}