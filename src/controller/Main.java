package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.SkillDAO;
import model.Skill;
import utility.ConnectionManager;

class Main{
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException 
	{	List<Skill>list=new ArrayList<Skill>();
		SkillDAO skilldao=new SkillDAO();
		list=skilldao.listAllSkills();
		System.out.println("List of all skills");
		for (Skill s : list) {
			System.out.println(s.getSkillId()+") "+s.getSkillName());
		}
	}
	
}
