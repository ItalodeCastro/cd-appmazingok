package com.campusdual.appmazing.model.dto;

public class CustomerDto {
        private int id;

        private String name;

        private String surname_1;

        private String surname_2;

        private String email;

        private String phone_Number;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname_1() {
            return surname_1;
        }

        public void setSurname_1(String surname1) {
            this.surname_1 = surname1;
        }

        public String getSurname_2() {
            return surname_2;
        }

        public void setSurname_2(String surname2) {
            this.surname_2 = surname2;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone_Number() {
            return phone_Number;
        }

        public void setPhone_Number(String phone_Number) {
            this.phone_Number = phone_Number;
        }
    }