package com.dam.pmdm_412_raul;

import android.content.Context;
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
        String inflaterService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(inflaterService);

        layoutInflater.inflate(R.layout.componente_login_usuario, this, true);

        textoUsuario = (EditText)findViewById(R.id.TextoUsuario);
    }

}
