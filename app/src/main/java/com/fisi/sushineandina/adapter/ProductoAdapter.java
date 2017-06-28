package com.fisi.sushineandina.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fisi.sushineandina.R;
import com.fisi.sushineandina.activity.ProductoActivity;
import com.fisi.sushineandina.data.entity.Producto;

import java.util.ArrayList;

/**
 * Created by Bryam Soto on 27/06/2017.
 */

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductoHolder> {

    private Context context;
    private ArrayList<Producto> productos;

    public ProductoAdapter(Context context, ArrayList<Producto> productos) {
        this.context = context;
        this.productos = productos;
    }

    @Override
    public ProductoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductoHolder(LayoutInflater.from(context).inflate(R.layout.item_producto, parent, false));
    }

    @Override
    public void onBindViewHolder(ProductoHolder holder, int position) {
        Producto producto = productos.get(position);
        holder.productoImagen.setImageResource(producto.getProductoImagen());
        holder.productoNombre.setText(producto.getProductoNombre());
        holder.productoPrecio.setText("S/" + producto.getProductoPrecio());
        holder.productoPrecioNormal.setText("S/" + producto.getProductoPrecioNormal());
        holder.productoDescuento.setText("- " + producto.getProductoDescuento() + "%");
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public class ProductoHolder extends RecyclerView.ViewHolder {

        ImageView productoImagen;
        TextView productoNombre;
        TextView productoPrecio;
        TextView productoPrecioNormal;
        TextView productoDescuento;

        public ProductoHolder(View itemView) {
            super(itemView);

            productoImagen = (ImageView) itemView.findViewById(R.id.producto_img);
            productoNombre = (TextView) itemView.findViewById(R.id.producto_nombre);
            productoPrecio = (TextView) itemView.findViewById(R.id.producto_precio);
            productoPrecioNormal = (TextView) itemView.findViewById(R.id.producto_precio_normal);
            productoDescuento = (TextView) itemView.findViewById(R.id.producto_descuento);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    context.startActivity(new Intent(context, ProductoActivity.class));
                }
            });
        }
    }
}
