package com.sharecar.entidades;

import com.sharecar.entidades.Marca;
import com.sharecar.entidades.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Modelo.class)
public class Modelo_ { 

    public static volatile SingularAttribute<Modelo, Integer> idModelo;
    public static volatile SingularAttribute<Modelo, Marca> idMarca;
    public static volatile SingularAttribute<Modelo, String> nombre;
    public static volatile CollectionAttribute<Modelo, Vehiculo> vehiculoCollection;

}