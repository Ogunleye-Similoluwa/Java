package Chief;

import Chief1.Citizen;

import java.math.BigDecimal;

import Chief1.TaxCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class CitizenTest {
        private TaxCalculator calculator;
        private Citizen mathias;
        private Citizen adewunmi;
        private Citizen deola;
        @BeforeEach
        public  void setUp(){
            mathias = new Citizen();
            mathias.setFirstName("Mathias");
            mathias.setSurname("Momodu");
            mathias.setEarnings((17000));

            adewunmi = new Citizen("Adewunmi", "Adegunwa");
            adewunmi.setEarnings((25000));

            deola = new Citizen("Adeola", "Adekunle", 40000);

        }
        @Test
        public void calculateTax(){
            double mathiasTax = TaxCalculator.calculateTax(mathias);
            assertEquals(2550.0, mathiasTax);

            double wunmiTax = TaxCalculator.calculateTax(adewunmi);
            assertEquals(3750.0, wunmiTax);

        }
        @Test
        public void calculateExcessTax(){
            double deolaTax = TaxCalculator.calculateTax(deola);
            assertEquals(7200.0, deolaTax);
        }
}
