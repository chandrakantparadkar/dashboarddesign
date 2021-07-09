/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;


/**
 * @author cparadkar
 *
 */
public class DashboardScheduledJobExecutor {

	@Autowired
	private ESService esService;

	@Autowired
	private AssessmentJobService assessmentJobService;
	
	@Autowired
	private DashboardAssessmentJobService dashboardAssessmentJobService;


	/**
	 * This method starts hourly fetch and execution of jobs.
	 * 
	 */
	@Scheduled(fixedRate = 3600000)
	public void initiateScheduledJobExecution() {
		List<DashboardAssessmentJob> jobList = fetchActiveDashboardJobs();
		this.excuteJobs(jobList);
	}

	/**
	 * This method fetches DashboardAssessmentJob list.
	 * 
	 * @return
	 */
	private List<DashboardAssessmentJob> fetchActiveDashboardJobs() {
		return dashboardAssessmentJobService.fetchScheduledDashboardJobs();

	}

	/**
	 * This method executes jobList.
	 * 
	 * @param jobList
	 * @return 
	 */
	private void excuteJobs(List<DashboardAssessmentJob> jobList) {

		JobSubmissionStatus jobSubmissionStatus = null;
		for (DashboardAssessmentJob job : jobList) {
			try {
				jobSubmissionStatus = assessmentJobService.run(null, convertDashboardJobs(job), null);
			} catch (Exception e) {
               //log error
			}
		}

	}
	
	private AssessmentJobInput convertDashboardJobs(DashboardAssessmentJob job) {
		return null;

	}

}
