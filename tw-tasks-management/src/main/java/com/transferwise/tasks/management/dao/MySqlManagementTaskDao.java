package com.transferwise.tasks.management.dao;

import com.transferwise.tasks.TasksProperties;
import com.transferwise.tasks.dao.ITaskDaoDataSerializer;
import com.transferwise.tasks.dao.MySqlTaskTables;
import com.transferwise.tasks.dao.MySqlTaskTypesMapper;
import javax.sql.DataSource;

public class MySqlManagementTaskDao extends JdbcManagementTaskDao {

  public MySqlManagementTaskDao(DataSource dataSource, TasksProperties properties, ITaskDaoDataSerializer taskDataSerializer) {
    super(dataSource, new MySqlTaskTables(properties), new MySqlTaskTypesMapper(), taskDataSerializer);
  }
}
