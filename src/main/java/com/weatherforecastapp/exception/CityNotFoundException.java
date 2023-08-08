package com.weatherforecastapp.exception;

public class CityNotFoundException extends RuntimeException {
    private final String redirectPath;

    public CityNotFoundException(String cityName, String redirectPath) {
        super("City not found: " + cityName);
        this.redirectPath = redirectPath;
    }

    public String getRedirectPath() {
        return redirectPath;
    }
}
