package com.example.calculator_220821;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculator_220821.domain.Operations;

import java.util.Locale;


/*
 Использовал append вместо setText, чтобы числа не заменяли друг-друга в TextView. Возможно не самое эффективное решение, ибо дальше писать логику.
 savedInstanceState пока пустой
 */

public class MainActivity extends AppCompatActivity {

    private TextView calculationField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

        } else {
            Operations.getResult();
        }

        initCalculationField();
        initButtons();

    }

    private void initButtons() {
        ClickHandler clickHandler = new ClickHandler();

        findViewById(R.id.key_0).setOnClickListener(clickHandler);
        findViewById(R.id.key_1).setOnClickListener(clickHandler);
        findViewById(R.id.key_2).setOnClickListener(clickHandler);
        findViewById(R.id.key_3).setOnClickListener(clickHandler);
        findViewById(R.id.key_4).setOnClickListener(clickHandler);
        findViewById(R.id.key_5).setOnClickListener(clickHandler);
        findViewById(R.id.key_6).setOnClickListener(clickHandler);
        findViewById(R.id.key_7).setOnClickListener(clickHandler);
        findViewById(R.id.key_8).setOnClickListener(clickHandler);
        findViewById(R.id.key_9).setOnClickListener(clickHandler);
        findViewById(R.id.key_plus).setOnClickListener(clickHandler);
        findViewById(R.id.key_minus).setOnClickListener(clickHandler);
        findViewById(R.id.key_multi).setOnClickListener(clickHandler);
        findViewById(R.id.key_div).setOnClickListener(clickHandler);
        findViewById(R.id.key_dot).setOnClickListener(clickHandler);
    }

    private void initCalculationField() {
        calculationField = findViewById(R.id.field);
    }

    //Доделать кнопки. Каждое число заменяет предыдущее, сделать чтобы выводилось строкой.


    class ClickHandler implements View.OnClickListener {

        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {

            switch (view.getId()) {

                case R.id.key_dot:
                    printChar(calculationField, ".");
                    break;

                case R.id.key_result:

                    break;

                case R.id.key_div:
                    printChar(calculationField, "/");
                    break;

                case R.id.key_multi:
                    printChar(calculationField, "*");
                    break;

                case R.id.key_minus:
                    printChar(calculationField, "-");
                    break;

                case R.id.key_plus:
                    printChar(calculationField, "+");
                    break;

                case R.id.key_1:
                    printDigit(calculationField, 1);
                    break;

                case R.id.key_2:
                    printDigit(calculationField, 2);
                    break;

                case R.id.key_3:
                    printDigit(calculationField, 3);
                    break;

                case R.id.key_4:
                    printDigit(calculationField, 4);
                    break;

                case R.id.key_5:
                    printDigit(calculationField, 5);
                    break;

                case R.id.key_6:
                    printDigit(calculationField, 6);
                    break;

                case R.id.key_7:
                    printDigit(calculationField, 7);
                    break;

                case R.id.key_8:
                    printDigit(calculationField, 8);
                    break;

                case R.id.key_9:
                    printDigit(calculationField, 9);
                    break;

                case R.id.key_0:
                    printDigit(calculationField, 0);
                    break;

            }
        }

        private void printDigit(TextView field, int digit) {
            field.append(String.format(Locale.getDefault(), "%d", digit));
        }

        private void printChar(TextView field, String symbol) {
            field.append(String.format(Locale.getDefault(), "%s", symbol));
        }
    }
}