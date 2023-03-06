package com.epf.rentmanager.service;

import java.util.ArrayList;
import java.util.List;

import com.epf.rentmanager.dao.ReservationDao;
import com.epf.rentmanager.exception.DaoException;
import com.epf.rentmanager.exception.ServiceException;
import com.epf.rentmanager.model.Client;
import com.epf.rentmanager.model.Vehicle;
import com.epf.rentmanager.model.Reservation;
import com.epf.rentmanager.dao.ClientDao;
import com.epf.rentmanager.dao.VehicleDao;

public class ReservationService {

    private ReservationDao reservationDao;
    public static ReservationService instance;

    private ReservationService() {
        this.reservationDao = ReservationDao.getInstance();
    }

    public static ReservationService getInstance() {
        if (instance == null) {
            instance = new ReservationService();
        }

        return instance;
    }

    public long create(Reservation reservation) throws ServiceException {
        // TODO: créer un véhicule
        try{
            return ReservationDao.getInstance().create(reservation);
        }catch(DaoException e){
            e.printStackTrace();
            throw new ServiceException();
        }
    }
    public List<Reservation> findByClientId(long id) throws ServiceException {
        if (id<0){
            throw new ServiceException("L'id est inferieur à 0");
        }
        try{
            return ReservationDao.getInstance().findResaByClientId(id);
        }catch(DaoException e){
            e.printStackTrace();
            throw new ServiceException();
        }

    }
    public List<Reservation> findByVehicleId(long id) throws ServiceException {
        if (id<0){
            throw new ServiceException("L'id est inferieur à 0");
        }
        try{
            return ReservationDao.getInstance().findResaByVehicleId(id);
        }catch(DaoException e){
            e.printStackTrace();
            throw new ServiceException();
        }

    }
    public List<Reservation> findAll() throws ServiceException {

        try{
            return ReservationDao.getInstance().findAll();
        }catch(DaoException e){
            e.printStackTrace();
            throw new ServiceException();
        }

    }
    public int count() throws ServiceException{
        try {
            return ReservationDao.getInstance().findAll().size();
        }catch(DaoException e){
            e.printStackTrace();
            throw new ServiceException();
        }
    }
}
