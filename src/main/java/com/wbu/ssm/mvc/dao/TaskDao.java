package com.wbu.ssm.mvc.dao;

/**
 * @auther aqing
 */
import com.wbu.ssm.mvc.bean.Task;
import com.wbu.ssm.mvc.mapper.TaskDaoMapper;
import com.wbu.ssm.mvc.utils.CodeUtils;
import com.wbu.ssm.mvc.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDao implements TaskDaoMapper {


    @Test@Override
    public List<Task> queryAllTask() {
        SqlSession sqlSession = SqlSessionUtil.getSession();
        TaskDaoMapper mapper = sqlSession.getMapper(TaskDaoMapper.class);
        List<Task> tasks = mapper.queryAllTask();
        return tasks;
    }

    @Test@Override
    public int saveTask(String task_no, String cus_name, String cus_phone, String task_item) {
        SqlSession sqlSession = SqlSessionUtil.getSession();
        TaskDaoMapper mapper = sqlSession.getMapper(TaskDaoMapper.class);
        int saveTask = mapper.saveTask(CodeUtils.getCode(),cus_name,cus_phone,task_item);
        System.out.println(saveTask);
        return saveTask;
    }

    @Test@Override
    public int removeTask(String task_no) {
        SqlSession sqlSession = SqlSessionUtil.getSession();
        TaskDaoMapper mapper = sqlSession.getMapper(TaskDaoMapper.class);
        int removeTask = mapper.removeTask(task_no);
        System.out.println(removeTask);
        return removeTask;
    }

    @Test@Override
    public int editTaskStatus(String task_no, int status) {
        SqlSession SqlSession = SqlSessionUtil.getSession();
        TaskDaoMapper mapper = SqlSession.getMapper(TaskDaoMapper.class);
        int editTaskStatus = mapper.editTaskStatus(task_no,status);
        System.out.println(editTaskStatus);
        return editTaskStatus;
    }
}
