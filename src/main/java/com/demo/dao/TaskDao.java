package com.demo.dao;


import com.demo.bean.Task;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;


@Mapper
public interface TaskDao {

    // 用户新增
    @Insert("insert into user(id,content,createdTime) values (#{id},#{content},#{createdTime})")
    void addTask(Task tasks);

    // 用户更新
    @Update("update user set content=#{content},createdTime=#{createdTime} where id=#{id}")
    void updateTask(Task tasks);

    // 用户删除
    @Delete("delete from user where id=#{id}")
    void deleteTask(int id);

    // 用户查询
    @Select("SELECT id,content,createdTime FROM user where id=#{id}")
    Task findById(@Param("id") int id);


}
