/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Composite.controller;

/**
 *
 * @author ASUS
 */
public class Leaf extends Component{
    
     public Leaf( String nombre )
    {
        this.setTypeComponent(Component.ARCHIVE );
        this.setName( nombre );
    }

    @Override
     public void show()
    {
        System.out.println( "Archive: [" + this.getName() + "]" );
    }
    
}
