package mcm.edu.ph.tapenit_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);

        String firstname = "Adrian";
        char middleInitial ='A';
        String lastname = "Tapenit";
        int myAge = 19;
        float myDreamTVLGrade = 100.0f;
        double myMoney =99999.99;


        //String.valueOf(myMoney);
        display.setText("My Name is"+firstname+ " "
                +String.valueOf(middleInitial)+ " "
                +lastname+ "\n and my age is "
                +myAge+ ".\n I want my grade in TVL3 to be"
                +String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;


    }
}