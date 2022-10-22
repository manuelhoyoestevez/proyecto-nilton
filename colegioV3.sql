CREATE TABLE `asignaturas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT NULL,
  `fecha_actualizacion` datetime DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  `nombre` varchar(40) DEFAULT NULL, 
  `departamento` varchar(40) DEFAULT NULL,
  `coordinador` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `profesores` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT NULL,
  `fecha_actualizacion` datetime DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  `nombre` varchar(40) DEFAULT NULL, 
  `apellidos` varchar(40) DEFAULT NULL,
  `dni` varchar(9) NOT NULL UNIQUE,
  `fecha_nacimiento` datetime DEFAULT NULL,
  `jefe_de_departamento` bit(1) DEFAULT NULL, 
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `imparte` (
  `id_profesor` bigint(20) NOT NULL,
  `id_asignatura` bigint(20) NOT NULL,
  PRIMARY KEY (`id_Profesor`,`id_Asignatura`),
  CONSTRAINT `imparte_fk_profesor` FOREIGN KEY (`id_profesor`) REFERENCES profesores(id),
  CONSTRAINT `imparte_fk_asignatura` FOREIGN KEY (`id_asignatura`) REFERENCES asignaturas(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `coordina` (
  `id_profesor` bigint(20) NOT NULL,
  `id_asignatura` bigint(20) NOT NULL,
  PRIMARY KEY (`id_profesor`,`id_asignatura`),
  CONSTRAINT `coordina_fk_profesor` FOREIGN KEY (`id_profesor`) REFERENCES profesores(id),
  CONSTRAINT `coordina_fk_asignatura` FOREIGN KEY (`id_asignatura`) REFERENCES asignaturas(id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `alumnos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fecha_creacion` datetime DEFAULT NULL,
  `fecha_actualizacion` datetime DEFAULT NULL,
  `active` bit(1) DEFAULT NULL,
  `nombre` varchar(40) DEFAULT NULL, 
  `apellidos` varchar(40) DEFAULT NULL,
  `dni` varchar(9) NOT NULL UNIQUE,
  `fecha_nacimiento` datetime DEFAULT NULL,
  `nota_media_global`  bigint(20) DEFAULT NULL, 
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `matricula` (
  `id_alumno` bigint(20) NOT NULL,
  `id_asignatura` bigint(20) NOT NULL,
  PRIMARY KEY (`id_alumno`,`id_asignatura`),
  CONSTRAINT `matricula_fk_alumno` FOREIGN KEY (`id_alumno`) REFERENCES alumnos(id),
  CONSTRAINT `matricula_fk_asignatura` FOREIGN KEY (`id_asignatura`) REFERENCES asignaturas(id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

INSERT INTO asignaturas VALUES(1, CURRENT_TIMESTAMP, NULL, TRUE, 'Lengua','Comunicacion','Andrea');
INSERT INTO asignaturas VALUES(2, CURRENT_TIMESTAMP, NULL, TRUE, 'Calculo','Matematicas','Maria');
INSERT INTO asignaturas VALUES(3, CURRENT_TIMESTAMP, NULL, TRUE, 'Automatas','Informatica','Alex');
INSERT INTO asignaturas VALUES(4, CURRENT_TIMESTAMP, NULL, FALSE, 'Poo','Informatica','Alex');

INSERT INTO profesores VALUES(1, CURRENT_TIMESTAMP, NULL, TRUE, 'Alex','Montemayor','00112233A', '1980-01-01', TRUE);
INSERT INTO profesores VALUES(2, CURRENT_TIMESTAMP, NULL, TRUE, 'Maria','Garcia','22334455B', '1981-02-02', FALSE);
INSERT INTO profesores VALUES(3, CURRENT_TIMESTAMP, NULL, TRUE, 'Margarita','Robles','80245678C', '1982-03-03', FALSE);
INSERT INTO profesores VALUES(4, CURRENT_TIMESTAMP, NULL, TRUE, 'Andrea','Monterico','98635718D', '1983-04-04', FALSE);

INSERT INTO imparte VALUES(1, 2);
INSERT INTO imparte VALUES(1, 3);
INSERT INTO imparte VALUES(2, 2);
INSERT INTO imparte VALUES(3, 1);
INSERT INTO imparte VALUES(4, 3);

INSERT INTO alumnos VALUES(1, CURRENT_TIMESTAMP, NULL, TRUE, 'Walter','Carraza','11111111A', '1990-01-01', 8);
INSERT INTO alumnos VALUES(2, CURRENT_TIMESTAMP, NULL, TRUE, 'Luis','Osco','22222222B', '1991-02-02', 5);
INSERT INTO alumnos VALUES(3, CURRENT_TIMESTAMP, NULL, TRUE, 'Enrique','Sayan','33333333C', '1992-03-03', 4);
INSERT INTO alumnos VALUES(4, CURRENT_TIMESTAMP, NULL, TRUE, 'Kenny','Munguia','44444444D', '1993-04-04', 10);

INSERT INTO matricula VALUES(1, 4);
INSERT INTO matricula VALUES(1, 3);
INSERT INTO matricula VALUES(1, 2);
INSERT INTO matricula VALUES(2, 4);
INSERT INTO matricula VALUES(3, 1);
INSERT INTO matricula VALUES(4, 3);


