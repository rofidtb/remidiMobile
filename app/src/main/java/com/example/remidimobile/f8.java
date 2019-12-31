package com.example.remidimobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class f8 extends Fragment {
    View view;
    TextView textView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_content, container, false);
        return view;

    }
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FrameLayout frameLayout = view.findViewById(R.id.frame_content);
        textView = view.findViewById(R.id.text_content);
        frameLayout.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.menu8));
        textView.setText("8");
    }
}
