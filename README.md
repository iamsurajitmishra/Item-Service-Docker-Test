# ########### Docker Command #######################
## =>  Create a docker file with name Dockerfile on the root location
##    @ https://github.com/iamsurajitmishra/Item-Service-Docker-Test/blob/master/Dockerfile


## => Build a docker image -
##   > docker -t app_name:v1 .
 ##  > This will create an image into the docker engine

## => Check all the docker image
  ## > docker image list
  ## > This will give us the list of docker image

## => Run the docker image -
  ## > docker run -d -p <container_exposed_port>:<app_port> app_name : app_version
 ##  > This will create a container inside the docker engine
   
   	
## => Check for all container into the docker engine
 ##  > docker ps // show all the running container 
 ##  > docker ps -a // show all the running and paused container
 ##  >docker container list // show a list of running container
       
       
## => Execute a docker container -
 ##  > docker exec -it <container_id> bash
   
## => How to pull base packages from docker hub -
 ##  > docker pull mongo:latest
 ##  > docker pull mongo:4.4s 
