import java.util.Scanner;
public class student {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number of Subject:");
        int numSubjects=sc.nextInt();

        if(numSubjects <=0){
            System.out.println("Please enter a valid number of the subject.");
            return;
        }
        int totalMarks=0;
        int maxMarksPersubject=100;

        for(int i=1;i<=numSubjects;i++){
            System.out.println("Enter matks obtained in subject"+i+"(out of 100):");
            int marks=sc.nextInt();

            if(marks<0||marks>maxMarksPersubject){
                System.out.println("Marks should be in the range of 0 to 100.please enter vaildmarks.");
                i--;
            }
            else{
                totalMarks +=marks;
            }
        }
        double averagePercentage=(double)totalMarks/(numSubjects * maxMarksPersubject)*100;
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Average Percentage:"+averagePercentage+"%");
        String grade;
        if(averagePercentage>=90){
            grade="A+";
        } else if (averagePercentage >= 80) {
            grade="A";

        } else if (averagePercentage >=70) {
            grade="B";

        } else if (averagePercentage >=60) {
            grade="c";
        } else if (averagePercentage >=50) {
            grade="D";
        }
        else{
            grade="F";
        }
        System.out.println("Gread:"+grade);
    }
}
