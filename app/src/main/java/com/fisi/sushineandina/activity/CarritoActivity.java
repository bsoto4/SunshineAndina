package com.fisi.sushineandina.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.fisi.sushineandina.R;
import com.fisi.sushineandina.adapter.CarritoAdapter;
import com.fisi.sushineandina.data.entity.Producto;

import java.util.ArrayList;

public class CarritoActivity extends AppCompatActivity {

    private RecyclerView rvProductos;
    private Button btnComprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Mi carrito");

        rvProductos = (RecyclerView) findViewById(R.id.rv_productos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        CarritoAdapter adapter = new CarritoAdapter(this, getProductos());
        rvProductos.setLayoutManager(llm);
        rvProductos.setAdapter(adapter);

        btnComprar = (Button) findViewById(R.id.btn_pager);

        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CarritoActivity.this, EnvioActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private ArrayList<Producto> getProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Hidratante Facial - Maracuyá", "Descripcion 1", 10.00, 20.00, 50, R.drawable.producto, 20, 1));
        productos.add(new Producto(1, "Hidratante Facial - Maracuyá", "Descripcion 1", 10.00, 20.00, 50, R.drawable.producto, 20, 1));
        productos.add(new Producto(1, "Hidratante Facial - Maracuyá", "Descripcion 1", 10.00, 20.00, 50, R.drawable.producto, 20, 1));
        productos.add(new Producto(1, "Hidratante Facial - Maracuyá", "Descripcion 1", 10.00, 20.00, 50, R.drawable.producto, 20, 1));
        return productos;
    }

}
