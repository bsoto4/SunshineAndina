package com.fisi.sushineandina.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.fisi.sushineandina.R;
import com.fisi.sushineandina.adapter.CarritoAdapter;
import com.fisi.sushineandina.adapter.ProductoAdapter;
import com.fisi.sushineandina.data.entity.Producto;

import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity {

    private RecyclerView rvProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Favoritos");


        rvProductos = (RecyclerView) findViewById(R.id.rv_productos);
        GridLayoutManager glm = new GridLayoutManager(this, 2);
        ProductoAdapter adapter = new ProductoAdapter(this, getProductos());
        rvProductos.setLayoutManager(glm);
        rvProductos.setAdapter(adapter);
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
