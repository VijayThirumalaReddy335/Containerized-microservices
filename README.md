# Containerized-microservices
# Spring Boot Microservices Project

## Overview

This project demonstrates how to create, containerize, and deploy two Spring Boot microservices using Docker and Kubernetes. The applications interact with each other through REST APIs and can be deployed using either Minikube or Kind for local Kubernetes testing.

The project includes:
- **FirstApplication**: A simple Spring Boot application exposing a `/hello` endpoint.
- **SecondApplication**: Another Spring Boot application that retrieves data from `FirstApplication`, processes it, and exposes a `/reverse` endpoint.
- **Dockerfiles**: Dockerfiles for building Docker images of each application.
- **Kubernetes Manifests**: YAML files to deploy the microservices on Kubernetes.
- **Script**: `script.sh` to automate the build, push, and deployment process.


## Prerequisites

- Docker: [Install Docker](https://www.docker.com/get-started)
- Kubernetes CLI (`kubectl`): [Install kubectl](https://kubernetes.io/docs/tasks/tools/)
- Minikube: [Install Minikube](https://minikube.sigs.k8s.io/docs/start/)
- Kind: [Install Kind](https://kind.sigs.k8s.io/docs/user/quick-start/)

## How to Run

### Step 1: Build and Push Docker Images

1. Open a terminal and navigate to the root directory of the project.
2. Set up your Docker repository in the `script.sh` file:
   ```bash
   DOCKER_REPO="your-dockerhub-username/your-repo-name"
   
3. Make script.sh executable:
chmod +x script.sh

4. Run the script to build and push Docker images:
   ./script.sh minikube

5. Purpose of Using Minikube
  Minikube is a powerful tool for developing and testing Kubernetes applications locally. It provides a consistent, easy-to-use, and feature-rich environment that closely mirrors a real Kubernetes cluster. 
  Using Minikube can significantly streamline the development and testing process, ensuring that applications behave as expected before they are deployed to a production environment.
