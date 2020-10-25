package com.skaz.quiz.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class Category {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	@NonNull
    private String name;
	@NonNull
    private String description;
	
	@OneToMany(mappedBy="category")
	private Set<Quiz> quiz;
	
	@ManyToOne()
	@JoinColumn(name="category")
	private User createdBy;
}
