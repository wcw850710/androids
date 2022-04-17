package com.example.android2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {
  private Dish[] dishes = {
      new Dish("Tea and cardamom bread","Tea and cardamom bread Tea and cardamom bread Tea and cardamom bread", 987),
      new Dish("Beef and chickpea soup","Beef and chickpea soup Beef and chickpea soup Beef and chickpea soup", 1200),
      new Dish("Lettuce and steak ciabatta","Lettuce and steak ciabatta Lettuce and steak ciabatta Lettuce and steak ciabatta", 35),
      new Dish("Sweet potato and rosemary stir fry","Sweet potato and rosemary stir fry Sweet potato and rosemary stir fry Sweet potato and rosemary stir fry", 446),
      new Dish("Coffee and garlic oil salad","Coffee and garlic oil salad Coffee and garlic oil salad Coffee and garlic oil salad", 7865),
      new Dish("Aubergine and squash bread","Aubergine and squash bread Aubergine and squash bread Aubergine and squash bread", 245),
      new Dish("Longan and blueberry salad","Longan and blueberry salad Longan and blueberry salad Longan and blueberry salad", 678),
      new Dish("Aubergine and chickpea fusilli","Aubergine and chickpea fusilli Aubergine and chickpea fusilli Aubergine and chickpea fusilli", 123),
      new Dish("Chicken and ham toastie","Chicken and ham toastie Chicken and ham toastie Chicken and ham toastie", 24),
      new Dish("Banana and lemon cupcakes","Banana and lemon cupcakes Banana and lemon cupcakes Banana and lemon cupcakes", 354),
      new Dish("Pepper and crab soup","Pepper and crab soup Pepper and crab soup Pepper and crab soup", 687),
      new Dish("Blackcurrant and wheat bran salad","Blackcurrant and wheat bran salad Blackcurrant and wheat bran salad Blackcurrant and wheat bran salad", 245),
      new Dish("Feta and celeriac parcels","Feta and celeriac parcels Feta and celeriac parcels Feta and celeriac parcels", 378),
      new Dish("Tomato and parsnip soup","Tomato and parsnip soup Tomato and parsnip soup Tomato and parsnip soup", 45),
      new Dish("Sweetcorn and plantain madras","Sweetcorn and plantain madras Sweetcorn and plantain madras Sweetcorn and plantain madras", 7895),
      new Dish("Cocoa and persimmon pudding","Cocoa and persimmon pudding Cocoa and persimmon pudding Cocoa and persimmon pudding", 215),
      new Dish("Basil and pheasant salad","Basil and pheasant salad Basil and pheasant salad Basil and pheasant salad", 3785),
      new Dish("Chilli and cheese pasta","Chilli and cheese pasta Chilli and cheese pasta Chilli and cheese pasta", 678),
      new Dish("Bacon and chocolate cupcakes","Bacon and chocolate cupcakes Bacon and chocolate cupcakes Bacon and chocolate cupcakes", 254),
      new Dish("Tumeric and cod korma","Tumeric and cod korma Tumeric and cod korma Tumeric and cod korma", 78),
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_starters);

    ListView startersListView = findViewById(R.id.list_view_starters);

    ArrayAdapter<Dish> stringArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

    startersListView.setAdapter(stringArrayAdapter);
  }
}