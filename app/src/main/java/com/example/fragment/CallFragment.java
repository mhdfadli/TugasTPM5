package com.example.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class CallFragment extends Fragment implements View.OnClickListener {

    public CallFragment() {
        // Required empty public constructor
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btncall = view.findViewById(R.id.btn_call);
        btncall.setOnClickListener(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call, container, false);
    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.btn_call:
            String phoneNmbr ="081234567890";
            Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNmbr));
            startActivity(dialIntent);
    }
    }
}