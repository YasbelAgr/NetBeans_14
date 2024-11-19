import javax.swing.JOptionPane;
public class Arbol {
    public static void main (String[] agrs){
    int i,o,a;
    for (i=1; i<=5; i++){
        for (o=1; o<=8-i; o++){
            System.out.print(" ");
        } for (a=1; a<=2*i-1; a++){
            System.out.print("*");
        }
        System.out.println("");   
    }  
    for (i=3; i<=7; i++){
        for (o=1; o<=8-i; o++){
            System.out.print(" ");
        } for (a=1; a<=2*i-1; a++){
            System.out.print("*");
        }
        System.out.println("");  
    }
    for (i=4; i<=8; i++){
        for (o=1; o<=8-i; o++){
            System.out.print(" ");
        } for (a=1; a<=2*i-1; a++){
            System.out.print("*");
    }   System.out.println("");      
    }
    for (i=4; i<=8-1; i++){
        for(o=1; o<=6-2; o++){
            System.out.print(" ");
        }for (a=1; a<=7; a++){
            System.out.print("*");       
    }   System.out.println("");
    }
    }
}
