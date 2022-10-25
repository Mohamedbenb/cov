package com.cov.covoiturage.services;

import com.cov.covoiturage.domain.User;
import com.cov.covoiturage.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser (String firstName, String lastName, String email, String password) throws EtAuthException;



}
