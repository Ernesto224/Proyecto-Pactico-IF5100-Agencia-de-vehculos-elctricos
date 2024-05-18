package if5100agenciadevehiculoselectricos;

import GUI.JIFListarVehiculos;
import GUI.JIFReservarProducto;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;

public class IF5100AgenciaDeVehiculosElectricos {

    public static void main(String[] args) {
        // Crear un nuevo marco principal
        JFrame frame = new JFrame("Agencia de Vehículos Eléctricos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un nuevo escritorio para contener los JInternalFrames
        JDesktopPane desktopPane = new JDesktopPane();

        // Crear una instancia del JInternalFrame que quieres mostrar
        JIFReservarProducto jIFReservarProducto = new JIFReservarProducto();

        // Agregar el JInternalFrame al escritorio
        desktopPane.add(jIFReservarProducto);

        // Hacer visible el JInternalFrame
        jIFReservarProducto.setVisible(true);

        // Agregar el escritorio al marco principal
        frame.add(desktopPane);

        // Establecer el tamaño del marco
        frame.setSize(1000, 1000);

        // Centrar el marco en la pantalla
        frame.setLocationRelativeTo(null);

        // Hacer visible el marco principal
        frame.setVisible(true);
    }
}
