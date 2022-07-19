package hr.kingict.akademija.spring_app.service.impl;

import hr.kingict.akademija.spring_app.model.User;
import hr.kingict.akademija.spring_app.repository.UserRepository;
import hr.kingict.akademija.spring_app.security.CustomDatabaseUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username).orElse(null);
        return  new CustomDatabaseUserDetails(user);
    }
}
