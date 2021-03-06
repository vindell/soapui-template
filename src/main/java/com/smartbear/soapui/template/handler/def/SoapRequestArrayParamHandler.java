/*
 * Copyright (c) 2018, hiwepy (https://github.com/hiwepy).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.smartbear.soapui.template.handler.def;

import com.eviware.soapui.impl.wsdl.WsdlOperation;
import com.eviware.soapui.impl.wsdl.WsdlRequest;
import com.eviware.soapui.impl.wsdl.support.soap.SoapVersion;
import com.eviware.soapui.support.SoapUIException;
import com.smartbear.soapui.template.handler.SoapRequestHandler;
import com.smartbear.soapui.template.utils.SoapuiRequestUtils;

/**
 * TODO
 * @author 		： <a href="https://github.com/hiwepy">hiwepy</a>
 */
public class SoapRequestArrayParamHandler implements SoapRequestHandler<String[]> {

	@Override
	public String handleRequest(WsdlOperation operationInst, WsdlRequest request, String[] params) throws SoapUIException {
		// generate the request content from the schema
		String requestXML = operationInst.createRequest( true );
		// 对 requestContent 进行动态补全
		SoapVersion soapVersion = operationInst.getInterface().getSoapVersion();
		return SoapuiRequestUtils.buildSoapMessage(requestXML, soapVersion, params);
	}

}
