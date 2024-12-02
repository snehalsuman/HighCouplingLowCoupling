package com.loose.coupling;

import com.tight.coupling.UserDatabase;

public class UserManager {
    UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;


    }
    public String getUserName() {
        return userDataProvider.getUserDetails();
    }

}
