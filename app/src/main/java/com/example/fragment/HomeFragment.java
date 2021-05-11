package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private RecyclerView rvMotor;
    private ArrayList<MotorModel> list = new ArrayList<>();


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMotor = view.findViewById(R.id.rv_motor);
        rvMotor.setHasFixedSize(true);
        list.addAll(MotorData.getListData());
        rvMotor.setLayoutManager(new LinearLayoutManager(getActivity()));

        CardViewMotorAdapter cardViewMotorAdapter = new CardViewMotorAdapter(MotorData.getListData(), getActivity());

        rvMotor.setAdapter(cardViewMotorAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}