package udacity.pedrovarela.com.projectzero;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {


    private Button buttonSpotifyStreamer, buttonScoresApp, buttonBuildItBigger, buttonXYZReader, buttonCapstone;

    /**
     * Button click listener
     */
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        String message;

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.buttonSpotifyStreamer:
                    message = getResources().getString(R.string.toast_message, getString(R.string.app_name_spotify));
                    break;
                case R.id.buttonBuildItBigger:
                    message = getResources().getString(R.string.toast_message, getString(R.string.app_name_build_it_bigger));
                    break;
                case R.id.buttonScoresAp:
                    message = getResources().getString(R.string.toast_message, getString(R.string.app_name_scores));
                    break;
                case R.id.buttonXYZReader:
                    message = getResources().getString(R.string.toast_message, getString(R.string.app_name_xyz_reader));
                    break;
                case R.id.buttonCapstone:
                    message = getResources().getString(R.string.toast_message, getString(R.string.app_name_capstone));
                    break;
            }

            Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();

        }
    };


    /**
     * OnCreate
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSpotifyStreamer = (Button) findViewById(R.id.buttonSpotifyStreamer);
        buttonSpotifyStreamer.setOnClickListener(onClickListener);

        buttonScoresApp = (Button) findViewById(R.id.buttonScoresAp);
        buttonScoresApp.setOnClickListener(onClickListener);

        buttonBuildItBigger = (Button) findViewById(R.id.buttonBuildItBigger);
        buttonBuildItBigger.setOnClickListener(onClickListener);

        buttonXYZReader = (Button) findViewById(R.id.buttonXYZReader);
        buttonXYZReader.setOnClickListener(onClickListener);

        buttonCapstone = (Button) findViewById(R.id.buttonCapstone);
        buttonCapstone.setOnClickListener(onClickListener);

    }

    /**
     * OnCreate options menu
     *
     * @param menu
     * @return false, to hide the menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

    /**
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
