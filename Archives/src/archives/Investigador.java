
package archives;

/**
 *
 * @author angel
 */
public class Investigador {
    
    private int codigo;
    private String nombre;
    private String fechaIngreso;
    private String carrera;
    private boolean activo;

    public Investigador() {
    }

    public Investigador(int codigo, String nombre, String fechaIngreso, String carrera, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.carrera = carrera;
        this.activo = activo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    
}
