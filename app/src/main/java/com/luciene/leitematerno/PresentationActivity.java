package com.luciene.leitematerno;

import android.app.Presentation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PresentationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

        Button BtnLogin = (Button) findViewById(R.id.loginButton);
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(PresentationActivity.this, LoginActivity.class);
                startActivity(it);

            }

        });

        Button BtnCadastro = (Button) findViewById(R.id.cadastroButton);
        BtnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(PresentationActivity.this, SignupActivity.class);
                startActivity(it);

            }

        });
    }
}
