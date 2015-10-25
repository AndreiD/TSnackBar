package com.androidadvance.tsnackbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androidadvance.topsnackbar.TSnackbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_example_1 = (Button) findViewById(R.id.button_example_1);
        Button button_example_2 = (Button) findViewById(R.id.button_example_2);
        Button button_example_3 = (Button) findViewById(R.id.button_example_3);
        Button button_example_4 = (Button) findViewById(R.id.button_example_4);

        button_example_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSnackbar.make(findViewById(R.id.coordinatorLayout), "Hello from VSnackBar 1", TSnackbar.LENGTH_LONG).show();
            }
        });


        button_example_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TSnackbar snackbar = TSnackbar
                        .make(findViewById(R.id.coordinatorLayout), "Had a snack at Snackbar", TSnackbar.LENGTH_LONG)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.d("CLICKED UNDO", "CLIDKED UNDO");
                            }
                        });
                snackbar.setActionTextColor(Color.BLACK);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#00CC00"));
                TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.tsnackbar.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);
                snackbar.show();

            }
        });


        button_example_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TSnackbar snackbar = TSnackbar
                        .make(findViewById(R.id.coordinatorLayout), "Had a snack at Snackbar", TSnackbar.LENGTH_LONG)
                        .setAction("Action", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.d("CLICKED Action", "CLIDKED Action");
                            }
                        });
                snackbar.setActionTextColor(Color.WHITE);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#0000CC"));
                TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.tsnackbar.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);
                snackbar.show();

            }
        });


        button_example_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TSnackbar snackbar = TSnackbar
                        .make(findViewById(R.id.coordinatorLayout), "Had a snack at Snackbar  Had a snack at Snackbar  Had a snack at Snackbar Had a snack at Snackbar Had a snack at Snackbar Had a snack at Snackbar", TSnackbar.LENGTH_LONG);
                snackbar.setActionTextColor(Color.WHITE);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
                TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.tsnackbar.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);
                snackbar.show();

            }
        });
    }
}
