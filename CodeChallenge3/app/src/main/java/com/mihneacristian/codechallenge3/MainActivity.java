package com.mihneacristian.codechallenge3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.mihneacristian.codechallenge3.Fragments.LoginFragment;

public class MainActivity extends AppCompatActivity {

    public static final String FIRST_NAME = "first";
    public static final String LAST_NAME = "last";

    private EditText firstNameEditText;
    private EditText lastNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameEditText = findViewById(R.id.firstName);
        lastNameEditText = findViewById(R.id.lastName);

    }

    public void sendLoginInformationOnClick(View view) {

        String firstName = firstNameEditText.getText().toString();
        String lastName = lastNameEditText.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString(FIRST_NAME, firstName);
        bundle.putString(LAST_NAME, lastName);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        LoginFragment loginFragment = new LoginFragment();
        loginFragment.setArguments(bundle);

        fragmentTransaction.replace(R.id.displayCredentialsFragment, loginFragment);
        fragmentTransaction.commit();
    }
}