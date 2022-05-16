import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      Scanner scan = new Scanner(System.in);
      int opcja = 10;
      String imie;
      String data_ur;
      int wiek;
      System.out.println("MENU");
      System.out.println("1 - Dodawanie studenta");
      System.out.println("2 - Wyświetlenie listy studentów");
      System.out.println("0 - wyjście z programu");
      while(opcja != 0){
        System.out.println("Podaj opcje:");
        opcja = scan.nextInt();
        scan.nextLine();
        switch(opcja){
          case 1:
            System.out.println("Podaj imie: ");
            imie = scan.nextLine();
            System.out.println("Podaj wiek:");
            wiek = scan.nextInt();
            scan.nextLine();
            System.out.println("Podaj date urodzenia:");
            data_ur = scan.nextLine();
            s.addStudent(new Student(imie, wiek,data_ur));
            break;

          case 2:
            var students = s.getStudents();
            for(Student current : students) {
            System.out.println(current.ToString());
            break;
        }
      }
        
      
      }
    } catch (IOException e) {

    }
  }
}