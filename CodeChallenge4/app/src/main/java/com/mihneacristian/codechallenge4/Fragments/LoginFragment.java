package com.mihneacristian.codechallenge4.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.mihneacristian.codechallenge4.MainActivity;
import com.mihneacristian.codechallenge4.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private TextView loginCredentialsTextView;
    private String firstName;
    private String lastName;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        loginCredentialsTextView = view.findViewById(R.id.loginCredentials);

        displayName();

        return view;
    }

    public void setData(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayName() {

        String firstNameLastName = firstName + " " + lastName;
        loginCredentialsTextView.setText(firstNameLastName);
    }

}