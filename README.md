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
## Ejecutar Kubernetes localmente
Instalar el binario de [kind](https://kind.sigs.k8s.io/)

1. Crear un cluster:
    ```sh
    kind create cluster --image kindest/node:v1.23.5
    ```

2. Ver los servicios del master:
    ```sh
    kubectl get po -A
    kubectl cluster-info
    ```

3. Obtener el contexto
    ```sh
    kubectl config get-contexts
    ```

4. Setear el contexto donde se va a trabajar
    ```sh
    kubectl config set-context <nombre del contexto>
    ```

5. Ver los comandos
    ```sh
    kubectl -h
    ```

## Namespace

1. Crear namespace [documentación](https://kubernetes.io/docs/tasks/administer-cluster/namespaces-walkthrough/)
    ```sh
    kubectl create namespace indra
    ```

## Deployments

1. Crear deployment [documentación](https://kubernetes.io/docs/concepts/workloads/controllers/deployment/)
    ```sh
    kubectl -n indra apply -f deployment.yaml
    kubectl get pods -n indra
    ```

## Services

1. Crear services [documentación](https://kubernetes.io/docs/concepts/services-networking/service/)
    ```sh
    kubectl -n indra apply -f service.yaml
    kubectl get services -n indra
    ```
## Port Forwarding

1. Podemos acceder a los endpoints de servicios privados o pods usando `port-forward`
    ```sh
    kubectl -n indra port-forward <pod-name> 8080
    ```

## Public Traffic

Para hacer que nuestro sitio sea público, es común exponer los servidores web a través de un proxy o un API gateway.
En Kubernetes, se utiliza un Ingress.


## Ingress

1. Para usar un Ingress, necesitamos un controlador de Ingress.
    ```sh
    kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v1.1.3/deploy/static/provider/cloud/deploy.yaml

    kubectl -n ingress-nginx get pods

    kubectl -n ingress-nginx --address 0.0.0.0 port-forward svc/ingress-nginx-controller 80
    ```

2. Crear un Ingress [documentación](https://kubernetes.io/docs/concepts/services-networking/ingress/)
    ```sh
    kubectl apply -f ingress.yaml
    ```