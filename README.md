Airline-application

docker-compose up -d

mvn clean install docker:build

docker-compose -f docker-compose-infra-full.yaml up -d

docker-compose -f docker-compose-infra-full.yaml ps

docker-compose -f docker-compose-infra-full.yaml down