package everton.assignments;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSms = (Button) findViewById(R.id.bt_sms);
        if(btSms != null){
            btSms.setOnClickListener(this);
        }
        Button btTel = (Button) findViewById(R.id.bt_tel);
        if(btTel != null){
            btTel.setOnClickListener(this);
        }
        Button btWeb = (Button) findViewById(R.id.bt_web);
        if(btWeb != null){
            btWeb.setOnClickListener(this);
        }
        Button btMap = (Button) findViewById(R.id.bt_map);
        if(btMap != null){
            btMap.setOnClickListener(this);
        }
        Button btShare = (Button) findViewById(R.id.bt_share);
        if(btShare != null){
            btShare.setOnClickListener(this);
        }
        Button btGallery = (Button) findViewById(R.id.bt_gallery);
        if(btGallery != null){
            btGallery.setOnClickListener(this);
        }
        LinearLayout body = (LinearLayout) findViewById(R.id.body);
        if(body != null){
            body.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View selectdView){
        EditText etNumber = (EditText) findViewById(R.id.et_number);

        switch (selectdView.getId()) {
            case R.id.bt_sms:
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                smsIntent.setData(Uri.parse("smsto:" + etNumber.getText()));
                smsIntent.putExtra("sms_body", "Hello. It's Me, Everton!");
                startActivity(smsIntent);
                break;

            case R.id.bt_tel:
                Intent telIntent = new Intent(Intent.ACTION_DIAL);
                telIntent.setData(Uri.parse("tel:" + etNumber.getText()));
                startActivity(telIntent);
                break;

            case R.id.bt_web:
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pace.edu"));
                startActivity(webIntent);
                break;

            case R.id.bt_map:
                String geoUri = String.format("geo: 40.711151, -74.004697");
                Uri geo = Uri.parse(geoUri);
                Intent geoMap = new Intent(Intent.ACTION_VIEW, geo);
                startActivity(geoMap);
                break;

            case R.id.bt_share:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "CS639");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Join CS639");
                startActivity(Intent.createChooser(shareIntent, "Share the love"));
                break;

            case R.id.bt_gallery:
                Intent actionStartIntent = new Intent("everton.assignments.OPEN_GALLERY");
                startActivity(actionStartIntent);
                break;

            case R.id.body:
                //Intent actionStartIntent = new Intent("everton.assignments.OPEN_GALLERY");
                // startActivity(actionStartIntent);
                break;

            default:
                //Nothing
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
        }else if(id == R.id.action_about) {
            Intent actionStartIntent = new Intent("everton.assignments.OPEN_ABOUT");
            startActivity(actionStartIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
