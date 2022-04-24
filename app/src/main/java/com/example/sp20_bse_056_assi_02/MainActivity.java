package com.example.sp20_bse_056_assi_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private String key = "9999";
    private TextView key_text;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button back;
    private Button confirm;

//===================================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        @Override
        protected void onStart() {
            super.onStart();
            key_text = findViewById(R.id.key);
            button1 = findViewById(R.id.button1);
            button2 = findViewById(R.id.button2);
            button3 = findViewById(R.id.button3);
            button4 = findViewById(R.id.button4);
            button5 = findViewById(R.id.button5);
            button6 = findViewById(R.id.button6);
            button7 = findViewById(R.id.button7);
            button8 = findViewById(R.id.button8);
            button9 = findViewById(R.id.button9);
            button0 = findViewById(R.id.button0);
            back = findViewById(R.id.back);
            confirm = findViewById(R.id.confirm);
        }

//================================================================================

    private void setKeyText(int n){
        String keyTextValue = key_text.getText().toString();
        if(keyTextValue.length() >= 4){
            return;
        }
        key_text.setText(keyTextValue + n);
    }

//================================================================================

    @Override
    protected void onResume() {
        super.onResume();
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(0);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(6);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(7);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(8);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setKeyText(9);
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String keyTextValue = key_text.getText().toString();
                if(keyTextValue.length() > 0){
                    key_text.setText(keyTextValue.substring(0, keyTextValue.length() - 1));
                }
            }
        });


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String keyTextValue = key_text.getText().toString();
                if(keyTextValue.equals(key)){
                    Intent intent = new Intent(getApplicationContext(), SafeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Wrong Key", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




  //===========LAST===============================================================
}