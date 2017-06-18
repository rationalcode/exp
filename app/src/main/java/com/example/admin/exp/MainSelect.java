package com.example.admin.exp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainSelect extends Activity implements View.OnClickListener {


    public static EditText printText;
    public static Button buttonClick;
    public static TextView textView;

    public int count = 0;

    public boolean newState;
    public boolean oldState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_select);

        printText = (EditText) findViewById(R.id.editText);
        buttonClick = (Button) findViewById(R.id.button);
        buttonClick.setOnClickListener(this);

        textView = (TextView) findViewById(R.id.textView);



        if (savedInstanceState!=null){

            count = savedInstanceState.getInt("count");
            newState = savedInstanceState.getBoolean("newState");
            oldState = savedInstanceState.getBoolean("oldState");

        }

        textView.setText(Integer.toString(count));

    }


    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.button) {

            count++;

            Toast toast = Toast.makeText(getApplicationContext(), "click Button", Toast.LENGTH_LONG);
            toast.show();

            printText.setText("Нажата кнопка");
            textView.setText(Integer.toString(count));

        }
    }


    @Override
    public void onSaveInstanceState (Bundle savedInstanceState){

        savedInstanceState.putInt("count", count);
        //savedInstanceState.putBoolean("newState", newState);
        //savedInstanceState.putBoolean("oldState", oldState);

    }


}
