package com.practice.springsecurityjwt;

import com.practice.springsecurityjwt.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserLoginTest {

    @Test
    public void testLogin_정상적인_상황() {
        //Given
        UserService userService = new UserService();
        String id = "test";
        String password = "1234";

        //when
        boolean isLoginSuccess = userService.login(id, password);

        //Then
        assertTrue(isLoginSuccess);

    }

}
