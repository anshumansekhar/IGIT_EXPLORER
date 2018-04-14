package com.example.smokie.igit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by SMOKIE on 12-03-2017.
 */
public class adapter extends BaseAdapter {
    Context ctx;
    int[] list;
    String[] names;


    public adapter(Context ctx, int[] list, String[] names) {
        this.ctx = ctx;
        this.list = list;
        this.names = names;
    }

    @Override
    public int getCount() {
        return list.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        grid=inflater.inflate(R.layout.image,null);
        ImageView imgf=(ImageView)grid.findViewById(R.id.imageq);
        Glide.with(ctx)
                .load(list[position])
                .centerCrop()
                .into(imgf);
        TextView name=(TextView)grid.findViewById(R.id.name);
        name.setText(names[position]);
        return grid;
    }

}




