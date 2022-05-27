package com.example.krushi_app1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class home_fragment extends Fragment {


Button b1;
Button b2;
    public home_fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    //    ImageView s= (ImageView)findViewById(R.id.image_view);
    //    s.setY(0);
   //     s.setX(-100);
        View view=inflater.inflate(R.layout.fragment_home_fragment, container, false);

        b1=view.findViewById(R.id.Button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment registerFrag = new Register();
                FragmentTransaction fm=getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.container,registerFrag).commit();

            }
        });


        b2=view.findViewById(R.id.Button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment loginFrag=new Login();
                FragmentTransaction fm1=getActivity().getSupportFragmentManager().beginTransaction();
                fm1.replace(R.id.container,loginFrag).commit();
            }
        });
    return view;
    }
}