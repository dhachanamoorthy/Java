
CREATE TABLE IF NOT EXISTS `tray` (
  `tray_id` int NOT NULL AUTO_INCREMENT,
  `rep_id` int NOT NULL,
  `charges_per_day` int DEFAULT NULL,
   PRIMARY KEY (`tray_id`),
   FOREIGN KEY (`rep_id`) REFERENCES `rep` (`rep_id`)
);
ALTER TABLE tray AUTO_INCREMENT=1000;
INSERT INTO `tray`(rep_id,charges_per_day) VALUES (101,5000),
                                                  (100,3000),
                                                  (102,4000),
                                                  (104,4000),
                                                  (103,4000),
                                                  (105,6000),
                                                  (107,7000),
                                                  (108,5500);
                            