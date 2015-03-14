# Introduction #

These are the bare bones basics for how to build and run App Inventor.  You will need to have Java, Ant, the Android SDK, and the App Engine SDK installed on your machine.

**Please note that at the current time, the App Inventor build server (part of this code release) only works on Linux and Mac operating systems.**


# Building #

After downloading the code:

  * $ cd appinventor
  * $ ant

# Testing #

To run the set of App Inventor unit tests:

  * $ cd appinventor
  * $ ant tests

# Running App Inventor locally #

Once you've built according to the directions above:

  * $ <PATH TO APP ENGINE SDK>/bin/dev\_appserver.sh --port=8888 --address=0.0.0.0 build/war/ &

and in a serarate shell:

  * $ cd appinventor
  * $ ant RunLocalBuildServer

then go to http://localhost:8888 in your browser.

# Running App Inventor on Google App Engine #

For now, please use the instructions for the [App Inventor Jars distribution from MIT](https://docs.google.com/a/google.com/document/d/124V0q-Jzs8n9LqAlFKnSWxGLei_KZAUQGJUZwlALVws/view) for guidance.  That document doesn't completely describe all that you'll need but it should help to get you started.  We'll have a better document for this at some point.