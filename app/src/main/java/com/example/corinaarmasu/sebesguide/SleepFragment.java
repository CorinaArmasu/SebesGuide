package com.example.corinaarmasu.sebesguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SleepFragment extends Fragment {

    public SleepFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        /** Create a list of places*/
        ArrayList <Place> places = new ArrayList <Place>();
        places.add(new Place(getString(R.string.leul_de_aur), getString(R.string.stars_2)));
        places.add(new Place(getString(R.string.axa_hotel), getString(R.string.stars_4)));
        places.add(new Place(getString(R.string.adrian_vila), getString(R.string.vila)));
        places.add(new Place(getString(R.string.turn_hotel), getString(R.string.stars_3)));
        places.add(new Place(getString(R.string.fan_hotel), getString(R.string.stars_3)));
        places.add(new Place(getString(R.string.pensiunea_ana), getString(R.string.guest_house)));


        /**Create a PlaceAdapter; create layouts for each item in the place_list.*/
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_sleep);

        /** Find the ListView object in the place_list.xml layout file.*/
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**Attach the PlaceAdapter; ListView will display place_list items for each place in the place_list of places */
        listView.setAdapter(adapter);

        return rootView;
    }
}
