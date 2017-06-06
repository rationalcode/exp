package com.example.admin.exp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainSelect extends Activity implements View.OnClickListener {


    public static EditText printText;
    public static Button buttonClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_select);

    printText = (EditText) findViewById(R.id.editText);
        buttonClick = (Button) findViewById(R.id.button);
        buttonClick.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.button) {

            Toast toast = Toast.makeText(getApplicationContext(), "click Button", Toast.LENGTH_LONG);
            toast.show();

            printText.setText("Нажата кнопка");
        }
    }



}
