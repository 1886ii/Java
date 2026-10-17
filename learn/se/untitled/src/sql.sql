show databases;
drop database blog;
create database if not exists blog;

show collation;

use blog;
show tables;

drop table  user;
create table if not exists user (
    id int primary key auto_increment,
    username varchar(256),
    account varchar(256) not null,
    ip varchar(256)
    );

desc user;

insert into user(id, username, account, ip) value (null,'1','1','1');
insert into user(id, username, account, ip) value (null,2,2,'1');  # 支持隐式类型转换

select * from user;
select username name from user;
select username as name from user;

update user set username = '2' where id = 1;

delete from user where id = 1;

alter table user
    add email varchar(256) default '0' after ip,
    modify account char(25) not null ,
    drop username,
    rename column id to uid;

insert into user(username, account) values(null,1) ,(null,2), (null, 3);
select * from user where username <=> null;     # null = null  false   null <=> null true
select * from user where username = null;



select * from user;

insert into user value ('100zs', '100zs','1212',1);

select * from user where id = '1zs';

desc user;

select current_date,current_time, now();
select CURTIME(),CURDATE(), NOW();