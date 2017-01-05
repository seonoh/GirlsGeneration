package com.example.tacademy.girlsgeneration;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Tacademy on 2016-11-01.
 */

public class GirlAdapter extends RecyclerView.Adapter<GirlAdapter.GirlViewHolder> {
    ArrayList<GirlValueObject> memberlist = new ArrayList<GirlValueObject>();

    public  void  addGirlData(GirlValueObject girlmember){
        if(girlmember != null){
            memberlist.add(girlmember);
        }
    }
    public  class GirlViewHolder extends  RecyclerView.ViewHolder{
        ImageView memberimage;
        public GirlViewHolder(View itemRootview){
            super(itemRootview);
            memberimage = (ImageView) itemRootview.findViewById(R.id.member_image);
        }
    }




    @Override
    public GirlViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);

        return new GirlViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final GirlViewHolder holder, final int position) {
        final  GirlValueObject valueObject = memberlist.get(position);
        holder.memberimage.setImageResource(valueObject.memberimage);
        holder.memberimage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ((MainActivity)view.getContext()).callMainMethod(valueObject.memberimage);
                return false;
            }
        });


    }


    @Override
    public int getItemCount() {
        return memberlist.size();
    }


}
