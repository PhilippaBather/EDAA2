# AA2Entornos: el proyecto de la asignatura Entornos de Desarrollo.

Proyecto: la aplicación simula un sistema de existencias (stock) y pedidos de una tienda de música. Un usuario puede aÑadir, borrar o mostrar las existencias en el sistema. Además, puede crear pedidos para un cliente cogiendo los detalles del usuario y de su pedido.

Objetos:  i) CD; ii) Vinyl (vinilo); iii) Order (pedido); y, iv) Customer (cliente).
Nota: CD y Vinyl extende la clase abstracta Album.
Nota: los métodos equals() y toString() están usados para cada clase.

Puntos de la tarea:

1) Repositorio AA2Entornos creado; 3 ramas (master, develop y feature) creadas; README.md creado explicando los puntos del proyecto.
2)  a) Pull request creado después de crear las clases.
    b) Pull request creado despues de crear las opciones de menú para registrar objetos de las clases.
    c) Pull request creado despues de crear las opciones de menú para visualizar los objetos creados.
    d) Otros pull requests creados por otros cambios del código explicando en los comentarios 'commit'.
3) Jobs configurados en Jankins para i) clean y compile para el código inicial y ii) clean, compile y package el proyecto terminado.
4) Configuración necesaria implementada para analizar el código del proyecto por un SonarQube.
5) VisualVM usado para monitoriza el rendimiento y el uso de memoria de la aplicación; las capturas ha sido enviado con la entrega en Google Classroom.
6) Maven configurado para lanzar un análisis de código del proyecto directamente desde el terminal con SonarQube.
7) Tests de JUnit añadido al proyecto y el job de Jenkins configurado para que se ejecuten cada vez que éste se lance
   a) Tests de los constructores y los valores de sus atributos
   b) Tests de los métodos equals para las clases
8) Un release del proyecto añadido
9) Gestor de issues
   a) cada funcionalidad registrada como un feature
   b) 3 bugs identificados y solucionados
10) Diagrama de clases (enviado con la entrega via Google Classroom)
11) Una página web del proyecto utilizando GitHub-Pages
