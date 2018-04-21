package com.abadarau.tourguider;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.abadarau.tourguider.adapters.BratislavaAttractionAdapter;
import com.abadarau.tourguider.domain.entities.BratislavaAttraction;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BratislavaMuseums extends Fragment {


    public BratislavaMuseums() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bratislava_attravtions_list_view, container, false);
        BratislavaAttractionAdapter bratislavaAttractionAdapter = new BratislavaAttractionAdapter(getContext(), R.layout.bratislava_attraction_list_item, getAttractions());
        ListView museumList = view.findViewById(R.id.bratislava_attractions_list_view);
        museumList.setAdapter(bratislavaAttractionAdapter);
        return view;
    }

    private List<BratislavaAttraction> getAttractions() {
        ArrayList<BratislavaAttraction> bratislavaAttractions = new ArrayList<>();
        bratislavaAttractions.add(new BratislavaAttraction(
                "Slovak National Museum",

                R.string.slovak_national_museum,
                R.drawable.slovak_national_museum
        ));
        bratislavaAttractions.add(new BratislavaAttraction(
                "Bratislava City Museum",
                R.string.bratislava_city_museum,
                R.drawable.bratislava_city_museum
        ));
        return bratislavaAttractions;
    }

}
