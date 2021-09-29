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




