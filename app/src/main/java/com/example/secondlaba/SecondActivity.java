package com.example.secondlaba;

import static com.example.secondlaba.LabaConstants.SENDED_TEXT_MSG;
import static com.example.secondlaba.LabaConstants.TEXT_PLAIN;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author anechaev
 * @since 17.01.2022
 */
public class SecondActivity extends Activity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String textFromPreviousAct = intent.getStringExtra(SENDED_TEXT_MSG);
        textView = findViewById(R.id.secActTextView);
        textView.setText(textFromPreviousAct);

        button = findViewById(R.id.secActSendMsgButton);
        button.setOnClickListener(v -> {
            Intent implicitIntent = new Intent(Intent.ACTION_SEND)
                .setType(TEXT_PLAIN)
                .putExtra(Intent.EXTRA_TEXT, textFromPreviousAct);
            startActivity(implicitIntent);
        });

    }
}