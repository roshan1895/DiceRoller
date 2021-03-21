package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   TextView tv;
   Button rollBtn;
   ImageView diceImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.count_txt);
        diceImg=findViewById(R.id.dice_img);
        rollBtn=findViewById(R.id.roll_btn);
        rollDice();
        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Dice Rolled!", Toast.LENGTH_SHORT).show();
                rollDice();
            }
        });
    }
    void rollDice()
    {
        Dice dice=new Dice();
        int rollcount=dice.roll();
        int resId;
        switch (rollcount)
        {
            case 1:resId=R.drawable.dice_1;
                   break;
            case 2:resId=R.drawable.dice_2;
                break;
            case 3:resId=R.drawable.dice_3;
                break;
            case 4:resId=R.drawable.dice_4;
                break;
            case 5:resId=R.drawable.dice_5;
                break;
            case 6:resId=R.drawable.dice_6;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rollcount);
        }
        diceImg.setImageResource(resId);
        diceImg.setContentDescription(String.valueOf(rollcount));

    }

        // Update the ImageView with the correct drawable resource ID

}