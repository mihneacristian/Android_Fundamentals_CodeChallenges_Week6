package com.mihneacristian.codechallenge3.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mihneacristian.codechallenge3.MainActivity;
import com.mihneacristian.codechallenge3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private TextView loginCredentialsTextView;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        loginCredentialsTextView = view.findViewById(R.id.loginCredentials);

        getDataFromActivity();

        return view;
    }

    public void getDataFromActivity() {

        Bundle bundle = getArguments();
        String firstName = bundle.getString(MainActivity.FIRST_NAME, "");
        String lastName = bundle.getString(MainActivity.LAST_NAME, "");
        String firstNameLastName = firstName + " " + lastName;
        loginCredentialsTextView.setText(firstNameLastName);
    }

}