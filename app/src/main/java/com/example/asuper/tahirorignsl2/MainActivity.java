package com.example.asuper.tahirorignsl2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText first = (EditText) findViewById(R.id.first);
                EditText second = (EditText) findViewById(R.id.second);
                TextView textView = (TextView) findViewById(R.id.textView);

                int num1 = Integer.parseInt(first.getText().toString());
                int num2 = Integer.parseInt(second.getText().toString());
                int result = num1 + num2;
                textView.setText(result + "");
            }

        });


    }
}


