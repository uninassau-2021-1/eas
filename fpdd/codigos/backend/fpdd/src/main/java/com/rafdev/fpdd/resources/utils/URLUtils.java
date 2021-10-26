package com.rafdev.fpdd.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.jboss.logging.Logger;

import com.rafdev.fpdd.exceptions.ClassNotInstantiableException;

public final class URLUtils {

	private URLUtils() {
		throw new ClassNotInstantiableException(URLUtils.class);
	}

	public static String decodeParam(String param) {
		if (param == null || param.isBlank()) {
			return "";
		}
		
		try {
			return URLDecoder.decode(param, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			Logger.getLogger(URLUtils.class).info(e);
			return "";
		}
	}

	public static List<Integer> decodeIntList(String ids) {
		return Arrays.asList(ids.split(",")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
	}

}
