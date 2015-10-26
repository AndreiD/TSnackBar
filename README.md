Top Snackbar
==========================

Show a Snackbar from the top.


![alt text](https://raw.githubusercontent.com/AndreiD/TSnackBar/master/app/snackbar.gif "How the app looks 1")



### Instalation:

in your project build.gradle add

~~~~
allprojects {
    repositories {
        jcenter()
        maven {
            url 'https://dl.bintray.com/andreid/maven/'
        }
    }
}
~~~~

in your app build.gradle add

~~~~
compile 'com.androidadvance:topsnackbar:0.0.6'
~~~~



### How to use it:


##### Simple usage:

~~~~
 TSnackbar.make(findViewById(android.R.id.content),"xxxx",TSnackbar.LENGTH_LONG).show();
~~~~

##### Custom colors:

~~~~
                TSnackbar snackbar = TSnackbar
                        .make(findViewById(R.id.coordinatorLayout), "A Snackbar is a lightweight material design method for providing feedback to a user, while optionally providing an action to the user.", TSnackbar.LENGTH_LONG);
                snackbar.setActionTextColor(Color.WHITE);
                View snackbarView = snackbar.getView();
                snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
                TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.tsnackbar.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);
                snackbar.show();
~~~~

##### Custom colors & Action Button:              

~~~~                
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
~~~~


#### Updates, Questions, and Requests

Ping me here :)


#### TODO://

* Add easy change of colors
* Add icons


#### Check https://github.com/AndreiD/UltimateAndroidAppTemplate if you like this one.
