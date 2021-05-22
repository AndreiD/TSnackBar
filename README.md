Top Snackbar
==========================

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-TSnackBar-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/2779) [ ![Download](https://api.bintray.com/packages/andreid/maven/topsnackbar/images/download.svg) ](https://bintray.com/andreid/maven/topsnackbar/_latestVersion)

Show a Snackbar from the top. A big thanks to https://github.com/ejohansson, https://github.com/antoninovitale, https://github.com/hansonchris and everyone that took the time to make pull requests. 


![alt text](https://raw.githubusercontent.com/AndreiD/TSnackBar/master/app/snackbar.gif "How the app looks 1")

Icons support:

![alt text](https://raw.githubusercontent.com/AndreiD/TSnackBar/master/app/with_icon.jpg "How the app looks 1")


### Installation (app's build.gradle):


~~~~ groovy
maven {
            url 'https://jitpack.io'
        }

implementation 'com.github.Redman1037:TSnackBar:V2.0.0'
~~~~

### How to use it (a tutorial starting from **simple usage** to **complex one**):


##### Example 1: Simple usage:

~~~~ java
TSnackbar.make(findViewById(android.R.id.content),"Hello from TSnackBar.",TSnackbar.LENGTH_LONG).show();
~~~~

##### Example 2: Custom colors:

~~~~  java
TSnackbar snackbar = TSnackbar.make(findViewById(android.R.id.content), "A Snackbar is a lightweight material design method for providing feedback to a user, while optionally providing an action to the user.", TSnackbar.LENGTH_LONG);
snackbar.setActionTextColor(Color.WHITE);
View snackbarView = snackbar.getView();
snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
textView.setTextColor(Color.YELLOW);
snackbar.show();
~~~~

##### Example 3: Give 'em everything you got:

~~~~ java
//vectordrawable
TSnackbar snackbar = TSnackbar
        .make(relative_layout_main, "Snacking with VectorDrawable", TSnackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.WHITE);
        snackbar.setIconLeft(R.drawable.ic_android_green_24dp, 24);
        View snackbarView = snackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
        TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
        textView.setTextColor(Color.YELLOW);
        snackbar.show();

  //left and right icon
 TSnackbar snackbar = TSnackbar
         .make(relative_layout_main, "Snacking Left & Right", TSnackbar.LENGTH_LONG);
         snackbar.setActionTextColor(Color.WHITE);
         snackbar.setIconLeft(R.mipmap.ic_core, 24); //Size in dp - 24 is great!
         snackbar.setIconRight(R.drawable.ic_android_green_24dp, 48); //Resize to bigger dp
         snackbar.setIconPadding(8);
         snackbar.setMaxWidth(3000); //if you want fullsize on tablets
         View snackbarView = snackbar.getView();
         snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"));
         TextView textView = (TextView) snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
         textView.setTextColor(Color.YELLOW);
         snackbar.show();
~~~~

#### Troubleshooting 

1. Make sure you have the ***latest*** shit. At this moment: compileSdkVersion 99+, targetSdkVersion 99+, buildToolsVersion "99.0.1", compile 'com.android.support:appcompat-v7:99.1.0',   compile 'com.android.support:design:99.1.0' etc.
2. Notice that, if you use ***findViewById(android.R.id.content)*** your tsnackbar might appear over your notifications bar (the one with the clock, battery). To fix it, replace it with your view, coordinator layout etc.
3. If your TSnackbar appears with padding on the sides, make sure the parent view doesn't have padding.
4. Note: remember to use CoordinatorLayout if you get some strange behaviour!
#### Updates, Questions, and Requests

Ping me here :)


#### Want to contribute ?

You are a hero.

#### TODO://

* Persistent mode.
* Waiting for your suggestions

#### Changes List

1.1.1: added .setMaxWidth() method to make (ex: you want them to appear larger(fullwith) on tablets)

#### You like this library ? Check:
- https://github.com/AndreiD/SimpleChat - Simple Realtime Room Chat in Android.
- https://github.com/AndreiD/surveylib - A very good looking survey library
- https://github.com/AndreiD/UltimateAndroidAppTemplate The best android template app to start with


## Stargazers over time

[![Stargazers over time](https://starcharts.herokuapp.com/AndreiD/TSnackBar.svg)](https://starcharts.herokuapp.com/AndreiD/TSnackBar)
      
      
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
