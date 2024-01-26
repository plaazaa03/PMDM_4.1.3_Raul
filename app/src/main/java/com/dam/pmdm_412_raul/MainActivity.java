package com.dam.pmdm_412_raul;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Componente_login_usuario componenteLoginUsuario = (Componente_login_usuario)findViewById(R.id.componente_login_usuario);
        final Componente_login_password componenteLoginPassword = (Componente_login_password)findViewById(R.id.componente_login_password);


    }
}