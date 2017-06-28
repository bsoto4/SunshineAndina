package com.fisi.sushineandina.fragment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fisi.sushineandina.R;
import com.fisi.sushineandina.adapter.ProductoAdapter;
import com.fisi.sushineandina.data.entity.Producto;

import java.util.ArrayList;

/**
 * Created by Bryam Soto on 28/06/2017.
 */

public class ProductosFragment extends Fragment {

    private RecyclerView rvProductos;

    public static ProductosFragment newInstance() {
        return new ProductosFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_productos, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvProductos = (RecyclerView) view.findViewById(R.id.rv_productos);
        GridLayoutManager glm = new GridLayoutManager(getContext(), 2);
        ProductoAdapter adapter = new ProductoAdapter(getContext(), getProductos());
        rvProductos.setLayoutManager(glm);
        rvProductos.setAdapter(adapter);
    }

    private ArrayList<Producto> getProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Producto 1", "Descripcion 1", 10.00, 20.00, 50, R.drawable.producto, 20, 1));
        productos.add(new Producto(1, "Producto 1", "Descripcion 1", 10.00, 20.00, 50, R.drawable.producto, 20, 1));
        productos.add(new Producto(1, "Producto 1", "Descripcion 1", 10.00, 20.00, 50, R.drawable.producto, 20, 1));
        productos.add(new Producto(1, "Producto 1", "Descripcion 1", 10.00, 20.00, 50, R.drawable.producto, 20, 1));
        return productos;
    }

}
