-- rollback.sql

TRUNCATE TABLE person_bank RESTART IDENTITY CASCADE ;
TRUNCATE TABLE person RESTART IDENTITY CASCADE ;
TRUNCATE TABLE bank RESTART IDENTITY CASCADE ;

INSERT INTO bank (id, name)
VALUES (1, 'Сбер'),
       (2, 'Тинькофф'),
       (3, 'Хоум Банк'),
       (4, 'ВТБ');
INSERT INTO person (id, full_name)
VALUES (1, 'Иванов Сидор Петрович'),
       (2, 'Сидоров Петр Иванович'),
       (3, 'Петров Иван Сидорович'),
       (4, 'Наличный Артем Андреевич');
INSERT INTO person_bank (person_id, bank_id)
VALUES (1, 1),
       (1, 3),
       (2, 2),
       (2, 3),
       (2, 4),
       (3, 1),
       (3, 4);
