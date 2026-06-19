package com.sistema;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasosComisiones {
    private Empleado empleado;
    private ControlComisiones control = new ControlComisiones();
    private double resultadoComision;

    @Dado("que un empleado tiene ventas por valor de {double}")
    public void que_un_empleado_tiene_ventas_por_valor_de(Double ventas) {
        empleado = new Empleado("Pérez", "Ana", ventas);
    }

    @Cuando("el sistema procesa su comisión")
    public void el_sistema_procesa_su_comisión() {
        resultadoComision = control.procesarComisionEmpleado(empleado);
    }

    @Entonces("la comisión total devuelta debe ser {double}")
    public void la_comisión_total_devuelta_debe_ser(Double comisionEsperada) {
        assertEquals(comisionEsperada, resultadoComision, 0.001);
    }
}