CREATE TABLE contact (
  	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	id_person BIGINT NOT NULL,
	name VARCHAR(50) NOT NULL,
	email VARCHAR(100) NOT NULL,
	phone VARCHAR(20) NOT NULL,
  FOREIGN KEY (id_person) REFERENCES person(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

insert into contact (id, id_person, name, email, phone) values (1, 1, 'Marcos Henrique', 'marcos@single-app.com', '00 0000-0000');
