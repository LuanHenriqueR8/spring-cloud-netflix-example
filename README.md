## Eureka

 - http://localhost:7777/

## Zuul + Ribbon
- http://localhost:9000/

## Foo-service

- direct access
	- http://localhost:{random.port}/
- with zuul
	- http://localhost:9000/foo-service

## Bar-service
- direct access
	- http://localhost:{random.port}/
- with zuul
	- http://localhost:9000/bar-service
