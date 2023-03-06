package com.epf.rentmanager.ui;
import java.time.LocalDate;

import com.epf.rentmanager.exception.ServiceException;
import com.epf.rentmanager.model.Client;
import com.epf.rentmanager.service.ClientService;
import com.epf.rentmanager.service.ReservationService;
import com.epf.rentmanager.service.VehicleService;

public class test {
    public static void main(String[] args){
        final int CE_QUE_JE_VEUX=2;
        try {
            System.out.println(ClientService.getInstance().findAll());

        }
        catch (ServiceException e){
            e.printStackTrace();
        }
    }
}
