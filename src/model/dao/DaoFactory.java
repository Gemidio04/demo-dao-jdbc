package model.dao;

import db.DB;
import model.dao.impl.*;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDeparmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
	
}
