package com.sahabt.project.dto.response;

import lombok.Data;

import javax.persistence.*;

@Data
public class CustomerResponse {

    private String fullname;
    private String mail;
    private String phone;

}