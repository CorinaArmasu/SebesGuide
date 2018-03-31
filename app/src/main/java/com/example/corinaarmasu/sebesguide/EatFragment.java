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
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        /** Create a list of places  */
        final ArrayList <Place> places = new ArrayList <Place>();

        places.add(new Place(getString(R.string.karlhof), getString(R.string.german)));
        places.add(new Place(getString(R.string.gasthof), getString(R.string.german)));
        places.add(new Place(getString(R.string.dolce), getString(R.string.italian)));
        places.add(new Place(getString(R.string.mirage), getString(R.string.french)));
        places.add(new Place(getString(R.string.casa), getString(R.string.traditional)));
        places.add(new Place(getString(R.string.ioana), getString(R.string.traditional)));

        /**Create a PlaceAdapter; create layouts for each item in the place_list.*/
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_eat);

        /** Find the ListView object in the place_list.xml layout file.*/
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**Attach the PlaceAdapter; ListView will display place_list items for each place in the place_list of places */
        listView.setAdapter(adapter);

        return rootView;
    }
}
