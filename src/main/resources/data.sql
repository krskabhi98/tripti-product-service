
-- Create products table
CREATE TABLE PRODUCT (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    PRODUCT_NAME VARCHAR(255) NOT NULL,
    PRODUCT_DESCRIPTION TEXT,
    PRODUCT_PRICE DECIMAL(10, 2) NOT NULL,
    PRODUCT_STOCK_QUANTITY INT NOT NULL

);





INSERT INTO PRODUCT (PRODUCT_NAME, PRODUCT_DESCRIPTION, PRODUCT_PRICE, PRODUCT_STOCK_QUANTITY ) VALUES
('Product 1', 'Description for product 1', 10.99, 100),
('Product 2', 'Description for product 2', 19.99, 150),
('Product 3', 'Description for product 3', 5.99, 200),
('Product 4', 'Description for product 4', 14.99, 50),
('Product 5', 'Description for product 5', 24.99, 75),
('Product 6', 'Description for product 6', 9.99, 120),
('Product 7', 'Description for product 7', 29.99, 60),
('Product 8', 'Description for product 8', 4.99, 300),
('Product 9', 'Description for product 9', 15.99, 90),
('Product 10', 'Description for product 10', 12.99, 110);
