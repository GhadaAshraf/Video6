package com.example.mm.video6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtv = (TextView)findViewById(R.id.textView);
        Bundle bundle= getIntent().getExtras();
        String user = bundle.getString("username");
        String pass = bundle.getString("password");
        txtv.setText("user:" + user +",pass"+ pass);

    }
}
