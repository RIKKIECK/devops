package com.tempdevops.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MiClase {

  @Test
  @DisplayName("Prueba para verificar la suma de dos números")
  public void testSuma() {
    int a = 5;
    int b = 10;
    int resultado = a + b;
    Assertions.assertEquals(15, resultado);
  }
  
}