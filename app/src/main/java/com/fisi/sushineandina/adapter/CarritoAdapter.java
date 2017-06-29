package com.fisi.sushineandina.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.fisi.sushineandina.R;
import com.fisi.sushineandina.data.entity.Producto;

import java.util.ArrayList;

/**
 * Created by Bryam Soto on 27/06/2017.
 */

public class CarritoAdapter extends RecyclerView.Adapter<CarritoAdapter.ProductoHolder> {

    private Context context;
    private ArrayList<Producto> productos;

    public CarritoAdapter(Context context, ArrayList<Producto> productos) {
        this.context = context;
        this.productos = productos;
    }

    @Override
    public ProductoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProductoHolder(LayoutInflater.from(context).inflate(R.layout.item_carrito, parent, false));
    }

    @Override
    public void onBindViewHolder(final ProductoHolder holder, int position) {
        final Producto producto = productos.get(position);
        holder.productoImagen.setImageResource(producto.getProductoImagen());
        holder.productoNombre.setText(producto.getProductoNombre());
        holder.productoPrecio.setText("S/" + producto.getProductoPrecio());
        holder.productoCantidad.setText(producto.getProductoCantidad()+"");
        holder.btnDisminuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                producto.setProductoCantidad(producto.getProductoCantidad()-1);
                holder.productoCantidad.setText(producto.getProductoCantidad()+"");
            }
        });

        holder.btnAumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                producto.setProductoCantidad(producto.getProductoCantidad()+1);
                holder.productoCantidad.setText(producto.getProductoCantidad()+"");
            }
        });
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public class ProductoHolder extends RecyclerView.ViewHolder {

        ImageView productoImagen;
        TextView productoNombre;
        TextView productoPrecio;
        TextView productoCantidad;
        Button btnAumentar;
        Button btnDisminuir;

        public ProductoHolder(View itemView) {
            super(itemView);

            productoImagen = (ImageView) itemView.findViewById(R.id.producto_img);
            productoNombre = (TextView) itemView.findViewById(R.id.producto_nombre);
            productoPrecio = (TextView) itemView.findViewById(R.id.producto_precio);
            productoCantidad = (TextView) itemView.findViewById(R.id.producto_cantidad);
            btnAumentar = (Button) itemView.findViewById(R.id.btn_aumentar);
            btnDisminuir = (Button) itemView.findViewById(R.id.btn_disminuir);

        }
    }
}
