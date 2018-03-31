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
public class DrinkFragment extends Fragment {

    public DrinkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        /** Create a list of places */
        final ArrayList <Place> places = new ArrayList <Place>();
        places.add(new Place(getString(R.string.la_zvonuri), getString(R.string.pub)));
        places.add(new Place(getString(R.string.bellagio), getString(R.string.bar)));
        places.add(new Place(getString(R.string.snack_bar), getString(R.string.bar)));
        places.add(new Place(getString(R.string.carolina), getString(R.string.club)));
        places.add(new Place(getString(R.string.fresko), getString(R.string.coffee)));
        places.add(new Place(getString(R.string.alex_cafe),getString(R.string.coffee)));


        /**Create a PlaceAdapter; create layouts for each item in the place_list.*/
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_drink);

        /** Find the ListView object in the place_list.xml layout file.*/
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**Attach the PlaceAdapter; ListView will display place_list items for each place in the place_list of places */
        listView.setAdapter(adapter);

        return rootView;
    }
}
