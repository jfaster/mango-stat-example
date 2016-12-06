package org.jfaster.mango.example.stat.dao;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.ReturnGeneratedId;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.example.stat.pojo.User;

/**
 * @author ash
 */
@DB
public interface UserDao {

  @ReturnGeneratedId
  @SQL("insert into user(name, age, update_time) values(:name, :age, :updateTime)")
  int addUser(User user);

  @SQL("select id, name, age, update_time from user where id = :1")
  User getUserById(int id);

  @SQL("select id, name, age, update_time from user where name = :1")
  User getUserByName(String name);

  @SQL("update user set name=:name, age=:age, update_time=:updateTime where id=:id")
  void updateUser(User user);

  @SQL("delete from user where id = :1")
  void deleteUserById(int id);

}
