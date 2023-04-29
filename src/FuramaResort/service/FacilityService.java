package FuramaResort.service;

import FuramaResort.model.Facility;
import FuramaResort.repository.FacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FacilityService implements IFacilityService{
    FacilityRepository facilityRepository = new FacilityRepository();

    public void displayListFacility(){
    Map<Facility,Integer> map = facilityRepository.getFacilityMap();
        Set<Facility> facilitySet = map.keySet();
        for (Facility c : facilitySet) {
            System.out.println(c + " - " + map.get(c));
        }
    }
}
