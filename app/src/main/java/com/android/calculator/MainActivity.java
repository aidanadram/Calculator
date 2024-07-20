package com.android.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second;
    private Boolean isOperation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        String text = ((MaterialButton) view).getText().toString();
        if (text.equals("AC") ) {
            textView.setText("0");
        }else if (textView.getText().toString().equals("0")|| isOperation)  {
            textView.setText(text);
        }else {
            textView.append(text);
        }
        isOperation = false;

    }

    public void onOperationClick(View view) {
        if (view.getId() == R.id.btn_plus){
            textView.getText().toString();
            first = Integer.valueOf(textView.getText().toString());

        }else if (view.getId() == R.id.btn_equal) {
            textView.getText().toString();
            second = Integer.valueOf(textView.getText().toString());

            Integer result = first + second;
            textView.setText(result.toString());

        }

        if (view.getId() == R.id.btn_minus){
            textView.getText().toString();
            first = Integer.valueOf(textView.getText().toString());

        }else if (view.getId() == R.id.btn_equal) {
            textView.getText().toString();
            second = Integer.valueOf(textView.getText().toString());

            Integer result = first - second;
            textView.setText(result.toString());

        }

        if (view.getId() == R.id.btn_division){
            textView.getText().toString();
            first = Integer.valueOf(textView.getText().toString());

        }else if (view.getId() == R.id.btn_equal) {
            textView.getText().toString();
            second = Integer.valueOf(textView.getText().toString());

            Integer result = first / second;
            textView.setText(result.toString());

        }

        if (view.getId() == R.id.btn_multi){
            textView.getText().toString();
            first = Integer.valueOf(textView.getText().toString());

        }else if (view.getId() == R.id.btn_equal) {
            textView.getText().toString();
            second = Integer.valueOf(textView.getText().toString());

            Integer result = first * second;
            textView.setText(result.toString());

        }

        isOperation = true;
    }
}