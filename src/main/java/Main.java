import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Generyka<String> generyka = new Generyka<String>("Test");
        System.out.println(generyka.getField());
        Generyka<Integer> generyka1 = new Generyka<Integer>(5);
        System.out.println(generyka1.getField());

        School school = new School("UMK", "Toruń");
        School school1 = new School("WSB", "Toruń");
        School school2 = new School("UMCS", "Bydgoszcz");
        School school3 = new School("UW", "Warszawa");

        Student student=new Student("Jan", "Kowalski");
        Student student1=new Student("Iwo", "Zen");
        Student student2=new Student("Jas", "Nowak");
        Student student3=new Student("Kola", "Zielinski");
        Student student4=new Student("Ala", "Wisniewska");
        Student student5=new Student("Ola", "Kowalska");
        Student student6=new Student("Iga", "Kos");
        Student student7=new Student("Kasia", "Kowal");
        Student student8=new Student("Iga", "Kowala");
        Student student9=new Student("Emi", "Kot");
        Student student10=new Student("Jacek", "Koza");
        Student student11=new Student("Japa", "Koski");

        List<Student> listaUMK= new ArrayList<>();
        listaUMK.add(student);
        listaUMK.add(student1);
        listaUMK.add(student2);


        List<Student> listaWSB= new ArrayList<>();
        listaWSB.add(student3);
        listaWSB.add(student4);
        listaWSB.add(student5);


        List<Student> listaUMCS= new ArrayList<>();
        listaUMCS.add(student6);
        listaUMCS.add(student7);
        listaUMCS.add(student8);


        List<Student> listaUW= new ArrayList<>();
        listaUW.add(student9);
        listaUW.add(student10);
        listaUW.add(student11);



        Map<School, List<Student>> map = new HashMap<School, List<Student>>();
        map.put(school, listaUMK);
        map.put(school1, listaWSB);
        map.put(school2, listaUMCS);
        map.put(school3, listaUW);



        for (Map.Entry<School, List<Student>> entry : map.entrySet()) {
            System.out.println("Szkoła " + entry.getKey() + " " + "Lista studentów " + entry.getValue());
        }
    }


}
