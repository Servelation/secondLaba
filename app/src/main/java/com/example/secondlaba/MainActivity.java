package com.example.secondlaba;

import static com.example.secondlaba.LabaConstants.SENDED_TEXT_MSG;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author anechaev
 * @since 16.01.2022
 */
public class MainActivity extends Activity {
    private EditText editTextField;
    private Button sendButton;
    private Intent setAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextField = (EditText) findViewById(R.id.editTextField);
        sendButton = (Button) findViewById(R.id.sendButton);

        sendButton.setOnClickListener(v -> {
            setAct = new Intent(MainActivity.this, SecondActivity.class)
                .putExtra(SENDED_TEXT_MSG, editTextField.getText().toString());
            startActivity(setAct);
        });


    }
}