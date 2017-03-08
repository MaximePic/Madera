INSERT INTO db_madera.ville (id,nom,code_postal) VALUES
('1','Bordeaux','33000'),
('2','Marseille','13000'),
('3','Paris','75000'),
('4','Nantes','44000'),
('5','Lyon','69000');

INSERT INTO db_madera.commercial (id,nom,prenom,numero_rue,nom_rue,portable,fixe,email,login,mot_passe,ville_id) VALUES
('1','Durant','Arthur','3','Rue Montaigne','0699887766','0556112233','arthur.durant@gmail.com','adurant','azerty','1'),
('2','Roux','Elise','57','Avenue Rochefort','0611223344','0456112233','elise.roux@gmail.com','croux','azerty','2'),
('3','Morin','Olivier','128','Rue Diderot','0712345678','0156112233','olivier.morin@gmail.com','omorin','azerty','3'),
('4','Dupont','Thomas','21','Avenue Descartes','0741526387','0256112233','thomas.dupont@gmail.com','tdupont','azerty','4'),
('5','Marin','Amélie','49','Rue Voltaire','0613647985','0456112233','amelie.marin@gmail.com','amarin','azerty','5');

INSERT INTO db_madera.client (id,nom,prenom,numero_rue,nom_rue,portable,fixe,email,date_creation,commercial_id,ville_id) VALUES
('1','Ilot','Mathilde','1','Rue Desproges','0601020304','0556112233','mathilde.ilot@gmail.com',NOW(),'1','5'),
('2','Pilou','Jean','200','Avenue Ravel','0799778866','0556112233','jean.pilou@gmail.com',NOW(),'2','4'),
('3','Mont','Pierre','77','Rue Mitterand','0646546545','0556112233','pierre.mont@gmail.com',NOW(),'3','3'),
('4','Guillot','Stéphanie','38','Avenue de l\'Intendant','0719283746','0556112233','stephanie.guillot@gmail.com',NOW(),'4','2'),
('5','Simier','Lisa','104','Rue De Sourdis','0633224466','0556112233','lisa.simier@gmail.com',NOW(),'5','1');

INSERT INTO db_madera.projet (id,nom,date_creation,commercial_id,client_id) VALUES
('1','Projet 1',NOW(),'1','1'),
('2','Projet 2',NOW(),'2','2'),
('3','Projet 3',NOW(),'3','3'),
('4','Projet 4',NOW(),'4','4'),
('5','Projet 5',NOW(),'5','5');