/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

import java.util.List;

/**
 * @author cparadkar
 *
 */
public interface DashboardAssessmentJobService {
	void createDashboardJob(AssessmentUser assessmentUser, DashboardAssessmentJobInput jobInput, Long userId) throws Exception;
	void deleteDashboardJob(String jobId);
	void updateDashboardJob(AssessmentUser assessmentUser,DashboardAssessmentJobInput jobInput,Long userId) throws Exception;
	JobSubmissionStatus executeDashboardJob(DashboardAssessmentJobInput jobInput);
	List<DashboardAssessmentJob> fetchScheduledDashboardJobs();
	List<DashboardAssessmentJob> fetchScheduledDashboardJobsForCustomer(String customerId);
	List<DashboardAssessmentJobMapping> fetchJobExecutionResult(String jobId, String resultType);

}
