package com.skaz.quiz;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.skaz.quiz.model.Category;
import com.skaz.quiz.model.Choice;
import com.skaz.quiz.model.Question;
import com.skaz.quiz.model.Quiz;
import com.skaz.quiz.service.CategoryService;
import com.skaz.quiz.service.ChoiceService;
import com.skaz.quiz.service.QuestionService;
import com.skaz.quiz.service.QuizService;

@Component
public class InitData {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private QuizService quizService;
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private ChoiceService choiceService;
	
	@EventListener
    public void appReady(ApplicationReadyEvent event) {
		Category cat=new Category("JavaScript Quiz", "Simple JavaScript Quiz");
		categoryService.saveCategory(cat);
		
		Quiz quiz=new Quiz("Javascript Quiz", "Simple JavaScript Quiz", cat, LocalDateTime.now());
		quizService.saveQuiz(quiz);
		
		Question q1=new Question("Which HTML tag do we use to put the JavaScript?",quiz);
		Question q2=new Question("Which built-in method calls a function for each element in the array?",quiz);
		Question q3=new Question("What is the difference between let and var?",quiz);
		
		questionService.saveQuestion(q1);
        questionService.saveQuestion(q2);
        questionService.saveQuestion(q3);
		
		Choice c1q1=new Choice("<javascript>", false, q1);
		Choice c2q1=new Choice("<script>", true, q1);
		Choice c3q1=new Choice("<js>", false, q1);
		Choice c4q1=new Choice("None of the above", false, q1);
		
		Choice c1q2=new Choice("while()", false, q2);
		Choice c2q2=new Choice("loop", false, q2);
		Choice c3q2=new Choice("forEach", true, q2);
		Choice c4q2=new Choice("takeUntil", false, q2);
		
		Choice c1q3=new Choice("let has local scope", true, q3);
		Choice c2q3=new Choice("Both are same", false, q3);
		Choice c3q3=new Choice("var is new data type", false, q3);
		Choice c4q3=new Choice("let consumes more cpu and ram", false, q3);
        
        
        choiceService.saveChoice(c1q1);
        choiceService.saveChoice(c2q1);
        choiceService.saveChoice(c3q1);
        choiceService.saveChoice(c4q1);
        choiceService.saveChoice(c1q2);
        choiceService.saveChoice(c2q2);
        choiceService.saveChoice(c3q2);
        choiceService.saveChoice(c4q2);
        choiceService.saveChoice(c1q3);
        choiceService.saveChoice(c2q3);
        choiceService.saveChoice(c3q3);
        choiceService.saveChoice(c4q3);
        
        
    }

	
}
