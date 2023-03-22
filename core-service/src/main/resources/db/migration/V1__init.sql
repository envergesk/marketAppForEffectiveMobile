create table comments
(
    id              bigserial primary key,
    comment_text    varchar(1000)
);

create table users
(

    id              bigserial primary key ,
    username        varchar(32),
    email           varchar(32),
    password        varchar(100),
    balance         numeric(8, 2),
    is_deprecated   boolean
);

create table hashtags
(
    id              bigserial primary key ,
    title           varchar(255)
);



create table companies
(
    id              bigserial primary key,
    title           varchar(32),
    logo            varchar(16),
    user_id         bigint references users(id)
);

create table discounts
(
    id              bigserial primary key,
    amount          integer,
    end_dt          timestamp default CURRENT_TIMESTAMP
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

create table products_hashtags
(
    product_id      bigint not null references products(id),
    hashtag_id      bigint not null references hashtags(id),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp,
    primary key (product_id, hashtag_id)
);

insert into users (username, email, password, balance, is_deprecated)
values ('Sergey', 'sergey@mail.ru', '100', 40000.00, false),
       ('Andrey', 'andrey@mail.ru', '100', 70000.00, false),
       ('Ivan', 'ivan@mail.ru', '100', 50000.00, false);

insert into comments (comment_text)
values ('perfect'),
       ('good'),
       ('not bad');

insert into companies (title, logo, user_id)
values ('x5group', '5', 1),
       ('magnit', 'mag', 2),
       ('diksi', 'xXx', 3);

insert into discounts (amount)
values (5),
       (10),
       (25);

insert into products (title, price, remains, comment_id, specifications, score, company_id, discount_id)
values ('bread', 40.50, 20, 1,'10x5x2', 5, 1, 1),
       ('milk', 80.70, 50, 2, '20x10x10', 5, 2, 2),
       ('choco', 100.20, 10, 3, '5x5x2', 4, 3, 3);



