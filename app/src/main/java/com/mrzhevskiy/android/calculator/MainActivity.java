package com.mrzhevskiy.android.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    double x = 0;
    double y = 0;
    double answer = 0;
    String operator = "subtract";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);

    }

public void onClick(View v){

    Button b = (Button)v;

    switch (b.getText().toString()){
        case "1":
            textView.setText(textView.getText()+"1");
            break;
        case "2":
            textView.setText(textView.getText()+"2");
            break;
        case "3":
            textView.setText(textView.getText()+"3");
            break;
        case "4":
            textView.setText(textView.getText()+"4");
            break;
        case "5":
            textView.setText(textView.getText()+"5");
            break;
        case "6":
            textView.setText(textView.getText()+"6");
            break;
        case "7":
            textView.setText(textView.getText()+"7");
            break;
        case "8":
            textView.setText(textView.getText()+"8");
            break;
        case "9":
            textView.setText(textView.getText()+"9");
            break;
        case "0":
            textView.setText(textView.getText()+"0");
            break;
        case ".":
            if(!textView.getText().toString().contains(".")) {
                textView.setText(textView.getText() + ".");
            }
            break;
        case "C":
            textView.setText("");
            break;
        case "Back":
            textView.setText(textView.getText().subSequence(0,textView.getText().length()-1));
            break;
        case "+":
            x = Double.valueOf(textView.getText().toString());
            operator = "add";
            textView.setText("");
            break;
        case "-":
            x = Double.valueOf(textView.getText().toString());
            operator = "subtract";
            textView.setText("");
            break;
        case "x":
            x = Double.valueOf(textView.getText().toString());
            operator = "multiply";
            textView.setText("");
            break;
        case "/":
            x = Double.valueOf(textView.getText().toString());
            operator = "divide";
            textView.setText("");
            break;
        case "=":
            y = Double.valueOf(textView.getText().toString());
            switch(operator){
                case "add":
                    answer = x+y;
                    break;
                case "subtract":
                    answer = x-y;
                    break;
                case "multiply":
                    answer = x*y;
                    break;
                case "divide":
                    answer = x/y;
                    break;
            }
            String answerString = String.valueOf(answer);
            if(answerString.endsWith(".0")) answerString = answerString.substring(0,answerString.length()-2);
            textView.setText(answerString);


    }
}
}
