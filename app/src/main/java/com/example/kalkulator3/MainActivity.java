package com.example.kalkulator3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    EditText editTextN1, editTextN2;
    TextView textView;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMul = findViewById(R.id.btn_mul);
        buttonDiv = findViewById(R.id.btn_div);
        editTextN1 = findViewById(R.id.number1);
        editTextN2 = findViewById(R.id.number2);
        textView = findViewById(R.id.jawaban);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
    }
    public int getintFromEditText(EditText editText){
        if (editText.getText().toString().equals("")) {
            Toast.makeText(this,"Masukkan Angka",Toast.LENGTH_SHORT).show();
            return 0;
        }else
            return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View view) {
        num1 = getintFromEditText(editTextN1);
        num2 = getintFromEditText(editTextN2);
        if (view.getId() == R.id.btn_add) {
            textView.setText("jawaban = " + (num1 + num2));
        } else if (view.getId() == R.id.btn_sub) {
            textView.setText("jawaban = " + (num1 - num2));
        } else if (view.getId() == R.id.btn_mul) {
            textView.setText("jawaban = " + (num1 * num2));
        } else if (view.getId() == R.id.btn_div) {
            textView.setText("jawaban = " + ((float) num1 / (float) num2));
        }
    }
}