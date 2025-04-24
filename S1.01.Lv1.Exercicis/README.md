# 🚗 S1.01 - Herència i Polimorfisme en Java

## 📄 Enunciat dels exercicis

### 🎵 Exercici 1: Tipus d'instruments

Implementa una jerarquia de classes que representin diferents tipus d'instruments musicals.

- Crea una classe abstracta `Instrument` amb atributs comuns (nom, família, material…)
- Afegeix un mètode abstracte `tocar()` que haurà de ser implementat per les subclasses
- Crea subclasses com `Guitarra`, `Piano` o `Violí` que implementin el comportament del mètode `tocar()`

📚 **Objectiu:** Practicar els conceptes de *classes abstractes*, *herència* i *polimorfisme*.

---

### 🚙 Exercici 2: Classe "Cotxe"

Crea una classe `Cotxe` amb els atributs:

- `marca`: `static final`
- `model`: `static`
- `potencia`: `final`

Demostra la diferència entre ells:

- Quins es poden inicialitzar al constructor?
- Quins es comparteixen entre instàncies?

Afegeix dos mètodes a la classe:

- `static void frenar()` → Mostra: *"El vehicle està frenant"*
- `void accelerar()` → Mostra: *"El vehicle està accelerant"*

Des del `main()` de la classe principal, demostra:

- Com cridar el mètode `frenar()` de forma estàtica
- Com cridar el mètode `accelerar()` des d’una instància de `Cotxe`

📚 **Objectiu:** Entendre la diferència entre atributs i mètodes estàtics i no estàtics en Java.

---

## 💻 Tecnologies Utilitzades

- Java 17
- IntelliJ IDEA (Community Edition)
- Maven
- Git & GitHub

---

## 📋 Requisits previs

- Java JDK 17 instal·lat
- IntelliJ IDEA Community Edition
- Git Bash o una terminal
- Compte actiu a GitHub

---

## 🛠️ Instal·lació i configuració

1. Instal·la:
   - [Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
   - [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/)
   - [Git Bash](https://gitforwindows.org/)
2. Clona el repositori:
   ```bash
   git clone https://github.com/ArnauAsole/S1.01.InheritancePolymorphism.Lv1.git
   cd S1.01.InheritancePolymorphism.Lv1
