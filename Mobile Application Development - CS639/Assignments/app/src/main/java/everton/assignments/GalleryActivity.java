package everton.assignments;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class GalleryActivity extends ActionBarActivity implements View.OnClickListener{

    private String [] imagesDesc = {"everton_times", "everton_hollywood", "everton_navy", "everton_ring", "everton_stairs"};
    private int [] imgID =  {R.drawable.everton_times, R.drawable.everton_hollywood, R.drawable.everton_navy, R.drawable.everton_ring, R.drawable.everton_stairs};
    private int counter = 0;
    private TextView imageText;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        imageText = (TextView) findViewById(R.id.image_text);
        imageText.setText(imagesDesc[counter]);
        image = (ImageView) findViewById(R.id.image);
        image.setImageResource(imgID[counter]);

        Button buttonPrev = (Button) findViewById(R.id.prev);
        if(buttonPrev != null){
            buttonPrev.setOnClickListener(this);
        }
        Button buttonNext = (Button) findViewById(R.id.next);
        if(buttonNext != null){
            buttonNext.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View selectedView){
        if(selectedView.getId() == R.id.prev){
            if(counter > 0){
                counter--;
                imageText.setText(imagesDesc[counter]);
                image.setImageResource(imgID[counter]);
            }

        }
        if(selectedView.getId() == R.id.next){
            if(counter < 4){
                counter++;
                imageText.setText(imagesDesc[counter]);
                image.setImageResource(imgID[counter]);
            }

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.gallery, menu);
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
