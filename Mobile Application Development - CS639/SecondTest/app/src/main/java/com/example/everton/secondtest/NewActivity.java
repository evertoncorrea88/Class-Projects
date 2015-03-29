package com.example.everton.secondtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Everton on 9/17/14.
 */
public class NewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent currentIntent = getIntent();
        if(currentIntent.hasExtra("newBodyText")){
            String newText = currentIntent.getExtras().getString("newBodyText");
            TextView bodyView = (TextView)findViewById(R.id.new_activity_text_view);
            bodyView.setText(newText);
        }
    }

}
