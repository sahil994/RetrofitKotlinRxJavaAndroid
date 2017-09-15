package org.hocrox.kotlinrxretrofitandroid.models.errormodel;



/**
 * Created by hocrox_java on 30/07/16.
 */
public class ErrorUtils {

    static ErrorDTO errorDTO;
    public static ErrorDTO getErrorDetails(String failureResponseJson){
        try{
           // errorDTO = ApplicationConstants.gson.fromJson(failureResponseJson, ErrorDTO.class);
            return errorDTO;
        }
        catch(Exception e){
            e.printStackTrace();
           // errorDTO.setExceptionMessage(e.getMessage());
            return errorDTO;

        }
    }
}
