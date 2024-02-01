package com.dam.pmdm_412_raul;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Componente_login_password extends LinearLayout {
    private EditText textPassword;
    private TextView lengthText;
    public Componente_login_password(Context context) {
        super(context);
        inicializar();

    }

    private void inicializar() {
        String inflaterService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(inflaterService);

        layoutInflater.inflate(R.layout.componente_login_password, this, true);

        textPassword = (EditText)findViewById(R.id.TextoPassword);
        lengthText = (TextView)findViewById(R.id.textView);


        textPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            validarContraseña();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    private void validarContraseña() {
        if (textPassword.length() < 8){
            lengthText.setText("Longitud minima: " + textPassword);
            lengthText.setBackgroundColor(Color.RED);
        }else{
            lengthText.setText("Longitud: " + textPassword);
            lengthText.setBackgroundColor(Color.GREEN);
        }
    }

}

