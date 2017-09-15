package org.hocrox.kotlinrxretrofitandroid

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_server_request2.*
import org.hocrox.kotlinrxretrofitandroid.ServerRequests.Dispatch
import org.hocrox.kotlinrxretrofitandroid.ServerRequests.DispatchResponse
import org.hocrox.kotlinrxretrofitandroid.models.SendLoginRequestModel
import org.hocrox.kotlinrxretrofitandroid.models.errormodel.ErrorDTO

class ServerRequestActivity : AppCompatActivity(), Dispatch {

    lateinit var progressDialog: ProgressDialog

    override fun <T> apiSuccess(body: T) {

        progressDialog.dismiss()
        Log.e("Testing", "sucesss")
        Toast.makeText(this, "sucess", Toast.LENGTH_LONG).show()

    }

    override fun apiError(error: ErrorDTO) {
        progressDialog.dismiss()
        Log.e("Testing", "error from api" + error.message)
        Toast.makeText(this, "" + error.message, Toast.LENGTH_LONG).show()
    }

    override fun error(body: String?) {
        progressDialog.dismiss()
        Log.e("Testing", "error " + body)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_server_request2)


        //***********Press the button to get the response from server
        //Need to change the base url in dispatch response


        btnSendRequest.setOnClickListener({

            progressDialog = ProgressDialog(this)
            progressDialog.setMessage("Please Wait")
            progressDialog.show()
            DispatchResponse.dispatchResponse(this, "login", SendLoginRequestModel("NORMAL", "sahil", "sahil"))

        })

    }
}
