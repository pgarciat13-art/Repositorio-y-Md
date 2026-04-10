# Programación Orientada a Objetos (POO)

La **Programación Orientada a Objetos** es un paradigma de programación que utiliza "objetos" para diseñar aplicaciones y programas informáticos. Se basa en el uso de _clases_ que actúan como moldes para crear instancias específicas.

---

## Conceptos Fundamentales

Para entender la POO, debemos dominar sus cuatro pilares:

> "El software de calidad se construye mediante la abstracción de la realidad en componentes reutilizables."

### Los 4 Pilares de la POO

1. **Abstracción:** Ignorar los detalles irrelevantes y enfocarse en lo esencial.
2. **Encapsulamiento:** Ocultar los datos internos de un objeto para proteger su integridad.
3. **Herencia:** Capacidad de una clase para heredar atributos y métodos de otra.
4. **Polimorfismo:** \* Un mismo método puede comportarse de diferentes formas.
   - Permite tratar objetos de distintas clases de manera uniforme.

---

### Ejemplo de Estructura: Clase "Vehículo"

A continuación, se muestra cómo se organiza una jerarquía simple:

- **Clase Padre:** Vehículo
  - Atributo: `marca`
  - Método: `arrancar()`
- **Clases Hijas (Herencia):**
  - **Coche:** Añade el atributo `numero_puertas`.
  - **Moto:** Añade el atributo `cilindrada`.

![Esquema de Clases y Objetos](https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/UML_class_diagram_example.svg/500px-UML_class_diagram_example.svg.png)
_Diagrama representativo de la relación entre clases y objetos._

---

### Recursos Sugeridos

Puedes aprender más sobre la implementación de estos conceptos en los siguientes enlaces:

- [Documentación de MDN sobre Objetos](https://developer.mozilla.org/es/docs/Learn/JavaScript/Objects)
- [Principios SOLID (Buenas prácticas)](https://en.wikipedia.org/wiki/SOLID)

---

En conclusión, la POO permite que el código sea más **limpio**, **mantenible** y **escalable**, facilitando el trabajo en equipos grandes donde la modularidad es clave.
