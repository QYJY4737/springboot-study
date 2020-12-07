package cn.congee.api.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author: yang
 * @Date: 2020-12-08 2:54
 */
public class QuartzJob1 implements Job {

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println("[卖包子的]");
    }

}
