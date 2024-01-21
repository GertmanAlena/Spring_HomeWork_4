package HomeWorksSpring.HomeWorksSpring4.services;

import HomeWorksSpring.HomeWorksSpring4.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> usersList = new ArrayList<>();

    public void addUser(User user){
        usersList.add(user);
    }

    public List<User> getAllUser(){
        return usersList;
    }
}
