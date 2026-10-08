package dev_karinosstttttt;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bebida chicha = new BebidaAlcoholica("Chicha",1000,40,12,false);
        Bebida piscoSour = new BebidaAlcoholica("Pisco Sour",500,25,18,true);
        Bebida chichaSinAlcohol = new BebidaSinAlcohol("Chicha",1000,60,95);
        Bebida moteConHuesillo = new BebidaSinAlcohol("Mote Con Huesillo",400,50,70);


        ((ConsumoResponsable) chicha).restringirVenta();

        GestorFonda gestor = new GestorFonda();
        gestor.registrar(chicha);
        gestor.registrar(piscoSour);
        gestor.registrar(chichaSinAlcohol);
        gestor.registrar(moteConHuesillo);

        System.out.println("----- INVENTARIO DISPONIBLE -----");
        List<Bebida> todo = gestor.obtenerTodas();
        for (Bebida drink : todo) {
            System.out.println(drink.obtenerDetalle());
        }
        System.out.println();

        System.out.println("----- LISTADO BEBIDAS -----");
        for (Bebida drink : todo) {
            System.out.println(drink.toString());
        }
        System.out.println();

        System.out.println("----- VENTA DE BEBIDAS -----");
        gestor.vender("Pisco Sour",2);
        gestor.vender("Pisco Sour",5);
        gestor.vender("Chicha",1);
        gestor.vender("Mote Con Huesillo",6);
        System.out.println();

        System.out.println("----- BÚSQUEDA DE BEBIDA -----");
        List<Bebida> resultados = gestor.buscarPorNombre("Chicha");
        for (Bebida drink : resultados) {
            System.out.println(drink.obtenerDetalle());
        }
        System.out.println();

        System.out.println("----- INVENTARIO DISPONIBLE -----");
        for (Bebida drink : todo) {
            System.out.println(drink.obtenerDetalle());
        }
    }
}