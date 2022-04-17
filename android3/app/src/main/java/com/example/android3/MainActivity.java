package com.example.android3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView mainRecyclerView = findViewById(R.id.recycler_view_main);
    Project[] projects = {
        new Project("看不出來是什麼嗎", "好吃好好吃", R.drawable.foodiesfeed_com_carefully_putting_a_blackberry_on_tiramisu),
        new Project("天殺好吃餅", "吃了難以旺壞的味道", R.drawable.foodiesfeed_com_pouring_water_in_a_glass_with_mint_and_lime),
        new Project("奇妙碰碰湯", "爽抱你的嘴", R.drawable.foodiesfeed_com_pumpkin_soup_with_pumpkin_seeds_on_top),
    };
    ProjectsAdapter projectsAdapter = new ProjectsAdapter(projects);
    mainRecyclerView.setAdapter(projectsAdapter);
  }
}