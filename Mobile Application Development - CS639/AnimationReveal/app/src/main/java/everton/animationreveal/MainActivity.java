package everton.animationreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.os.Build;



public class MainActivity extends Activity {

    public boolean isRevealed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
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
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            View button = rootView.findViewById(R.id.button1);

            final View myView = rootView.findViewById(R.id.my_view);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    MainActivity main = (MainActivity) getActivity();

                    main.isRevealed = !main.isRevealed;
                    if(main.isRevealed){
                        int centerX = (myView.getLeft() + myView.getRight()) / 2;
                        int centerY = (myView.getTop() + myView.getBottom()) / 2;

                        int startRadius = myView.getWidth();
                        int endRadius = 0;

                        Animator reveal = ViewAnimationUtils.createCircularReveal(
                                myView, // The new View to reveal
                                centerX,      // x co-ordinate to start the mask from
                                centerY,      // y co-ordinate to start the mask from
                                startRadius,  // radius of the starting mask
                                endRadius);   // radius of the final mask

                        reveal.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                                myView.setVisibility(View.INVISIBLE);
                            }
                        });
                        reveal.start();
                    }
                    else {
                        myView.setVisibility(View.VISIBLE);

                        int centerX = (myView.getLeft() + myView.getRight()) / 2;
                        int centerY = (myView.getTop() + myView.getBottom()) / 2;

                        int startRadius = 0;
                        int endRadius = myView.getWidth();

                        Animator reveal = ViewAnimationUtils.createCircularReveal(
                                myView, // The new View to reveal
                                centerX,      // x co-ordinate to start the mask from
                                centerY,      // y co-ordinate to start the mask from
                                startRadius,  // radius of the starting mask
                                endRadius);   // radius of the final mask
                        reveal.start();
                    }
                }
            });

            return rootView;
        }
    }
}
