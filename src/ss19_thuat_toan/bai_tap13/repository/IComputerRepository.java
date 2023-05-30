package ss19_thuat_toan.bai_tap13.repository;

import ss19_thuat_toan.bai_tap13.model.Computer;

import java.util.List;

public interface IComputerRepository {
    List<Computer> getComputerList();

    void addNewComputer(Computer computer);

    int getIndexToId(String id);
}
