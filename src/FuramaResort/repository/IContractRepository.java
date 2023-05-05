package FuramaResort.repository;

import FuramaResort.model.Contract;

import java.util.List;

public interface IContractRepository {
    List<Contract> getContractList();

    void createNew(Contract contract);

    void editDeposit(int index, String deposit);

    void editTotalPayment(int index, String totalPayment);

    int getIndexToID(String idContract);
}
