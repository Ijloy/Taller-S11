#  Sistema de Entidades en Minecraft (POO - Java)

Este proyecto simula un sistema básico de entidades del mundo de **Minecraft** utilizando los principios de **Programación Orientada a Objetos (POO)** en **Java**.

##  Objetivo

Modelar entidades como jugadores, zombis y aldeanos mediante una jerarquía de clases e interfaces, practicando herencia, abstracción y polimorfismo.

## 🧠 Clases y Funcionalidades

### 🔷 `EntidadMinecraft` (Interfaz)
Define los métodos comunes que toda entidad debe implementar:
- `void aparecer()`
- `void interactuar()`
- `String obtenerTipo()`

---

### 🧱 `EntidadBase` (Clase Abstracta)
Clase base que implementa parcialmente la interfaz `EntidadMinecraft`.

**Atributos:**
- `String nombre`
- `int salud`

**Métodos implementados:**
- `aparecer()`: Muestra un mensaje cuando la entidad aparece.
- `obtenerTipo()`: Devuelve "Entidad desconocida" por defecto.

**Método abstracto:**
- `interactuar()`: Cada subclase lo implementa de forma específica.

---

### 🧍 `Jugador` (Subclase de EntidadBase)
Representa a un jugador del mundo de Minecraft.

**Atributo adicional:**
- `List<String> inventario`

**Métodos propios:**
- `agregarItem(String item)`: Agrega un ítem al inventario.
- `mostrarInventario()`: Muestra los ítems en el inventario.

**Comportamiento al interactuar:**
- Explora el mundo y puede mostrar su inventario.

---

### 🧟 `Zombi` (Subclase de EntidadBase)
Representa un enemigo del juego.

**Atributo adicional:**
- `int nivelDeAgresividad`

**Comportamiento al interactuar:**
- Ataca con un nivel específico de agresividad.

---

### 🧑‍🌾 `Aldeano` (Subclase de EntidadBase)
Representa a un personaje no jugable que comercia.

**Atributo adicional:**
- `String profesion`




**Comportamiento al interactuar:**
- Comercia con el jugador según su profesión (por ejemplo, Herrero, Agricultor, etc.).



