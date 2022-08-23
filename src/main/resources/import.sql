INSERT INTO paciente (primernombre, segundonombre, primerapellido, segundoapellido, edad) VALUES ('josué','emanuel','dionicio','orellana',22);
INSERT INTO paciente (primernombre, segundonombre, primerapellido, segundoapellido, edad) VALUES ('luis','fernando','gomez','donis',24);
INSERT INTO paciente (primernombre, segundonombre, primerapellido, segundoapellido, edad) VALUES ('erineo','de','leon','campos',23);
INSERT INTO paciente (primernombre, segundonombre, primerapellido, segundoapellido, edad) VALUES ('carlos','emanuel','marroquin','ortega',19);
INSERT INTO paciente (primernombre, segundonombre, primerapellido, segundoapellido, edad) VALUES ('fernando','rolando','martinez','saravia',28);

INSERT INTO poliza (idpaciente, estado, inicio, fin) VALUES (1,'normal',NOW(),NOW());
INSERT INTO poliza (idpaciente, estado, inicio, fin) VALUES (2,'normal',NOW(),NOW());
INSERT INTO poliza (idpaciente, estado, inicio, fin) VALUES (3,'critico',NOW(),NOW());
INSERT INTO poliza (idpaciente, estado, inicio, fin) VALUES (4,'normal',NOW(),NOW());
INSERT INTO poliza (idpaciente, estado, inicio, fin) VALUES (5,'critico',NOW(),NOW());


INSERT INTO citas (fecha, hora, idpoliza, estado, observaciones) VALUES (NOW(),'19:49',1,'pendiente','weno');
INSERT INTO citas (fecha, hora, idpoliza, estado, observaciones) VALUES (NOW(),'19:49',2,'cancelado','fello');
INSERT INTO citas (fecha, hora, idpoliza, estado, observaciones) VALUES (NOW(),'19:49',3,'pendiente','aceptable');
