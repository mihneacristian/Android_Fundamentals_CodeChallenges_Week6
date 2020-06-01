package com.mihneacristian.codechallenge5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.mihneacristian.codechallenge5.fragments.AndroidListener;
import com.mihneacristian.codechallenge5.fragments.InputNamesFragment;

public class MainActivity extends AppCompatActivity implements AndroidListener {

    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);

        openFragment(new InputNamesFragment());
    }

    private void openFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.placeholder, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void concatFirstNameLastName(String firstName, String lastName) {

        String concactNames = "Hello, " + firstName + " " + lastName;
        textViewResult.setText(concactNames);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e("Listener", "click on back");
    }
}