package com.souleatergames.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Scientific extends Activity {

    public String string = "";
    Character mathFunction = 'm';
    double input, input2;
    double pi = 3.14159;
    EditText answer;
    private Button basic;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scientific);
        answer = (EditText)findViewById(R.id.displayAnswer);

        disableSoftInputFromAppearing(answer);


        basic = (Button) findViewById(R.id.basic);
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scientific.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });
    }

    public void sin(View v){
        answer.setText("sin");
        double sine = Math.sin(input);
        display(sine);
    }

    public void cos(View v){ answer.setText("cos"); }

    public void tan(View v){ answer.setText("tan"); }

    public void i(View v){ answer.setText("i"); }

    public void ln(View v){ answer.setText("ln"); }

    public void log(View v){ answer.setText("log"); }

    public void pi(View v){ display(pi); }

    public void e(View v){ display(2.71828); }

    public void percent(View v){ answer.setText(input + "%"); }

    public void factorial(View v){ answer.setText(input + "!"); }

    public void sqrroot(View v) { answer.setText("√" + input); }

    public void power(View v) { answer.setText(input + "^"); }

    public void leftP(View v) { answer.setText("(" + input); }

    public void rightP(View v) { answer.setText(input + ")"); }

    public void clear(View v){ reset(); }

    private void reset() {
        string = "";
        mathFunction = 'm';
        input = 0;
        input2 = 0;
        answer.setText("0");
    }

    private void display(double v) {
        string = string + Double.toString(v);
        input = Double.valueOf(string).doubleValue();
        answer.setText(string);
    }

    public static void disableSoftInputFromAppearing(EditText editText) {
        if (Build.VERSION.SDK_INT >= 11) {
            editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
            editText.setTextIsSelectable(true);
        } else {
            editText.setRawInputType(InputType.TYPE_NULL);
            editText.setFocusable(true);
        }
    }
}