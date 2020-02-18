package edu.temple.myfragmentapp;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    View layout;

    public ColorFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_color, container, false);

        Button changeColorButton = layout.findViewById(R.id.changeColorButton);

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colors[] = {Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA, Color.CYAN, Color.DKGRAY};

                int colorIndex = (new Random()).nextInt(colors.length);

                layout.setBackgroundColor(colors[colorIndex]);

            }
        });

        layout.setBackgroundColor((new Random()).nextInt() % 2 == 0 ? Color.RED : Color.BLUE);

        return layout;
    }

}
