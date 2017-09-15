package org.hocrox.kotlinrxretrofitandroid.ServerRequests

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.hocrox.kotlinrxretrofitandroid.models.errormodel.ErrorDTO
import retrofit2.Call
import retrofit2.Response

/**
 * Created by sahilgoyal on 28/8/17.
 */
public class RequestCallback<T>(val dispatch: Dispatch, val result: Response<T>)  {


     fun onResponse() {

         if (result.isSuccessful) {

             dispatch.apiSuccess(result)

         } else {


             val gson: Gson = GsonBuilder().create()
             val errorDTO: ErrorDTO = gson.fromJson(result.errorBody().string(), ErrorDTO::class.java)

             dispatch.apiError(errorDTO)
         }
     }

     fun onFailure(call: Call<T>?, t: Throwable?) {

        if (t != null) {
            dispatch.error(t.message)
        }

    }


}

