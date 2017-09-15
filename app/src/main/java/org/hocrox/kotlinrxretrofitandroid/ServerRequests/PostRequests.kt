package org.hocrox.kotlinrxretrofitandroid.ServerRequests

import org.hocrox.kotlinrxretrofitandroid.models.GetLoginResponseModel
import org.hocrox.kotlinrxretrofitandroid.models.SendLoginRequestModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * Created by sahilgoyal on 28/8/17.
 */
interface PostRequests {

    @POST("authenticate")
    fun authenticateUser(@Body sendLoginRequestModel: SendLoginRequestModel): Observable<Response<GetLoginResponseModel>>


}