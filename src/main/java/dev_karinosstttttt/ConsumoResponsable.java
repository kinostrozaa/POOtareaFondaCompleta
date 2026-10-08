package dev_karinosstttttt;

public interface ConsumoResponsable {

    boolean tieneVentaRestringida();
    void restringirVenta();
    boolean superaLimite(int unidades);
}