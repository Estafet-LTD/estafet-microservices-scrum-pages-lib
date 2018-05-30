package com.estafet.microservices.scrum.lib.selenium.pages.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.estafet.microservices.scrum.lib.selenium.pages.Page;
import com.estafet.microservices.scrum.lib.selenium.pages.story.StoryPage;

public class AddTaskPage extends Page {

	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement submitButton;
	
	@FindBy(xpath = "//input[@id='title']")
	@CacheLookup
	WebElement titleField;
	
	@FindBy(xpath = "//input[@id='initialHours']")
	@CacheLookup
	WebElement estimateField;
		
	public AddTaskPage(String storyId) {
		super(storyId);
	}

	public AddTaskPage(WebDriver driver) {
		super(driver);
	}

	public StoryPage clickSubmitButton() {
		return click(submitButton, StoryPage.class);
	}
	
	@Override
	public String title() {
		return "Simple Scrum Project Management";
	}

	@Override
	public String uri() {
		return "/story/{1}/task";
	}

	public AddTaskPage setTitle(String title) {
		setField(titleField, title);
		return this;
	}

	public AddTaskPage setEstimate(int hours) {
		setField(estimateField, hours);
		return this;
	}
	
	

}
