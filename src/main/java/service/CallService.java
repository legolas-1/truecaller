package service;

import models.User;

import java.util.Map;
import java.util.UUID;

public class CallService {

    Map<String,User> mp;

    public Boolean checkIfBlocked(String userid1, String phone) {
        User user = mp.get(userid1);

//        user.getBlockedList()

        return false;
    }

    public Boolean checkIfContact() {

    }

    public OnCall() {
        if(checkIfBlocked()) {
            // display none
        } else if(checkIfContact()) {
            // return name
        } else {
            // generic
        }
    }


}
