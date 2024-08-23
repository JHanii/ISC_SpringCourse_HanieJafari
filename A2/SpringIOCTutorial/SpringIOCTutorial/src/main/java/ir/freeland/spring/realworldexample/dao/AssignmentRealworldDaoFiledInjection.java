package ir.freeland.spring.realworldexample.dao;
//Assignment

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AssignmentRealworldDaoFiledInjection {
  @Autowired
  private MsSqlApplicationDao msSqlApplicationDao;
  
  @Autowired
  private OracleSqlApplicationDao oracleSqlApplicationDao;
  
  @Autowired
  private MySqlApplicationDao mySqlApplicationDao;

  public void test() {
	  msSqlApplicationDao.add();
	  oracleSqlApplicationDao.add();
	  mySqlApplicationDao.add();
  }

}
