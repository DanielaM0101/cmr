
CREATE TABLE IF NOT EXISTS "user" (
                                      id SERIAL PRIMARY KEY,
                                      full_name VARCHAR(255) NOT NULL,
                                      age INT NOT NULL,
                                      diagnosis VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS "exercise_session" (
                                                 id SERIAL PRIMARY KEY,
                                                 user_id INT NOT NULL,
                                                 exercise_type VARCHAR(255) NOT NULL,
                                                 duration INT NOT NULL,
                                                 correct_answers INT NOT NULL,
                                                 date TIMESTAMP NOT NULL,
                                                 FOREIGN KEY (user_id) REFERENCES "user"(id) ON DELETE CASCADE
);