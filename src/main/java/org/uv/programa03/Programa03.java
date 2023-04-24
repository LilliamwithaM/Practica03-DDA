/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa03;

/**
 *
 * @author LilyE
 */
public class Programa03 {

    public static void main(String[] args) {
        
//        ClaseConcreta c = new ClaseConcreta();
//        c.imprimir();
//        
//        ClaseAHija cah = new ClaseAHija();
//        cah.imprimir();
//        
//        ClaseAHija2 cah2 = new ClaseAHija2();
//        cah2.imprimir();

//    ClaseA ca = null; 
//    
//    ca = new ClaseAHija();
//    ca.imprimir();
//    
//    ca = new ClaseAHija2();
//    ca.imprimir();
//    
//    //Clase anónima
//    ca=new ClaseA(){
//        @Override
//        public void msg() {
//            System.out.println("Clase anónima");
//        }
//    };
//    ca.imprimir();

    IClaseInterface ejemplo = null;
    ejemplo = new IClaseConcretauno();
    ejemplo.msg();
    
    ejemplo = new IClaseConcretados();
    ejemplo.msg();
        
    //Poliformismo con interfaces, instancias anónimas
    ejemplo = new IClaseInterface(){
        @Override
        public void msg() {
            System.out.println("Otro");
        }
    };
    ejemplo.msg();
    }
    
}


