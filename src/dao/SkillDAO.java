package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.*;
import utility.ConnectionManager;
public class SkillDAO{
	
	public List<Skill>listAllSkills() throws SQLException, ClassNotFoundException, IOException{
		List<Skill>list= new ArrayList<Skill>();
		Connection con = ConnectionManager.getConnection();
		Skill skill = null;
		String sql="SELECT * FROM SKILL";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			skill = new Skill(rs.getLong(1),rs.getString(2));
			list.add(skill);
		}
		con.close();
		return list;
	}
}
