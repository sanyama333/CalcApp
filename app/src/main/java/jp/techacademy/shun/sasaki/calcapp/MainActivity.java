package jp.techacademy.shun.sasaki.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        try {
            mEditText1 = (EditText) findViewById(R.id.editText1);
            mEditText2 = (EditText) findViewById(R.id.editText2);
        }catch(ArithmeticException e){
            System.out.println("例外が発生しました。");
            System.out.println(e);
        }
    }

    @Override
    public void onClick(View v) {
        try {
            if (v.getId() == R.id.button1) {
                Intent intent = new Intent(this, SecondActivity.class);
                String text1 = mEditText1.getText().toString();
                String text2 = mEditText2.getText().toString();
                double num1 = Double.parseDouble(text1);
                double num2 = Double.parseDouble(text2);
                intent.putExtra("VALUE1", num1 + num2);
                startActivity(intent);
            } else if (v.getId() == R.id.button2) {
                Intent intent = new Intent(this, SecondActivity.class);
                String text1 = mEditText1.getText().toString();
                String text2 = mEditText2.getText().toString();
                double num1 = Double.parseDouble(text1);
                double num2 = Double.parseDouble(text2);
                intent.putExtra("VALUE1", (num1 - num2));
                startActivity(intent);
            } else if (v.getId() == R.id.button3) {
                Intent intent = new Intent(this, SecondActivity.class);
                String text1 = mEditText1.getText().toString();
                String text2 = mEditText2.getText().toString();
                double num1 = Double.parseDouble(text1);
                double num2 = Double.parseDouble(text2);
                intent.putExtra("VALUE1", num1 * num2);
                startActivity(intent);
            } else if (v.getId() == R.id.button4) {
                Intent intent = new Intent(this, SecondActivity.class);
                String text1 = mEditText1.getText().toString();
                String text2 = mEditText2.getText().toString();
                double num1 = Double.parseDouble(text1);
                double num2 = Double.parseDouble(text2);
                intent.putExtra("VALUE1", num1 / num2);
                startActivity(intent);
            }
        }catch(ArithmeticException e){
            System.out.println("例外が発生しました。");
            System.out.println(e);
        }
    }
}
