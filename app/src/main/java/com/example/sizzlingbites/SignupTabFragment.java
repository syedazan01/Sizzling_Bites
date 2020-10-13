package com.example.sizzlingbites;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText email,mobile,pass,confipass;
    Button signup;
    float v = 0;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signuptab_fragment,container,false);
        email = root.findViewById(R.id.signup_email);
        pass = root.findViewById(R.id.signup_passoword);
        confipass = root.findViewById(R.id.confierm_password);
        signup = root.findViewById(R.id.signup_bt);
        mobile = root.findViewById(R.id.mobilenum);

        email.setTranslationX(800);
        pass.setTranslationX(800);
        confipass.setTranslationX(800);
        signup.setTranslationX(800);
        mobile.setTranslationX(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        confipass.setAlpha(v);
        signup.setAlpha(v);
        mobile.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        confipass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        mobile.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        return root;
    }
}
