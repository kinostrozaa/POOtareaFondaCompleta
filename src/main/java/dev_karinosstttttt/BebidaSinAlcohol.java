package dev_karinosstttttt;

public class BebidaSinAlcohol extends Bebida {

    private int azucarPorLitro;

    public BebidaSinAlcohol(String nombre, int volumenMl, int stock, int azucarPorLitro){
        super(nombre, volumenMl,stock);
        this.azucarPorLitro = azucarPorLitro;
    }

    public int getAzucarPorLitro(){
        return this.azucarPorLitro;
    }
    public void setAzucarPorLitro(int azucarPorLitro){
        this.azucarPorLitro = azucarPorLitro;
    }

    @Override
    public double calcularPrecio(){
        double precio = 2000;
        if (this.azucarPorLitro > 80){
            precio += precio*0.1;
        }
        return precio;
    }

    @Override
    public String obtenerDetalle(){
        String detalle = "Tipo: Bebida Sin Alcohol || Nombre: "+getNombre()+
                " || Volumen: "+getVolumenML()+" mL || Stock: "+
                getStock()+" || Azúcar: "+getAzucarPorLitro()+" g/L || Precio: $"+
                calcularPrecio();
        return detalle;
    }
}
