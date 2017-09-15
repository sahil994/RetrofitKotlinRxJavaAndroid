package org.hocrox.kotlinrxretrofitandroid.models.errormodel;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO for transfering error message with a list of field errors.
 */
@ToString
@Getter
@Setter
public class ErrorDTO implements Serializable {

    public  String message = null;
    public  String description = null;
    public List<FieldErrorDTO> fieldErrors;
    public String exceptionMessage;

}
