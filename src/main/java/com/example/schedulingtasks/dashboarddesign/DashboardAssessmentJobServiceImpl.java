/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

import java.util.List;

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
	private AssessmentJobService assessmentJobService;

	@Autowired
	private ProviderService providerService;

	@Override
	public void createDashboardJob(AssessmentUser assessmentUser,DashboardAssessmentJobInput jobInput,Long userId) throws Exception {
		try {
			this.validateDashboardAssessmentJob(assessmentUser,jobInput,userId);
			DashboardAssessmentJob job = dashboardJobConvertor(jobInput);
			this.createJobRecord(job);
			this.sendEmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// log error
			this.sendEmail(); // error
			throw e;
		}

	}

	@Override
	public void deleteDashboardJob(String jobId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDashboardJob(AssessmentUser assessmentUser,DashboardAssessmentJobInput jobInput,Long userId) throws Exception {
		try {
			this.validateDashboardAssessmentJob(assessmentUser,jobInput,userId);
			DashboardAssessmentJob job = dashboardJobConvertor(jobInput);
			this.updateJobRecord(job);
			this.sendEmail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// log error
			this.sendEmail(); // error
			throw e;
		}

	}

	@Override
	public JobSubmissionStatus executeDashboardJob(DashboardAssessmentJobInput jobInput) {
		AssessmentJobInput job = convertDashboardJobs(jobInput);
		JobSubmissionStatus jobSubmissionStatus = null;

		try {
			jobSubmissionStatus = assessmentJobService.run(null, job, null);
			this.sendEmail(); // error

		} catch (Exception e) {
			// log error
			this.sendEmail(); // error

		}
		return jobSubmissionStatus;
	}
	
	@Override
	public List<DashboardAssessmentJob> fetchScheduledDashboardJobs() {
		// TODO Auto-generated method stub
		return null;
	}

	private DashboardAssessmentJob dashboardJobConvertor(DashboardAssessmentJobInput jobInput) {
		return null;

	}

	private AssessmentJobInput convertDashboardJobs(DashboardAssessmentJobInput jobInput) {
		return null;

	}

	private void createJobRecord(DashboardAssessmentJob dashboardAssessmentJob) {

	}

	private void updateJobRecord(DashboardAssessmentJob dashboardAssessmentJob) {

	}

	private void sendEmail() {

	}

	private void validateDashboardAssessmentJob(AssessmentUser assessmentUser, DashboardAssessmentJobInput jobInput, Long userId) throws Exception {
		Provider provider = null;

		provider = providerService.getProvider(new Long(jobInput.getProviderId()));
		AccountValidatorFactory.validate(provider, assessmentUser, this.convertDashboardJobs(jobInput), userId);

	}

	@Override
	public List<DashboardAssessmentJob> fetchScheduledDashboardJobsForCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DashboardAssessmentJobMapping> fetchJobExecutionResult(String jobId,String resultType) {
		return null;
	}



}
