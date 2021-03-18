

CREATE TABLE IF NOT EXISTS `rep` (
  `rep_id` int NOT NULL AUTO_INCREMENT,
  `rep_name` varchar(50),
  `location` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rep_id`)
);

INSERT INTO `rep` VALUES (100,'Shabareesh V S','Coimbatore'),
                        (101,'Rajesh Kumar R','Chennai'),
                        (102,'Ram','Madurai'),
                        (103,'Amal','Delhi'),
                        (104,'Moorthy','Pondichery'),
                        (105,'Sam','Madurai'),
                        (106,'Ramesh','Pollachi'),
                        (107,'Surya','Erode'),
                        (108,'Aravind','Salem'),
                        (109,'Dinesh','Kanchipuram'),
                        (110,'Bala','Coimbatore');
                      


