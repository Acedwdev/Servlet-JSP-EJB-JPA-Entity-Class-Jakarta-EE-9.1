
package co.com.acedwdev.sms.service;

import co.com.acedwdev.sms.data.UserDao;
import co.com.acedwdev.sms.domain.User;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.List;

@Stateless
public class ImplServiceUser implements RemoteServiceUser, ServiceUser{
    
    @Inject
    private UserDao userDao;

    @Override
    public List<User> userList() {        
        return userDao.findAllUsers();
    }

    @Override
    public User findUserById(User user) {
        return userDao.findUserById(user);
    }

    @Override
    public User findUserByEmail(User user) {
        return userDao.findUserByEmail(user);
    }

    @Override
    public void registerUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void modifyUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
    
}
