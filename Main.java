import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancia de HospitalMaciel con array vacío inicialmente
        HospitalMaciel hospital = new HospitalMaciel(null);

        // 1. Pedir cantidad de pacientes y crear array
        hospital.Cantidadpaciente();

        // 3. Registrar síntomas de los pacientes
        hospital.LlenarArray();

        // 4. Mostrar cantidad de casos críticos
        int casosCriticos = hospital.CasosCriticos();
        System.out.println("Cantidad de casos críticos: " + casosCriticos);

        // 5. Pedir índice de paciente y mostrar gravedad
        System.out.print("Ingrese el índice del paciente (0 a " + (hospital.getHospital().length - 1) + "): ");
        int indicePaciente = scanner.nextInt();
        if (indicePaciente >= 0 && indicePaciente < hospital.getHospital().length) {
            int gravedad = hospital.GravedadDePaciente(indicePaciente);
            System.out.println("Gravedad del paciente " + indicePaciente + ": " + gravedad);
        } else {
            System.out.println("Índice inválido.");
        }

        // 6. Pedir valor de gravedad y mostrar promedio y cantidad menor
        System.out.print("Ingrese un valor de gravedad (1-4): ");
        int valorGravedad = scanner.nextInt();
        int cantidadMenosGraves = hospital.CantidadpacienteMenosGraves(valorGravedad);
        double promedioSintomas = hospital.MostrarPromedioSintomas(valorGravedad);
        System.out.println("Cantidad de pacientes con gravedad menor a " + valorGravedad + ": " + cantidadMenosGraves);
        System.out.println("Promedio de síntomas para gravedad " + valorGravedad + ": " + promedioSintomas);

        // 7. Ya incluido en 6

        // 8. Mostrar mayor cantidad de síntomas
        int mayorSintomas = hospital.MayorCantidadSintomas();
        System.out.println("Mayor cantidad de síntomas registrados: " + mayorSintomas);

        // 9. Mostrar porcentaje de pacientes con gravedad 1 y 2
        double porcentajeBajoPocoGrave = hospital.PorcentajeBajoYPocoGrave();
        System.out.println("Porcentaje de pacientes con gravedad bajo observación o poco grave: " + porcentajeBajoPocoGrave + "%");

        scanner.close();
    }
}
