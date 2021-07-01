package com.example.schedulingtasks.dashboarddesign;

import java.util.List;

public class DashboardAssessmentJobInput {
	
	private boolean notificationEnabled;
	private String notifyEmail;
	private List<AssessmentTemplateResponse> templates;
	private String cloudType;
	private String selectedBlueprint;
	private boolean ignorePermissionWarning;
	private String jobName;
	private String assessmentTool;
	private String assessmentFrequency;
	private String endDate;
	private String assessmentTime;
	private String providerId;


	public boolean isNotificationEnabled() {
		return notificationEnabled;
	}

	public void setNotificationEnabled(boolean notificationEnabled) {
		this.notificationEnabled = notificationEnabled;
	}

	public String getNotifyEmail() {
		return notifyEmail;
	}

	public void setNotifyEmail(String notifyEmail) {
		this.notifyEmail = notifyEmail;
	}

	public List<AssessmentTemplateResponse> getTemplates() {
		return templates;
	}

	public void setTemplates(List<AssessmentTemplateResponse> templates) {
		this.templates = templates;
	}

	public String getCloudType() {
		return cloudType;
	}

	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
	}

	public String getSelectedBlueprint() {
		return selectedBlueprint;
	}

	public void setSelectedBlueprint(String selectedBlueprint) {
		this.selectedBlueprint = selectedBlueprint;
	}

	public boolean isIgnorePermissionWarning() {
		return ignorePermissionWarning;
	}

	public void setIgnorePermissionWarning(boolean ignorePermissionWarning) {
		this.ignorePermissionWarning = ignorePermissionWarning;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
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

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAssessmentTime() {
		return assessmentTime;
	}

	public void setAssessmentTime(String assessmentTime) {
		this.assessmentTime = assessmentTime;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}



}
