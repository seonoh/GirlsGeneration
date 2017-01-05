package com.example.tacademy.girlsgeneration;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by Tacademy on 2016-11-01.
 */

public class GirlFragment extends Fragment{
    public GirlFragment(){
        super();
    }
    public  void  callMainMethod(String message){

    }
  //  MessageCallBack callBack;
    RecyclerView girlRecycler;
    GirlAdapter girlAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment, container, false);
        girlRecycler =(RecyclerView)view.findViewById(R.id.fragment_list);
        Context context = view.getContext();
        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false);
        girlRecycler.setLayoutManager(layoutManager);
        girlAdapter = new GirlAdapter();
        girlAdapter.addGirlData(new GirlValueObject(R.drawable.girls_eneration_all));
        girlAdapter.addGirlData(new GirlValueObject(R.drawable.girls_eneration_hyoyeon));
        girlAdapter.addGirlData(new GirlValueObject(R.drawable.girls_eneration_jesica));
        girlAdapter.addGirlData(new GirlValueObject(R.drawable.girls_eneration_seohyun));
        girlAdapter.addGirlData(new GirlValueObject(R.drawable.girls_eneration_sunny));
        girlAdapter.addGirlData(new GirlValueObject(R.drawable.girls_eneration_suyoung));
        girlAdapter.addGirlData(new GirlValueObject(R.drawable.girls_eneration_taeyeon));
        girlAdapter.addGirlData(new GirlValueObject(R.drawable.girls_eneration_tifany));
        girlAdapter.addGirlData(new GirlValueObject(R.drawable.girls_eneration_yuri));
        girlRecycler.setAdapter(girlAdapter);






        return  view;
    }
}
