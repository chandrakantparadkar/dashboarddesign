/**
 * 
 */
package com.example.schedulingtasks.dashboarddesign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
	
	@RequestMapping(
		    value = "/createdashboardjob", 
		    method = RequestMethod.POST,
		    produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createDashboradJob(@RequestBody DashboardAssessmentJobInput jobInput)
	{
		dashboardAssessmentJobService.createDashboardJob(jobInput);
		return null;
		
	}
	
	
	@RequestMapping(
		    value = "/deletedashboardjob", 
		    method = RequestMethod.DELETE,
		    produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Object deleteJob(@RequestParam("id") String id)
	{
		return null;
		
	}
	
	
	@RequestMapping(
		    value = "/updatedashboardjob", 
		    method = RequestMethod.POST,
		    produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateDashboradJob(@RequestBody DashboardAssessmentJobInput jobInput)
	{
		dashboardAssessmentJobService.updateDashboardJob(jobInput);
		return null;
		
	}
	
	
	@RequestMapping(
		    value = "/manualtriggerdashboardjob", 
		    method = RequestMethod.POST,
		    produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> manualTriggerDashboardJob(@RequestBody DashboardAssessmentJobInput jobInput)
	{
		dashboardAssessmentJobService.executeDashboardJob(jobInput);
		return null;
		
	}

}
