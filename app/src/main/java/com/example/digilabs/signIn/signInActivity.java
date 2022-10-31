package com.example.digilabs.signIn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.digilabs.MainActivity;
import com.example.digilabs.R;
import com.example.digilabs.splashScreen;

public class signInActivity extends AppCompatActivity {

    private EditText et_username;
    private Button bt_masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        et_username =findViewById(R.id.signin_tv_username);
        bt_masuk = findViewById(R.id.signin_btmasuk);

        bt_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signin();
            }
        });




    }

    private void signin() {

        String username = et_username.getText().toString();
        if(username == ""){
            Toast.makeText(getApplicationContext(), "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
        }else{

            Intent i =  new Intent(signInActivity.this, MainActivity.class);
            startActivity(i);
            finish();

            SharedPreferences.Editor logstatus = getSharedPreferences("logstatus", MODE_PRIVATE).edit();
            logstatus.putString("username", username);
            logstatus.apply();
        }
    }
}