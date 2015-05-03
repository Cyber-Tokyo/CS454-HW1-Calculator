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

//    public void zero(View v){ display(0); }
//
//    public void one(View v){ display(1); }
//
//    public void two(View v){ display(2); }
//
//    public void three(View v){ display(3); }
//
//    public void four(View v){ display(4); }
//
//    public void five(View v){ display(5); }
//
//    public void six(View v){ display(6); }
//
//    public void seven(View v){ display(7); }
//
//    public void eight(View v){ display(8); }
//
//    public void nine(View v){ display(9); }
//
//    public void period (View v) { answer.setText(input + "."); }
//
//    private void function() {
//        string = "";
//        input2 = input;
//    }
//
//    public void add(View v){
//        function();
//        mathFunction = '+';
//        answer.setText("+");
//    }
//
//    public void sub(View v){
//        function();
//        mathFunction = '-';
//        answer.setText("-");
//    }
//
//    public void mult(View v){
//        function();
//        mathFunction = '×';
//        answer.setText("×");
//    }
//
//    public void div(View v){
//        function();
//        mathFunction = '÷';
//        answer.setText("÷");
//    }
//
//    public void equal(View v){ operations(); }
//
//    public void clear(View v){ reset(); }
//
//    private void reset() {
//        string = "";
//        mathFunction = 'm';
//        input = 0;
//        input2 = 0;
//        answer.setText("0");
//    }
//
//    private void display(int v) {
//        string = string +Integer.toString(v);
//        input = Integer.valueOf(string).intValue();
//        answer.setText(string);
//    }
//
//    private void operations() {
//
//        if(mathFunction == '+'){
//            input = input2 + input;
//        }
//        else if(mathFunction == '-') {
//            input = input2 - input;
//        }
//        else if(mathFunction == '÷') {
//            input = input2 / input;
//        }
//        else if(mathFunction == '×') {
//            input = input2 * input;
//        }
//
////        if(mathFunction == '.'){
////            input = 0 + '.';
////        }
//
//
//
//        answer.setText("" + input);
//    }

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
