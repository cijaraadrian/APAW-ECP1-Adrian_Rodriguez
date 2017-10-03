# Forja
#### Asignatura: *Ingeniería Web: Arquitectura y patrones de diseño*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

### STRATEGY

### Descripción
Este patrón define un conjunto de algoritmos o comportamientos, encapsula cada uno de ellos y los hace intercambiables. Permite que el algoritmo o comportamiento pueda variar independientemente de los clientes que lo utilicen. 


Se apoya en un contexto, un interface o clase abstracta y las distintas implementaciones del objeto y su comportamiento.

En nuestro ejercicio Invoice-Shopping trataremos de aplicar Strategy para que el metodo CREATE(), realize una creacion del objeto predefinida. Los distintos comportamientos seran que al atributo total (que sera el valor de la suma del atributo cost de cada elemento de la lista List<Shopping>) se le aplicara un porcentaje predeterminado en un atributo llamado IVA y el otro comportamiento que se implementa es la creacion de un invoice basica.

En detalle :

Nuestro Contexto sera la entidad llamada ERP.
El interface invoice :
    atributos : id , total , client, date , List<Shopping>
    metodo abstracto CREATE()
La clase Invoice21 
	añadimos el atributo iva = 21
	El comportamiento de CREATE lo redefinimos y tras la creacion de un objeto predeterminado aplicamos a total el porcetaje almacenado en el atributo IVA.

La clase Invoice
	Crea un objeto inicializando los valores a 0 y una lista vacia.


