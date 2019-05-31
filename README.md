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

![fa1](https://user-images.githubusercontent.com/49033427/58683004-77a1a400-8338-11e9-9659-ad24a8a4a898.png)
![fa2](https://user-images.githubusercontent.com/49033427/58683030-9a33bd00-8338-11e9-9228-ac61b1e19efc.png)
![fa3](https://user-images.githubusercontent.com/49033427/58683032-9a33bd00-8338-11e9-9ea5-8570d8748dbd.png)
![fa4](https://user-images.githubusercontent.com/49033427/58683033-9acc5380-8338-11e9-88de-0ff346d54aec.png)
![fa5](https://user-images.githubusercontent.com/49033427/58683034-9acc5380-8338-11e9-976b-58dd256531fe.png)

•	La clase que se encuentra después es la clase ImagenTabla la cual utilizada para la creación de labels en los cuales se insertaran las imágenes que se desean.

![iT](https://user-images.githubusercontent.com/49033427/58683064-b59ec800-8338-11e9-8016-4db8363a9353.png)

•	La clase Persona es la clase que heredaba sus atributos a la clase Empleado y Cliente, pero esta clase tiene sus propios atributos que son el codigo, nombre, cedula, dirección, teléfono y email.

![p1](https://user-images.githubusercontent.com/49033427/58683106-df57ef00-8338-11e9-9bf7-d0e50d03bfe0.png)
![p2](https://user-images.githubusercontent.com/49033427/58683110-df57ef00-8338-11e9-8572-2d80ee73c082.png)
![p3](https://user-images.githubusercontent.com/49033427/58683111-df57ef00-8338-11e9-8ba5-8ead3ab846d1.png)
![p4](https://user-images.githubusercontent.com/49033427/58683112-df57ef00-8338-11e9-9f58-79a9c00d687d.png)
![principal](https://user-images.githubusercontent.com/49033427/58683114-dff08580-8338-11e9-8cdf-cf7371113031.png)
![p5](https://user-images.githubusercontent.com/49033427/58683115-dff08580-8338-11e9-85bb-470e3a084c75.png)

•	La clase que viene después es la clase Producto, esta clase es una clase que hereda de la clase Stock pero esta misma clase tiene su propio atributo que es path el cual nos sirve para guarda la ubicación de la imagen de dicho producto.

![p1](https://user-images.githubusercontent.com/49033427/58683153-fd255400-8338-11e9-8042-0f9ef9795605.png)
![p2](https://user-images.githubusercontent.com/49033427/58683154-fd255400-8338-11e9-8da2-03cabbc2d7cf.png)

•	Y por último la última clase que queda es la clase Stock el cual esta hereda sus atributos a diferentes clases que han sido anteriormente mencionadas, pero tiene sus atributos propios, que son: codigo, nombre, costo, cantidad y la fecha de expedición.

![s1](https://user-images.githubusercontent.com/49033427/58683181-175f3200-8339-11e9-90e2-402a8aae65c2.png)
![s2](https://user-images.githubusercontent.com/49033427/58683182-175f3200-8339-11e9-82e8-a9c500020874.png)
![s3](https://user-images.githubusercontent.com/49033427/58683183-175f3200-8339-11e9-8ecb-038b4446d984.png)
![s4](https://user-images.githubusercontent.com/49033427/58683184-17f7c880-8339-11e9-9ddc-7410db10c74d.png)

4.	Descripción de la utilización de las ventanas.
El proyecto que es realizado consta de hacer una factura de una tiene da videojuegos el cual es realizado con una interfaz gráfica y a continuación se explicará la utilización de cada una de las ventanas que son implementadas.

•	La primera ventana que se nos visualiza es la venta de Login en la cual se debe iniciar sesión para poder tener diferentes privilegios.

![p1](https://user-images.githubusercontent.com/49033427/58683281-8a68a880-8339-11e9-8c30-8764155512e3.png)

•	La siguiente ventana es la venta secundaria en la cual se puede hacer varias acciones que se deseen en la cuales las principales entrar a cliente, empleado, producto, factura e idiomas.

![p2](https://user-images.githubusercontent.com/49033427/58683282-8a68a880-8339-11e9-9990-30f5a47b9768.png)

•	Una vez que se ingrese al menú de cliente y se entra a la opción de crear cliente no sale la siguiente ventana en la cual se nos dan varios campos a llenar y otro que no se puede manipular y es el codigo que se genera cada que se va a crear un nuevo cliente.

![p3](https://user-images.githubusercontent.com/49033427/58683284-8b013f00-8339-11e9-8922-aa2cf1f5f8cb.png)

•	Esta ventana es Buscar cliente en la cual se nos pide que ingresemos el codigo del cliente el cual fue anteriormente creado y luego de eso se nos va a llenar los recuadros con la información deseada.

![p4](https://user-images.githubusercontent.com/49033427/58683285-8b013f00-8339-11e9-9491-aa8a51ec65e3.png)

•	La ventana actualizar cliente ingresamos el codigo del cliente y luego de ello le damos a buscar y luego podemos manipular cualquier de los otros datos para actualizarlos.

![p5](https://user-images.githubusercontent.com/49033427/58683286-8b013f00-8339-11e9-806b-b16cd37d1bbb.png)

•	En la ventana eliminar cliente se nos pide de igual manera que ingresemos el codigo y si el codigo es correcto podremos eliminar el cliente que ha sido encontrado.

![p6](https://user-images.githubusercontent.com/49033427/58683287-8b013f00-8339-11e9-817f-a9e1b658f80a.png)

•	Por último en la clase cliente encontramos la clase listar cliente en la cual se nos va a mostrar en una forma de lista todos los clientes que han sido registrados anteriormente.

![p7](https://user-images.githubusercontent.com/49033427/58683290-8b99d580-8339-11e9-9a75-995d99e9c4d6.png)

•	Una vez que se ingrese al menú de empleado y se entra a la opción de crear cliente no sale la siguiente ventana en la cual se nos dan varios campos a llenar y otro que no se puede manipular y es el codigo que se genera cada que se va a crear un nuevo empelado mientras que en esta ventana se aumenta el campo del sueldo.

![p8](https://user-images.githubusercontent.com/49033427/58683291-8c326c00-8339-11e9-98a3-c21db9d870b5.png)

•	Esta ventana es Buscar empelado en la cual se nos pide que ingresemos el codigo del cliente el cual fue anteriormente creado y luego de eso se nos va a llenar los recuadros con la información deseada.

![p9](https://user-images.githubusercontent.com/49033427/58683292-8c326c00-8339-11e9-9f6e-58e57f36f24f.png)

•	La ventana actualizar empleado ingresamos el codigo del empelado y luego de ello le damos a buscar y luego podemos manipular cualquier de los otros datos para actualizarlos.

![p10](https://user-images.githubusercontent.com/49033427/58683293-8c326c00-8339-11e9-84cc-04c6daa7d065.png)

•	En la ventana eliminar empelado se nos pide de igual manera que ingresemos el codigo y si el codigo es correcto podremos eliminar el empleado que ha sido encontrado.

![p11](https://user-images.githubusercontent.com/49033427/58683295-8c326c00-8339-11e9-8fc2-5d47aecc5b2e.png)

•	Por ultimo en la clase empelado encontramos la clase listar empelado en la cual se nos va a mostrar en una forma de lista todos los empleados que han sido registrados anteriormente.

![p12](https://user-images.githubusercontent.com/49033427/58683296-8ccb0280-8339-11e9-94c2-43016d32f763.png)

•	Una vez que se ingrese al menú de producto y se entra a la opción de crear producto no sale la siguiente ventana en la cual se nos dan varios campos a llenar y otro que no se puede manipular y es el codigo que se genera cada que se va a crear un nuevo producto.

![p13](https://user-images.githubusercontent.com/49033427/58683299-8ccb0280-8339-11e9-8e20-eba61ffffb1b.png)

•	Esta ventana es Buscar producto en la cual se nos pide que ingresemos el codigo del producto el cual fue anteriormente creado y luego de eso se nos va a llenar los recuadros con la información deseada.

![p14](https://user-images.githubusercontent.com/49033427/58683301-8d639900-8339-11e9-8b84-649bbe26885b.png)

•	La ventana actualizar producto ingresamos el codigo del producto y luego de ello le damos a buscar y luego podemos manipular cualquier de los otros datos para actualizarlos.

![p15](https://user-images.githubusercontent.com/49033427/58683302-8d639900-8339-11e9-966b-0639b7b362f1.png)

•	En la ventana eliminar producto se nos pide de igual manera que ingresemos el codigo y si el codigo es correcto podremos eliminar el producto que ha sido encontrado.

![p16](https://user-images.githubusercontent.com/49033427/58683303-8d639900-8339-11e9-835b-3afed38c5c0e.png)

•	Por ultimo en la clase producto encontramos la clase listar producto en la cual se nos va a mostrar en una forma de lista todos los producto que han sido registrados anteriormente.

![p17](https://user-images.githubusercontent.com/49033427/58683304-8d639900-8339-11e9-853b-9b53742f8e6f.png)

•	Mientras que si se entra al menú de Factura y nos vamos al crear factura nos saldrá la siguiente factura en la cual podemos crear una nueva factura.

![p18](https://user-images.githubusercontent.com/49033427/58683305-8d639900-8339-11e9-851b-d19263a03d62.png)

•	Mientras que si entramos al menú de Buscar/Eliminar podemos buscar las facturas anteriormente y si se desea las podemos eliminar.

![p19](https://user-images.githubusercontent.com/49033427/58683306-8dfc2f80-8339-11e9-939d-fd11a5af215d.png)

•	Por ultimo tenemos el ítem de listar el cual se encarga de listar y asi mostrar cada una de las facturas que han sido creadas.

![p20](https://user-images.githubusercontent.com/49033427/58683307-8dfc2f80-8339-11e9-8e61-a9ee11661c3b.png)

5.	Descripción de la internacionalización.

En el proyecto se nos pidió realizar la internacionalización para nuestro programa y para realizarla es necesario crear un package para sus respectivas clases y ahí es donde se nos guarda la información que deseamos y guardamos nuestros ítems en el idioma original como en el idioma que nos esta pidiendo dicha internacionalización. 

![i1](https://user-images.githubusercontent.com/49033427/58683474-2b576380-833a-11e9-89af-5b8567086998.png)

A continuación, se muestra los ítems con sus nombres respectivamente guardados.

![i2](https://user-images.githubusercontent.com/49033427/58683475-2b576380-833a-11e9-81a9-37c570ec397c.png)
![i3](https://user-images.githubusercontent.com/49033427/58683477-2beffa00-833a-11e9-9bbe-41aa4418ec48.png)

6.	Descripción de las imágenes.

Para la realización de los diferentes botones que se han implementado a lo largo del programa se nos hizo necesario implementar imágenes tanto para nuestra ventana principal para su respectivo Login como para los iconos de cada uno de los botones que se ha ido creando en cada una de las ventanas que han sido creadas.

![i1](https://user-images.githubusercontent.com/49033427/58683514-4cb84f80-833a-11e9-9635-7452af5356a8.png)

7.	Creación de un README en el GitHub.

Se crea un README en el repositorio de GitHub para así poder tener una demostración y una explicación de nuestro programa para que de esta manera cualquier persona que lea este archivo pueda entender su funcionamiento y sus características.

![r1](https://user-images.githubusercontent.com/49033427/58683533-5cd02f00-833a-11e9-96d5-c6a604f15310.png)
