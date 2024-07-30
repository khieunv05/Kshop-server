INSERT INTO car (license_plate, repair_date, customer_name, catalogs, car_maker)
VALUES          ('29V-653.66','2003-11-16','Nguyễn Ngọc Minh Trang','Bảo dưỡng lần 1','Honda'),
                ('29H-158.40','2023-05-19','Lê Bảo Bình'           ,'Bảo dưỡng lần 8',"Vinfast"),
                ('29E-888.88','2019-04-07','Nguyễn Thị Thái Hà'    ,'Bảo dưỡng lần 2','Porsche'),
                ('11A-206.57','2022-07-21','Phạm Văn Hệ'           ,'Bảo dưỡng lần 3','Toyota'),
                ('14B-676.66','2018-03-29','Nguyễn Thị Hương'      ,'Bảo dưỡng lần 4','Audi'),
                ('20B-643.83','2006-05-29','Vũ Anh Đoán'           ,'Bảo dưỡng lần 6','Vinfast');

INSERT INTO accessory (license_plate, repair_date, name         , price  , status_damaged, repair_status)
VALUES                ('11A-206.57' ,'2022-07-21 ','Cần gạt mưa', 999000 , 'Bị gãy'       , 'Thay mới'),
                      ('14B-676.66' ,'2018-03-29 ','Lọc gió'    , 199000 , 'Bị bụi bẩn'   , 'Làm sạch'),
                      ('20B-643.83' ,'2006-05-29' ,'Lốp xe'     , 2000000, 'Bị thủng'     , 'Thay mới');