package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button b;
  EditText E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.hbutton);
        E=(EditText) findViewById(R.id.PersonName);
        b.setOnClickListener(new View.OnClickListener(){
        public void onClick(View view) {  String s=E.getText().toString();
TextView v=(TextView)findViewById(R.id.textview);  v.setText("Hello,"+s);
}
});


}}