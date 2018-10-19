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
- hystrix-dashboard
	- http://localhost:{random.port}/hystrix
- hystrix-stream
	- http://localhost:{random.port}/actuator/hystrix.stream
