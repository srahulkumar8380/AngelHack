package com.hackthon.srahulkumar.remotebus;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v;

        v = inflater.inflate(R.layout.fragment_two, container, false);
        EditText destination = v.findViewById(R.id.destination);
        String val = destination.getText().toString();
        return v;
    }

}
