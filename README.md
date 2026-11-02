<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&height=180&color=0:0f172a,100:2563eb&text=E-Commerce%20Project&fontColor=ffffff&fontSize=42&fontAlignY=35&desc=Portafolio%20de%20Desarrollo%20Backend&descAlignY=55" alt="Banner del proyecto" />

# 🛒 E-Commerce Project (Monorrepo)

[![Java](https://img.shields.io/badge/Java-21-007396?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Arquitectura](https://img.shields.io/badge/Arquitectura-Microservicios-blueviolet)](#-arquitectura)
[![Estado](https://img.shields.io/badge/Estado-En%20desarrollo-orange)](#-estado-del-proyecto)

</div>

Proyecto backend de **E-Commerce** desarrollado con **Java + Spring Boot**, diseñado con enfoque de **microservicios** dentro de un **monorrepo**. Este repositorio forma parte de mi portafolio profesional y evoluciona de forma incremental.

## 📌 Tabla de contenido

- [🎯 Objetivo](#-objetivo)
- [🏗️ Arquitectura](#-arquitectura)
- [🧩 Estado del proyecto](#-estado-del-proyecto)
- [🛠️ Stack tecnológico](#️-stack-tecnológico)
- [📁 Estructura del repositorio](#-estructura-del-repositorio)
- [🚀 Guía rápida de ejecución](#-guía-rápida-de-ejecución)
- [🗺️ Roadmap](#️-roadmap)
- [🔄 Mantenimiento del README](#-mantenimiento-del-readme)

## 🎯 Objetivo

Construir una plataforma de e-commerce modular, escalable y mantenible, aplicando buenas prácticas de arquitectura backend y documentación clara para facilitar su uso y evolución.

## 🏗️ Arquitectura

El proyecto utiliza un enfoque **monorrepo**, donde cada microservicio vive en su propio módulo, permitiendo:

- Desarrollo aislado por servicio.
- Evolución coordinada de todo el sistema.
- Documentación centralizada y alineada con el avance real.

## 🧩 Estado del proyecto

### Implementado actualmente

- `products/` ✅ **En desarrollo activo**
  - Gestión de catálogo de productos.
  - Base para extender funcionalidades de stock, categorías y precios.

### Planeado

- `users/` ⏳ Registro, autenticación y perfiles.
- `orders/` ⏳ Carrito, órdenes y flujo de compra.

## 🛠️ Stack tecnológico

- **Java 21**
- **Spring Boot 3.x**
- **Maven**
- Arquitectura orientada a **microservicios**

## 📁 Estructura del repositorio

```text
e-commerce-project/
├── pom.xml
└── products/
```

## 🚀 Guía rápida de ejecución

### Prerrequisitos

- JDK 21+
- Maven 3.9+
- Git

### 1) Clonar el repositorio

```bash
git clone https://github.com/MiguelFOlivar/e-commerce-project.git
cd e-commerce-project
```

### 2) Ejecutar el microservicio `products`

```bash
cd products
mvn spring-boot:run
```

### 3) Ejecutar pruebas del módulo `products`

```bash
cd products
mvn test
```

## 🗺️ Roadmap

- [x] Crear base del monorrepo.
- [x] Inicializar microservicio `products`.
- [ ] Incorporar microservicio `users`.
- [ ] Incorporar microservicio `orders`.
- [ ] Definir integración entre servicios.

## 🔄 Mantenimiento del README

Este README se actualizará constantemente conforme existan cambios importantes en la arquitectura, módulos o forma de ejecución del proyecto, manteniéndose siempre en estado **ready** para futuras mejoras.
