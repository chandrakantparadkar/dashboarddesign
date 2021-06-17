package com.example.schedulingtasks.dashboarddesign;

import java.util.List;
import java.util.Map;

public class DashboardAssessmentJob {

	private String name;
	private String id;
	private AssessmentUser assessmentUser;
	private String createdTimeStamp;
	private List<Assessment> assessments;
	private AccountDetails accountDetails;
	private Map<String, String> temaplatesMap;
	private String cloudType;
	private String assessmentTool;
	private String assessmentFrequency;
	private String assessmentTime;
	private String selectedBlueprint;
	private String providerName;
	private String providerId;
	private String endDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AssessmentUser getAssessmentUser() {
		return assessmentUser;
	}

	public void setAssessmentUser(AssessmentUser assessmentUser) {
		this.assessmentUser = assessmentUser;
	}

	public String getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(String createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public List<Assessment> getAssessments() {
		return assessments;
	}

	public void setAssessments(List<Assessment> assessments) {
		this.assessments = assessments;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	public Map<String, String> getTemaplatesMap() {
		return temaplatesMap;
	}

	public void setTemaplatesMap(Map<String, String> temaplatesMap) {
		this.temaplatesMap = temaplatesMap;
	}

	public String getCloudType() {
		return cloudType;
	}

	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
	}

	public String getAssessmentTool() {
		return assessmentTool;
	}

	public void setAssessmentTool(String assessmentTool) {
		this.assessmentTool = assessmentTool;
	}

	public String getAssessmentFrequency() {
		return assessmentFrequency;
	}

	public void setAssessmentFrequency(String assessmentFrequency) {
		this.assessmentFrequency = assessmentFrequency;
	}

	public String getAssessmentTime() {
		return assessmentTime;
	}

	public void setAssessmentTime(String assessmentTime) {
		this.assessmentTime = assessmentTime;
	}

	public String getSelectedBlueprint() {
		return selectedBlueprint;
	}

	public void setSelectedBlueprint(String selectedBlueprint) {
		this.selectedBlueprint = selectedBlueprint;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
