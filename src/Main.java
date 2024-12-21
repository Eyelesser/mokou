import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Users\\16086\\Desktop\\employer.txt";
        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        List<Employer> employers = new ArrayList<>();
        List<Employer> boss = new ArrayList<>();

        while (sc.hasNext()) {
            Employer employer = new Employer();
            employer.setId(Integer.parseInt(sc.next()));
            employer.setName(sc.next());
            employer.setSurname(sc.next());
            employer.setAge(Integer.parseInt(sc.next()));
            employer.setGender(Boolean.parseBoolean(sc.next()));
            employer.setPosition(sc.next());
            employer.setSalary(Double.parseDouble(sc.next()));
            employers.add(employer);
        }
        for (Employer employer : employers) {
            if (employer.getPosition().equals("Boss")) {
                boss.add(employer);
            }
        }
        System.out.println("All Employers:");
        for (Employer employer : employers) {
            System.out.println(employer);
        }

        System.out.println("\nBosses:");
        for (Employer manager : boss) {
            System.out.println(manager);
        }
    }
}
