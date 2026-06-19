package com.sistema;

public class ControlComisiones {
    
    // Método para prueba unitaria
    public double calcularPorcentaje(double ventas) {
        if (ventas > 10000) {
            return 0.10; // 10%
        }
        return 0.05; // 5%
    }

    // Circuito operativo para prueba de integración
    public double procesarComisionEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        double porcentaje = calcularPorcentaje(empleado.getVentasMensuales());
        return empleado.getVentasMensuales() * porcentaje;
    }
}