/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

/**
 * @author cparadkar
 *
 */
public interface DashboardAssessmentJobService {
	void createDashboardJob(AssessmentUser assessmentUser, DashboardAssessmentJobInput jobInput, Long l) throws Exception;
	void deleteDashboardJob(String jobId);
	void updateDashboardJob(AssessmentUser assessmentUser,DashboardAssessmentJobInput jobInput,Long userId) throws Exception;
	JobSubmissionStatus executeDashboardJob(DashboardAssessmentJobInput jobInput);
}
