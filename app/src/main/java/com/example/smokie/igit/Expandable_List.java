package com.example.smokie.igit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Expandable_List extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String> header;
    HashMap<String, List<String>> child;
    ActionBar ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable__list);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        prepareList();
        expandableListView.setAdapter(new listadapter(getApplicationContext(), header, child));
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Intent b=new Intent(Expandable_List.this,MapsActivity.class);
                switch (groupPosition) {

                    case 0:
                        switch (childPosition) {
                            case 0:
                                Log.e("groupos", groupPosition + " " + childPosition);
                                b.putExtra("Lat", 20.9348201);
                                b.putExtra("Long", 85.2630304);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "IGIT");
                                Log.e("Name1", "gdb");
                                break;
                            case 1:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "arya");
                                break;
                            case 2:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 3:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 4:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 5:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 6:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 7:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 8:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 9:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 10:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            default:
                                break;
                        }
                        break;
                    case 1:
                        switch (childPosition) {
                            case 0:
                                Log.e("groupos", groupPosition + " " + childPosition);
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 1:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 2:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 3:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 4:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 5:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 6:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 7:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 8:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 9:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        switch (childPosition) {
                            case 0:
                                Log.e("groupos", groupPosition + " " + childPosition);
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 1:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 2:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 3:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 4:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 5:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 6:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                        }
                        break;
                    case 3:
                        switch (childPosition) {
                            case 0:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 1:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 2:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 3:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 4:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 5:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 6:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 7:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 8:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 9:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 10:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 11:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        switch (childPosition) {
                            case 0:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 1:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 2:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 3:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 4:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 5:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 6:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 7:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            case 8:
                                b.putExtra("Lat", 12.0);
                                b.putExtra("Long", 23.0);
                                b.putExtra("zoom", 15.0);
                                b.putExtra("Name", "gwjhfhj");
                                break;
                            default:
                                break;
                        }
                        break;
                }
                startActivity(b);
                return true;
            }
        });
        ab=getSupportActionBar();
        ab.setDisplayShowHomeEnabled(true);

    }

    private void prepareList() {
        header=new ArrayList<String>();
        child=new HashMap<String, List<String>>();
        for (int i = 0; i < Constants.names.length-1; i++)
            header.add(Constants.names[i]);
        List<String> management=new ArrayList<String>();
        for(int j=0;j<Constants.Management_map.length;j++)
            management.add(Constants.Management_map[j]);
        List<String> residence=new ArrayList<String>();
        for(int j=0;j<Constants.Residence_name.length;j++)
            residence.add(Constants.Residence_name[j]);
        List<String> eateries=new ArrayList<String>();
        for(int j=0;j<Constants.Eateries_name.length;j++)
            eateries.add(Constants.Eateries_name[j]);
        List<String> amenities=new ArrayList<String>();
        for(int j=0;j<Constants.Amenities_name.length;j++)
            amenities.add(Constants.Amenities_name[j]);
        List<String> travel=new ArrayList<String>();
        for(int j=0;j<Constants.Travel_map.length;j++)
            travel.add(Constants.Travel_map[j]);
        child.put(header.get(0),management);
        child.put(header.get(1),residence);
        child.put(header.get(2),eateries);
        child.put(header.get(3),amenities);
        child.put(header.get(4),travel);




    }
}
