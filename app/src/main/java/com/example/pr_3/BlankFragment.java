package com.example.pr_3;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment extends Fragment {

    private Context context;
    private final int duration = Toast.LENGTH_SHORT;
    private static final String TAG = "BlankFragment";
    public BlankFragment() {
        super(R.layout.fragment_blank);
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
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated");
        Toast.makeText(context, "onViewCreated", duration).show();
        getParentFragmentManager().setFragmentResultListener("requestKey", this, (key, bundle) -> {
            String result = bundle.getString("bundleKey");
            TextView text1 = (TextView) getView().findViewById(R.id.wc1);
            text1.setText("Вы успешно сформировали читательский билет.\nНомер билета: " + result);
            TextView text2 = (TextView) getView().findViewById(R.id.wc2);
            text2.setText("Нажмите клавишу 'Начать', чтобы перейти в библиотеку!");
            TextView text3 = (TextView) getView().findViewById(R.id.wc3);
            text3.setText("");
        });
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(v -> getParentFragmentManager().beginTransaction().replace(R.id.fragment_container_view, BlankFragment2.class, null).commit());

        TextView text1 = view.findViewById(R.id.wc1);
        text1.setText("Добро пожаловать в GloLib!");
        TextView text2 = view.findViewById(R.id.wc2);
        text2.setText("Похоже, что у вас пока нету читательского билета!");
        TextView text3 = view.findViewById(R.id.wc3);
        text3.setText("Нажмите клавишу 'Начать', чтобы перейти на этап регистрации билета.");

        ImageView image = view.findViewById(R.id.bookImage1);
        image.setImageDrawable(getResources().getDrawable(R.drawable.book_svgrepo_com));

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