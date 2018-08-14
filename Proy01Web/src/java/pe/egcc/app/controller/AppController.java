/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
/**
 *
 * @author PCB
 */
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import pe.eggc.app.service.MateService;
@WebServlet(name = "AppController", urlPatterns = {"/AppSumar","/AppRestar"})
public class AppController extends HttpServlet {

    
    
     
    @Override
     public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
           // super.service(req, res); //To change body of generated methods, choose Tools | Templates.
            
            String path=request.getServletPath();
            switch (path){
                case "/AppSumar" :
                    appSumar(request,response);
                    break;
                case "/AppRestar" :
                    appRestar(request,response);
                    break;
                 
                
            }
             
     }


    protected void appSumar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //datos
        int n1=Integer.parseInt(request.getParameter("num1").toString());
        int n2=Integer.parseInt(request.getParameter("num2").toString());
        MateService  mateService =new MateService();
        int suma=mateService.sumar(n1,n2);
        //forward
        request.setAttribute("n1", n1);
        request.setAttribute("n2", n2);
        request.setAttribute("suma", suma);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("respuesta.jsp");
        dispatcher.forward(request,response);
    }

    private void appRestar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //datos
        
        int n3=Integer.parseInt(request.getParameter("num1").toString());
        int n4=Integer.parseInt(request.getParameter("num2").toString());
        MateService  mateService =new MateService();
        int resta=mateService.restar(n3,n4);
        //forward
        request.setAttribute("n1", n3);
        request.setAttribute("n2", n4);
        request.setAttribute("resta", resta);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("respuesta.jsp");
        dispatcher.forward(request,response);
            
    }

}
