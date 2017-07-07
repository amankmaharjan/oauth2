package com.example.CRUDDemo.services;

import com.example.CRUDDemo.domain.Authority;
import com.example.CRUDDemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component("DomainUserDetailsService")
public class DomainUserDetailsService implements UserDetailsService {


    @Autowired
    private UserService userService;

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userService.findByname(name);
        System.out.println("User : " + user);
        if (user == null) {
            System.out.println("User not found");
            throw new UsernameNotFoundException("Username not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getEnabled(), true, true, true, getGrantedAuthorities(user));
    }

    private List<GrantedAuthority> getGrantedAuthorities(User user) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        for (Authority userAuthority : user.getAuthortList()) {
            System.out.println("UserProfile : " + userAuthority);
            authorities.add(new SimpleGrantedAuthority("ROLE_" + userAuthority.getAuthority()));
        }
        System.out.print("authorities :" + authorities);
        return authorities;
    }
}