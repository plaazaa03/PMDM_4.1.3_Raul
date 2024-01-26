package com.dam.pmdm_412_raul;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Componente_login_password extends LinearLayout {
    private EditText textPassword;
    public Componente_login_password(Context context) {
        super(context);
        inicializar();

    }

    private void inicializar() {
        String inflaterService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(inflaterService);

        layoutInflater.inflate(R.layout.componente_login_password, this, true);

        textPassword = (EditText)findViewById(R.id.TextoPassword);


    }

}

