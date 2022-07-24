import java.util.Scanner;
public class TriviaQuiz {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("welcome to the MCQ's of History:(:-:)\nLet's Start!");
        System.out.println("\t_Indian__  __ History__\n");
        
        System.out.println("1. The Rowlatt Act was passed in:\n");
        System.out.println("A.1905\tB.1913\nC.1919\tD.1925\n");
        String O1=scan.nextLine();
        
        int score=5;
        if(O1.equals("C")){
            
            System.out.println("\nScore:"+(score));  
        } else{
            System.out.println("\nScore:"+(score-=5));
        }
        
        System.out.println("2. Mahatma Gandhi launched kheda Satyagrah on Gujrat in 1918 to support the cause of:\n");
        System.out.println("A.Mill Owners\tB.Land Lords\nC.The peasants\tD.Kol Rebellion\n");
        String O2=scan.nextLine();
        
        if(O2.equals("C")){
            
            System.out.println("\nScore:"+(score+=5));  
            ;
        } else{
            System.out.println("\nScore:"+(score-=5));
        }
                 
        System.out.println("3. Who is the Founder of Haryanka Dynasty:\n");
        System.out.println("A.Ajatashatru\tB.Harshvardhan\nC.Bimbisara\tD.Ghananand\n");
        String O3=scan.nextLine();
        
        if(O3.equals("C")){
            
            System.out.println("\nScore:"+(score+=5));  
            
        } else{
            System.out.println("\nScore:"+(score-=5));
        }
        System.out.println("4. The East India Association was set up in:\n");
        System.out.println("A.1866\tB.1857\nC.1836\tD.1885\n");
        String O4=scan.nextLine();        
        
        if(O4.equals("A")){
            
            System.out.println("\nScore:"+(score+=5));  
            
        } else{
            System.out.println("\nScore:"+(score-=5));
        }
        System.out.println("5. Who called Subash Chandra Bose as Desh Nayak?:\n");
        System.out.println("A.Lala Lajpat Rai\tB.Rabindranath tagore\nC.Mahatma Gandhi\tD.Bal Gangadhar Tilak\n");
        String O5=scan.nextLine();
        
        if(O5.equals("A")){
            
            System.out.println("\nScore:"+(score+=5));  
            
        } else{
            System.out.println("\nScore:"+(score-=5));
        }
        // for checking answers which one is correct and which one is wrong
        if (score>=15){
          System.out.println("\nWow you know all the stuff\n");
        }
        else if(score<15&&score>=5){
          System.out.println("\nNot Bad!\n");
        }
         else{
            System.out.println("Better luck next time\n");
         }
            
        }
    }

