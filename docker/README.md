# docker-demo

## Prerrequisitos
- Docker

## Uso docker

1. Habilitar nginx:
    ```sh
    docker run -p 8080:80 -d nginx

    curl localhost:8080
    ```

2. Agregamos un archivo al contenedor:
   ```sh
   echo 'Hola Indra!!!' >> index.html

   docker run -v $(pwd)/index.html:/usr/share/nginx/html/index.html -p 8080:80 -d nginx
   ``` 

3. Construimos imagen docker:
    ```sh
    docker build -t darkmtrance/hola-docker:indra .
    ```

4. Subir imagen a docker hub:
    ```sh
    docker push darkmtrance/hola-docker:indra
    ```

## Uso docker compose

1. Ejecutar:
    ```sh
    docker compose up -d
    ```
