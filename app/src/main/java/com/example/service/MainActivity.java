package com.example.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startService,stopService,bindService,unbindService,startIntentService,stopIntentService;
    private Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = this;
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        initView();
    }

    private void initView() {
        startService = (Button) findViewById(R.id.btn_start_service);
        stopService = (Button) findViewById(R.id.btn_stop_service);
        bindService = (Button) findViewById(R.id.btn_bind_service);
        unbindService = (Button) findViewById(R.id.btn_unbind_service);
        startIntentService = (Button) findViewById(R.id.btn_start_intent_service);
        stopIntentService = (Button) findViewById(R.id.btn_stop_intent_service);
        startService.setOnClickListener(onButtonClick);
        stopService.setOnClickListener(onButtonClick);
        bindService.setOnClickListener(onButtonClick);
        unbindService.setOnClickListener(onButtonClick);
        startIntentService.setOnClickListener(onButtonClick);
        stopIntentService.setOnClickListener(onButtonClick);
    }

    private View.OnClickListener onButtonClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_start_service:
                    Intent startIntent = new Intent(context,ExampleService.class);
                    startService(startIntent);//
                    break;
                 case R.id.btn_stop_service:
                     Intent stopIntent = new Intent(context, ExampleService.class);
                     stopService(stopIntent);
                     break;
                 case R.id.btn_bind_service:
                    break;
                 case R.id.btn_unbind_service:
                    break;
                 case R.id.btn_start_intent_service:
                    break;
                 case R.id.btn_stop_intent_service:
                    break;

            }

        }
    };

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
