package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";

    private MyAdapter myAdapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Added
        myAdapter = new MyAdapter();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);


        new JsonFile(this, this).execute(JSON_FILE);

        new JsonTask(this).execute(JSON_URL);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
        if (json != null) {
            try {
                // Parse the JSON
                JSONArray jsonArray = new JSONArray(json);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);

                    // Extracting from JSON object
                    String name = jsonObject.getString("name");
                    String ID = jsonObject.getString("ID");
                    String type = jsonObject.getString("type");
                    String company = jsonObject.getString("company");
                    String location = jsonObject.getString("location");
                    String category = jsonObject.getString("category");
                    int size = jsonObject.getInt("size");
                    int cost = jsonObject.getInt("cost");

                    myAdapter.MountainsList.add(new Mountain(ID, name, type, company, location, category, size, cost));
                }

                // Notify for changes
                myAdapter.notifyDataSetChanged();

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
