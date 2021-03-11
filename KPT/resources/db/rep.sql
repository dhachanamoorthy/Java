

CREATE TABLE IF NOT EXISTS `rep` (
  `rep_id` int NOT NULL AUTO_INCREMENT,
  `location` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rep_id`)
);

INSERT INTO `rep` VALUES (100,'Coimbatore'),
                        (101,'Chennai'),
                        (102,'Madurai'),
                        (103,'Delhi'),
                        (104,'Pondichery'),
                        (105,'Madurai'),
                        (106,'Pollachi'),
                        (107,'Erode'),
                        (108,'Salem'),
                        (109,'Kanchipuram'),
                        (110,'Coimbatore');


