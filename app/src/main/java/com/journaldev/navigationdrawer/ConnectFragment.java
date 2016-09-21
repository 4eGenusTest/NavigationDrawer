package com.journaldev.navigationdrawer;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class ConnectFragment extends Fragment {
    TextView title;
    ImageView pic;
    TextView code;
    private String[] mNavigationDrawerItemTitles;

    public ConnectFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mNavigationDrawerItemTitles= getResources().getStringArray(R.array.promotion_codes);
        View rootView = inflater.inflate(R.layout.fragment_connect, container, false);
        title = (TextView) rootView.findViewById(R.id.label);
        pic = (ImageView) rootView.findViewById(R.id.cardPicture);
        code = (TextView) rootView.findViewById(R.id.cardCode);
        setCard();
        return rootView;
    }


    void setCard(){
        //set label
        Bundle bundle = this.getArguments();
        String myString = bundle.getString("label", "testMiha");
        title.setText(myString);
        // set picture
        int myInt = bundle.getInt("pic");
        pic.setImageResource(myInt);
        int intCode = bundle.getInt("code");
        code.setText(mNavigationDrawerItemTitles[intCode]);
    }





}
