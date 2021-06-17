/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

import java.util.concurrent.ExecutorService;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

/**
 * @author cparadkar
 *
 */
@Component
public class DashboardAssessmentJobHandler {
	
	private ExecutorService executor;
	
	@PostConstruct
	public void initExecutor() {
		
	}
	
	public DashboardAssessmentJobTask createNewTask(DashboardAssessmentJob job)
	{
		return null;
		
	}
	
	public void submitJob(DashboardAssessmentJobTask jobTask) {
		executor.submit(jobTask);
	}


}
