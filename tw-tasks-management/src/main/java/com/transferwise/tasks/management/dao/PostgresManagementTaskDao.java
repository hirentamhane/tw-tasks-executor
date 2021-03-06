package com.transferwise.tasks.management.dao;

import com.transferwise.tasks.TasksProperties;
import com.transferwise.tasks.dao.ITaskDaoDataSerializer;
import com.transferwise.tasks.dao.PostgresTaskSqlMapper;
import com.transferwise.tasks.dao.PostgresTaskTables;
import javax.sql.DataSource;

public class PostgresManagementTaskDao extends JdbcManagementTaskDao {

  public PostgresManagementTaskDao(DataSource dataSource, TasksProperties tasksProperties, ITaskDaoDataSerializer taskDataSerializer) {
    super(dataSource, new PostgresTaskTables(tasksProperties), new PostgresTaskSqlMapper(), taskDataSerializer);
  }
}
