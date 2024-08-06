# docker-demo

## Prerrequisitos
- Docker

## Uso

1. Habilitar nginx:
    ```sh
    docker run -p 8080:80 -d nginx

    curl localhost:8080
    ```

2. Agregamos un archivo al contenedor
   ```sh
   echo 'Hola Indra!!!' >> index.html

   docker run -v index.html:/usr/share/nginx/html/index.html -p 8080:80 -d nginx
   ``` 