package com.dam.pmdm_412_raul;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Componente_login_usuario extends LinearLayout {
    private EditText textoUsuario;

    public Componente_login_usuario(Context context) {
        super(context);
        inicializar();
    }

    // Constructor que define el texto del botón de acceso
    public Componente_login_usuario(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        inicializar();
    }

    private void inicializar() {
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.componente_login_usuario, this, true);

        textoUsuario = (EditText)findViewById(R.id.TextoUsuario);

        textoUsuario.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            validarFormato(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void validarFormato(String string) {
        // Validar el formato del usuario (username@bikeforall.es)
        if (string.matches("[a-zA-Z0-9._-]+@bikeforall.es")) {
            // Formato correcto
            System.out.println("Formato correcto.");
        } else {
            // Formato incorrecto
            textoUsuario.setError("Formato incorrecto.");
        }

    }

}
