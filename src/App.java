import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int loop = 1;

        while(loop==1){
        
        System.out.print("Entre com o dados da hora: ");
        int hora=sc.nextInt();
        System.out.print("\nEntre com os dados dos minutos: ");
        int minutos=sc.nextInt();

        int horaConvertida=conversor(hora);
        amPm(horaConvertida, minutos, hora);
        loop=sc.nextInt();
        }
        sc.close();
    }

    static int conversor(int hora){
        if(hora==0){
            hora=12;
        }else if(hora>=13){
            hora=hora-12;
        }
        return hora;
    }

    static void amPm(int horaConvertida, int minuto, int hora){
        if(hora>=0&&hora<12){
            System.out.println("\nHora convertida: "+horaConvertida+":"+minuto+" A.M.");
        }else{
            System.out.println("\nHora convertida: "+horaConvertida+":"+minuto+" P.M.");
        }
    }
}