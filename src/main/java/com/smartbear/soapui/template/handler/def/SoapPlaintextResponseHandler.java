 package com.smartbear.soapui.template.handler.def;

import com.eviware.soapui.impl.wsdl.WsdlOperation;
import com.eviware.soapui.model.iface.Response;
import com.eviware.soapui.support.SoapUIException;
import com.smartbear.soapui.template.handler.SoapResponseHandler;

/**
 * 请求响应处理：返回String对象
 * @author 		： <a href="https://github.com/vindell">vindell</a>
 */
public class SoapPlaintextResponseHandler implements SoapResponseHandler<String> {
 
	@Override
	public String handleResponse(WsdlOperation operationInst, Response response) throws SoapUIException {
		return response.getContentAsString();
	}
	
}

 