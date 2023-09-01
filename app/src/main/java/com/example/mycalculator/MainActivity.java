package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    boolean plus, min, mul, div, mRemainder, dot;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnc, btnplusmn, btnmod, btndiv, btnplus, btnmin, btnmul, btneq, btndot;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnc = findViewById(R.id.btnc);
        btnplusmn = findViewById(R.id.btnplusmin);
        btnmod = findViewById(R.id.btnmod);
        btndiv = findViewById(R.id.btndiv);
        btnmul = findViewById(R.id.btnmul);
        btnmin = findViewById(R.id.btnmin);
        btnplus = findViewById(R.id.btnplus);
        btneq = findViewById(R.id.btneq);
        btndot = findViewById(R.id.btndot);

        txt = findViewById(R.id.txt);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+ "9");
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().length() != 0){
                    input1 = Float.parseFloat(txt.getText()+"");
                    plus = true;
                    dot = false;
                    txt.setText(null);
                }
            }
        });
        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt.getText().length() != 0) {
                    input1 = Float.parseFloat(txt.getText() + "");
                    min = true;
                    dot = false;
                    txt.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt.getText().length() != 0) {
                    input1 = Float.parseFloat(txt.getText() + "");
                    mul = true;
                    dot = false;
                    txt.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt.getText().length() != 0) {
                    input1 = Float.parseFloat(txt.getText() + "");
                    div = true;
                    dot = false;
                    txt.setText(null);
                }
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().length() != 0) {
                    input1 = Float.parseFloat(txt.getText() + "");
                    mRemainder = true;
                    dot = false;
                    txt.setText(null);
                }
            }
        });
        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(plus || min || mul || div || mRemainder){
                    input2 = Float.parseFloat(txt.getText()+ "");
                }
                if(plus){
                    txt.setText(input1+input2 + "");
                    plus = false;
                }
                if(min){
                    txt.setText(input1-input2 + "");
                    min = false;
                }
                if(mul){
                    txt.setText(input1 * input2 + "");
                    mul = false;
                }
                if(div){
                    txt.setText(input1 / input2 + "");
                    div = false;
                }
                if(mRemainder){
                    txt.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("");
                input1 = 0;
                input2 = 0;
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dot){

                }else {
                    txt.setText(txt.getText() + ".");
                    dot = true;
                }
            }
        });
    }
}