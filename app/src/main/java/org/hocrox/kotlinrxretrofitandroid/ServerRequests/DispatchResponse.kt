package org.hocrox.kotlinrxretrofitandroid.ServerRequests

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.hocrox.kotlinrxretrofitandroid.models.SendLoginRequestModel
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by sahilgoyal on 28/8/17.
 */
open class DispatchResponse {

    companion object {


        //***Need to change the base url*********
        val baseApi: String = "https://7c42e8d8.ngrok.io/api/v1/"
        fun dispatchResponse(dispatchs: Dispatch, type: String, objects: Any?) {

            val http: HttpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

            val builder: OkHttpClient.Builder = OkHttpClient.Builder();

            builder.addInterceptor(http)
            val retrofit: Retrofit = Retrofit.Builder().addCallAdapterFactory(RxJavaCallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).baseUrl(baseApi).build()



            //***Change the Post,GetRequest as per requirements*********

            val postRequest: PostRequests = retrofit.create(PostRequests::class.java)


            when (type) {


                "login" -> {

                       val sendLoginRequestModel: SendLoginRequestModel = objects as SendLoginRequestModel
                        postRequest.authenticateUser(sendLoginRequestModel).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe({ result ->
                        RequestCallback(dispatchs, result).onResponse()
                      }, { error ->
                            Log.e("teet", "error dto"+error.message);

                      })


                }


            }

        }

    }


}




