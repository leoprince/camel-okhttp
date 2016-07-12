/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.okhttp;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;

/**
 * The <a href="http://camel.apache.org/http.html">OkHTTP Component</a>
 *
 * @version 
 */
public class OkHttpComponent extends DefaultComponent{

/*	public OkHttpComponent(CamelContext context, Class<? extends Endpoint> endpointClass) {
		super(context, endpointClass);
		// TODO Auto-generated constructor stub
	}
	*/

	
	protected Endpoint createEndpoint(String arg0, String arg1, Map<String, Object> arg2) throws Exception {
		// TODO Auto-generated method stub
		OkHttpEndpoint okHttpEndpoint = new OkHttpEndpoint();
        setProperties(okHttpEndpoint, arg2);

		return okHttpEndpoint;
	}
	

	
}