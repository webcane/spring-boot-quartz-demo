package com.kaviddiss.bootquartz.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.beans.factory.annotation.Autowired;

import com.kaviddiss.bootquartz.service.SampleService;

/**
 * Created by david on 2015-01-20.
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class SampleJob implements Job {
	
    @Autowired
    private SampleService service;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        service.hello();
    }
}
