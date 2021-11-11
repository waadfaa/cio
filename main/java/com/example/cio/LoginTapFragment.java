package com.example.cio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class LoginTapFragment extends Fragment {

    EditText email;
    EditText password;
    Button SignIn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root =(ViewGroup) inflater.inflate(R.layout.login_tap_fragment,container, false);

        email = root.findViewById(R.id.email);
        password = root.findViewById(R.id.password);
        SignIn = root.findViewById(R.id.SignIn);

        return root;
    }
}
