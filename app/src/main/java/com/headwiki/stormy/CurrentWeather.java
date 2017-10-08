package com.headwiki.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.SimpleFormatter;

/**
 * Created by Z77 on 07.10.2017.
 */

public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private Double mTemperature;
    private Double mHumidity;
    private Double mPrecipChance;
    private String mSummary;
    private String mTimezone;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId() {
        int iconId = R.drawable.clear_day;

        switch (getIcon()) {
            case "clear-day":
                iconId = R.drawable.clear_day;
                break;
            case "clear-night":
                iconId = R.drawable.clear_night;
                break;
            case "rain":
                iconId = R.drawable.rain;
                break;
            case "snow":
                iconId = R.drawable.snow;
                break;
            case "sleet":
                iconId = R.drawable.sleet;
                break;
            case "wind":
                iconId = R.drawable.wind;
                break;
            case "fog":
                iconId = R.drawable.fog;
                break;
            case "cloudy":
                iconId = R.drawable.cloudy;
                break;
            case "partly-cloudy-day":
                iconId = R.drawable.partly_cloudy;
                break;
            case "partly-cloudy-night":
                iconId = R.drawable.cloudy_night;
                break;
        }

        return iconId;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        Date dateTime = new Date(getTime() * 1000);
        String time = formatter.format(dateTime);
        return time;
    }

    public Double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(Double temperature) {
        mTemperature = temperature;
    }

    public Double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(Double humidity) {
        mHumidity = humidity;
    }

    public Double getPrecipChance() {
        return mPrecipChance;
    }

    public void setPrecipChance(Double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }
}
