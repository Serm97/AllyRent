package com.sharecar.entidades;

import com.sharecar.entidades.Datamaster;
import com.sharecar.entidades.Publicacion;
import com.sharecar.entidades.Usuario;
import com.sharecar.entidades.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Datatype.class)
public class Datatype_ { 

    public static volatile SingularAttribute<Datatype, String> nombreDataType;
    public static volatile SingularAttribute<Datatype, String> descripcionDataType;
    public static volatile CollectionAttribute<Datatype, Vehiculo> vehiculoCollection2;
    public static volatile CollectionAttribute<Datatype, Vehiculo> vehiculoCollection1;
    public static volatile SingularAttribute<Datatype, Integer> idDataType;
    public static volatile CollectionAttribute<Datatype, Usuario> usuarioCollection;
    public static volatile CollectionAttribute<Datatype, Vehiculo> vehiculoCollection;
    public static volatile CollectionAttribute<Datatype, Publicacion> publicacionCollection;
    public static volatile SingularAttribute<Datatype, Datamaster> idDataMaster;
    public static volatile CollectionAttribute<Datatype, Usuario> usuarioCollection1;

}