package com.sharecar.entidades;

import com.sharecar.entidades.Usuario;
import com.sharecar.entidades.Vehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Comentario.class)
public class Comentario_ { 

    public static volatile SingularAttribute<Comentario, Float> calificacion;
    public static volatile SingularAttribute<Comentario, Vehiculo> idVehiculo;
    public static volatile SingularAttribute<Comentario, Date> fechaComentario;
    public static volatile SingularAttribute<Comentario, Usuario> dUsuario;
    public static volatile SingularAttribute<Comentario, String> comentario;
    public static volatile SingularAttribute<Comentario, Integer> idComentario;

}