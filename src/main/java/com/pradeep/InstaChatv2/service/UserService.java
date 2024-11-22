package com.pradeep.InstaChatv2.service;

import com.pradeep.InstaChatv2.model.User;
import com.pradeep.InstaChatv2.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
