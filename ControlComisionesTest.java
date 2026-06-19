package com.sistema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlComisionesTest {

    // a. Prueba Unitaria
    @Test
    public void testCalcularPorcentajeAltaVenta() {
        ControlComisiones control = new ControlComisiones();
        double porcentaje = control.calcularPorcentaje(15000);
        assertEquals(0.10, porcentaje, 0.001);
    }

    // b. Prueba de Integración (Circuito: Empleado + ControlComisiones)
    @Test
    public void testProcesarComisionCircuitoCompleto() {
        Empleado empleado = new Empleado("Gómez", "Juan", 20000);
        ControlComisiones control = new ControlComisiones();
        
        double comisionFinal = control.procesarComisionEmpleado(empleado);
        
        // 20000 * 0.10 = 2000
        assertEquals(2000.0, comisionFinal, 0.001);
    }
}