package com.example.cio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;

public class SinUpTapFragment extends Fragment {

    EditText facilityname;
    EditText email;
    EditText password;
    EditText facilitycode;
    Button signup;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root =(ViewGroup) inflater.inflate(R.layout.signup_tap_fragment,container, false);

        facilityname = root.findViewById(R.id.facilityname);
        email = root.findViewById(R.id.email);
        password = root.findViewById(R.id.password);
        facilitycode = root.findViewById(R.id.facilitycode);
        signup = root.findViewById(R.id.signup);

        return root;
    }
}
