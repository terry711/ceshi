package cn.zskxt.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;



@Service(value="jobTest")
public class taskimp{

    //@Scheduled(cron="0 */1 * * * ? ")   //每5分钟执行一次
    public void myTest1() {
    	System.out.println("部门人员统计----------------------------------------------");
    	
    	
    	
    }

}

