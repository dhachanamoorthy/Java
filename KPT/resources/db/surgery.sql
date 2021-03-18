
DROP TABLE IF EXISTS `surgery`;
CREATE TABLE `surgery` (
  `surgery_id` int NOT NULL AUTO_INCREMENT,
  `hospital_id` int NOT NULL,
  `tray_id` int NOT NULL,
  `surgery_date` date DEFAULT NULL,
  `surgery_created_date` date DEFAULT NULL,
  PRIMARY KEY (`surgery_id`),
  KEY `tray_id` (`tray_id`),
  KEY `hospital_id` (`hospital_id`),
  CONSTRAINT `surgery_ibfk_1` FOREIGN KEY (`tray_id`) REFERENCES `tray` (`tray_id`),
  CONSTRAINT `surgery_ibfk_2` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`hospital_id`)
);

