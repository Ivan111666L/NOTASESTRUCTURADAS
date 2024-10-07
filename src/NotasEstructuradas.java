import javax.swing.JOptionPane;

public class NotasEstructuradas{
    public static void main(String[] args) throws Exception {
        for(int est = 1; est <=2; est++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante"); 
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese la nota 1 del Estudiante"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese la nota 2 del Estudiante"));
            float notaFinal = (nota1 + nota2) / 2;
            JOptionPane.showMessageDialog(null, "informacion del Estudiante\n NOMBRE:" +nombre+  "Nota Final" + notaFinal);

            if(notaFinal <- 3)
            {
                JOptionPane.showMessageDialog(null,"El Estudiante Rebrueba El Curso");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El Estudiante Aprueba El Curso");

            }
        }
    }
}
