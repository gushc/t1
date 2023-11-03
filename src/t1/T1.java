
package t1;


public class T1 {


    public static void main(String[] args) {
        
        main ventana = new main();
        ventana.setVisible(true);
    }
    

    
    
    /*
    Primero hacer el diseño
    segundo hacer la logica de agregar datos del jtxtfield al jtxtarea en el boton agregar,
    creo un metodo que añade el texto al txtarea usando gettext y apend text + \n para que el siguiente texto se escriba abajo
    txta.append() sirve par añadir texto al txtarea y reemplaaza al settext:
       public void EnviarMensaje(){
        
        String cadena = txtn.getText() + "\n";      
        //txta.setText(cadena); en vez de usar el set para poner el texto uso el apend del jtext area
        txta.append(cadena);
    }
    luego lo pongo al boton:
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        EnviarMensaje();
        txtn.setText("");
    }  
    Luego para mostrar el text seleccionado en la otra ventana lo primero que tengo que ahcer es crear un metodo en la ventan 2 :
    
       public void mostrar(String mensaje) {
    lbl1.setText(mensaje);
}
    
    despues en el boton que me lleva a la segunda ventana con el texto seleccionado pongo esta logica:
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        ver venta2 = new ver();      
        venta2.mostrar(txta.getSelectedText());
        venta2.setVisible(true);
    
    crea el obejto de la ventana2 llamada venta2
    invoco al metodo publico de la ventana 2 y le pongo el texto que llevara a travez de txta.getSelectedText();
    luego muestro la ventana:
            venta2.setVisible(true);


    
    */
}
