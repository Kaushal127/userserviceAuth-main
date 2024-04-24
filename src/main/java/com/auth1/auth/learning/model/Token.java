package com.auth1.auth.learning.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Getter
@Setter
public class Token extends BaseModel{

    @OneToOne
    private User user;
    private String value;
    private Date expireAt;
    private boolean deleted;
}
