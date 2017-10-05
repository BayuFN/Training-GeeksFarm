--Membuat Database Transaksi
CREATE DATABASE Transaksi;

--Mengakses/menggunakan database Transaksi
USE Transaksi;

--Membuat tabel customer
CREATE TABLE customer(
    ID int NOT NULL,
    Name varchar(20) NOT NULL,
    Age int,
    Address varchar(100),
    Sallary int,
    PRIMARY KEY(ID));

--Membuat tabel orders
CREATE TABLE orders(
    ID int NOT NULL,
    Date date,
    Cust_ID int NOT NULL,
    Orders varchar(50),
    PRIMARY KEY(ID));

--Memasukan beberapa data pada tabel
--Tabel customer
INSERT INTO customer VALUES (1, 'Bayu', 22, 'Bandung', 3000), (2, 'Fajar', 22, 'Bandung', 2800),
							(3, 'Nugraha', 23, 'Kab. Bandung', 4000), (4, 'Suzy', 25, 'Seoul', 9000);
--Tabel orders
INSERT INTO orders VALUES (1, '2017-10-01', 1, 'Gunpla - Gundam Exia (MG)'), (2, '2017-10-01', 2, 'Gunpla - Gouf II (HG)'),
						  (3, '2017-10-03', 1, 'Gunpla - Gundam Qan[T] (PG)'), (4, '2017-10-03', 3, 'Gunpla - Gundam Astray Red Frame (MG)'),
						  (5, '2017-10-04', 4, 'Gunpla - BearGuy (HG)');

--Melihat data menggunakan SELECT
--Data customer dengan sallary <=4000
SELECT*FROM customer WHERE sallary <= 4000 ;

--Data customer yang beralamat di Bandung
SELECT*FROM customer WHERE address='Bandung';

--Melihat data orders menggunakan klausa BETWEEN berdasarkan date
SELECT * FROM `orders` WHERE date BETWEEN '2017-10-01' AND '2017-10-03';

--Melihat data customer yang namanya berawalan S
SELECT * FROM `customer` WHERE Name LIKE 'S%';
--Merubah address Fajar dari Bandung menjadi Cimahi
UPDATE customer SET address = 'Cimahi' WHERE Name = 'Fajar';

--Menghapus data
DELETE FROM orders WHERE ID = 1;

--INNER JOIN tabel customer dengan orders menggunakan klaus WHERE
SELECT c.ID, c.Name, o.Orders, o.Date FROM customer c INNER JOIN orders o ON c.ID = o.CUST_ID WHERE c.id = 1 ;

--LEFT JOIN tabel customer dengan orders
SELECT c.ID, c.Name, o.Orders, o.Date FROM customer c LEFT JOIN orders o ON c.ID = o.CUST_ID;

--RIGHT JOIN tabel customer dengan orders
SELECT c.ID, c.Name, o.Orders, o.Date FROM customer c RIGHT JOIN orders o ON c.ID = o.CUST_ID;

--FULL JOIN (UNION) tabel customer dengan orders
SELECT c.ID, c.Name, o.Orders, o.Date FROM customer c LEFT JOIN orders o ON c.ID = o.CUST_ID
UNION ALL
SELECT c.ID, c.Name, o.Orders, o.Date FROM customer c RIGHT JOIN orders o ON c.ID = o.CUST_ID;

--SELF JOIN tabel customer
SELECT c.ID, c.Name, c2.age, c.address, c2.sallary FROM customer c, customer c2;

--CARTESIAN/CROSS JOIN tabel customer dengan orders
SELECT c.ID, c.Name, c.age, c.address, o.Date, o.Orders FROM customer c, orders o;