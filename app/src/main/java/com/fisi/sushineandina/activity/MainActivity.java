package com.fisi.sushineandina.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.fisi.sushineandina.R;
import com.fisi.sushineandina.adapter.ProductoAdapter;
import com.fisi.sushineandina.data.entity.Producto;
import com.fisi.sushineandina.fragment.ProductosFragment;
import com.fisi.sushineandina.utils.ActivityUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sunshine Andina");

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ProductosFragment fragment = (ProductosFragment) getSupportFragmentManager().findFragmentById(R.id.body_productos);
        if (fragment == null) {
            fragment = ProductosFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), fragment, R.id.body_productos);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        Intent intent = null;
        int flag = 0;
        switch (id) {
            case R.id.nav_perfil:
                flag = 2;
                intent = new Intent(this, ProfileActivity.class);
                break;
            case R.id.nav_compras:
                flag = 1;
                intent = new Intent(this, ComprasActivity.class);
                break;
            case R.id.nav_carrito:
                flag = 1;
                intent = new Intent(this, CarritoActivity.class);
                break;
            case R.id.nav_favoritos:
                flag = 1;
                intent = new Intent(this, FavoritosActivity.class);
                break;
            case R.id.nav_cupones:
                flag = 1;
                intent = new Intent(this, CuponesActivity.class);
                break;
            case R.id.nav_salir:
                flag = 2;
                intent = new Intent(this, LoginActivity.class);
                break;
        }

        drawer.closeDrawer(GravityCompat.START);

        if (flag != 0) {
            startActivity(intent);
        }

        if (flag == 1) {
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else if (flag == 2) {
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            this.finish();
        }
        return true;
    }
}
