package com.wbu.ssm.mvc.controller;

/**
 * @auther aqing
 */
import com.wbu.ssm.mvc.bean.Fit;
import com.wbu.ssm.mvc.bean.Task;
import com.wbu.ssm.mvc.dao.TaskDao;
import com.wbu.ssm.mvc.mapper.FitDaoMapper;
import com.wbu.ssm.mvc.mapper.TaskDaoMapper;
import com.wbu.ssm.mvc.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private TaskDaoMapper taskDaoMapper;

    @Autowired
    private FitDaoMapper fitDaoMapper;

    @RequestMapping(value = "/index",params = "name=query_all")
    @ResponseBody
    public List<Task> taskList(){
        return taskDaoMapper.queryAllTask();
    }

    @RequestMapping(value = "/index",params = "name=query_all_fit")
    @ResponseBody
    public List<Fit> fitList(){
        return fitDaoMapper.findAllFit();
    }

    @RequestMapping(value = "/index",params = "name=edit_status")
    @ResponseBody
    public int change_status(String task_no,String task_item,int task_status){
        return taskDaoMapper.editTaskStatus(task_no,task_status);
    }

    @RequestMapping(value = "/index",params = "name=remove_task")
    @ResponseBody
    public int remove_task(String task_no){
        return taskDaoMapper.removeTask(task_no);
    }

    @RequestMapping(value = "index",params = "name=save_task")
    @ResponseBody
    public int save_task(String cus_name,String cus_phone,String task_item){
        return taskDaoMapper.saveTask(CodeUtils.getCode(),cus_name,cus_phone,task_item);
    }


}
