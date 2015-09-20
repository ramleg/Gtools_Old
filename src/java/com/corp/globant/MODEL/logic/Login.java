package com.corp.globant.MODEL.logic;

import com.corp.globant.MODEL.beans.*;
import com.corp.globant.MODEL.dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ram
 */
public class Login extends HttpServlet {
    private HttpSession session;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            session.invalidate();
            response.sendRedirect("index.jsp");
            return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
                Connection conn = ConnectionManager.getConnection();
                User user = UserDAOpsql.getByUserDomain(conn, request.getParameter("txt-username"));
                
                LdapDAO.validateUser(user.getUserId(), request.getParameter("txt-passwd"));
                System.out.println("usuario validado");
                
                HttpSession session = request.getSession();
                session.setAttribute("UserLogged", user);
                response.sendRedirect("home.jsp");
            }
        catch(SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Invalid User");
            response.sendRedirect("index.jsp");
        }
        catch(NamingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Invalid Password");
            response.sendRedirect("index.jsp");
        }
        catch (Exception ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Database connection error");
            response.sendRedirect("index.jsp");
        }
        finally{
            
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}