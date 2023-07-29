# microservices-demo-project

<img width="700" alt="Screenshot 2023-07-29 at 6 00 52 PM" src="https://github.com/akd15102091/microservices-demo-project/assets/61588604/70240a63-607b-4f39-b547-9d6a186de941">


The project structure consists of four components: "e_server" is the Eureka server, while "contact_service," "user_service," and "apigateway" are Eureka clients representing separate microservices.

The "user_service" microservice handles incoming requests with the path "/user/{userId}". It operates on port 9001 with the hostname set to "localhost."

Similarly, the "contact_service" microservice processes requests with the path "/contact/user/{userId}". It runs on port 9002 with the hostname "localhost."

Alongside the previously mentioned microservices, the "apigateway" is an integral part of the project and functions as an independent microservice. It operates on port 8999 and serves as the API Gateway, responsible for routing requests to their appropriate services.

With the API Gateway in place, users can access various endpoints through a single port, simplifying the communication process. For instance:
- To retrieve user information with a specific userId, users can use the endpoint: http://localhost:8999/user/{userId}.
- To obtain contact information for a particular user with a specific userId, users can use the endpoint: http://localhost:8999/contact/user/{userId}.

By utilizing the API Gateway, users can access both user and contact information seamlessly through this one port, improving the overall user experience and service interaction.

All microservices operate on distinct ports. The User service runs on one port, while the Contact service runs on another port. The client interacts with these services through a single endpoint provided by the API Gateway.

When a client sends a request to the API Gateway's endpoint, it triggers the User service. The User service, in turn, communicates with the Contact service to obtain contact information. Once the User service retrieves the necessary contact details, it combines this data with the user's information. Finally, the User service returns the updated user data back to the client through the API Gateway. As a result, the client can access all the required user and contact information through a single endpoint, while the services manage the communication and data aggregation in the background.
