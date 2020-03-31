package com.example.restauranthomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //mRecyclerView will contain the recyclerView that we have added in XML file
    private RecyclerView mRecyclerView;
    //Adapter is the bridge between the ArrayList(the data) and the recyclerView
    private RecyclerView.Adapter mAdapter;
    //LayoutManager is responsible for aligning the items in the list
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //new Arraylist for the items allow us to fill up the imageview and textview
        ArrayList<RestaurantItem> exampleList = new ArrayList<>();
        exampleList.add(new RestaurantItem(R.drawable.ic_eljannah, "El Jannah", "Casual Dining - Middle-Eastern", "Granville", "4.2", "$30 for two people (approx.)"));
        exampleList.add(new RestaurantItem(R.drawable.ic_watsup, "Watsup Brothers", "Takeaway - Middle-Eastern", "Condell Park", "3.7", "$35 for two people (approx.)"));
        exampleList.add(new RestaurantItem(R.drawable.ic_timeforthai, "Time for Thai", "Casual Dining - Thai", "Kingsford", "4.8", "$30 for two people (approx.)"));
        exampleList.add(new RestaurantItem(R.drawable.redpepper, "Red Pepper", "Pub - Korean", "Strathfield", "4.1", "$40 for two people (approx.)"));
        exampleList.add(new RestaurantItem(R.drawable.chickenv, "Chicken V", "Casual Dining - Korean", "Town Hall", "3.4", "$40 for two people (approx.)"));
        exampleList.add(new RestaurantItem(R.drawable.malatang, "YGF Malatang", "Casual Dining - Chinese", "Burwood", "3.2", "$30 for two people (approx.)"));
        exampleList.add(new RestaurantItem(R.drawable.awafi, "Awafi", "Takeaway - Middle Eastern", "Revesby", "3.8", "$30 for two people (approx.)"));
        exampleList.add(new RestaurantItem(R.drawable.blburgers, "BL Burgers", "Pub - Burgers", "Darlinghurst", "4.5", "$40 for two people (approx.)"));
        exampleList.add(new RestaurantItem(R.drawable.frango, "Frangos", "Takeaway - Portugese Chicken", "Petersham", "4.7", "$30 for two people (approx.)"));
        exampleList.add(new RestaurantItem(R.drawable.sushihub, "Sushi Hub", "Takeaway - Japanese", "Haymarket", "3.2", "$30 for two people (approx.)"));


        //initialises recyclerView
        mRecyclerView = findViewById(R.id.recyclerView);
        //If we know that recyclerView will not change in size, to improve performance
        mRecyclerView.setHasFixedSize(true);
        //initialises layoutManager
        mLayoutManager = new LinearLayoutManager(this);
        //Passes ArrayList of items, this list get passes to adapter which then provides to viewHolder
        mAdapter = new RestaurantAdapter(exampleList);
        //Passes layout manager into recyclerview
        mRecyclerView.setLayoutManager(mLayoutManager);
        //Passes mAdapter
        mRecyclerView.setAdapter(mAdapter);
    }
}
