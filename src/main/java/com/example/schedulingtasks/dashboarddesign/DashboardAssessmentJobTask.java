/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;


/**
 * @author cparadkar
 *
 */
public class DashboardAssessmentJobTask implements Callable<DashboardAssessmentJob> {

	public DashboardAssessmentJobTask() {
	}

	private ExecutorService executor;

	private DashboardAssessmentJob assessmentJob;
	
	private ESService esService;


	@Override
	public DashboardAssessmentJob call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	private void saveDashboardPolicyJob(Assessment assessment) {
	}

	private void sendEmail() {
	}

	private boolean isNotificationEnabled() {
		return false;
	}

}
