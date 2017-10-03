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
    metodo abstracto setIva()
La clase Invoice21 
	Devuelve in string para observar el comportamiento de aplicar un 21 %

La clase Invoice10
	Devuelve in string para observar el comportamiento de aplicar un 10 %


