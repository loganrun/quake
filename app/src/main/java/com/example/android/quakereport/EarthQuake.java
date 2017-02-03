package com.example.android.quakereport;

/**
 * Created by loganrun on 1/5/17.
 */
public class EarthQuake {
    private double mQuakeMag;
    private String mQuakePlace;
    private long mTimeInMilliseconds;
    private String mQuakeUrl;
   // private String mQuakeDate;

    public EarthQuake (double quakeMag, String quakePlace, long timeInMilliseconds, String quakeUrl){
        mQuakeMag = quakeMag;
        mQuakePlace = quakePlace;
       // mQuakeDate= quakeDate;
        mTimeInMilliseconds = timeInMilliseconds;
        mQuakeUrl = quakeUrl;
    }

    public double getQuakeMag(){return mQuakeMag;}

    public String getQuakePlace(){ return mQuakePlace;}

    public long getTimeInMilliseconds(){return mTimeInMilliseconds;}

    public  String getQuakeUrl(){return mQuakeUrl;}

    //public String getQuakeDate(){ return mQuakeDate;}


}
