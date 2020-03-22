package com.demo.service;
import com.demo.bean.Task;



public interface TaskService {

    // 用户新增
    boolean addTask(Task tasks);

    // 用户更新
    boolean updateTask(Task tasks);

    // 用户删除
    boolean deleteTask(int id);

    // 用户查询
    Task findTaskById(int id);
}
