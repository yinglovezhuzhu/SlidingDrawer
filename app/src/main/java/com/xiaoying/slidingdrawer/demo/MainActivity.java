package com.xiaoying.slidingdrawer.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SlidingDrawer slidingDrawer = (SlidingDrawer) findViewById(R.id.sliding_drawer);
//        slidingDrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
//            @Override
//            public void onDrawerOpened()
//            {
//                Toast.makeText(getApplicationContext(),"OnDrawerOpened",Toast.LENGTH_SHORT).show();
//            }
//
//        });
//
//        slidingDrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
//
//            @Override
//            public void onDrawerClosed() {
//                Toast.makeText(getApplicationContext(), "onDrawerClosed", Toast.LENGTH_SHORT).show();
//            }
//
//        });
//
//        slidingDrawer.setOnDrawerScrollListener(new SlidingDrawer.OnDrawerScrollListener() {
//
//            @Override
//            public void onScrollEnded() {
//                Toast.makeText(getApplicationContext(), "onScrollEnded", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onScrollStarted() {
//                Toast.makeText(getApplicationContext(), "onScrollStarted", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

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
