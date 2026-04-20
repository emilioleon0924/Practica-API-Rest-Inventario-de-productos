# API Rest - Inventario de productos

API REST completa para gestionar el inventario deuna tieda, construida en Spring Bott, Gradle, Postgres y dockerizada 

## Tecnologías
- Spring Boot 4.0.5
- Gradle 8.14
- PostgreSQL 16
- Docker, Docker compose 
- JPA - hibernate

## Cómo ejecutar

```bash
# Clonar el repositorio
git clone 

# Entrar al directorio
cd inventario

# Ejecutar con docker compose
docker-compose up --build 
```
## Endpoints
| Método | Endpoint             | Descripción                |
| ------ | -------------------- | -------------------------- |
| GET    | /api/productos       | Lista todos los productos  |
| GET    | /api/productos/{id}  | Obtener producto por ID    |
| POST   | /api/productos       | Crear un producto          |
| PUT    | /api/productos/{id}  | Actualizar un producto     |
| DELETE | /api/productos/{id}  | Eliminar un producto       |

Base de datos: PostgreSQL (puerto 5433)