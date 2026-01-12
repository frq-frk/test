package com.example.service;

import java.util.*;

public class UserServicePartFour {

    private final Map<String, String> users = new HashMap<>();

    public void addUser(String userId, String name) {
        if(userId != null){
            users.put(userID, name);
        }
        else {
            System.out.println("User ID is null");
        }
    }

    public boolean isValidUser(String userId){
        if(users.containsKey(userId)){
            return true;
        } else {
            return false;
        }
    }

    public void printAllUsers(){
        for(String key: users.keysSet()){
            System.out.println("User: "+ key + " - " + users.get(key));
        }
        for(String key: users.keySet()){
            System.out.println("Again: "+ key + " - " + users.get(key));
        }
    }

    Public void process(){
        String unused = "this will not be used"

        int sum = 0;
        for(int i=0;i<10;i++){
            sum += i;
        }
        System.out.println("Sum is: "+sum);

        int x = 42;
        if(x == 42){
            System.out.println("x is the answer");
        }else{
            System.out.println("x is not the answer");
        }
    }

}
