/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author cparadkar
 *
 */
@Component
public class DashboardAssessmentJobServiceImpl implements DashboardAssessmentJobService {

	@Autowired
	private ESService esService;
	

	@Autowired
	private DashboardAssessmentJobHandler jobHandler;

	@Override
	public void createDashboardJob(DashboardAssessmentJobInput jobInput) {
		this.createJobRecord(dashboardJobConvertor(jobInput));
		this.sendEmail();
	}
	
	@Override
	public void deleteDashboardJob(String jobId) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void updateDashboardJob(DashboardAssessmentJobInput jobInput) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void executeDashboardJob(DashboardAssessmentJobInput jobInput) {
		DashboardAssessmentJob dashboardAssessmentJob = dashboardJobConvertor(jobInput);
		DashboardAssessmentJobTask jobTask = jobHandler.createNewTask(dashboardAssessmentJob);
		jobHandler.submitJob(jobTask);
		
	}

	private DashboardAssessmentJob dashboardJobConvertor(DashboardAssessmentJobInput jobInput) {
		return null;

	}

	private void createJobRecord(DashboardAssessmentJob dashboardAssessmentJob) {

	}
	
	private void sendEmail()
	{
		
	}







}
