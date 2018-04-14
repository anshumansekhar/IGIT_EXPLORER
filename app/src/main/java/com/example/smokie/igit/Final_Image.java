package com.example.smokie.igit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Final_Image extends AppCompatActivity {

    int image_id;
    ViewPager pager;
    viewpageradapter viewpageradapter;
    TextView descp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final__image);
        Intent q=getIntent();
        String name=q.getStringExtra("Type");
        pager=(ViewPager)findViewById(R.id.viewpager);
        descp=(TextView)findViewById(R.id.name);
        if(name.equals(Constants.Residence_name[0]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[0]);
            descp.setText(Constants.Residence_description[0].toString());

        }
        if(name.equals(Constants.Residence_name[1]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[1]);
            descp.setText(Constants.Residence_description[1].toString());

        }
        if(name.equals(Constants.Residence_name[2]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[2]);
            descp.setText(Constants.Residence_description[2].toString());

        }
        if(name.equals(Constants.Residence_name[3]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[3]);
            descp.setText(Constants.Residence_description[3].toString());

        }
        if(name.equals(Constants.Residence_name[4]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[4]);
            descp.setText(Constants.Residence_description[4].toString());

        }
        if(name.equals(Constants.Residence_name[5]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[5]);
            descp.setText(Constants.Residence_description[5].toString());

        }
        if(name.equals(Constants.Residence_name[6]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[6]);
            descp.setText(Constants.Residence_description[6].toString());

        }
        if(name.equals(Constants.Residence_name[7]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[7]);
            descp.setText(Constants.Residence_description[7].toString());

        }
        if(name.equals(Constants.Residence_name[8]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[8]);
            descp.setText(Constants.Residence_description[8].toString());

        }
        if(name.equals(Constants.Residence_name[9]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Residence_images[9]);
            descp.setText(Constants.Residence_description[9].toString());

        }
        if(name.equals(Constants.Adminstrative_name[0]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.ACC_images);
            descp.setText(Constants.Adminstrative_description[0].toString());

        }
        if(name.equals(Constants.Adminstrative_name[1]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.EXAM_images);
            descp.setText(Constants.Adminstrative_description[1].toString());

        }
        if(name.equals(Constants.Adminstrative_name[2]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.PLACEMENT_images);
            descp.setText(Constants.Adminstrative_description[2].toString());

        }
        if(name.equals(Constants.Adminstrative_name[3]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.ESTABLISHMENT_images);
            descp.setText(Constants.Adminstrative_description[3].toString());

        }
        if(name.equals(Constants.Academics_name[0]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.CSE_images);
            descp.setText(Constants.Academics_description[0].toString());

        }
        if(name.equals(Constants.Academics_name[1]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.MECH_images);
            descp.setText(Constants.Academics_description[1].toString());

        }
        if(name.equals(Constants.Academics_name[2]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.CIVIL_images);
            descp.setText(Constants.Academics_description[2].toString());

        }
        if(name.equals(Constants.Academics_name[3]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.CHEMICAL_images);
            descp.setText(Constants.Academics_description[3].toString());

        }
        if(name.equals(Constants.Academics_name[4]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.META_images);
            descp.setText(Constants.Academics_description[4].toString());

        }
        if(name.equals(Constants.Academics_name[5]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.ELECT_images);
            descp.setText(Constants.Academics_description[5].toString());

        }
        if(name.equals(Constants.Academics_name[6]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.ETC_images);
            descp.setText(Constants.Academics_description[6].toString());

        }
        if(name.equals(Constants.Academics_name[7]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.MATH_images);
            descp.setText(Constants.Academics_description[7].toString());

        }
        if(name.equals(Constants.Academics_name[8]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.PHY_images);
            descp.setText(Constants.Academics_description[8].toString());

        }
        if(name.equals(Constants.Academics_name[9]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.CHE_images);
            descp.setText(Constants.Academics_description[9].toString());

        }
        if(name.equals(Constants.Eateries_name[0]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Food_images);
            descp.setText(Constants.Eateries_description[0].toString());

        }
        if(name.equals(Constants.Eateries_name[1]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Caffeteria_images);
            descp.setText(Constants.Eateries_description[1].toString());

        }
        if(name.equals(Constants.Eateries_name[2]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Canteen_images);
            descp.setText(Constants.Eateries_description[2].toString());

        }
        if(name.equals(Constants.Eateries_name[3]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Pradhan_images);
            descp.setText(Constants.Eateries_description[4].toString());

        }
        if(name.equals(Constants.Eateries_name[4]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Khuntia_images);
            descp.setText(Constants.Eateries_description[4].toString());

        }
        if(name.equals(Constants.Eateries_name[5]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Mushi_images);
            descp.setText(Constants.Eateries_description[5].toString());

        }
        if(name.equals(Constants.Amenities_name[0]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Libraray_images);
            descp.setText(Constants.Amenities_description[0].toString());

        }
        if(name.equals(Constants.Amenities_name[1]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.MPM_images);
            descp.setText(Constants.Amenities_description[1].toString());

        }
        if(name.equals(Constants.Amenities_name[2]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.AUdi_images);
            descp.setText(Constants.Amenities_description[2].toString());

        }
        if(name.equals(Constants.Amenities_name[3]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.OpenAir_images);
            descp.setText(Constants.Amenities_description[3].toString());

        }
        if(name.equals(Constants.Amenities_name[4]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.SB_images);
            descp.setText(Constants.Amenities_description[4].toString());

        }
        if(name.equals(Constants.Amenities_name[5]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.PO_images);
            descp.setText(Constants.Amenities_description[5].toString());

        }
        if(name.equals(Constants.Amenities_name[6]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Dispensary_images);
            descp.setText(Constants.Amenities_description[6].toString());

        }
        if(name.equals(Constants.Amenities_name[7]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Badminton_images);
            descp.setText(Constants.Amenities_description[7].toString());

        }
        if(name.equals(Constants.Amenities_name[8]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Volly_images);
            descp.setText(Constants.Amenities_description[8].toString());

        }
        if(name.equals(Constants.Amenities_name[9]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Basket_images);
            descp.setText(Constants.Amenities_description[9].toString());

        }
        if(name.equals(Constants.Amenities_name[10]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Gym_images);
            descp.setText(Constants.Amenities_description[10].toString());

        }
        if(name.equals(Constants.Amenities_name[11]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Book_images);
            descp.setText(Constants.Amenities_description[11].toString());

        }
        if(name.equals(Constants.Attractions_name[0]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Ananta_images);
            descp.setText(Constants.Attractions_description[0].toString());

        }
        if(name.equals(Constants.Attractions_name[1]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Brhamani_images);
            descp.setText(Constants.Attractions_description[1].toString());

        }
        if(name.equals(Constants.Attractions_name[2]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Dadraghati_images);
            descp.setText(Constants.Attractions_description[2].toString());

        }
        if(name.equals(Constants.Attractions_name[3]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Temple_images);
            descp.setText(Constants.Attractions_description[3].toString());

        }
        if(name.equals(Constants.Attractions_name[4]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Rajvatika_images);
            descp.setText(Constants.Attractions_description[4].toString());

        }
        if(name.equals(Constants.Attractions_name[5]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Bhimkund_images);
            descp.setText(Constants.Attractions_description[5].toString());

        }
        if(name.equals(Constants.Transport_name[0]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Rail_images);
            descp.setText(Constants.Transport_description[0].toString());

        }
        if(name.equals(Constants.Transport_name[1]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Bus_images);
            descp.setText(Constants.Transport_description[1].toString());

        }
        if(name.equals(Constants.Transport_name[2]))
        {
            viewpageradapter=new viewpageradapter(this,Constants.Auto_images);
            descp.setText(Constants.Transport_description[2].toString());

        }
        pager.setAdapter(viewpageradapter);
    }
}