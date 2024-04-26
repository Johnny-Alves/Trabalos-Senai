Exercicio-1
USE sakila;
SHOW TABLES;
SELECT * FROM film_list;


Exercicio-2
USE sakila;
SHOW TABLES;
SELECT title FROM film_list WHERE title LIKE "A%S";

Exercicio-3
USE sakila;
SHOW TABLES;
SELECT title FROM film_list ;

Exercicio-4
USE sakila;
SHOW TABLES;
SELECT title FROM film_list
WHERE length="60";

Exercicio-5 
USE sakila;
SHOW TABLES;
SELECT * FROM customer WHERE active="0";

Exercicio-6
USE sakila;
SHOW TABLES;
SELECT * FROM address;

Exercicio-7

Exercicio-8
USE sakila;
SELECT *
FROM actor
ORDER BY first_name ASC;

Exercicio-9
USE sakila;
SELECT  * 
FROM  actor
where actor_id > 5 and actor_id<= 25
ORDER BY actor_id;

Exercicio-10
USE sakila;
SELECT customer_id,first_name,email
FROM customer
ORDER BY customer_id ASC;

Exercicio-11
USE sakila;
SELECT * 
FROM film_list 
where category = "family";

Exercicio-12
USE sakila;
SELECT * 
FROM customer 
where customer_id < "5";

Exercico-13
USE sakila;
SELECT  first_name,  picture, username, password 
FROM staff;

Exercicio-14
USE sakila;
SELECT payment_id, rental_id, amount, payment_date 
FROM payment
WHERE payment_date <= "2005-05-31 00:00:00";

Exercicio-15
USE sakila;
SELECT name 
FROM category
WHERE  category_id = "7";

Exercicio-16
USE sakila;
SELECT first_name, last_name
FROM actor
WHERE  actor_id > 190 AND actor_id <> 199;

Exercicio-17
USE sakila;
SELECT title, length, rating
FROM film
WHERE  length > 50 AND length < 200;

Exercicio-18
USE sakila;
SELECT title, rating
FROM film
WHERE  rating <> "NC-17";

Exercicio-19
USE sakila;
SELECT first_name, last_name
FROM customer
WHERE firt_name = 'Mari' ;

Exercicio-20
USE sakila;
SELECT  name, address, 'zip code', phone,city ,country
FROM customer_list
WHERE country ='JAPAN' OR country='FRANCE' ;

Exercicio-21
USE sakila;
SELECT  customer_id, staff_id, rental_id, amount
FROM  payment
WHERE amount between 10.00 AND 15.00;

Exercicio-22
USE sakila;
SELECT   first_name, last_name, film_info  actor_info
FROM  actor_info
WHERE last_name IN("CAGE","WOOD", "GUINESS") ;