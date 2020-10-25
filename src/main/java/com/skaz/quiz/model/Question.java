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
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String questionText;
	private String image;
	@OneToMany(mappedBy="question")
	private Set<Choice> choice;
	@ManyToOne()
	@JoinColumn(name="questions")
	private Quiz quiz;
	

}
