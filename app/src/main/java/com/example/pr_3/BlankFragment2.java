package com.example.pr_3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class BlankFragment2 extends Fragment {
    private Context context;
    private final int duration = Toast.LENGTH_SHORT;

    private static final String TAG = "BlankFragment2";
    public BlankFragment2() {
        super(R.layout.fragment_blank2);
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        Toast.makeText(context, "onCreateView", duration).show();
        return null;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated");
        Toast.makeText(context, "onViewCreated", duration).show();
        Random r = new Random();
        int randomNumber = (int)(Math.random()*100000);
        TextView ticket = view.findViewById(R.id.ticket);
        ticket.setText(String.valueOf(randomNumber));

        Button button = view.findViewById(R.id.button3);
        button.setOnClickListener(v -> {
            Bundle result = new Bundle();
            result.putString("bundleKey", String.valueOf(randomNumber));
            getParentFragmentManager().setFragmentResult("requestKey", result);

            getParentFragmentManager().beginTransaction().replace(R.id.fragment_container_view, BlankFragment.class, null).commit();
        });
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView");
        Toast.makeText(context, "onDestroyView", duration).show();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getContext();
        Log.d(TAG, "onCreate");
        Toast.makeText(context, "onCreate", duration).show();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated");
        Toast.makeText(context, "onActivityCreated", duration).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(context, "onStart", duration).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(context, "onResume", duration).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(context, "onPause", duration).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(context, "onStop", duration).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(context, "onDestroy", duration).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach");
        Toast.makeText(context, "onDetach", duration).show();
    }
}