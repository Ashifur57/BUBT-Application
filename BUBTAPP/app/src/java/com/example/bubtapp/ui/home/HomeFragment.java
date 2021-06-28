package com.example.bubtapp.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.support.v4.os.IResultReceiver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.bubtapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout = view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();

        return view;
    }

    private void setSliderViews() {
        for(int i=0;i<=5;i++){
            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch (i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bubt-5d64e.appspot.com/o/gallery%2FbubtS7.jpg?alt=media&token=899425e7-c571-446e-a791-79fe2adeb4a7");
                    break;
                    case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bubt-5d64e.appspot.com/o/gallery%2FbubtS3.jpg?alt=media&token=ca3fe518-8b90-469c-8675-4133a3d99b82");
                    break;
                    case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bubt-5d64e.appspot.com/o/gallery%2FbubtS5.jpg?alt=media&token=61be7a28-b0b4-4fe3-9738-c6e2f3412c3c");
                    break;
                    case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bubt-5d64e.appspot.com/o/gallery%2FbubtS6.jpg?alt=media&token=fa5037f6-751c-46d8-b74b-f96b9e12d9a8");
                    break;
                    case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bubt-5d64e.appspot.com/o/gallery%2FbubtS4.jpg?alt=media&token=ee973708-4041-46de-9aa4-b8a1397000d3");
                    break;
                    case 5:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/bubt-5d64e.appspot.com/o/gallery%2FbubtS1.jpg?alt=media&token=0ca89d6d-76af-4b67-b36c-2503747caa86");
                    break;

            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            sliderLayout.addSliderView(sliderView);
        }

    }
}