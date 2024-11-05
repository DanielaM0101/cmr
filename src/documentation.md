
### User Endpoints

#### Get User by ID
- **URL:** `/api/users/{id}`
- **Method:** `GET`
- **Description:** Retrieves a user by their ID.
- **Parameters:**
    - `id` (path): The ID of the user.
- **Responses:**
    - `200 OK`: Successfully retrieved user.
    - `404 Not Found`: User not found.

#### Create a New User
- **URL:** `/api/users`
- **Method:** `POST`
- **Description:** Creates a new user.
- **Request Body:**
  ```json
  {
  "fullName": "string",
  "age": Int,
  "diagnosis": "String" 
    }

 
- **Responses:**
    - `200 OK`: Successfully created user.
    - `400 Bad Request`: Invalid input.

### Exercise Session Endpoints

#### Get Exercise Session by ID
- **URL:** `/api/sessions/{id}`
- **Method:** `GET`
- **Description:** Retrieves an exercise session by its ID.
- **Parameters:**
    - `id` (path): The ID of the exercise session.
- **Responses:**
    - `200 OK`: Successfully retrieved exercise session.
    - `404 Not Found`: Exercise session not found.

#### Create a New Exercise Session
- **URL:** `/api/sessions`
- **Method:** `POST`
- **Description:** Creates a new exercise session.
- **Request Body:**
  ```json
  {
    "userId": "long",
    "exerciseType": "string",
    "duration": "int",
    "correctAnswers": "string",
    "date": "string" 
  
  }
  ```
- **Responses:**
    - `200 OK`: Successfully created exercise session.
    - `400 Bad Request`: Invalid input.

