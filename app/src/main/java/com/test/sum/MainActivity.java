package com.test.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNum1;
    private EditText inputNum2;
    private Button btn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNum1=(EditText) findViewById(R.id.inputNum1);
        inputNum2=(EditText) findViewById(R.id.inputNum2);
        btn=(Button) findViewById(R.id.btn);
        result=(TextView) findViewById(R.id.result);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                int number1 = Integer.parseInt(inputNum1.getText().toString());
                int number2 = Integer.parseInt(inputNum2.getText().toString());
                int sum = number1 + number2;
                result.setText("Answer: " + String.valueOf(sum));
            }
        });
    }
}