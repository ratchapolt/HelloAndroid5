package com.example.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloandroid.model.InputDigits;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //private String mDigits;
    private InputDigits mInputDigits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInputDigits = new InputDigits("");

        clearDigits();

        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(this);
        Button btn7 = (Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(this);
        Button btn8 = (Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(this);
        Button btn9 = (Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(this);
        Button btn0 = (Button) findViewById(R.id.button_0);
        btn0.setOnClickListener(this);
        Button btnClear = (Button) findViewById(R.id.clear_button);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Toast t = Toast.makeText(this, "Hello", Toast.LENGTH_LONG);
        //t.show();

        int id = v.getId();

        if (id == R.id.button_1) {
            addDigit(1);
        } else if (id == R.id.button_2) {
            addDigit(2);
        } else if (id == R.id.button_3) {
            addDigit(3);
        } else if (id == R.id.button_4) {
            addDigit(4);
        } else if (id == R.id.button_5) {
            addDigit(5);
        } else if (id == R.id.button_6) {
            addDigit(6);
        } else if (id == R.id.button_7) {
            addDigit(7);
        } else if (id == R.id.button_8) {
            addDigit(8);
        } else if (id == R.id.button_9) {
            addDigit(9);
        } else if (id == R.id.button_0) {
            addDigit(0);
        } else if (id == R.id.clear_button) {
            clearDigits();
        }
    }

    private void addDigit(int i) {
        if (mInputDigits.get().length() < 6) {
            mInputDigits.add(i);
            showDigits();
        }
    }

    private void clearDigits() {
        mInputDigits.clear();
        showDigits();
    }

    private void showDigits() {
        TextView tv = (TextView) findViewById(R.id.digit_text_view);
        tv.setText(mInputDigits.get());
    }
}


