package com.skaz.quiz.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Quiz {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@NonNull
	private String name;
	@NonNull
	private String description;
	private String image;
	@NonNull
	@ManyToOne
	@JsonIgnore
	private Category category;
	@OneToMany(mappedBy = "quiz")
	private List<Question> questions;
	@NonNull
	private LocalDateTime createdAt;
	
	//@NonNull  add it once user feature is added
	@ManyToOne()
	@JoinColumn(name="createdBy")
	private User createdBy;
	private LocalDateTime updatedAt;
	@ManyToOne()
	@JoinColumn(name="updatedBy")
	private User updatedBy;
	@OneToOne
	private Score score;
	
	
}
