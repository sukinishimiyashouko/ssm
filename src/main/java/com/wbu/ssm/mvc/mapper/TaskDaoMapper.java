package com.wbu.ssm.mvc.mapper;

/**
 * @auther aqing
 */
import com.wbu.ssm.mvc.bean.Task;
import org.apache.ibatis.annotations.*;


import java.util.List;

public interface TaskDaoMapper {
    @Select("select * from tb_task")
    List<Task> queryAllTask();
    @Insert("insert into tb_task(task_no,cus_name,cus_phone,task_item,task_status) values(#{task_no},#{cus_name},#{cus_phone},#{task_item},0)")
    int saveTask(@Param("task_no") String task_no, @Param("cus_name") String cus_name, @Param("cus_phone") String cus_phone, @Param("task_item") String task_item);

    @Delete("delete from tb_task where task_no = #{task_no}")
    int removeTask(@Param("task_no") String task_no);

    @Update("update tb_task set task_status = #{status} where task_no = #{task_no}")
    int editTaskStatus(@Param("task_no") String task_no,@Param("status") int status);

}
