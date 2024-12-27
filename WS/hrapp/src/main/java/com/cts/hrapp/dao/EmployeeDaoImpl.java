package com.cts.hrapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cts.hrapp.exceptions.DatabaseException;
import com.cts.hrapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	public static final String GET_ALL = "SELECT empId,name,sal FROM emps";
	public static final String GET_BY_ID = "SELECT empId,name,sal FROM emps WHERE empId=?";
	public static final String ADD = "INSERT INTO emps(name,sal) values(?,?)";
	public static final String DEL_BY_ID = "DELETE FROM emps WHERE empId=?";

	public static final String CONN_STR = "jdbc:mysql://localhost:3306/hrdb";
	public static final String USER_ID = "root";
	public static final String PWD = "root";

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(CONN_STR, USER_ID, PWD);
	}

	@Override
	public Employee add(Employee emp) throws DatabaseException {
		if (emp != null) {
			try (Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(ADD);) {

				pst.setString(1, emp.getName());
				pst.setDouble(2, emp.getSalary());
				pst.executeUpdate();

			} catch (SQLException exp) {
				System.out.println(exp.getMessage()); // orelse we have to log the exception
				throw new DatabaseException("Unable to add the employee!");
			}
		}
		return emp;
	}

	@Override
	public List<Employee> getAll() throws DatabaseException {
		List<Employee> emps = new ArrayList<>();

		try (Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(GET_ALL);) {

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				emps.add(new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}

		} catch (SQLException exp) {
			System.out.println(exp.getMessage()); // orelse we have to log the exception
			throw new DatabaseException("Unable to fetech employees!");
		}

		return emps;
	}

	@Override
	public Employee getEmployeeById(int empId) throws DatabaseException {
		Employee emp = null;
		try (Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(GET_BY_ID);) {
			pst.setInt(1, empId);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				emp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
			}

		} catch (SQLException exp) {
			System.out.println(exp.getMessage()); // orelse we have to log the exception
			throw new DatabaseException("Unable to fetech the employee!");
		}

		return emp;
	}

	@Override
	public void deleteById(int empId) throws DatabaseException {
		try (Connection con = getConnection(); PreparedStatement pst = con.prepareStatement(DEL_BY_ID);) {
			pst.setInt(1, empId);
			pst.executeUpdate();
		} catch (SQLException exp) {
			System.out.println(exp.getMessage()); // orelse we have to log the exception
			throw new DatabaseException("Unable to delete the employee!");
		}

	}

}
