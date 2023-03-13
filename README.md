# Quarkus Exemplars

This project means to test exemplars support in `quarkus-micrometer`.

## How to run it

1. `docker-compose up`
2. `mvn quarkus:dev`

Make several calls to http://localhost:8080/people

Then, go to http://localhost:8080/q/metrics to see if the exemplar data was sent to Prometheus (or you can also check directly on http://localhost:9090).