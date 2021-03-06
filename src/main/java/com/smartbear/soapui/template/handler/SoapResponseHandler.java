package com.smartbear.soapui.template.handler;

import com.eviware.soapui.impl.wsdl.support.soap.SoapVersion;
import com.eviware.soapui.model.iface.Response;
import com.eviware.soapui.support.SoapUIException;

/**
 * Handler that encapsulates the process of generating a response object
 * from a {@link Response}.
 */
public interface SoapResponseHandler<T> {

    /**
     * Processes an {@link Response} and returns some value
     * corresponding to that response.
     *
     * @param response The response to process
     * @return A value determined by the response
     *
     * @throws SoapUIException in case of a problem or the connection was aborted
     */
    T handleResponse(Response response, SoapVersion version) throws SoapUIException;

}
