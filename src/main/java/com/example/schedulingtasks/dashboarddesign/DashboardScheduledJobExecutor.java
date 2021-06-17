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
	private DashboardAssessmentJobHandler jobHandler;

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
		return null;

	}

	/**
	 * This method executes jobList.
	 * 
	 * @param jobList
	 */
	private void excuteJobs(List<DashboardAssessmentJob> jobList) {

		for (DashboardAssessmentJob job : jobList) {
			DashboardAssessmentJobTask jobTask = jobHandler.createNewTask(job);
			jobHandler.submitJob(jobTask);
		}

	}

}
