# ProyectoIntercicloFacturaVideojuego
1.	Creación de varios package para cada una de las clases.
Se crea varios packages para cada una de las clases que habrán puesto que existirá un package con el nombre Idiomas para la internacionalización, existe el package controlador donde existen los controladores de cada clase principal siendo estas: cliente, empleado, factura, producto, en el siguiente package imágenes es donde se almacenan las diferentes imágenes utilizadas tanto para botones como para logos, el package modelo es donde se guardan las clases de clase, cliente, detalle factura, empleado, factura, imagentabla, persona, producto y stock mientras que en el package vista están las clases que son mostradas hacia el usuario tanto como para su login como la factura.
![package](https://user-images.githubusercontent.com/49033427/58682638-06152600-8337-11e9-87f4-36e5d27d932f.jpg)

2.	Creación de un repositorio en GitHub.
El link del repositorio es: https://github.com/VinicioCabrera/ProyectoIntercicloFacturaVideojuego
Se crea un repositorio de GitHub en el cual se subirá cada modificación que se hará en el respectivo código que cada integrante haga pues que cada integrante es un contribuidor y podemos cada uno las modificaciones que se desee para de esta manera poder trabajar de una manera conjunto y grupal.
![punto 2](https://user-images.githubusercontent.com/49033427/58682645-10cfbb00-8337-11e9-8293-14315f09d0df.jpg)

3.	Descripción de la utilización de cada clase.
Se tienen 8 clases que ha sido creadas en el package modelo y a continuación se explicaran y detallaran cada una de ellas. 
![punto 3](https://user-images.githubusercontent.com/49033427/58682716-48d6fe00-8337-11e9-8c88-fab7cf3ef74f.jpg)

•	La siguiente es la clase Cliente, en la cual se tiene como atributos cada uno de los detalles que tiene el cliente los cuales son heredados de la clase Persona la cual será explicada luego. 
![punto 3 1](https://user-images.githubusercontent.com/49033427/58682752-64da9f80-8337-11e9-8f71-15631eb24531.jpg)
•	A continuación, está la clase DetalleFactura, esta al igual que en el caso anterior tiene detalles que son heredados de la clase Stock. 
![punto 3 2](https://user-images.githubusercontent.com/49033427/58682788-889de580-8337-11e9-8f33-5388b0a31e54.jpg)
![punto 3 22](https://user-images.githubusercontent.com/49033427/58682830-b420d000-8337-11e9-9601-1f3d9302811d.jpg)
![punto 3 23](https://user-images.githubusercontent.com/49033427/58682876-d7e41600-8337-11e9-8c66-0d4157fdd128.jpg)
![punto 3 24](https://user-images.githubusercontent.com/49033427/58682875-d7e41600-8337-11e9-8622-f53ab42a1cf9.jpg)
•	Después se encuentra la clase Empleado el cual tiene los detalles que cada empleado puede poseer además de heredar varios detalles que de igual manera son heredados de la clase Persona.
![punto 3 3](https://user-images.githubusercontent.com/49033427/58682930-17aafd80-8338-11e9-845c-85fb44a0e23e.jpg)
![punto 3 34](https://user-images.githubusercontent.com/49033427/58682931-1974c100-8338-11e9-8492-b42d41176e50.jpg)
•	La clase Factura es la que la sigue, en esta factura podemos encontrar los detalles, que son llamados atributos, que tiene una factura los cuales son los siguientes el código, empleado, cliente, fecha, subtotal, IVA y el total pero también se aplican atributos que lo comparten las clases Cliente, Empleado y DetalleFactura.
