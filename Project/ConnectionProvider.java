/** To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */ package Project; import java.sql.*; import java.sql.DriverManager; /** ** @author mithi */ public class ConnetionProvider { public static Connection getcon() { try { Class.forName("com.mysql.jdbc.Driver"); Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","22 98"); return con; }catch(Exception e) { return null; } } }