create table tb_andress (id int8 generated by default as identity, andress varchar(255), complement varchar(255), district varchar(255), number int4, client_id int8, primary key (id));
create table tb_client (id int8 generated by default as identity, name varchar(255), primary key (id));
create table tb_flavor (id int8 generated by default as identity, amount float8, name varchar(255), primary key (id));
create table tb_order (id int8 generated by default as identity, amount float8, client_id int8, primary key (id));
create table tb_order_flavor (id int8 generated by default as identity, flavor_id int8, order_id int8, primary key (id));
create table tb_telephone (id int8 generated by default as identity, telephone varchar(255), client_id int8, primary key (id));
create table tb_user (id int8 generated by default as identity, cpf varchar(255), client_id int8, primary key (id));
alter table if exists tb_andress add constraint FKgcbhi5ipx8df8wgx5msv8utes foreign key (client_id) references tb_client;
alter table if exists tb_order add constraint FK7c9of0p9ogx0w8sfrebt4n9kk foreign key (client_id) references tb_client;
alter table if exists tb_order_flavor add constraint FKet5bgnmgg35jkd2xnt5j2yxdi foreign key (flavor_id) references tb_flavor;
alter table if exists tb_order_flavor add constraint FKs1ts5qqh4udmahrw4hbsa3ipf foreign key (order_id) references tb_order;
alter table if exists tb_telephone add constraint FKce6f3wwx909ksr0dt9r7kh5h8 foreign key (client_id) references tb_client;
alter table if exists tb_user add constraint FKcl6t9w60u4gaith7cvjvkyo9 foreign key (client_id) references tb_client;
INSERT INTO tb_client(name) VALUES ('Jesse Orestes');
INSERT INTO tb_client(name) VALUES ('Isaque Rosa');
INSERT INTO tb_client(name) VALUES ('Nikollas Junior');
INSERT INTO tb_client(name) VALUES ('Maria Joaquina');
INSERT INTO tb_andress(client_id,andress,number,district,complement) VALUES (1, 'Rua Carlos Nobre', 746,'Santa Rita', 'fundos');
INSERT INTO tb_andress(client_id,andress,number,district,complement) VALUES (2, 'Rua Carlos Nobre', 746,'Santa Rita', 'Casa Azul');
INSERT INTO tb_andress(client_id,andress,number,district,complement) VALUES (3, 'Rua Salustiano Avalino Ribeiro', 746,'Colina', 'fundos');
INSERT INTO tb_andress(client_id,andress,number,district,complement) VALUES (4, 'Rua Macapa', 1410,'Santa Rita', 'casa amarela');
INSERT INTO tb_telephone(client_id, telephone) VALUES (1,'51995800353');
INSERT INTO tb_telephone(client_id, telephone) VALUES (2,'51995800354');
INSERT INTO tb_telephone(client_id, telephone) VALUES (3,'51995800352');
INSERT INTO tb_telephone(client_id, telephone) VALUES (4,'51995800351');
INSERT INTO tb_user(client_id, cpf) VALUES (1,'04644789045');
INSERT INTO tb_user(client_id, cpf) VALUES (2,'04444589045');
INSERT INTO tb_user(client_id, cpf) VALUES (3,'04844189045');
INSERT INTO tb_user(client_id, cpf) VALUES (4,'14344769045');
INSERT INTO tb_flavor(name, amount) VALUES ('Calabresa', 8);
INSERT INTO tb_flavor(name, amount) VALUES ('Frango', 8);
INSERT INTO tb_flavor(name, amount) VALUES ('Pizza', 12);
INSERT INTO tb_flavor(name, amount) VALUES ('Doce de Leite', 8);
INSERT INTO tb_order(client_id, amount) VALUES (1, 8);
INSERT INTO tb_order(client_id, amount) VALUES (2, 8);
INSERT INTO tb_order(client_id, amount) VALUES (3, 12);
INSERT INTO tb_order(client_id, amount) VALUES (4, 8);
INSERT INTO tb_order_flavor(flavor_id, order_id) VALUES (1, 1);
INSERT INTO tb_order_flavor(flavor_id, order_id) VALUES (2, 2);
INSERT INTO tb_order_flavor(flavor_id, order_id) VALUES (3, 3);
INSERT INTO tb_order_flavor(flavor_id, order_id) VALUES (4, 4);