package com.estafet.microservices.scrum.lib.selenium.pages.story;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.estafet.microservices.scrum.lib.selenium.pages.Page;
import com.estafet.microservices.scrum.lib.selenium.pages.project.ProjectPage;

public class AddStoryPage extends Page {

	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement submitButton;
	
	@FindBy(xpath = "//input[@id='title']")
	@CacheLookup
	WebElement storyTitleField;
	
	@FindBy(xpath = "//input[@id='storypoints']")
	@CacheLookup
	WebElement storyPointsField;
	
	public AddStoryPage(String projectId) {
		super(projectId);
	}

	public AddStoryPage(WebDriver driver) {
		super(driver);
	}

	public ProjectPage clickSubmitButton() {
		return click(submitButton, ProjectPage.class);
	}
	
	@Override
	public String title() {
		return "Simple Scrum Project Management";
	}

	@Override
	public String uri() {
		return "/addstory/{1}";
	}

	public AddStoryPage setTitle(String title) {
		setField(storyTitleField, title);
		return this;
	}

	public AddStoryPage setStoryPointsField(int storyPoints) {
		setField(storyPointsField, storyPoints);
		return this;
	}

	
	
}
