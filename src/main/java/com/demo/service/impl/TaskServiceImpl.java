package com.demo.service.impl;

import com.demo.bean.Task;
import com.demo.dao.TaskDao;
import com.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Transactional
    @Override
    public boolean addTask(Task tasks) {
        boolean flag = false;
        try {
            taskDao.addTask(tasks);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Transactional
    @Override
    public boolean updateTask(Task tasks) {
        boolean flag = false;
        try {
            taskDao.updateTask(tasks);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Transactional
    @Override
    public boolean deleteTask(int id) {
        boolean flag = false;
        try {
            taskDao.deleteTask(id);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Task findTaskById(int id) {
        return taskDao.findById(id);
    }


}
