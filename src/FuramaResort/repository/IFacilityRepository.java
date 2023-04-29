package FuramaResort.repository;

import FuramaResort.model.Facility;

import java.util.Map;

public interface IFacilityRepository extends Repository{
    Map<Facility,Integer> getFacilityMap();

}
