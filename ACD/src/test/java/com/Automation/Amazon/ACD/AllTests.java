package com.Automation.Amazon.ACD;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


//corro todos los casos de prueba desde esta clase
@RunWith(Suite.class)
@SuiteClasses({ Busqueda.class, Usuario_Incorrecto.class })
public class AllTests {

}
