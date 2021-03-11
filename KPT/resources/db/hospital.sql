DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital` (
  `hospital_id` int NOT NULL AUTO_INCREMENT,
  `location` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`hospital_id`)
);

INSERT INTO `hospital` VALUES (1000,'Chennai'),
                                (1001,'Coimbatore'),
                                (1002,'Madurai'),
                                (1003,'Vellore'),
                                (1004,'Kanchipuram'),
                                (1005,'Erode'),
                                (1006,'Tirupur'),
                                (1007,'Salem'),
                                (1008,'Pondichery'),
                                (1009,'Thanjavore'),
                                (1010,'Kanchipuram');

