package com.mihneacristian.codechallenge5.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mihneacristian.codechallenge5.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InputNamesFragment extends Fragment {

    private EditText editTextFirstName;
    private EditText editTextLastName;
    private Button buttonSendNames;

    public InputNamesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input_names, container, false);

        editTextFirstName = view.findViewById(R.id.editTextFirstName);
        editTextLastName = view.findViewById(R.id.editTextLastName);
        buttonSendNames = view.findViewById(R.id.buttonSendNames);

        buttonSendNames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstName = editTextFirstName.getText().toString();
                String lastName = editTextLastName.getText().toString();

                AndroidListener androidListener = (AndroidListener) getActivity();
                androidListener.concatFirstNameLastName(firstName, lastName);
            }
        });

        return view;
    }
}