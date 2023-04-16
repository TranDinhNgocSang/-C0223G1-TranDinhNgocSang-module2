package quan_ly_hoc_vien.repository;

import quan_ly_hoc_vien.model.Student;
import quan_ly_hoc_vien.model.Tutor;

import java.util.ArrayList;

public class TutorRepository implements ITutorRepository {
    private static ArrayList<Tutor> tutorList = new ArrayList<>();
    static {
        Tutor tutor1 = new Tutor(1,"Chánh","12/05/1995",true,"ĐH");
        Tutor tutor2 = new Tutor(2,"Hải","12/05/1995",true,"ĐH");
        Tutor tutor3 = new Tutor(3,"Trung","12/05/1995",true,"ĐH");
        Tutor tutor4 = new Tutor(4,"Công","12/05/1995",true,"ĐH");
        Tutor tutor5 = new Tutor(5,"Quang","12/05/1995",true,"ĐH");
       tutorList.add(tutor1);
       tutorList.add(tutor2);
       tutorList.add(tutor3);
       tutorList.add(tutor4);
       tutorList.add(tutor5);
    }
    @Override
    public ArrayList<Tutor> getTutorList() {
        return tutorList;
    }

    @Override
    public void addNewTutor(Tutor tutor) {
        tutorList.add(tutor);
    }

    @Override
    public boolean deleteTutor(int id) {
        for (int i = 0; i < tutorList.size(); i++) {
            if (tutorList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
