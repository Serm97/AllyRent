/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharecar.beans;

import com.sharecar.entidades.Tarifa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jorge
 */
@Stateless
public class TarifaFacade extends AbstractFacade<Tarifa> {

    @PersistenceContext(unitName = "com.sharecar_ShareCar_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TarifaFacade() {
        super(Tarifa.class);
    }
    
}
