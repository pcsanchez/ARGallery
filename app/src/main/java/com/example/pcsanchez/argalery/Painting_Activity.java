package com.example.pcsanchez.argalery;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Painting_Activity extends AppCompatActivity {

    private ImageView img;
    private ImageButton bClose;
    private TextView tvProveedor;
    private TextView tvPrecio;
    private TextView tvDimensiones;
    private TextView tvMaterial;
    private TextView tvDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting_);

        img = findViewById(R.id.painting_thumbnail);
        bClose = findViewById(R.id.back_action);

        tvProveedor = findViewById(R.id.pProveedor_id);
        tvPrecio = findViewById(R.id.pPrecio_id);
        tvDimensiones = findViewById(R.id.pDimensiones_id);
        tvMaterial = findViewById(R.id.pMaterial_id);
        tvDescripcion = findViewById(R.id.pDescripcion_id);

        bClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Painting_Activity.super.onBackPressed();
            }
        });

        Intent myIntent = getIntent();
        int image = myIntent.getExtras().getInt("Paint");
        String proveedor = myIntent.getExtras().getString("Proveedor");
        String precio = myIntent.getExtras().getDouble("Precio") + " pesos";
        String material = myIntent.getExtras().getString("Material");
        String descripcion = myIntent.getExtras().getString("Descripcion");
        double largo = myIntent.getExtras().getDouble("Largo");
        double ancho = myIntent.getExtras().getDouble("Ancho");

        img.setImageResource(image);
        tvProveedor.setText(proveedor);
        tvPrecio.setText(precio);
        tvDimensiones.setText(largo + " m x " + ancho + " m");
        tvMaterial.setText(material);
        tvDescripcion.setText(descripcion);

    }
}
