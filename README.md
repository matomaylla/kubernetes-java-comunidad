# kubernetes-java-comunidad

## Descripción
Este proyecto tiene como objetivo conocer el orquestador de contenedores Kubernetes mediante una aplicación Java.

## Prerrequisitos
- Java 17 o superior
- Maven 3.6.0 o superior
- Docker
- Kubernetes (Minikube o cualquier otra distribución)

## Instalación
1. Clona el repositorio:
    ```sh
    git clone <url-del-repositorio>
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd <directorio-del-proyecto>
    ```
3. Construye el proyecto usando Maven:
    ```sh
    mvn clean install
    ```

## Uso
1. Construye la imagen Docker:
    ```sh
    docker build -t nombre-imagen .
    ```
2. Despliega la aplicación en Kubernetes:
    ```sh
    kubectl apply -f deployment.yaml
    ```
3. Accede a la aplicación en `http://localhost:<puerto>`.