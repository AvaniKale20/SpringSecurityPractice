package com.tw.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//todo-1>creating one project with web and test dependancies.. and open local host 8080 browser. It should see welcome msg
//todo-2>how u add spring security into kind of web application--for that we have to add spring boot starter security dependancies(its maven depen which pull all the neccesary dependamncies and make u availble )
// after adding "spring boot starter security" dependancies (creating default user)after clicking sign in pop is bad credintial .. Why its happen? ans is bcz of using some kind of filter- Filter intercepts every requests and check whatever stuff we need for application its presents or not
@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

}
