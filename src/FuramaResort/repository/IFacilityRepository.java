package FuramaResort.repository;

import FuramaResort.model.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository extends Repository{
    Map<Facility,Integer> getFacilityMap();
    void addNewFacility (Facility facility);
    boolean checkIdService (String id);
    List<Facility> displayListFacilityMaintenance ();

}
