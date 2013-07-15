package com.yash.talentacquisition.security;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.util.DigestUtils;

public class UserPasswordEncoder implements PasswordEncoder {

    private Logger logger = LoggerFactory.getLogger( getClass() );

    public String encodePassword(String plaintextPassword, Object salt)
    throws DataAccessException {
    		logger.debug("Calling encodePassword");
        return DigestUtils.md5DigestAsHex( plaintextPassword.getBytes() );
    }

 
    public boolean isPasswordValid(String encodedPassword, String plaintextPassword, Object salt)
    throws DataAccessException {
        // todo: add a salt string
    		logger.debug("Calling isPasswordValid");
        return encodedPassword.equals( DigestUtils.md5DigestAsHex(plaintextPassword.getBytes()) );
    }
}
