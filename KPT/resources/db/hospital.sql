DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital` (
  `hospital_id` int NOT NULL AUTO_INCREMENT,
  `hospital_name` varchar(50) ,
  `location` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`hospital_id`)
);

INSERT INTO `hospital` VALUES (1000,'Fortis Malar Hospital','Chennai'),
                                (1001,'PSG Hospital','Coimbatore'),
                                (1002,'Rajaji Hospital','Madurai'),
                                (1003,'Cristian Medical College & Hospital','Vellore'),
                                (1004,'K.H Hospital','Kanchipuram'),
                                (1005,'Kumarasamy Hospital','Erode'),
                                (1006,'Sri Kumaran Hospital','Tirupur'),
                                (1007,'Kauvery Hospital','Salem'),
                                (1008,'Be Well Hospital Puducherry','Pondichery'),
                                (1009,'Meenakshi Multi Speciality Hospital','Thanjavore'),
                                (1010,'Narbhavi Hospital','Kanchipuram');


