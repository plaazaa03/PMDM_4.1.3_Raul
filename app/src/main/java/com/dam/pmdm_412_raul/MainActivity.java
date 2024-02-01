package com.dam.pmdm_412_raul;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            final Componente_login_usuario componenteLoginUsuario = findViewById(R.id.componente_login_usuario);

            final Componente_login_password componenteLoginPassword = findViewById(R.id.componente_login_password);
        } catch (Exception e){
            e.printStackTrace();
        }





    }
}