--Create tables prices, brands, products

CREATE TABLE prices
(
    id         INT PRIMARY KEY,
    brand_id   INT,
    product_id INT,
    price      DECIMAL(10, 2),
    curr       VARCHAR(10),
    priority   INT,
    start_date TIMESTAMP,
    end_date   TIMESTAMP
);

CREATE TABLE brands
(
    id    INT PRIMARY KEY,
    name  VARCHAR(50),
    email VARCHAR(50)
);

CREATE TABLE products
(
    id   INT PRIMARY KEY,
    name VARCHAR(50)
);
ALTER TABLE prices
    ADD CONSTRAINT fk_id_brand FOREIGN KEY (brand_id) REFERENCES brands (id);
ALTER TABLE prices
    ADD CONSTRAINT fk_id_product FOREIGN KEY (product_id) REFERENCES products (id);

--Insert tables prices, brands, products

INSERT INTO brands (id, name, email)
VALUES (1, 'ZARA', 'info@ZARA.com');
INSERT INTO products (id, name)
VALUES (35455, 'Shirt');
INSERT INTO products (id, name)
VALUES (35456, 'Pants');
INSERT INTO prices (id, brand_id, product_id, price, curr, priority, start_date, end_date)
VALUES (1, 1, 35455, 35.50, 'EUR', 0, '2020-06-14 00:00:00', '2020-12-31 23:59:59');
INSERT INTO prices (id, brand_id, product_id, price, curr, priority, start_date, end_date)
VALUES (2, 1, 35455, 25.45, 'EUR', 1, '2020-06-14 15:00:00', '2020-06-14 18:30:00');
INSERT INTO prices (id, brand_id, product_id, price, curr, priority, start_date, end_date)
VALUES (3, 1, 35455, 30.50, 'EUR', 1, '2020-06-15 00:00:00', '2020-06-15 11:00:00');
INSERT INTO prices (id, brand_id, product_id, price, curr, priority, start_date, end_date)
VALUES (4, 1, 35455, 38.95, 'EUR', 1, '2020-06-15 16:00:00', '2020-12-31 23:59:59');

