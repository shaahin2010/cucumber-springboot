package com.gmail.shaahin2010.springcucumber.cucumber;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.springframework.http.client.ClientHttpResponse;

import lombok.Getter;

public class ResponseResults {
	
	@Getter
	private final ClientHttpResponse theResponse;

	@Getter
	private final String body;

	ResponseResults(final ClientHttpResponse response) throws IOException {
		this.theResponse = response;
		final InputStream bodyInputStream = response.getBody();
		final StringWriter stringWriter = new StringWriter();
		IOUtils.copy(bodyInputStream, stringWriter);
		this.body = stringWriter.toString();
	}

}
