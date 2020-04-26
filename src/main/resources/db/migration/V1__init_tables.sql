drop table if exists categories;

create table categories(
    id int primary key auto_increment,
    name varchar(100) not null,
    description varchar(100)
);

create table products(
    id int primary key auto_increment,
    description varchar(100) not null,
    price int not null,
    category_id int,
    foreign key (category_id) references categories (id)
);

