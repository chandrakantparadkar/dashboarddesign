/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

/**
 * @author cparadkar
 *
 */
public interface DashboardAssessmentJobService {
	void createDashboardJob(DashboardAssessmentJobInput jobInput);
	void deleteDashboardJob(String jobId);
	void updateDashboardJob(DashboardAssessmentJobInput jobInput);
	void executeDashboardJob(DashboardAssessmentJobInput jobInput);
}
