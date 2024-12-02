package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
       MongoDBProvider databaseProvider =new MongoDBProvider();
       UserManager userManager = new UserManager(databaseProvider);
        System.out.printf(userManager.getUserName());



    }
}
