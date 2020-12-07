package cn.congee.api.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author: yang
 * @Date: 2020-12-08 2:55
 */
public class QuartzJob2 implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println("[卖猪肉的]");
    }

}
