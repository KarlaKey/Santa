package com.example.android.santa;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        String emailAddress = res.getString(R.string.email);
        String webPage = res.getString(R.string.website);
        String streetAddress = res.getString(R.string.address);

        // Recognize phone number
        TextView myPhone = (TextView) findViewById(R.id.phone);
        myPhone.setText(R.string.phone_number);
        myPhone.setLinkTextColor(Color.parseColor("#ffffff"));
        Linkify.addLinks(myPhone, Linkify.PHONE_NUMBERS);

        // Recognize email address
        TextView myEmail = (TextView) findViewById(R.id.email);
        myEmail.setText(emailAddress);
        myEmail.setLinkTextColor(Color.parseColor("#ffffff"));
        Linkify.addLinks(myEmail, Linkify.EMAIL_ADDRESSES);

        // Recognize web URL
        TextView myWebSite = (TextView) findViewById(R.id.website);
        myWebSite.setText(webPage);
        myWebSite.setLinkTextColor(Color.parseColor("#ffffff"));
        Linkify.addLinks(myWebSite, Linkify.WEB_URLS);

        // Recognize map address
        TextView myLocation = (TextView) findViewById(R.id.location);
        myLocation.setText(streetAddress);
        myLocation.setLinkTextColor(Color.parseColor("#ffffff"));
        Linkify.addLinks(myLocation, Linkify.MAP_ADDRESSES);


    }


}

/**

 * 1600 Amphitheatre\n Parkway Mountain View, \nCA 94043
 * 2801 East Ventura Blvd, Oxnard, \nCA 93036
 Santa Claus Village, 96930 Rovaniemi, Finnland
 Joulupukin Pajakylä, 96930 Rovaniemi, Suomi

 */
