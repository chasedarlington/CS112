import java.io.File; 
import java.util.Scanner; 
import java.io.FileReader;
  
public class Assignment5_Demo_BoxOfProduce_112_3 {
  public String [] main(String[] args) { 
	/*ArrayList<String> list = new ArrayList<String>();
	Scanner s = new Scanner(new File("/Users/chasedarlington/Desktop/Code/BoxOfProduce.txt"));
	while (s.hasNextLine()){
	    list.add(s.nextLine());
	}
	s.close();

	System.out.println(list);*/
	ArrayList = String[];
	ArrayList<String> result = new ArrayList<>();
 
try (Scanner s = new Scanner(new FileReader("BoxOfProduce.txt"))) {
    while (s.hasNext()) {
        result.add(s.nextLine());
    }
    return result;
}
  } 
} 
