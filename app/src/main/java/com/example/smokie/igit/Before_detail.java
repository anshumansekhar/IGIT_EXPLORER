package com.example.smokie.igit;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class Before_detail extends AppCompatActivity {
    ListView listView;
    adapter adapter;
    int[] image;
    String[] names;
    ActionBar ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_detail);
        ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        Intent s=getIntent();
        if(s.getStringExtra("Type").equals(Constants.Management_name[0]))
        {
            image=Constants.Administration_images;
            names=Constants.Adminstrative_name;

        }
        if(s.getStringExtra("Type").equals(Constants.Management_name[1]))
        {
            image=Constants.Academics_images;
            names=Constants.Academics_name;

        }
        if(s.getStringExtra("Type").equals(Constants.Travel_name[0]))
        {
            image=Constants.Attractions_images;
            names=Constants.Attractions_name;
        }
        if(s.getStringExtra("Type").equals(Constants.Travel_name[1]))
        {
            image=Constants.Transport_images;
            names=Constants.Transport_name;
        }
        listView=(ListView)findViewById(R.id.listview);
        adapter=new adapter(getApplicationContext(),image,names);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv=(TextView)view.findViewById(R.id.name);
                String itemClickedname=tv.getText().toString().trim();
                Intent q=new Intent(Before_detail.this,Final_Image.class);
                if(itemClickedname.equals(Constants.Adminstrative_name[0])) {
                    q.putExtra("Type", Constants.Adminstrative_name[0]);
                }

                if(itemClickedname.equals(Constants.Adminstrative_name[1]))
                {
                    q.putExtra("Type",Constants.Adminstrative_name[1]);

                }
                if(itemClickedname.equals(Constants.Adminstrative_name[2]))
                {
                    q.putExtra("Type",Constants.Adminstrative_name[2]);

                }
                if(itemClickedname.equals(Constants.Adminstrative_name[3]))
                {
                    q.putExtra("Type",Constants.Adminstrative_name[3]);

                }
                if(itemClickedname.equals(Constants.Academics_name[0])) {
                    q.putExtra("Type", Constants.Academics_name[0]);

                }
                if(itemClickedname.equals(Constants.Academics_name[1]))
                {
                    q.putExtra("Type",Constants.Academics_name[1]);

                }
                if(itemClickedname.equals(Constants.Academics_name[2]))
                {
                    q.putExtra("Type",Constants.Academics_name[2]);

                }
                if(itemClickedname.equals(Constants.Academics_name[3]))
                {
                    q.putExtra("Type",Constants.Academics_name[3]);

                }
                if(itemClickedname.equals(Constants.Academics_name[4]))
                {
                    q.putExtra("Type",Constants.Academics_name[4]);

                }
                if(itemClickedname.equals(Constants.Academics_name[5]))
                {
                    q.putExtra("Type",Constants.Academics_name[5]);

                }
                if(itemClickedname.equals(Constants.Academics_name[6]))
                {
                    q.putExtra("Type",Constants.Academics_name[6]);

                }
                if(itemClickedname.equals(Constants.Academics_name[7]))
                {
                    q.putExtra("Type",Constants.Academics_name[7]);

                }
                if(itemClickedname.equals(Constants.Academics_name[8]))
                {
                    q.putExtra("Type",Constants.Academics_name[8]);

                }
                if(itemClickedname.equals(Constants.Academics_name[9]))
                {
                    q.putExtra("Type",Constants.Academics_name[9]);

                }
                if(itemClickedname.equals(Constants.Attractions_name[0]))
                {
                    q.putExtra("Type",Constants.Attractions_name[0]);

                }
                if(itemClickedname.equals(Constants.Attractions_name[1]))
                {
                    q.putExtra("Type",Constants.Attractions_name[1]);

                }
                if(itemClickedname.equals(Constants.Attractions_name[2]))
                {
                    q.putExtra("Type",Constants.Attractions_name[2]);

                }
                if(itemClickedname.equals(Constants.Attractions_name[3]))
                {
                    q.putExtra("Type",Constants.Attractions_name[3]);

                }
                if(itemClickedname.equals(Constants.Attractions_name[4]))
                {
                    q.putExtra("Type",Constants.Attractions_name[4]);

                }
                if(itemClickedname.equals(Constants.Attractions_name[5]))
                {
                    q.putExtra("Type",Constants.Attractions_name[5]);

                }
                if(itemClickedname.equals(Constants.Transport_name[0]))
                {
                    q.putExtra("Type",Constants.Transport_name[0]);

                }
                if(itemClickedname.equals(Constants.Transport_name[1])) {
                    q.putExtra("Type", Constants.Transport_name[1]);

                }
                if(itemClickedname.equals(Constants.Transport_name[2]))
                {
                    q.putExtra("Type",Constants.Transport_name[2]);

                }
                startActivity(q);




            }
        });

    }
}