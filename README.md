# RetrofitKotlinRxJavaAndroid

This  Project is the combination of RxJava with Retrofit in kotlin. 

Steps to integrate this project classes into your project 
1. Add this permission in manifest file

<uses-permission android:name="android.permission.INTERNET"/>

2. Configure your android studio with kotlin. Check out this below link to configure the kotlin  

https://segunfamisa.com/posts/setting-up-android-studio-for-kotlin-development

3.Now Need to add the dependencies for rx in buid.gradle(Module:app)

   dependencies{ 

   compile 'io.reactivex:rxjava:1.1.0'
   compile 'io.reactivex:rxandroid:1.1.0'
   
  }
  
 4. Then sync your project ..after that add dependencies for rertofit and retrofit rx adapter
 
 dependencies{
 
     compile 'com.squareup.okhttp3:logging-interceptor:3.3.1'
    compile 'com.squareup.okhttp3:okhttp:3.3.1'
    compile 'com.squareup.retrofit2:converter-gson:2.0.0'
    compile 'com.squareup.retrofit2:adapter-rxjava:2.0.0'
 
 }
 
 5. Sync your project 
 
 6. All setup now just download this project and copy the Server Request Package 
     and model package and paste into your project 

7.Now you are ready to go.........
 
If anyone faces any kind of difficulity while integrate that project..cann contact me sahilgoyal9994@gmail.com 
 
 
     
     
   
