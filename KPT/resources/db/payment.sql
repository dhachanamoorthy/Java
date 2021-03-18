drop table payment;
create table payment(
	payment_id int auto_increment ,
    hospital_id int,
    rep_id int,
     surgery_id int,
     tray_id int,
     event_id int,
     tray_check_in_time datetime,
     tray_check_out_time datetime,
     tray_used int,
     rep_payout int,
     kpt_commission int,
     payment_date datetime,
     primary key(payment_id),
     foreign key(hospital_id) references hospital(hospital_id),
     foreign key(rep_id) references rep(rep_id),
     foreign key(surgery_id) references surgery(surgery_id),
     foreign key(tray_id) references tray(tray_id)
);