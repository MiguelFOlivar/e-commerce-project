# 🛒 Sistema E-Commerce (Monorrepo)

[![Java](https://img.shields.io/badge/Java-21-007396?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Arquitectura](https://img.shields.io/badge/Arquitectura-Microservicios-blueviolet)](#arquitectura-del-proyecto)
[![Estado](https://img.shields.io/badge/Estado-Fase%20Inicial-orange)](#)

Proyecto de **E-Commerce** desarrollado con **Java** y **Spring Boot**, diseñado bajo una arquitectura de microservicios y organizado como un **monorrepo** para centralizar el desarrollo en un único repositorio.

## 🏗️ Arquitectura del Proyecto

Este repositorio utiliza un enfoque **monorrepo**, donde cada microservicio vive en su propia carpeta con su código aislado, pero compartiendo el mismo repositorio Git.

Se eligió esta estructura para facilitar:
- La colaboración y visibilidad del sistema completo.
- La evolución coordinada entre servicios.
- La gestión centralizada de documentación y estándares del proyecto.

## 📦 Microservicios Incluidos

- `products/` — **Estado: En Desarrollo 🛠️**  
  Gestión del catálogo de productos, stock, categorías y precios.

- `users/` — **Estado: Pendiente ⏳**  
  Registro de usuarios, autenticación protegida (JWT) y gestión de perfiles.

- `orders/` — **Estado: Pendiente ⏳**  
  Gestión de carritos de compra, creación de órdenes y estados de pago.

## 🚀 Cómo empezar

1. Clona el repositorio:

```bash
git clone https://github.com/<usuario>/<repositorio>.git
```

2. Entra a la raíz del proyecto:

```bash
cd <repositorio>
```

3. Levanta de forma independiente el microservicio `products`:

```bash
cd products
mvn spring-boot:run
```

---

*Nota: Este proyecto se encuentra en su fase inicial de desarrollo y el README se irá actualizando conforme avance su implementación.*
