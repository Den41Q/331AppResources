package com.example.a331appresources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private Button mBtnZero;
    private Button mBtnOne;
    private Button mBtnTwo;
    private Button mBtnThree;
    private Button mBtnFour;
    private Button mBtnFive;
    private Button mBtnSix;
    private Button mBtnSeven;
    private Button mBtnEight;
    private Button mBtnNine;
    private Button mBtnPoint;
    private Button mBtnClear;
    private Button mBtnChangeSign;
    private Button mBtnPercent;
    private Button mBtnDivision;
    private Button mBtnMultiplication;
    private Button mBtnMinus;
    private Button mBtnPlus;
    private Button mBtnEqualsTo;
    private int results = 0;
    private int num1;
    private int num2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        result = findViewById(R.id.result);
        mBtnZero = findViewById(R.id.btn_0);
        mBtnOne = findViewById(R.id.btn_1);
        mBtnTwo = findViewById(R.id.btn_2);
        mBtnThree = findViewById(R.id.btn_3);
        mBtnFour = findViewById(R.id.btn_4);
        mBtnFive = findViewById(R.id.btn_5);
        mBtnSix = findViewById(R.id.btn_6);
        mBtnSeven = findViewById(R.id.btn_7);
        mBtnEight = findViewById(R.id.btn_8);
        mBtnNine = findViewById(R.id.btn_9);
        mBtnPoint = findViewById(R.id.btn_point);
        mBtnClear = findViewById(R.id.clear);
        mBtnChangeSign = findViewById(R.id.sign_change);
        mBtnPercent = findViewById(R.id.percent);
        mBtnDivision = findViewById(R.id.division);
        mBtnMultiplication = findViewById(R.id.multiplication);
        mBtnMinus = findViewById(R.id.minus);
        mBtnPlus = findViewById(R.id.plus);
        mBtnEqualsTo = findViewById(R.id.equals_to);

        mBtnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "0");
            }
        });

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "1");
            }
        });

        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "2");
            }
        });

        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "3");
            }
        });

        mBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "4");
            }
        });

        mBtnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "5");
            }
        });

        mBtnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "6");
            }
        });

        mBtnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "7");
            }
        });

        mBtnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "8");
            }
        });

        mBtnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("0".equalsIgnoreCase(result.getText().toString())) {
                    result.setText(" ");
                }
                result.setText(result.getText().toString() + "9");
            }
        });

        mBtnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!result.getText().toString().contains(".")) {
                    result.setText(result.getText().toString() + ".");
                } else {
                }
            }
        });

        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(result.getText().toString());
                result.setText(" ");
            }
        });

        mBtnEqualsTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Integer.getInteger(result.getText().toString());

                String oper = "";

                switch (v.getId()) {
                    case R.id.plus:
                        oper = "+";
                        results = num1 + num2;
                        break;
                    case R.id.minus:
                        oper = "-";
                        results = num1 - num2;
                        break;
                    case R.id.multiplication:
                        oper = "*";
                        results = num1 * num2;
                        break;
                    case R.id.division:
                        oper = "/";
                        results = num1 / num2;
                        break;
                    default:
                        break;
                }
                result.setText(num1 + " " + oper + " " + num2 + " = " + result);
            }
        });
    }
}