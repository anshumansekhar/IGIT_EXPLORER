package com.example.smokie.igit;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    GridView gridView;
    ImageView igit;
    CollapsingToolbarLayout layout;
    adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        layout=(CollapsingToolbarLayout)findViewById(R.id.collapsing);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        igit=(ImageView)findViewById(R.id.igit);
        Glide.with(this)
                .load(R.drawable.igit)
                .centerCrop()
                .into(igit);
        igit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent (MainActivity.this,Final_Image.class);
                h.putExtra("Type",Constants.Amenities_name[0]);
                startActivity(h);
            }
        });
        gridView=(GridView)findViewById(R.id.grid);
        adapter=new adapter(getApplicationContext(),Constants.list,Constants.names);
        adapter.notifyDataSetChanged();
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent j;
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        j=new Intent(MainActivity.this,Grid.class);
                        j.putExtra("Type","Management");
                        startActivity(j);
                        break;
                    case 1:
                        j=new Intent(MainActivity.this,Grid.class);
                        j.putExtra("Type","Residence");
                        startActivity(j);
                        break;
                    case 2:
                        j=new Intent(MainActivity.this,Grid.class);
                        j.putExtra("Type","Eateries");
                        startActivity(j);
                        break;
                    case 3:
                        j=new Intent(MainActivity.this,Grid.class);
                        j.putExtra("Type","Amenities");
                        startActivity(j);
                        break;
                    case 4:
                        j=new Intent(MainActivity.this,Grid.class);
                        j.putExtra("Type","Travel");
                        startActivity(j);
                        break;
                    case 5:
                        j=new Intent(MainActivity.this,Expandable_List.class);
                        j.putExtra("Type","Maps");
                        startActivity(j);
                        break;


                }
            }
        });
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
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {

        } else if (id == R.id.maps) {
            startActivity(new Intent(MainActivity.this,Expandable_List.class));



        } else if (id == R.id.nav_share) {
            ApplicationInfo app=getApplicationContext().getApplicationInfo();
            String filePath=app.sourceDir;
            Intent sendIntent=new Intent(Intent.ACTION_SEND);
            sendIntent.setType("*/*");
            sendIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
            startActivity(Intent.createChooser(sendIntent,"Share Via"));
        } else if (id == R.id.about) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
