-- Membuat table untuk transaction
CREATE TABLE transactions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    product_id VARCHAR(50),
    product_name VARCHAR(100),
    amount VARCHAR(50),
    customer_name VARCHAR(100),
    status INT,
    transaction_date DATETIME,
    create_by VARCHAR(100),
    create_on DATETIME
);

-- Membuat table untuk status
CREATE TABLE status_master (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

-- Insert untuk data status
INSERT INTO status_master (id, name) VALUES (0, 'SUCCESS');
INSERT INTO status_master (id, name) VALUES (1, 'FAILED');

-- Insert untuk data transaction
INSERT INTO transactions 
(id, product_id, product_name, amount, customer_name, status, transaction_date, create_by, create_on) 
VALUES
(1372, '10001', 'Test 1', '1000', 'abc', 0, '2022-07-10 11:14:52', 'abc', '2022-07-10 11:14:52'),
(1373, '10002', 'Test 2', '2000', 'abc', 0, '2022-07-11 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1374, '10001', 'Test 1', '1000', 'abc', 0, '2022-08-10 12:14:52', 'abc', '2022-07-10 12:14:52'),
(1375, '10002', 'Test 2', '1000', 'abc', 1, '2022-08-10 13:10:52', 'abc', '2022-07-10 13:10:52'),
(1376, '10001', 'Test 1', '1000', 'abc', 0, '2022-08-10 13:11:52', 'abc', '2022-07-10 13:11:52'),
(1377, '10002', 'Test 2', '2000', 'abc', 0, '2022-08-12 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1378, '10001', 'Test 1', '1000', 'abc', 0, '2022-08-12 14:11:52', 'abc', '2022-07-10 14:11:52'),
(1379, '10002', 'Test 2', '1000', 'abc', 1, '2022-09-13 11:14:52', 'abc', '2022-07-10 11:14:52'),
(1380, '10001', 'Test 1', '1000', 'abc', 0, '2022-09-13 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1381, '10002', 'Test 2', '2000', 'abc', 0, '2022-09-14 09:11:52', 'abc', '2022-07-10 09:11:52'),
(1382, '10001', 'Test 1', '1000', 'abc', 0, '2022-09-14 10:14:52', 'abc', '2022-07-10 10:14:52'),
(1383, '10002', 'Test 2', '1000', 'abc', 1, '2022-08-15 13:14:52', 'abc', '2022-07-10 13:14:52');