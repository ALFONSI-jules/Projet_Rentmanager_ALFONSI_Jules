package com.epf.rentmanager.servlet;

import com.epf.rentmanager.exception.ServiceException;
import com.epf.rentmanager.service.ClientService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class ListeClientServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private ClientService clientService = ClientService.getInstance();


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{

            request.setAttribute("nomClient1", clientService.findById(1).getNom());
            request.setAttribute("prenomClient1", clientService.findById(1).getPrenom());
            request.setAttribute("emailClient1", clientService.findById(1).getEmail());
            request.setAttribute("nomClient2", clientService.findById(2).getNom());
            request.setAttribute("prenomClient2", clientService.findById(2).getPrenom());
            request.setAttribute("emailClient2", clientService.findById(2).getEmail());
            request.setAttribute("nomClient3", clientService.findById(3).getNom());
            request.setAttribute("prenomClient3", clientService.findById(3).getPrenom());
            request.setAttribute("emailClient3", clientService.findById(3).getEmail());
            request.setAttribute("nomClient4", clientService.findById(4).getNom());
            request.setAttribute("prenomClient4", clientService.findById(4).getPrenom());
            request.setAttribute("emailClient4", clientService.findById(4).getEmail());




        }
        catch(ServiceException e){
            e.printStackTrace();

        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/users/list.jsp").forward(request, response);

    }

}
