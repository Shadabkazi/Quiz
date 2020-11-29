package com.skaz.quiz.model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class User {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	@NonNull
    private String name;
	@NonNull
    private String email;
	@JsonIgnore
    private String Country;
	@JsonIgnore
    private String password;
	@JsonIgnore
    private String introduction;
	@JsonIgnore
    private String resetToken;
	@JsonIgnore
    @Column(name="isBlocked", columnDefinition = "tinyint(1) default 0")
    private String blocked;
	@JsonIgnore
	@Column(name = "type")
	private String type;
	@JsonIgnore
	@OneToMany(mappedBy="createdBy", fetch = FetchType.LAZY)
	private Set<Quiz> quiz;
	@JsonIgnore
	@OneToMany(mappedBy="createdBy")
	private Set<Category> category;
	@JsonIgnore
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "User_Score", 
            joinColumns = { @JoinColumn(name = "user_id") }, 
            inverseJoinColumns = { @JoinColumn(name = "score_id") }
        )
	private Set<Score> score;
	

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
    
    @Column(name = "points")
    private int points=0;
}
