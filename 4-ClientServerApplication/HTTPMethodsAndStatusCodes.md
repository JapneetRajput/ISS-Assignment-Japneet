# HTTP Methods and Status Codes

## HTTP Methods

HTTP methods are used to perform operations on resources identified by a URL. Each method corresponds to a specific type of request that a client can make to a server.

### Common HTTP Methods

1. **GET**

   - Retrieves data from the server.
   - Should not have any side effects (safe).
   - Example: `GET /users/123` retrieves user with ID 123.

2. **POST**

   - Submits data to the server to create a new resource.
   - Typically used for form submissions.
   - Example: `POST /users` creates a new user.

3. **PUT**

   - Updates an existing resource with new data.
   - Replaces the entire resource.
   - Example: `PUT /users/123` updates user with ID 123.

4. **PATCH**

   - Partially updates an existing resource.
   - Only the specified fields are updated.
   - Example: `PATCH /users/123` updates specified fields of user with ID 123.

5. **DELETE**

   - Deletes the specified resource from the server.
   - Example: `DELETE /users/123` deletes user with ID 123.

6. **HEAD**

   - Similar to GET but only retrieves the headers, not the body.
   - Useful for checking resource metadata.
   - Example: `HEAD /users/123` retrieves headers for user with ID 123.

7. **OPTIONS**
   - Describes the communication options for the target resource.
   - Used for CORS preflight requests.
   - Example: `OPTIONS /users` retrieves supported methods for `/users`.

## HTTP Status Codes

HTTP status codes indicate the result of the client's request. They are grouped into five categories.

### 1xx Informational

- **100 Continue**: The server received the initial part of the request and the client should continue.
- **101 Switching Protocols**: The server is switching protocols as requested by the client.

### 2xx Success

- **200 OK**: The request was successful.
- **201 Created**: The request was successful and a new resource was created.
- **202 Accepted**: The request has been accepted for processing but is not yet complete.
- **204 No Content**: The request was successful but there is no content to send in the response.

### 3xx Redirection

- **301 Moved Permanently**: The resource has been moved to a new URL permanently.
- **302 Found**: The resource has been temporarily moved to a different URL.
- **304 Not Modified**: The resource has not been modified since the last request.

### 4xx Client Errors

- **400 Bad Request**: The server could not understand the request due to invalid syntax.
- **401 Unauthorized**: Authentication is required and has failed or not been provided.
- **403 Forbidden**: The server understood the request but refuses to authorize it.
- **404 Not Found**: The requested resource could not be found.
- **405 Method Not Allowed**: The request method is not supported for the requested resource.
- **409 Conflict**: The request could not be processed due to a conflict with the current state of the resource.
- **429 Too Many Requests**: The client has sent too many requests in a given amount of time.

### 5xx Server Errors

- **500 Internal Server Error**: The server encountered an unexpected condition.
- **501 Not Implemented**: The server does not support the functionality required to fulfill the request.
- **502 Bad Gateway**: The server received an invalid response from an upstream server.
- **503 Service Unavailable**: The server is currently unavailable (overloaded or down).
- **504 Gateway Timeout**: The server did not receive a timely response from an upstream server.
