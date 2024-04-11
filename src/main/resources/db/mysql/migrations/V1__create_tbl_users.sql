CREATE TABLE if not exists tbl_users(
    user_id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    user_name VARCHAR(50) NOT NULL,
    PRIMARY KEY (user_id)
);