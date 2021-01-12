package com.demo.writeup.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POST_ID")
    private Integer postId;

    @Column(name = "POST_NAME")
    private String postName;

    @Column(name = "DATE_CREATED")
    private Date dateCreated;

    public Post(String postName, Date dateCreated) {
        this.postName = postName;
        this.dateCreated = dateCreated;
    }

}
