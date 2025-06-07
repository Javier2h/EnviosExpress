
🚚 Envios Express
---
![Logo de Envios Express](https://blogger.googleusercontent.com/img/a/AVvXsEjBQEL7pMi1G1lDnhBqQqzq6PepIeqySBgpbRdfZscJA0meeSU91rivVitiOhBZSTu4fwdftclcMiHt6NSdRfEfrYkBjGkkUBj69CTPxdDtCvZKmh_LIcQk2i03M8ukzws9Dr_odF9f8a1zCo9Vg-hEFqy_8bkepBZrIgYBHsOr6IB90ILnXHdpGn8N9RU)

Actividad 2 - Arrquitectura Software

👤 Autores
- Andrade Eduardo
- Condor Nicole


## 🚀 Tecnologías utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![SOAP](https://img.shields.io/badge/SOAP-0A0A0A?style=for-the-badge&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?style=for-the-badge&logo=postgresql&logoColor=white)

---

## 📚 Tabla de contenidos

- [Descripción](#descripción)
- [Uso del API](#uso-del-api)
- [Instalación](#instalación)
- [Funcionamiento](#Funcionamiento)

---

- ## 🧾 Descripción

Este proyecto implementa un servicio **SOAP** que permite a los clientes consultar el estado de sus paquetes a través de un número de seguimiento. La solución está desarrollada con **Spring Boot**, **JPA** y sigue buenas prácticas de diseño y documentación.

## 🧪 Uso del API

El servicio SOAP expone un método llamado `GetTrackingStatus` que recibe un número de guía y devuelve el historial de eventos del paquete.

---

## ⚙️ Instalación

### Clonar el proyecto
- Ingresamos a GitHub Desktop y le damos clik en clonar repositorio
- Seleccionamos la opcion de URL
- Pegamos este URL : https://github.com/Javier2h/EnviosExpress.git
- Seleccionamos donde queremos guardar
- Desde un IDE abrimos la carpeta y seguimos con el paso de crear la base de datos


### Crear la base de datos en PostgreSQL
- Dentro de pgAdmin crear la base de datos con el nombre de EnviosExpress

- Se puede iniciar el servicio desde cualquier IDE que soporte Java, como:

![VS Code](https://img.shields.io/badge/VS%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)

## ✅ Funcionamiento


```xml
📨 Solicitud

<GetTrackingStatusRequest>
    <trackingNumber>EX123456789EC</trackingNumber>
</GetTrackingStatusRequest>

📬Respuesta

<GetTrackingStatusResponse>
    <status>En tránsito</status>
    <events>
        <event>
            <location>Quito</location>
            <timestamp>2025-06-01T10:00:00</timestamp>
            <description>Salida de bodega</description>
        </event>
    </events>
</GetTrackingStatusResponse>

