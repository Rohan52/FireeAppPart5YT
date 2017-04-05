package com.example.android.fireeapp;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {


    private EditText mValueField;
    private Button mAddBtn;
    private EditText mKeyValue;
    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootRef = new Firebase("https://fireeapp.firebaseio.com/Users");

        mValueField = (EditText)findViewById(R.id.ValueField);
        mAddBtn = (Button)findViewById(R.id.AddBtn);
        mKeyValue = (EditText)findViewById(R.id.KeyValue);

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = mValueField.getText().toString();
                String key = mKeyValue.getText().toString();
                Firebase childRef = mRootRef.child(key);
                //childRef.setValue(value);

                childRef.setValue(value);




            }
        });


    }
}
