package ru.gb.Unit_tests_seminar_2.hw;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setupThis() {
        //System.out.println("@BeforeEach");

        car = new Car("Audi", "Q8", 2024);
        motorcycle = new Motorcycle("BMW", "RTM4000", 2019);
    }
    @DisplayName("CarIsVehicle")
    @Test
    void CarIsVehicle() {
        System.out.println("CarIsVehicle");
        assertThat(car instanceof Vehicle).isTrue();
    }
    @DisplayName("CarHasFourWheels")
    @Test
    //@Disabled
    void CarHasFourWheels() {
        System.out.println("CarHasFourWheels");
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @DisplayName("MotorcycleHasTwoWheels")
    @Test
        //@Disabled
    void MotorcycleHasTwoWheels() {
        System.out.println("MotorcycleHasTwoWheels");
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    @DisplayName("CarSpeedTest")
    @Test
    void CarSpeedTest() {
        System.out.println("CarSpeedTest");
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @DisplayName("MotorcycleSpeedTest")
    @Test
    void MotorcycleSpeedTest() {
        System.out.println("MotorcycleSpeedTest");
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    @DisplayName("CarPackingTest")
    @Test
    void CarPackingTest() {
        System.out.println("CarPackingTest");
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @DisplayName("MotorcyclePackingTest")
    @Test
    void MotorcyclePackingTest() {
        System.out.println("MotorcyclePackingTest");
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
    @AfterEach
    @Disabled
    void tearThis() {

        //System.out.println("@AfterEach");
    }

    @AfterAll
    @Disabled
    static void tear() {

        //System.out.println("@AfterAll");
    }
}
