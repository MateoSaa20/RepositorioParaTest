
package com.sistema;

public class Empleado {
    private String apellido;
    private String nombres;
    private double ventasMensuales;

    public Empleado(String apellido, String nombres, double ventasMensuales) {
        this.apellido = apellido;
        this.nombres = nombres;
        this.ventasMensuales = ventasMensuales;
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }
}

