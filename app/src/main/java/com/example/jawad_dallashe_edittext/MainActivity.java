package com.example.jawad_dallashe_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.opengl.ETC1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

    public class MainActivity extends AppCompatActivity {
        private TextView Tv1, Tv2, Tv3, Tv4, Tv5, Tv6;
        private ImageView Image1, Image2, Image3;
        private Button Test1, Test2, Test3;
        private EditText Et1, Et2, Et3;
        private Button Restart;

        private int random1,random2,random3,random4,random5,random6;
        double rating;
        int sum;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Tv1 = findViewById(R.id.TV1);
            Tv2 = findViewById(R.id.TV2);
            Tv3 = findViewById(R.id.TV3);
            Tv4 = findViewById(R.id.TV4);
            Tv5 = findViewById(R.id.TV5);
            Tv6 = findViewById(R.id.TV6);
            Et1 = findViewById(R.id.ET1);
            Et2 = findViewById(R.id.ET2);
            Et3 = findViewById(R.id.ET3);
            Image1 = findViewById(R.id.X1);
            Image2 = findViewById(R.id.X2);
            Image3 = findViewById(R.id.X3);
            Test1 = findViewById(R.id.Test1);
            Test2 = findViewById(R.id.Test2);
            Test3 = findViewById(R.id.Test3);
            Restart = findViewById(R.id.Restart);


            random1 = Big_Random();
            random2 = Big_Random();


            Tv1.setText("" + random1);
            Tv1.setTextSize(28);
            Tv2.setText("" + random2);
            Tv2.setTextSize(28);
            Tv3.setText("?");
            Tv3.setTextSize(28);
            Tv4.setText("?");
            Tv4.setTextSize(28);
            Tv5.setText("?");
            Tv5.setTextSize(28);
            Tv6.setText("?");
            Tv6.setTextSize(28);
            Et1.setTextSize(18);
            Et2.setTextSize(18);
            Et3.setTextSize(18);

            int backgroundColor1 = Color.rgb(72, 72, 72);
            Test1.setBackgroundColor(backgroundColor1);

            Test2.setBackgroundColor(Color.rgb(72, 72, 72));
            Test3.setBackgroundColor(Color.rgb(72, 72, 72));

            Restart.setBackgroundColor(Color.BLACK);

        }


    public static int Big_Random()
    {
        Random random_number = new Random();
        return (int)(Math.random() * 89 + 10);
    }

    public void Rawnd1(View view)
    {
        String answer1 = Et1.getText().toString();
        Image1.setVisibility(view.VISIBLE);
        if ( Integer.parseInt(answer1) != (random1 + random2))
          {
              Et1.setTextColor(Color.RED);
              Image1.setImageResource(R.drawable.ex);
          }
        else
          {
              Et1.setTextColor(Color.GREEN);
              Image1.setImageResource(R.drawable.ve);
              sum++;
          }
        random3 = (random1 + random2);
        random4 = Big_Random();
        Tv3.setText("" + random3);
        Tv4.setText("" + random4);
    }

    public void Rawnd2(View view)
    {
        String answer2 = Et2.getText().toString();
        Image2.setVisibility(view.VISIBLE);
        if ( Integer.parseInt(answer2) != (random3 + random4))
          {
              Image2.setImageResource(R.drawable.ex);
              Et2.setTextColor(Color.RED);
          }
        else
          {
              Et2.setTextColor(Color.GREEN);
              Image2.setImageResource(R.drawable.ve);
              sum++;
          }
        random5 = (random3 + random4);
        random6 = Big_Random();
        Tv5.setText("" + random5);
        Tv6.setText("" + random6);
    }

    public void Rawnd3(View view)
    {
        String answer3 = Et3.getText().toString();
        Image3.setVisibility(view.VISIBLE);
        if (Integer.parseInt(answer3) != (random5 + random6))
          {
              Et3.setTextColor(Color.RED);
              Image3.setImageResource(R.drawable.ex);
              random1 = (random5 + random6);
          }
        else
          {
              Et3.setTextColor(Color.GREEN);
              Image3.setImageResource(R.drawable.ve);
              sum++;
          }
        rating = ((double)sum/3) *100;
        Toast.makeText(MainActivity.this, (sum+ "/3, "+rating+"%"), Toast.LENGTH_SHORT).show();
        sum = 0;
        random1 = (random5 + random6);
        Tv1.setText("" + random1);
    }
    public void restart(View view) {
        Image1.setVisibility(View.INVISIBLE);
        Image2.setVisibility(View.INVISIBLE);
        Image3.setVisibility(View.INVISIBLE);

        random1 = Big_Random();
        random2 = Big_Random();

        Et1.setTextColor(Color.BLACK);
        Et2.setTextColor(Color.BLACK);
        Et3.setTextColor(Color.BLACK);

        Tv1.setText("" + random1);
        Tv2.setText("" + random2);
        Tv3.setText("?");
        Tv4.setText("?");
        Tv5.setText("?");
        Tv6.setText("?");

        Et1.setText(null);
        Et2.setText(null);
        Et3.setText(null);
    }
}