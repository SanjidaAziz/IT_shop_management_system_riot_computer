create database RiotComputer

create table users
(
ID int not null FOREIGN KEY REFERENCES Staff (StaffNo),
username varchar(50),
password varchar(50) 
);
insert into users values(7369, 'Tonny', '122');
insert into users values(7370, 'Zahid', '136');

create table branch
(
BranchNo int primary key,
Street varchar(50),
City varchar(50) default 'Dhaka',
Postcode varchar(50));



insert into branch values(10, 'Mohammadpur', 'Dhaka', '1204');
insert into branch values(20, 'Atibazar', 'Chittagong', '1302');
insert into branch values(30, 'Dhanmondi', 'Dhaka', '1402');
insert into branch values(40, 'Hair Street', 'Sylhet', '1203');


create table PrivateOwner
(
OwnerNo int primary key,
FirstName varchar(50),
LastName varchar(50),
ContactNo varchar(50));



insert into PrivateOwner values(1, 'Kazi', 'Hasan', '01912584349');
insert into PrivateOwner values(2, 'Kamran', 'Rashid', '01677515829');
insert into PrivateOwner values(3, 'Khan', 'Tahmeed', '01688370555');
insert into PrivateOwner values(4, 'Elon', 'Mask', '01551182170');
insert into PrivateOwner values(5, 'Chris', 'Evans', '01745698532');




create table Staff
(
StaffNo int primary key,
FirstName varchar(50),
LastName varchar(50),
Position varchar(50),
Sex varchar(10),
DateOfBirth date,
AnnualSalary money,
BranchNo int not null FOREIGN KEY REFERENCES branch (BranchNo));

insert into Staff values(7369, 'Rahim', 'Khan', 'Manager', 'M', '12/17/1989', 800, 40);
insert into Staff values(7370, 'Khan', 'Tahmeed', 'Assistant', 'M', '02/20/1980', 1600, 30);
insert into Staff values(7371, 'Karim', 'Rahman', 'Supervisor', 'F', '04/04/1976', 2850, 30);
insert into Staff values(7372, 'Kazi', 'Hasan', 'Assistant', 'M', '05/15/1995', 2750, 20);
insert into Staff values(7373, 'Hasan', 'Shahriar', 'Manager', 'M', '06/10/1996', 2200, 30);
insert into Staff values(7374, 'Kazi', 'Maruf', 'Assistant', 'F', '02/22/2000', 1250, 40);
insert into Staff values(7375, 'Kamran', 'Rashid', 'Assistant', 'F', '11/25/1999', 1400, 10);

create table Products
(
productId int primary key identity(101,1),
productName varchar(50),
category varchar(50) default 'Components',
price int);



insert into Products values( 'Nvidia gtx 1050', 'Graphics Card', 15000);
insert into Products values('LG 21" wide monitor', 'Display', 8000);
insert into Products values('Intel corei3 11th gen', 'Processor', 10000);
insert into products values('Ryzen 4700u', 'Processor', 1203);


