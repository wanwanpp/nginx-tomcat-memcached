package com.wp;

import java.io.Serializable;

public class User implements Serializable {
       
        private static final long serialVersionUID = 7073950136835429991L;

        private String userId;
     
        private String username;
        
        private String password;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public User() {
            super();
            // TODO Auto-generated constructor stub
        }

        public User(String userId, String username, String password) {
            super();
            this.userId = userId;
            this.username = username;
            this.password = password;
        }
        
        
    }