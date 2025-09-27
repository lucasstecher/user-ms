CREATE TYPE role as ENUM ('USER', 'ADMIN');

CREATE TABLE users (
    id uuid PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    role ROLE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    created_at TIMESTAMPTZ NOT NULL
);