/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import entities.Reportedradar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ALI-NRD
 */
@Stateless
public class ReportedradarFacade extends AbstractFacade<Reportedradar> implements ReportedradarFacadeLocal {
    @PersistenceContext(unitName = "TheTrafficViewerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReportedradarFacade() {
        super(Reportedradar.class);
    }
    
}
