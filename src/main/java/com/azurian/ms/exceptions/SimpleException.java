/*
 * @(#)SimpleException.java
 *
 * Copyright (c) (Chile). All rights reserved.
 *
 * All rights to this product are owned by and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
/**
 *
 */
package com.azurian.ms.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.HttpStatus;

/**
 * SimpleException.
 *
 * @author Jose.
 * @version 1.0.0
 */	
@JsonIgnoreProperties({
    "cause",
    "stackTrace",
    "localizedMessage",
    "suppressed",
    "status",
    "timestamp",
    "trace",
    "error",
    "path" })
public class SimpleException extends RuntimeException {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1905122041950251207L;
    /** HTTP status para esta excepcion. Por defecto INTERNAL ERROR SERVER (500) */
    private final int status;
    /** Codigo de error de cada aplicacion */
    private final String mensaje;

    /**
     * Constructor.
     *
     * @param mensaje {@link String}
     * @param httpStatus {@link HttpStatus}
     * @param cause {@link Throwable}
     */
    public SimpleException(final String mensaje, final int httpStatus, final Throwable cause) {
        super(mensaje, cause);
        this.mensaje = mensaje;
        this.status = httpStatus;
    }

    /**
     * Constructor principal.
     *
     * @param message {@link String}
     * @param httpStatus status http to response to this error
     */
    public SimpleException(final String message, final int httpStatus) {
        this(message, httpStatus, null);
    }

    /**
     * Obtiene el campo "status".
     *
     * @return status
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * Obtiene el campo "mensaje".
     *
     * @return mensaje
     */
    public String getMensaje() {
        return this.mensaje;
    }

}
