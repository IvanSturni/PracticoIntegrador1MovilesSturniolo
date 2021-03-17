package com.sturni.practicointegrador1sturniolo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class RecibirUSB extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean conectado = intent.getExtras().getBoolean("connected");

        if (conectado) {
            Toast.makeText(context, "Iniciando Llamada...", Toast.LENGTH_LONG).show();
            Intent llamar = new Intent(Intent.ACTION_CALL, Uri.parse("tel:911"));
            context.startActivity(llamar);
        }
    }
}
