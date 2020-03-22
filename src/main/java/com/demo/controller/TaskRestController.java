package com.demo.controller;

import com.demo.bean.Task;
import com.demo.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/tasks")
public class TaskRestController {

    @Autowired
    private TaskService taskService;

    Logger log = LoggerFactory.getLogger(TaskRestController.class);

    @PostMapping(value = "/addTask")
    public boolean addUser(@RequestBody Task tasks) {
        log.info("开始新增：" + tasks.toString());
        return taskService.addTask(tasks);
    }

    @PutMapping(value = "/updateTask")
    public boolean updateUser(@RequestBody Task tasks) {
        log.info("开始更新：" + tasks.toString());
        return taskService.updateTask(tasks);
    }

    @DeleteMapping(value = "/deleteTask")
    public boolean delete(@RequestParam(value = "id", required = true) int id) {
        log.info("开始删除id为：" + id + "的任务。");
        return taskService.deleteTask(id);
    }

    @GetMapping(value = "/taskId")
    public Task findByUserId(@RequestParam(value = "id", required = true) int id) {
        log.info("开始查询id为：" + id + "的任务。");
        return taskService.findTaskById(id);
    }



}
