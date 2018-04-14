package com.example.smokie.igit;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by SMOKIE on 12-03-2017.
 */
public class viewpageradapter extends PagerAdapter {
    Context ctx;
    int[] list_images;
    LayoutInflater mLayoutInflater;
    public viewpageradapter(Context ctx, int list_images) {
        this.ctx = ctx;
        int[] images=new int[1];
        images[0]=list_images;
        this.list_images = images;
        mLayoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public viewpageradapter(Context ctx, int[] list_images) {
        this.ctx = ctx;
        this.list_images = list_images;
        mLayoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list_images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==((ImageView)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView=mLayoutInflater.inflate(R.layout.image_pager,container,false);
        ImageView imageView=(ImageView)itemView.findViewById(R.id.pagerimage);
        Glide.with(ctx)
                .load(list_images[position])
                .centerCrop()
                .into(imageView);
//        imageView.setImageResource(list_images[position]);
        container.addView(imageView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView)object);
    }
}
