import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MiTabla2 extends JFrame {

    public MiTabla2() {
        this.setTitle("Tabla con DefaultTableModel");
        this.setSize(550, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object[][] datos = new Object[][]{
            {"Mary",   "Campione",  "Esquiar", 5, false, "Flan"},
            {"Lhucas", "Catherine", "Patinar", 3, true,  "Pastel"},
            {"Kathya", "Walrath",   "Escalar", 2, false, "Helado"},
            {"Marcus", "Andrews",   "Correr",  7, true,  "Barquillo"},
            {"Angela", "Lalth",     "Nadar",   4, false, "Manzana"},
            {"Pepe",   "Grillo",    "Tenis",   5, false, "Pera"}
        };

        String[] cabecera = new String[]{
            "Nombre", "Apellido", "Pasatiempo", "Años de Prac.", "Soltero(a)", "Postre"
        };

        JTable tabla = new JTable(new DefaultTableModel(datos, cabecera));
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiTabla2();
    }
}