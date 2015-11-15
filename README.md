Top Snackbar
==========================

Show a Snackbar from the top.


![alt text](https://raw.githubusercontent.com/AndreiD/TSnackBar/master/app/snackbar.gif "How the app looks 1")

Icons support:

![alt text](https://raw.githubusercontent.com/AndreiD/TSnackBar/master/app/with_icon.jpg "How the app looks 1")


### Instalation:

in your app build.gradle add

~~~~
compile 'com.androidadvance:topsnackbar:0.0.9'
~~~~



### How to use it:


##### Example 1: Simple usage:

~~~~
TSnackbar.make(findViewById(android.R.id.content),"Hello from TSnackBar.",TSnackbar.LENGTH_LONG).show();
~~~~

##### Example 2: Custom colors:

~~~~
TSnackbar snackbar = TSnackbar.make(findViewById(android.R.id.content), "A Snackbar is a lightweight material design method for providing feedback to a user, while optionally providing an action to the user.", TSnackbar.LENGTH_LONG);
snackbar.setActionTextColor(Color.WHITE);
View snackbarView = snackbar.getView();
snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
textView.setTextColor(Color.YELLOW);
snackbar.show();
~~~~

##### Example 3: Custom colors & Action Button:              

~~~~                
TSnackbar snackbar = TSnackbar
                        .make(findViewById(android.R.id.content), "Had a snack at Snackbar", TSnackbar.LENGTH_LONG)
                        .setAction("Undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.d("Action Button", "onClick triggered");
                            }
                        });
snackbar.setActionTextColor(Color.BLACK);
snackbar.addIcon(R.mipmap.ic_core, 200); <<-- replace me!
View snackbarView = snackbar.getView();
snackbarView.setBackgroundColor(Color.parseColor("#00CC00"));
TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
textView.setTextColor(Color.YELLOW);
snackbar.show();
~~~~

#### Troubleshooting 

1. Make sure you have the ***latest*** shit. At this moment: compileSdkVersion 23, targetSdkVersion 23, buildToolsVersion "23.0.1", compile 'com.android.support:appcompat-v7:23.1.0',   compile 'com.android.support:design:23.1.0' etc.
2. Notice that, if you use ***findViewById(android.R.id.content)*** your snackbar might appear over your notifications bar (the one with the clock, battery). To fix it, replace it with your view, coordinator layout etc.
3. If your TSnackbar appears with padding on the sides, make sure the parent view doesn't have padding.

#### Updates, Questions, and Requests

Ping me here :)


#### TODO://

* Waiting for your suggestions


#### You like this library ? Check:
- https://github.com/AndreiD/surveylib - A very good looking survey library
- https://github.com/AndreiD/UltimateAndroidAppTemplate The best android template app to start with


#### License

~~~~
Copyright 2015 AndroidAdvance.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
~~~~
