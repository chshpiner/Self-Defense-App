package com.magshimot.malki.bstrong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by malki on 14/06/2017.
 */

public class TrainingSkills_activity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.training_activity);

//        Button button = (Button) findViewById(R.id.button); //!

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }



    public void openSayNoScreen(View v) {
        Intent intent = new Intent(this, challeng2.class);
        startActivity(intent);

    }

}
