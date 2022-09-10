package array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class listProducto {

    ArrayList<producto> listProducto = new ArrayList<>();

    public String textoAgregar(String text) {
        return JOptionPane.showInputDialog(text);

    }

    public void agregarDatos() {

        String nombre = textoAgregar("Ingrese el nombre del producto: ");
        String id = textoAgregar("Ingrese el ID del producto: ");
        String precio = textoAgregar("Introduce el precio del producto:");
        String existencia = textoAgregar("Introduce la cantidad en existencia del producto:");
        producto Producto = new producto();
        Producto.setNombre(nombre);
        Producto.setId(id);
        Producto.setPrecio(precio);
        Producto.setExistencia(existencia);
        listProducto.add(Producto);

    }

    public void mostrarDatos() {
        String mostrar = "";
        for (int i = 0; i < listProducto.size(); i++) {
            mostrar += "Nombre: " + listProducto.get(i).getNombre() + "\n";
            mostrar += "ID: " + listProducto.get(i).getId() + "\n";
            mostrar += "Precio: " + listProducto.get(i).getPrecio() + "\n";
            mostrar += "Existencia: " + listProducto.get(i).getExistencia() + "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }

    public void eliminarDatos() {
        listProducto.clear();
    }

    public int posicion(ArrayList listProducto, String prodBuscar) {
        int posicion = -1; //el primer elemento de un arraylist es 0

        for (int i = 0; i < listProducto.size(); i++) {
            if (prodBuscar.equalsIgnoreCase(listProducto.get(i).toString())) {
                posicion = i;
            }
        }
        return posicion;
    }

    public void modificarDatos(producto Prod) {

       String idMod = JOptionPane.showInputDialog("Ingrese el ID del producto: ");
       String nomMod = JOptionPane.showInputDialog("Ingrese el nuevo ID");
       for(int i = 0; i<listProducto.size(); i++){
           if(listProducto.get(i).getId().equalsIgnoreCase(idMod)){
               listProducto.get(i).setId(nomMod);
           }
           JOptionPane.showMessageDialog(null, nomMod);
           
       }
       

        
        }

    }


