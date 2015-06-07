package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] forecastData = {
                "Mon - Sunny - 83/63",
                "Tues - Foggy - 70/46",
                "Weds - Cloudy - 72/63",
                "Thurs - Rainy - 64/51",
                "Fri - Foggy - 70/46",
                "Sat - Sunny - 75/68",
                "Sun - Snowy - 32/14"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastData));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(), // current context (this activity)
                R.layout.list_item_forecast, // Name of the layout id
                R.id.list_item_forecast_textview, // id of the textview to populate
                weekForecast);

        // Get view hierarchy?
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Get reference to ListView and bind the adapter to it
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);

        return rootView;
    }
}
