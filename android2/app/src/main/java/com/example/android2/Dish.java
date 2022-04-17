package com.example.android2;

public class Dish {
  String title;
  String description;
  int price;

  public Dish(String title, String description, int price) {
    this.title = title;
    this.description = description;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Dish{" +
        "title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", price=" + price +
        '}';
  }
}
