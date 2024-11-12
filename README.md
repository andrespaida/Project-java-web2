# Project-java-web2

This project aims to showcase a simple web page built using **HTML** and **Java**. It is a basic demonstration of a static webpage that can be run locally using Docker.

## Technologies Used

- **HTML**
- **Java**

## Installation

To run this project, follow these steps:

### Download the project image from DockerHub:

Run the following command to pull the latest image of the project:

    docker pull andrespaida/web-page-java:latest

### Create a container from the downloaded image:

Next, create and run the container with this command:

    docker run -d -p 9000:9000 --name web-container4 andrespaida/web-page-java:latest

### Access the webpage:

Once the container is running, open your browser and go to:

    http://localhost:9000

## License

This project is under the creator's license (Andrés Paida). All rights reserved.
