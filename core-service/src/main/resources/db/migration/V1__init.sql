create table comments
(
    id              bigserial primary key,
    comment_text    varchar(1000)
);

create table companies
(
    id              bigserial primary key,
    title           varchar(32),
    logo            varchar(16)
);

create table discounts
(
    id              bigserial primary key,
    amount          integer
);

create table products
(
    id              bigserial primary key,
    title           varchar(255),
    price           numeric(8, 2),
    remains         bigint,
    comment_id      bigint references comments(id),
    specifications  varchar(255),
    score           int,
    company_id      bigint references companies(id),
    discount_id     bigint references discounts(id),
    created_at      timestamp default current_timestamp,
    updated_at      timestamp default current_timestamp
);

insert into comments (comment_text)
values ('perfect'),
       ('good'),
       ('not bad');

insert into companies (title, logo)
values ('x5group', '5'),
       ('magnit', 'mag'),
       ('diksi', 'xXx');

insert into discounts (amount)
values (5),
       (10),
       (25);

insert into products (title, price, remains, comment_id, specifications, score, company_id, discount_id)
values ('bread', 40.50, 20, 1,'10x5x2', 5, 1, 1),
       ('milk', 80.70, 50, 2, '20x10x10', 5, 2, 2),
       ('choco', 100.20, 10, 3, '5x5x2', 4, 3, 3);


