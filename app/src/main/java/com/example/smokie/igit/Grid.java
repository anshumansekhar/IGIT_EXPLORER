package com.example.smokie.igit;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class Grid extends AppCompatActivity implements Runnable {
    GridView grd;
    String type;
    int[] image_list;
    String[] names;
    adapter adapter;
    ActionBar ab;
    ProgressDialog pd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        grd = (GridView) findViewById(R.id.grid);
        pd = new ProgressDialog(this);
        ab=getSupportActionBar();
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setMessage("Please Wait...");
        pd.setIndeterminate(false);
        pd.setCancelable(true);
        //pd.show();
        Thread t = new Thread(Grid.this);
        t.start();
        ab.setDisplayHomeAsUpEnabled(true);
        grd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = (TextView) view.findViewById(R.id.name);
                String itemClickedname = tv.getText().toString().trim();
                Intent q = new Intent(Grid.this, Final_Image.class);
                Intent f;
                f = new Intent(Grid.this, Before_detail.class);
                if (itemClickedname.equals(Constants.Management_name[0])) {
                    f.putExtra("Type", Constants.Management_name[0]);
                    startActivity(f);
                }
                if (itemClickedname.equals(Constants.Management_name[1])) {
                    f.putExtra("Type", Constants.Management_name[1]);
                    startActivity(f);
                }
                if (itemClickedname.equals(Constants.Travel_name[0])) {

                    f.putExtra("Type", Constants.Travel_name[0]);
                    startActivity(f);
                }
                if (itemClickedname.equals(Constants.Travel_name[1])) {
                    f.putExtra("Type", Constants.Travel_name[1]);
                    startActivity(f);
                }

                if (itemClickedname.equals(Constants.Amenities_name[0])) {
                    q.putExtra("Type", Constants.Amenities_name[0]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[1])) {
                    q.putExtra("Type", Constants.Amenities_name[1]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[2])) {
                    q.putExtra("Type", Constants.Amenities_name[2]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[3])) {
                    q.putExtra("Type", Constants.Amenities_name[3]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[4])) {
                    q.putExtra("Type", Constants.Amenities_name[4]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[5])) {
                    q.putExtra("Type", Constants.Amenities_name[5]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[6])) {
                    q.putExtra("Type", Constants.Amenities_name[6]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[7])) {
                    q.putExtra("Type", Constants.Amenities_name[7]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[8])) {
                    q.putExtra("Type", Constants.Amenities_name[8]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[9])) {
                    q.putExtra("Type", Constants.Amenities_name[9]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[10])) {
                    q.putExtra("Type", Constants.Amenities_name[10]);

                }
                if (itemClickedname.equals(Constants.Amenities_name[11])) {
                    q.putExtra("Type", Constants.Amenities_name[11]);

                }
                if (itemClickedname.equals(Constants.Residence_name[0])) {
                    q.putExtra("Type", Constants.Residence_name[0]);

                }
                if (itemClickedname.equals(Constants.Residence_name[1])) {
                    q.putExtra("Type", Constants.Residence_name[1]);

                }
                if (itemClickedname.equals(Constants.Residence_name[2])) {
                    q.putExtra("Type", Constants.Residence_name[2]);

                }
                if (itemClickedname.equals(Constants.Residence_name[3])) {
                    q.putExtra("Type", Constants.Residence_name[3]);

                }
                if (itemClickedname.equals(Constants.Residence_name[4])) {
                    q.putExtra("Type", Constants.Residence_name[4]);

                }
                if (itemClickedname.equals(Constants.Residence_name[5])) {
                    q.putExtra("Type", Constants.Residence_name[5]);

                }
                if (itemClickedname.equals(Constants.Residence_name[6])) {
                    q.putExtra("Type", Constants.Residence_name[6]);

                }
                if (itemClickedname.equals(Constants.Residence_name[7])) {
                    q.putExtra("Type", Constants.Residence_name[7]);

                }
                if (itemClickedname.equals(Constants.Residence_name[8])) {
                    q.putExtra("Type", Constants.Residence_name[8]);

                }
                if (itemClickedname.equals(Constants.Residence_name[9])) {
                    q.putExtra("Type", Constants.Residence_name[9]);

                }
                if (itemClickedname.equals(Constants.Eateries_name[0])) {
                    q.putExtra("Type", Constants.Eateries_name[0]);

                }
                if (itemClickedname.equals(Constants.Eateries_name[1])) {
                    q.putExtra("Type", Constants.Eateries_name[1]);

                }
                if (itemClickedname.equals(Constants.Eateries_name[2])) {
                    q.putExtra("Type", Constants.Eateries_name[2]);

                }
                if (itemClickedname.equals(Constants.Eateries_name[3])) {
                    q.putExtra("Type", Constants.Eateries_name[3]);

                }
                if (itemClickedname.equals(Constants.Eateries_name[4])) {
                    q.putExtra("Type", Constants.Eateries_name[4]);

                }
                if (itemClickedname.equals(Constants.Eateries_name[5])) {
                    q.putExtra("Type", Constants.Eateries_name[5]);

                }
                if(q.hasExtra("Type"))
                startActivity(q);
            }
        });
    }

    @Override
    public void run() {

        Intent h = getIntent();
        type = h.getStringExtra("Type");
        if (type.equals("Management")) {
            image_list = Constants.Management_images;
            names = Constants.Management_name;
            grd.setNumColumns(1);
            grd.setColumnWidth(GridView.STRETCH_COLUMN_WIDTH);

        } else if (type.equals("Residence")) {
            image_list = Constants.Residence_images;
            names = Constants.Residence_name;

        } else if (type.equals("Eateries")) {
            image_list = Constants.Eateries_images;
            names = Constants.Eateries_name;
            grd.setNumColumns(1);
            grd.setColumnWidth(GridView.STRETCH_COLUMN_WIDTH);

        } else if (type.equals("Amenities")) {
            image_list = Constants.Amenities_images;
            names = Constants.Amenities_name;

        } else if (type.equals("Travel")) {
            image_list = Constants.Travel_images;
            names = Constants.Travel_name;
            grd.setNumColumns(1);
            grd.setColumnWidth(GridView.STRETCH_COLUMN_WIDTH);

        }

        adapter = new adapter(getApplicationContext(), image_list, names);
        adapter.notifyDataSetChanged();
        grd.setAdapter(adapter);

    }
}




