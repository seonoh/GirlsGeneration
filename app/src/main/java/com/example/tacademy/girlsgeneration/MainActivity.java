package com.example.tacademy.girlsgeneration;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView)findViewById(R.id.girl_image);
//        imageView.setImageResource(R.drawable.girls_eneration_all);

        //girlFragment=(GirlFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_list);

        GirlFragment gf = new GirlFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, gf);
        ft.commit();
    }


    public void callMainMethod(int Itemid) {
        ImageView imageView = (ImageView) findViewById(R.id.girl_image);
        imageView.setImageResource(Itemid);
    }
}