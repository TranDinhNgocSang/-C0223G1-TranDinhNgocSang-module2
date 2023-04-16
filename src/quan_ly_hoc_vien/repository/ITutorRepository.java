package quan_ly_hoc_vien.repository;

import quan_ly_hoc_vien.model.Student;
import quan_ly_hoc_vien.model.Tutor;

import java.util.ArrayList;

public interface ITutorRepository {
    ArrayList<Tutor> getTutorList();

    void addNewTutor(Tutor tutor);

    boolean deleteTutor(int id);
}
