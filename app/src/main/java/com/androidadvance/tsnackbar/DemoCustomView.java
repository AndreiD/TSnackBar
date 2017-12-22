package com.androidadvance.tsnackbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;

public class DemoCustomView extends LinearLayout {
    public Button CloseButton;

    public DemoCustomView(Context context) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.demo_custom_view_include, this, true);

        CloseButton = (Button) findViewById(R.id.demo_close_btn);
    }



}
