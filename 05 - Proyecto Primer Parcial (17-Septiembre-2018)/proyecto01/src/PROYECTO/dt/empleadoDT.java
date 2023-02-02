package PROYECTO.dt;
//package proyecto01.dto;


public class empleadoDT {
    private int idnumEmpleado;
    private int idtienda;
    private String nombre;
    private String cargo;
    private int celular;
    private String email;
    private String sexo;

    public int getIdnumEmpleado() {
        return idnumEmpleado;
    }

    public void setIdnumEmpleado(int idnumEmpleado) {
        this.idnumEmpleado = idnumEmpleado;
    }

    public int getIdtienda() {
        return idtienda;
    }

    public void setIdtienda(int idtienda) {
        this.idtienda = idtienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
