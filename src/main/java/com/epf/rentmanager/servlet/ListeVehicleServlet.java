package com.epf.rentmanager.servlet;

import com.epf.rentmanager.exception.ServiceException;
import com.epf.rentmanager.service.ClientService;
import com.epf.rentmanager.service.ReservationService;
import com.epf.rentmanager.service.VehicleService;
import com.epf.rentmanager.model.Vehicle;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cars")
public class ListeVehicleServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private VehicleService vehicleService = VehicleService.getInstance();


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            List<Vehicle> vehicles = new ArrayList<Vehicle>();
            for (int i=0; i<vehicleService.findAll().size();i++) {
                vehicles.add(vehicleService.findAll().get(i));
                request.setAttribute("vehicles", vehicles);
            }
        }
        catch(ServiceException e){
            e.printStackTrace();

        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/vehicles/list.jsp").forward(request, response);

    }

}
