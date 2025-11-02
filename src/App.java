public class App {
    public static void main(String[] args) throws Exception {
        String dia1;
        System.out.println("Por favor, introduzca la primera hora.");
        do{
            dia1 = System.console().readLine("Día: ");
            dia1 = dia1.toLowerCase();    
        } while(!dia1.equals("lunes") && !dia1.equals("martes") && !dia1.equals("miercoles") && !dia1.equals("jueves") && !dia1.equals("viernes") && !dia1.equals("sabado") && !dia1.equals("domingo"));
        int hora1 = Integer.parseInt(System.console().readLine("Hora: "));
        System.out.println("Por favor, introduzca la segunda hora.");
        String dia2;
        do{
            dia2 = System.console().readLine("Día: ");
            dia2 = dia2.toLowerCase();    
        } while(!dia2.equals("lunes") && !dia2.equals("martes") && !dia2.equals("miercoles") && !dia2.equals("jueves") && !dia2.equals("viernes") && !dia2.equals("sabado") && !dia2.equals("domingo"));
        int hora2 = Integer.parseInt(System.console().readLine("Hora: "));

        int horaBaseDia1 = 0;

        switch (dia1) {
            case "lunes":
                horaBaseDia1 = 0;
                break;
            case "martes":
                horaBaseDia1 = 24;
                break;
            case "miercoles":
                horaBaseDia1 = 48;
                break;
            case "jueves":
                horaBaseDia1 = 72;
                break;
            case "viernes":
                horaBaseDia1 = 96;
                break;
            case "sabado":
                horaBaseDia1 = 120;
                break;
            case "domingo":
                horaBaseDia1 = 144;
                break;
            default:
                break;
        }

        int horaBaseDia2 = 0;

        switch (dia2) {
            case "lunes":
                horaBaseDia2 = 0;
                break;
            case "martes":
                horaBaseDia2 = 24;
                break;
            case "miercoles":
                horaBaseDia2 = 48;
                break;
            case "jueves":
                horaBaseDia2 = 72;
                break;
            case "viernes":
                horaBaseDia2 = 96;
                break;
            case "sabado":
                horaBaseDia2 = 120;
                break;
            case "domingo":
                horaBaseDia2 = 144;
                break;
            default:
                break;
        }

        int sol = (horaBaseDia2 + hora2) - (horaBaseDia1 + hora1);

        System.out.printf("Entre las %d:00 del %s y las %d:00 del %s hay %d horas/s.", hora1, dia1, hora2, dia2, sol);
    }
}
