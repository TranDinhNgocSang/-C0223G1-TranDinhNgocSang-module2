package FuramaResort.repository;

import FuramaResort.model.Booking;
import FuramaResort.model.Contract;
import FuramaResort.utils.ReadAndWriteContractFile;

import java.util.*;

public class ContractRepository implements IContractRepository {
    public final String CONTRACT_FILE_PATH = "E:\\CodeGym\\my-new-project\\src\\FuramaResort\\data\\contract_data.csv";
    private static List<Contract> contractList = new ArrayList<>();
    ReadAndWriteContractFile readAndWriteContractFile = new ReadAndWriteContractFile();
    BookingRepository bookingRepository = new BookingRepository();


    @Override
    public List<Contract> getContractList() {
        contractList = readAndWriteContractFile.read(CONTRACT_FILE_PATH);
        return contractList;
    }

    @Override
    public void createNew(Contract contract) {
        contractList = readAndWriteContractFile.read(CONTRACT_FILE_PATH);
        contractList.add(contract);
        readAndWriteContractFile.write(CONTRACT_FILE_PATH,contractList);
    }

    @Override
    public void editDeposit(int index, String deposit) {
        contractList = readAndWriteContractFile.read(CONTRACT_FILE_PATH);
        contractList.get(index).setDeposit(deposit);
        readAndWriteContractFile.write(CONTRACT_FILE_PATH,contractList);
    }

    @Override
    public void editTotalPayment(int index, String totalPayment) {
        contractList = readAndWriteContractFile.read(CONTRACT_FILE_PATH);
        contractList.get(index).setTotalPayment(totalPayment);
        readAndWriteContractFile.write(CONTRACT_FILE_PATH,contractList);
    }

    @Override
    public int getIndexToID(String idContract) {
        contractList = readAndWriteContractFile.read(CONTRACT_FILE_PATH);
        for (int i = 0; i < contractList.size(); i++) {
            if (contractList.get(i).getNumberContrac().equals(idContract)){
                return i;
            }
        }
        return -1;
    }


    public Stack<Booking> bookingNotContractStack(){
        Stack<Booking> bookingStack = new Stack<>();
        contractList = readAndWriteContractFile.read(CONTRACT_FILE_PATH);
        List<Booking> bookingList;
        bookingList = bookingRepository.getBookingList();
        for (int i = 0; i < bookingList.size(); i++) {
            if ((bookingList.get(i).getIdIdSerVice()).contains("SVRO")){
                bookingList.remove(i);
                i--;
            }
            for (int j = 0; j < contractList.size(); j++) {
                if (bookingList.get(i).getIdBooking().equals(contractList.get(j).getIdBooking())){
                    bookingList.remove(i);
                    i--;
                }

            }
        }
        bookingStack.addAll(bookingList);
        return bookingStack;
    }
}
