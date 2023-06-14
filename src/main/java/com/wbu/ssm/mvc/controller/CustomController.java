package com.wbu.ssm.mvc.controller;

/**
 * @auther aqing
 */
import com.wbu.ssm.mvc.bean.Task;
import com.wbu.ssm.mvc.mapper.TaskDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomController {

    @Autowired
    private TaskDaoMapper taskDaoMapper;

    @RequestMapping("/custom_view")
    public String custom(){
        return "custom_view";
    }

    @RequestMapping(value = "/custom_view",params = "name=query_all")
    @ResponseBody
    public List<Task> test(){
        return taskDaoMapper.queryAllTask();
    }
}
