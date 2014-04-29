package com.example.parlezvousactivity;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {
	
	private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.i(TAG,"OnCreate");
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
            return rootView;
        }
    }
    
    @Override
    public void onDestroy(){
        Log.i(TAG,"onDestroy");
        super.onDestroy();
    }
    @Override
    public void onPause(){
        Log.i(TAG,"onPause");
        super.onPause();
    }
    @Override
    public void onResume(){
        Log.i(TAG,"onResume");
        super.onResume();
    }
    
    @Override
    public void onSaveInstanceState(Bundle instance){
        Log.i(TAG,"onSaveInstanceState");
        super.onSaveInstanceState(instance);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstance){
        Log.i(TAG,"onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstance);
    }

}
