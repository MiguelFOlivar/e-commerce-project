<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&height=210&color=0:0b132b,50:1c2541,100:3a86ff&text=E-Commerce%20Backend%20Portfolio&fontColor=ffffff&fontSize=40&fontAlignY=35&desc=Microservicios%20con%20Spring%20Boot%20%7C%20Documentaci%C3%B3n%20viva&descAlignY=58" alt="Banner del proyecto" />

[![Typing SVG](https://readme-typing-svg.demolab.com?font=Fira+Code&pause=1300&color=3A86FF&center=true&vCenter=true&width=900&lines=Proyecto+backend+de+E-Commerce+en+evoluci%C3%B3n;Arquitectura+de+microservicios+en+monorrepo;README+orientado+a+despliegue+r%C3%A1pido+y+claro)](https://git.io/typing-svg)

# 🛒 E-Commerce Project (Monorrepo)

### Portafolio profesional de desarrollo backend

</div>

---

## 🧷 Badges del proyecto

### Tecnologías implementadas actualmente

![Java](https://img.shields.io/badge/Java-21-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-Connector-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JPA Hibernate](https://img.shields.io/badge/JPA-Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-Entorno%20de%20Desarrollo-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-Enabled-bd93f9?style=for-the-badge)

### Tecnologías planeadas (roadmap)

![Spring Security](https://img.shields.io/badge/Spring%20Security-Planificado-2EA44F?style=for-the-badge&logo=springsecurity&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-Planificado-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Planificado-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![OpenAPI](https://img.shields.io/badge/OpenAPI-Planificado-6BA539?style=for-the-badge&logo=openapiinitiative&logoColor=white)
![Flyway](https://img.shields.io/badge/Flyway-Evaluaci%C3%B3n%20futura-CC0200?style=for-the-badge&logo=flyway&logoColor=white)

---

## 📌 Tabla de contenido

- [🎯 Objetivo](#-objetivo)
- [🏗️ Arquitectura](#️-arquitectura)
- [🧩 Estado del proyecto](#-estado-del-proyecto)
- [📁 Estructura del repositorio](#-estructura-del-repositorio)
- [⚙️ Configuración por entorno (properties)](#️-configuración-por-entorno-properties)
- [🌱 Guía para principiantes](#-guía-para-principiantes)
- [🔐 Variables de entorno paso a paso](#-variables-de-entorno-paso-a-paso)
- [🚀 Ejecución en terminal (dev/prod)](#-ejecución-en-terminal-devprod)
- [💡 Ejecución con IntelliJ IDEA](#-ejecución-con-intellij-idea)
- [🧪 Pruebas](#-pruebas)
- [🗺️ Roadmap funcional](#️-roadmap-funcional)
- [🔄 Mantenimiento del README](#-mantenimiento-del-readme)

## 🎯 Objetivo

Construir una plataforma de e-commerce modular, escalable y mantenible, aplicando buenas prácticas de backend y documentación clara para facilitar ejecución local, despliegue y evolución continua.

## 🏗️ Arquitectura

Este repositorio utiliza un enfoque **monorrepo** para organizar microservicios independientes en un solo proyecto.

Beneficios del enfoque actual:

- Desarrollo aislado por servicio.
- Evolución coordinada del sistema completo.
- Configuración compartida y documentación centralizada.

## 🧩 Estado del proyecto

### Implementado actualmente

- `products/` ✅ **En desarrollo activo**
  - Gestión de catálogo de productos.
  - Integración con base de datos relacional vía JPA/Hibernate.
  - Perfiles de configuración para desarrollo y producción.

### Planeado

- `users/` ⏳ registro, autenticación y perfiles.
- `orders/` ⏳ carrito, órdenes y flujo de compra.

## 📁 Estructura del repositorio

```text
e-commerce-project/
├── pom.xml
└── products/
    ├── pom.xml
    └── src/main/resources/
        ├── application.properties
        ├── application-dev.properties
        └── application-prod.properties
```

## ⚙️ Configuración por entorno (properties)

La configuración de `products` está separada para facilitar desarrollo local y despliegue productivo.

### 1) `application.properties` (base común)

Archivo base con configuración compartida:

- Nombre de la app (`spring.application.name=products`).
- Variables base de conexión (`DB_HOST`, `DB_PORT`, `DB_NAME`).
- URL JDBC construida dinámicamente con esas variables.
- Configuración de pool de conexiones (HikariCP).
- Perfil activo por defecto: `spring.profiles.active=dev`.

### 2) `application-dev.properties` (entorno local)

Configuración enfocada en desarrollo:

- `server.port=8081`.
- Credenciales con fallback local (`DB_USER:root` y `DB_PASSWORD:root`).
- JPA con `ddl-auto=update`.
- SQL visible en consola para depuración.

### 3) `application-prod.properties` (entorno productivo)

Configuración enfocada en seguridad y estabilidad:

- `server.port=8080`.
- Credenciales **obligatorias** por variables de entorno (`DB_USER`, `DB_PASSWORD`).
- JPA con `ddl-auto=none` para evitar cambios automáticos de esquema.
- Logs SQL desactivados.

## 🌱 Guía para principiantes

Si no tienes experiencia previa con Spring Boot o variables de entorno, sigue esta ruta:

1. Instala **Java 21**, **Maven** y **MySQL**.
2. Clona el repositorio y entra a la carpeta `products`.
3. Crea/valida una base de datos llamada `db_products` en MySQL.
4. Ejecuta primero el perfil `dev` (más flexible para desarrollo).
5. Cuando quieras simular despliegue, ejecuta el perfil `prod` con variables de entorno explícitas.

## 🔐 Variables de entorno paso a paso

Las variables de entorno son valores externos que la app lee al iniciar (por ejemplo usuario/contraseña de DB), evitando hardcodear credenciales.

Variables que usarás en este proyecto:

- `DB_HOST`
- `DB_PORT`
- `DB_NAME`
- `DB_USER`
- `DB_PASSWORD`

### Linux / macOS (terminal bash/zsh)

```bash
export DB_HOST=localhost
export DB_PORT=3306
export DB_NAME=db_products
export DB_USER=root
export DB_PASSWORD=root
```

### Windows PowerShell

```powershell
$env:DB_HOST="localhost"
$env:DB_PORT="3306"
$env:DB_NAME="db_products"
$env:DB_USER="root"
$env:DB_PASSWORD="root"
```

> Nota: estas variables viven solo durante esa sesión de terminal. Si cierras la consola, debes volver a definirlas.

## 🚀 Ejecución en terminal (dev/prod)

### Prerrequisitos

- JDK 21+
- Maven 3.9+
- MySQL disponible
- Git

### 1) Clonar repositorio

```bash
git clone https://github.com/MiguelFOlivar/e-commerce-project.git
cd e-commerce-project
```

### 2) Ejecutar en desarrollo (`dev`)

`dev` es el perfil por defecto. Puedes correrlo explícitamente así:

```bash
cd products
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

Resultado esperado:

- Servicio arriba en `http://localhost:8081`
- Logs SQL visibles para depuración

### 3) Ejecutar en producción (`prod`)

1. Define variables de entorno (`DB_HOST`, `DB_PORT`, `DB_NAME`, `DB_USER`, `DB_PASSWORD`).
2. Ejecuta con perfil `prod`:

```bash
cd products
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

Resultado esperado:

- Servicio arriba en `http://localhost:8080`
- Sin creación/alteración automática de tablas (`ddl-auto=none`)
- Logs SQL desactivados

## 💡 Ejecución con IntelliJ IDEA

El proyecto se desarrolla en **IntelliJ IDEA**. Pasos recomendados:

1. `File` → `Open` y selecciona `/home/runner/work/e-commerce-project/e-commerce-project`.
2. Espera sincronización de Maven.
3. En módulo `products`, abre la clase principal de Spring Boot y crea una configuración `Run`.
4. En **Active profiles**, usa:
   - `dev` para desarrollo local.
   - `prod` para validar comportamiento productivo.
5. Para `prod`, en la configuración agrega variables en **Environment variables**:
   - `DB_HOST=localhost;DB_PORT=3306;DB_NAME=db_products;DB_USER=tu_usuario;DB_PASSWORD=tu_password`
6. Ejecuta con el botón **Run**.

## 🧪 Pruebas

Ejecuta pruebas del módulo `products`:

```bash
cd products
mvn test
```

## 🗺️ Roadmap funcional

- [x] Base del monorrepo.
- [x] Inicialización de `products`.
- [x] Perfiles de configuración `dev` y `prod`.
- [ ] Microservicio `users`.
- [ ] Microservicio `orders`.
- [ ] Seguridad con JWT/Spring Security.
- [ ] Migraciones con Flyway (evaluación e integración).
- [ ] Contenerización con Docker.

## 🔄 Mantenimiento del README

Este README se actualiza continuamente con cada cambio importante de arquitectura, configuración o ejecución, para mantenerlo útil como guía técnica y como pieza de portafolio profesional.
