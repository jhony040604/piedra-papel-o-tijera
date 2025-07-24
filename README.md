# 🎮 Rock Paper Scissors - Piedra, Papel o Tijeras

Un clásico juego de Piedra, Papel o Tijeras implementado en Java con interfaz de consola, múltiples modos de juego y sistema de estadísticas completo.

![Java](https://img.shields.io/badge/Java-8+-orange.svg)
![Console Game](https://img.shields.io/badge/Type-Console_Game-blue.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

## 🎯 Características

- **🎮 Múltiples modos de juego**: Partida individual y Mejor de 3
- **📊 Sistema de estadísticas**: Seguimiento completo de victorias, derrotas y empates
- **🎨 Interfaz visual atractiva**: Uso de emojis y marcos ASCII
- **💪 Código robusto**: Manejo de errores y validaciones
- **📖 Sistema de ayuda**: Reglas integradas y consejos
- **🔄 Funciones avanzadas**: Reinicio de estadísticas y porcentajes de victoria

## 🎲 Modos de Juego

### 🆚 Partida Individual
- Juega una ronda rápida contra la computadora
- Perfecto para cuando tienes poco tiempo
- Cada partida cuenta para tus estadísticas

### 🏆 Mejor de 3
- Torneo completo: el primero en ganar 2 partidas es el campeón
- Seguimiento de rondas en tiempo real
- ¡Demuestra tu consistencia!

## 🚀 Instalación y Uso

### Prerrequisitos
- **Java 8** o superior
- **JDK** instalado en tu sistema

### Compilar y ejecutar

```bash
# Clona el repositorio
git clone https://github.com/tu-usuario/rock-paper-scissors-java.git
cd rock-paper-scissors-java

# Compila el programa
javac RockPaperScissors.java

# Ejecuta el juego
java RockPaperScissors
```

### Ejecución directa (si tienes el .class)
```bash
java RockPaperScissors
```

## 🎯 Cómo Jugar

### Reglas básicas
```
🗿 PIEDRA    rompe las    ✂️ TIJERAS
📄 PAPEL     envuelve la  🗿 PIEDRA  
✂️ TIJERAS   cortan el    📄 PAPEL
```

### Controles
1. **Elige tu opción**: Presiona 1, 2 o 3
   - `1` = 🗿 Piedra
   - `2` = 📄 Papel  
   - `3` = ✂️ Tijeras

2. **Navega por el menú**: Usa los números para seleccionar opciones

### Opciones del menú
- **🆚 Jugar una partida**: Partida rápida individual
- **🏆 Mejor de 3**: Torneo completo
- **📊 Ver estadísticas**: Revisa tu rendimiento
- **📖 Reglas del juego**: Consulta las reglas
- **🔄 Reiniciar estadísticas**: Comenzar de cero
- **🚪 Salir**: Terminar el programa

## 📊 Sistema de Estadísticas

El juego rastrea automáticamente:

| Estadística | Descripción |
|-------------|-------------|
| **Partidas jugadas** | Total de partidas completadas |
| **Tus victorias** 🏆 | Cuántas veces has ganado |
| **Victorias de la PC** 🤖 | Cuántas veces ganó la computadora |
| **Empates** 🤝 | Partidas sin ganador |
| **Porcentaje de victorias** | Tu tasa de éxito |

### Sistema de evaluación
- **🌟 70%+ de victorias**: "¡Eres un maestro del juego!"
- **👍 50-69% de victorias**: "¡Buen rendimiento!"
- **💪 <50% de victorias**: "¡Sigue practicando!"

## 🛠️ Estructura del Código

```
RockPaperScissors.java
├── main()                    # Punto de entrada
├── menuPrincipal()          # Control del menú
├── jugarPartida()           # Lógica de partida individual
├── mejorDeTres()            # Lógica del torneo  
├── obtenerEleccionJugador() # Input del usuario
├── determinarGanador()      # Lógica del juego
├── mostrarEstadisticas()    # Display de stats
└── Métodos auxiliares       # Utilidades y UI
```

## 🎨 Características Técnicas

### Conceptos de Java aplicados
- **📦 Encapsulación**: Métodos privados y organización
- **🔢 Manejo de arrays**: Almacenamiento de opciones y emojis
- **❌ Manejo de excepciones**: Try-catch para input validation
- **🎲 Números aleatorios**: Clase Random para IA
- **📝 Formateo de strings**: Printf y manipulación de texto

### Detalles de implementación
- **Validación robusta**: Manejo de entradas inválidas
- **Interfaz amigable**: Marcos ASCII y emojis
- **Código limpio**: Métodos bien documentados
- **Sin dependencias externas**: Solo Java estándar

## 🚀 Ideas para Mejoras

### Próximas características
- [ ] **🤖 IA inteligente** que aprende de tus patrones
- [ ] **💾 Persistencia de datos** (guardar estadísticas en archivo)
- [ ] **👥 Modo multijugador** (2 jugadores humanos)
- [ ] **🏆 Sistema de logros** y medallas
- [ ] **⏱️ Modo cronometrado** con límite de tiempo
- [ ] **🎵 Efectos de sonido** (con Java Sound API)
- [ ] **🌍 Variantes internacionales** (Lagarto-Spock)
- [ ] **📈 Gráficos de rendimiento** con JavaFX

### Ejercicios para estudiantes
- [ ] Agregar una cuarta opción (Lagarto)
- [ ] Implementar save/load de estadísticas
- [ ] Crear una GUI con Swing
- [ ] Añadir diferentes niveles de dificultad de IA

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Este proyecto es perfecto para:

- **👨‍🎓 Estudiantes** aprendiendo Java
- **🔰 Desarrolladores junior** practicando conceptos básicos
- **👨‍🏫 Profesores** buscando ejemplos didácticos

### Cómo contribuir
1. **Fork** el proyecto
2. **Crea** una rama feature (`git checkout -b feature/AmazingFeature`)
3. **Commit** tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. **Push** a la rama (`git push origin feature/AmazingFeature`)
5. **Abre** un Pull Request

## 📚 Valor Educativo

Este proyecto es excelente para aprender:

### Conceptos básicos
- ✅ **Variables y constantes**
- ✅ **Estructuras de control** (if, while, switch)
- ✅ **Arrays y manipulación**
- ✅ **Métodos y parámetros**

### Conceptos intermedios
- ✅ **Manejo de excepciones**
- ✅ **Entrada de usuario** con Scanner
- ✅ **Números aleatorios**
- ✅ **Documentación Javadoc**

### Buenas prácticas
- ✅ **Código limpio** y bien estructurado
- ✅ **Separación de responsabilidades**
- ✅ **Manejo de errores**
- ✅ **Interfaz de usuario intuitiva**

## 🎉 ¡Disfruta jugando!

Este proyecto demuestra que los **juegos simples pueden ser muy divertidos** cuando están bien implementados. 

### ¿Por qué este proyecto es especial?

- 🎨 **Interfaz atractiva** sin usar librerías gráficas
- 📊 **Estadísticas completas** para seguimiento del progreso
- 🏗️ **Arquitectura limpia** fácil de entender y extender
- 📖 **Documentación completa** para aprender

Si te gusta este proyecto, no olvides darle una ⭐ en GitHub. ¡Gracias!

---

*Hecho con ☕ y mucho Java*
