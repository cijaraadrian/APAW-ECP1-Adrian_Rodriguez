# Forja
#### Asignatura: *Ingeniería Web: Arquitectura y patrones de diseño*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

### STRATEGY

### Descripción
Este patrón define un conjunto de algoritmos o comportamientos, encapsula cada uno de ellos y los hace intercambiables. Permite que el algoritmo o comportamiento pueda variar independientemente de los clientes que lo utilicen. 


Se apoya en un contexto, un interface o clase abstracta y las distintas implementaciones del objeto y su comportamiento.

En nuestro ejercicio Invoice-Shopping trataremos de aplicar Strategy para que el metodo setIva(), realize un caculo del atributo total aplicando el 21 % o el 10 %

En detalle :

Nuestro Contexto sera la entidad llamada ERP.
El interface invoice :
    atributos : id , total , client, date , List<Shopping>
    metodo abstracto CREATE()
La clase Invoice21 
	añadimos el atributo iva = 21
	El comportamiento de CREATE lo redefinimos y tras la creacion de un objeto predeterminado aplicamos a total el porcetaje almacenado en el atributo IVA.

La clase Invoice10
	Aplicara un 10 %


