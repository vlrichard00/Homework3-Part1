package com.example.astoldbyvee.homework3_part1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PartOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_one);



    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

        private Button button;

    public ImageView onClick() {

    button = (Button) findViewById(R.id.buttonToast);
        {
            if(OnClickListener==findViewById(R.id.buttonfirst)| (OnClickListener==findViewById(R.id.button24)))
            {
            ImageView image = (ImageView) layout.findViewById(R.id.image);
                image.setImageResource(R.drawable.lizard_web);}
            retrun image;

            else if(OnClickListener==findViewById(R.id.buttonthird)| (OnClickListener==findViewById(R.id.button23)| (OnClickListener==findViewById(R.id.button26))))

                {
                    ImageView image2 = (ImageView) layout.findViewById(R.id.image);
                    image.setImageResource(R.drawable.rock_web);
                    return image2;
                }
            else if(OnClickListener==findViewById(R.id.buttonsecond)| (OnClickListener==findViewById(R.id.button25)))
            {
                ImageView image3 = (ImageView) layout.findViewById(R.id.image);
                image.setImageResource(R.drawable.paper_web);
                return image3;
            }
        }
        else if(OnClickListener==findViewById(R.id.buttonfourth))
        {
            ImageView image4 = (ImageView) layout.findViewById(R.id.image);
            image.setImageResource(R.drawable.scissors _web);
            return image4;
        }
        else
        {
            ImageView image4 = (ImageView) layout.findViewById(R.id.image);
            image.setImageResource(R.drawable.spock_web);
            return image4;

        }
    }


