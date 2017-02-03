package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by loganrun on 1/16/17.
 */
public class EarthquakeLoader extends AsyncTaskLoader<List<EarthQuake>> {

    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    private String mUrl;

    public EarthquakeLoader(Context context, String url){
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading(){
        forceLoad();
    }

    @Override
    public List<EarthQuake> loadInBackground(){
        if (mUrl == null){
            return null;
        }
        List<EarthQuake> earthQuakes= QueryUtils.fetchEarthquakeData(mUrl);
        return earthQuakes;
    }
}
