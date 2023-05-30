package ss19_thuat_toan.bai_tap13.repository;

import ss19_thuat_toan.bai_tap13.model.Computer;
import ss19_thuat_toan.bai_tap13.unit.ReadAndWriteComputerFile;

import java.util.ArrayList;
import java.util.List;

public class ComputerRepository implements IComputerRepository {
    private static List<Computer> computerList = new ArrayList<>();
    private final String COMPUTER_FILE =
            "E:\\CodeGym\\my-new-project\\src\\ss19_thuat_toan\\bai_tap13\\data\\computer_data.csv";
    ReadAndWriteComputerFile readAndWriteComputerFile = new ReadAndWriteComputerFile();
    @Override
    public List<Computer> getComputerList() {
        computerList = readAndWriteComputerFile.read(COMPUTER_FILE);
        return computerList;
    }

    @Override
    public void addNewComputer(Computer computer) {
        computerList = readAndWriteComputerFile.read(COMPUTER_FILE);
        computerList.add(computer);
        readAndWriteComputerFile.write(COMPUTER_FILE,computerList);
    }

    @Override
    public int getIndexToId(String id) {
        computerList = readAndWriteComputerFile.read(COMPUTER_FILE);
        for (int i = 0; i < computerList.size(); i++) {
            if (computerList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
