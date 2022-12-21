import java.time.Duration;
import java.util.ArrayList;

public class Practica {
    public static void main(String[] args) {
        /*
        int numero1 = 9;
        int numero2 = 50;
        int numero3 = 4;

        // ordenar de menor a mayor con if

        // creando array

        int calificaciones[] = {1,2,3,4,5,6,7,8,9,10};
        //recorrelo con foreach

        for ( int calidicacion : calificaciones ){
            //System.out.println(calidicacion);
        } */

        // arraylist (se le pueden agregar cosas)

        ArrayList<Integer> calificaiones = new ArrayList<Integer>();

        calificaiones.add(1);
        calificaiones.add(2);
        calificaiones.add(3);

    }

    @Test
    public void vueloSanFrancisco(){
        WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.get("https://www.viajesfalabella.cl/");
        WebElement vuelos = driver.findElement(botonVuelos);
        vuelos.click();
        exwait.until(ExpectedConditions.elementToBeClickable(empresaAirCanada));
        WebElement canadaAirline = driver.findElement(empresaAirCanada);
        canadaAirline.click();
        WebElement btnNexDate = driver.findElement(LocalizadorBtnNexDate);
        WebElement mesActual = driver.findElement(localizadorMonthActive);

    }
}
