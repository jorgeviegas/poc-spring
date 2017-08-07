package com.sap.training.services;

import com.sap.training.models.Restaurant;

import java.util.List;


public interface RestaurantService {

    void createRestaurant(Restaurant restaurant);

    List<Restaurant> listRestaurants();

    boolean deleteRestaurant(int deleteId);

}
