/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author cparadkar
 *
 */
@RestController
@RequestMapping("/job")
public class AssessmentJobResource {

	@Autowired
	private DashboardAssessmentJobService dashboardAssessmentJobService;

	@RequestMapping(value = "/createdashboardjob", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createDashboradJob(@RequestBody DashboardAssessmentJobInput jobInput) {
		try {
			AssessmentUser assessmentUser = null;; 
			dashboardAssessmentJobService.createDashboardJob(assessmentUser,jobInput,getUserID() );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// log error
			// send email
			return null;
		}
		return null;

	}

	@RequestMapping(value = "/deletedashboardjob", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<?>  deleteJob(@RequestParam("id") String id) {
		return null;

	}

	@RequestMapping(value = "/updatedashboardjob", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateDashboradJob(@RequestBody DashboardAssessmentJobInput jobInput) {
		try {
			AssessmentUser assessmentUser = null;; 
			dashboardAssessmentJobService.updateDashboardJob(assessmentUser,jobInput,getUserID() );
		} catch (Exception e) {
			// log error
			// send email
			return null;
		}
		return null;
	}

	@RequestMapping(value = "/manualtriggerdashboardjob", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> manualTriggerDashboardJob(@RequestBody DashboardAssessmentJobInput jobInput) {
		dashboardAssessmentJobService.executeDashboardJob(jobInput);
		return null;

	}
	
	@RequestMapping(
		    value = "/fetchscheduledjobs", 
		    method = RequestMethod.POST,
		    produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Object fetchScheduledJobs(@RequestParam("customerId") String customerId) {
		return dashboardAssessmentJobService.fetchScheduledDashboardJobsForCustomer(customerId);
	}
	
	
	@RequestMapping(
		    value = "/fetchjobexecutionresult/{jobId}/{resultType}", 
		    method = RequestMethod.POST,
		    produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Object fetchJobExecutionResult(@PathVariable String jobId, @PathVariable String resultType) {
		return dashboardAssessmentJobService.fetchJobExecutionResult(jobId, resultType);
	}
	
	private long getUserID() {
		return 0;

	}

}
