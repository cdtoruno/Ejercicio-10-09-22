package array;

import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {

        listProducto obj = new listProducto();
        producto obj2 = new producto();
        //No hay validaciones, por favor probar con datos exactos
        byte opcion;

        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(
                    "Menu Principal\n"
                    + "1. Agregar Producto\n"
                    + "2. Mostrar Producto\n"
                    + "3. Limpiar Producto\n"
                    + "4. Modificar Datos\n"
                    + "5. Salir"));

            switch (opcion) {
                case 1:
                    obj.agregarDatos();
                    break;
                case 2:
                    obj.mostrarDatos();
                    break;

                case 3:
                    obj.eliminarDatos();
                    break;
                    
                case 4: 
                    obj.modificarDatos(obj2);
                    obj.mostrarDatos();
                    


                default:
                    JOptionPane.showMessageDialog(null, "Hasta la próxima");
                    break;

            }

        } while (opcion != 5);

    }

}
