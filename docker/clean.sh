echo "removing containers"
sudo docker rm -f docker_discovery_1
sudo docker rm -f  docker_zuul_1
sudo docker rm -f docker_ctuserservice_1
sudo docker rm -f docker_ctfileservice_1

echo "removing images"
sudo docker rmi -f  docker_discovery
sudo docker rmi -f docker_zuul
sudo docker rmi -f docker_ctuserservice
sudo docker rmi -f docker_ctfileservice