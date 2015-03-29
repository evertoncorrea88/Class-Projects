package com.example.everton.secondtest;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MyActivity extends Activity {

    //Cria receiver de broadcast para Intent de modo avião
    private BroadcastReceiver simpleReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
                Toast.makeText(context, R.string.airplane_change, Toast.LENGTH_LONG).show();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Chamada da super e definição do layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //Cria filtro para Intent de modo avião e registrar o receiver do Intent
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(simpleReceiver, intentFilter);

        //Captura do toque e chamada da próxima atividade
        View view = getWindow().getDecorView().findViewById(android.R.id.content);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent startIntent = new Intent(MyActivity.this, NewActivity.class);
                startActivity(startIntent);*/
                Intent actionStartIntent = new Intent("com.peachpit.PURPLE_PONY_POWER");
                actionStartIntent.putExtra("newBodyText", getString(R.string.touched_screen));
                startActivity(actionStartIntent);
            }
        });

        //Como acessar atributos da classe Aplication
        SampleApplication myApplication = (SampleApplication) getApplication();
        myApplication.username = "Everton gostoso";
    }

    public void onDestroy(){
        super.onDestroy();
        unregisterReceiver(simpleReceiver);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
