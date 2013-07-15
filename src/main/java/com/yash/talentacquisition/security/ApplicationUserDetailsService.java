package com.yash.talentacquisition.security;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.yash.talentacquisition.model.User;
import com.yash.talentacquisition.service.UserService;

public class ApplicationUserDetailsService implements UserDetailsService {
	
	private transient final Logger logger = LoggerFactory.getLogger( getClass() );
	
    @Autowired
    private UserService userService;
    
    private List<GrantedAuthority> grantedAuthorities = Arrays.asList( new GrantedAuthority[]{ new GrantedAuthorityImpl("ROLE_USER") } );
    

    @Transactional
    public UserDetails loadUserByUsername(final String username) 
    throws UsernameNotFoundException, DataAccessException {
    	logger.debug("#######loadUserByUserName :"+username);
        final User user = userService.getUserByEmail(username);
        logger.debug("loading user :"+user);
        if ( null == user ) {
            throw new UsernameNotFoundException("Unable to find " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPasswordDigest(), true, true, true, true, grantedAuthorities);
    }
}
