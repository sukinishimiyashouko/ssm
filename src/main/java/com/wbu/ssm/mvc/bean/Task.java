package com.wbu.ssm.mvc.bean;

/**
 * @auther aqing
 */
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Task {
    private int task_id;
    private String task_no;
    private String task_item;
    private String cus_name;
    private String cus_phone;
    private int task_status;
    public Task() {
    }

    public Task(int task_id, String task_no, String task_item, String cus_name, String cus_phone, int task_status) {
        this.task_id = task_id;
        this.task_no = task_no;
        this.task_item = task_item;
        this.cus_name = cus_name;
        this.cus_phone = cus_phone;
        this.task_status = task_status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", task_no='" + task_no + '\'' +
                ", task_item='" + task_item + '\'' +
                ", cus_name='" + cus_name + '\'' +
                ", cus_phone='" + cus_phone + '\'' +
                ", task_status=" + task_status +
                '}';
    }
}
