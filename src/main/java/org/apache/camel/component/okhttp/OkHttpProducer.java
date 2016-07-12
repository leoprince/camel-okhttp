package org.apache.camel.component.okhttp;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class OkHttpProducer extends DefaultProducer {
	OkHttpClient okHttpClient;

	public OkHttpProducer(Endpoint endpoint) {
		super(endpoint);
		okHttpClient = new OkHttpClient();
		// TODO Auto-generated constructor stub
	}

	public void process(Exchange exchange) throws Exception {
		System.out.println("Inside Producer:" + exchange.getIn().getBody());
		Request request = new Request.Builder().url("https://raw.github.com/square/okhttp/master/README.md").build();

		Response response = okHttpClient.newCall(request).execute();
		System.out.println("Response from OkHttp Github:" + response.body());

		response.body().close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
