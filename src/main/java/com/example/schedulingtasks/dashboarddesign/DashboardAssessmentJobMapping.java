/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

import java.util.Date;
import java.util.Set;

/**
 * @author cparadkar
 *
 */
public class DashboardAssessmentJobMapping {
	
	private String id;
	private String assessmentJobName;
	private String assessmentJobId;
	private String policy_job_mapping_id;
	private boolean archived;
	private Date executionTimestamp;
	private boolean isLatestExecutedJob;
	private String cloudType;
	private String assessmentTool;
	private String providerName;
	private Set<String> missingPermissions;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAssessmentJobName() {
		return assessmentJobName;
	}

	public void setAssessmentJobName(String assessmentJobName) {
		this.assessmentJobName = assessmentJobName;
	}

	public String getAssessmentJobId() {
		return assessmentJobId;
	}

	public void setAssessmentJobId(String assessmentJobId) {
		this.assessmentJobId = assessmentJobId;
	}

	public String getPolicy_job_mapping_id() {
		return policy_job_mapping_id;
	}

	public void setPolicy_job_mapping_id(String policy_job_mapping_id) {
		this.policy_job_mapping_id = policy_job_mapping_id;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	public Date getExecutionTimestamp() {
		return executionTimestamp;
	}

	public void setExecutionTimestamp(Date executionTimestamp) {
		this.executionTimestamp = executionTimestamp;
	}

	public boolean isLatestExecutedJob() {
		return isLatestExecutedJob;
	}

	public void setLatestExecutedJob(boolean isLatestExecutedJob) {
		this.isLatestExecutedJob = isLatestExecutedJob;
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

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public Set<String> getMissingPermissions() {
		return missingPermissions;
	}

	public void setMissingPermissions(Set<String> missingPermissions) {
		this.missingPermissions = missingPermissions;
	}
}
