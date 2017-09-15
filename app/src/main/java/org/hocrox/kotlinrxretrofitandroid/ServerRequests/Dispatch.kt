package org.hocrox.kotlinrxretrofitandroid.ServerRequests

import org.hocrox.kotlinrxretrofitandroid.models.errormodel.ErrorDTO

/**
 * Created by sahilgoyal on 28/8/17.
 */
interface Dispatch {

    fun <T>apiSuccess(body: T)
    fun apiError(error: ErrorDTO)
    fun error(body: String?)
}