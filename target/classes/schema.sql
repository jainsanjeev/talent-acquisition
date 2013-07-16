create schema talentacquisitiondb;

CREATE TABLE users (
    user_id INT NOT NULL IDENTITY,
    email VARCHAR(512) NOT NULL,
    password_digest VARCHAR(256) NOT NULL,
    name VARCHAR(255) NOT NULL,
    creation_date TIMESTAMP NOT NULL,
    last_updated_date TIMESTAMP NOT NULL,
    version INT NOT NULL,
 );