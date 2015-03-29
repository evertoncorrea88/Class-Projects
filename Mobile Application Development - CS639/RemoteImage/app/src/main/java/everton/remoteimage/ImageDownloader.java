package everton.remoteimage;


import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by Everton on 10/15/14.
 */
public class ImageDownloader extends AsyncTask<String, Integer, Bitmap> {

    private Activity mainActivity;
    private ProgressBar pbLoadingBar;
    private TextView tvLoadingText;

    public ImageDownloader(Activity activity){
        mainActivity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
//        pbLoadingBar = (ProgressBar) mainActivity.findViewById(R.id.pb_loading_bar);
//        tvLoadingText = (TextView) mainActivity.findViewById(R.id.tv_loading_text);
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        try{
            URL url = new URL(params[0]);
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            if (httpCon.getResponseCode() != HttpURLConnection.HTTP_OK){
                throw new Exception("Failed to connect");
            }
            InputStream is = httpCon.getInputStream();
            return BitmapFactory.decodeStream(is);
        }catch (Exception e){
            Log.e("Image", "Failed to load image", e);
        }
        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        ImageView iv = (ImageView) mainActivity.findViewById(R.id.iv_remote_image);
        pbLoadingBar = (ProgressBar) mainActivity.findViewById(R.id.pb_loading_bar);
        tvLoadingText = (TextView) mainActivity.findViewById(R.id.tv_loading_text);

        if (iv != null && bitmap != null){
            pbLoadingBar.setVisibility(View.GONE);
            tvLoadingText.setVisibility(View.GONE);
            iv.setImageBitmap(bitmap);
        }
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

    }
}
