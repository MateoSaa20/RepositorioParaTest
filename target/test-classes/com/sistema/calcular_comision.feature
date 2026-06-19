# language: es
Característica: Cálculo de comisiones de empleados

  Escenario: Calcular comisión básica para ventas bajas
    Dado que un empleado tiene ventas por valor de 5000
    Cuando el sistema procesa su comisión
    Entonces la comisión total devuelta debe ser 250