package com.example.corinaarmasu.sebesguide;

import android.view.LayoutInflater;
import android.view.View;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class VisitFragment extends Fragment {

    public VisitFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        /** Create a place_list of places  to add drawable....*/
        ArrayList <Place> places = new ArrayList <Place>();
        places.add(new Place(getString(R.string.casa_zapolya), getString(R.string.historical), R.drawable.zapolya));
        places.add(new Place(getString(R.string.franciscana_monastery), getString(R.string.monastery), R.drawable.franciscana));
        places.add(new Place(getString(R.string.lucian_blaga), getString(R.string.memorial_house), R.drawable.lucian));
        places.add(new Place(getString(R.string.tower), getString(R.string.tower_building), R.drawable.turn));
        places.add(new Place(getString(R.string.gymnasium), getString(R.string.evangelical), R.drawable.evanghelic));
        places.add(new Place(getString(R.string.clasic_hotel), getString(R.string.hotel), R.drawable.clasic));

        /**Create a PlaceAdapter; create layouts for each item in the place_list.*/
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_visit);

        /** Find the ListView object in the place_list.xml layout file.*/
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**Attach the PlaceAdapter; ListView will display place_list items for each place in the place_list of places */
        listView.setAdapter(adapter);

        return rootView;
    }
}
