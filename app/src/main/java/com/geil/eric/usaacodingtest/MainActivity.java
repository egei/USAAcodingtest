package com.geil.eric.usaacodingtest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.geil.eric.usaacodingtest.api.ApiService;
import com.geil.eric.usaacodingtest.api.RetroClient;
import com.geil.eric.usaacodingtest.model.ChildList;
import com.geil.eric.usaacodingtest.model.InnerData;
import com.geil.eric.usaacodingtest.model.OuterData;
import com.geil.eric.usaacodingtest.view.RedditRecyclerViewAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ArrayList<InnerData> redditData;
    private RecyclerView recyclerView;
    private RedditRecyclerViewAdapter redditAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ApiService api = RetroClient.getApiService();

        Call<OuterData> call = api.getMyJSON();

        call.enqueue(new Callback<OuterData>() {
            @Override
            public void onResponse(Call<OuterData> call, Response<OuterData> response) {
                if (response.isSuccessful()) {
                    ChildList children = response.body().getChildren();
                    recyclerView = (RecyclerView) findViewById(R.id.redditRecyleView);
                    redditAdapter = new RedditRecyclerViewAdapter(children.getChildren());
                    RecyclerView.LayoutManager layoutManager =
                            new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    recyclerView.setAdapter(redditAdapter);
                } else {
                    Log.e("USAA Coding Test", "Response failed:" + response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<OuterData> call, Throwable t) {
                Log.e("USAA Coding Test", "Callback failed:" + t.getMessage());
            }
        });
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
