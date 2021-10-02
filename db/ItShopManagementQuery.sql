create database RiotComputer

create table branch
(
BranchNo int primary key,
Area varchar(50),
District varchar(50) default 'Dhaka',
Postcode varchar(50))

insert into branch values(10, 'Mohammadpur', 'Dhaka', '1204');
insert into branch values(20, 'Atibazar', 'Chittagong', '1302');
insert into branch values(30, 'Dhanmondi', 'Dhaka', '1402');
insert into branch values(40, 'Hair Street', 'Sylhet', '1203');


create table Employee
(
EmployeeID int primary key,
FirstName varchar(50),
LastName varchar(50),
Position varchar(50),
Gender varchar(10),
DateOfBirth date,
Salary money,
BranchNo int not null FOREIGN KEY REFERENCES branch (BranchNo));

select * from Employee where Salary between 1800 and 2750

insert into Employee values(7369, 'Rohomot', 'Khan', 'Assistant', 'M', '12/17/1989', 1800, 40);
insert into Employee values(7370, 'Khan', 'Tahmeed', 'Assistant', 'M', '02/20/1980', 11600, 30);
insert into Employee values(7371, 'Kamrun', 'Banu', 'Supervisor', 'F', '04/04/1976', 32850, 30);
insert into Employee values(7372, 'Mahmuda', 'Hasan', 'Assistant', 'F', '05/15/1995', 2750, 20);
insert into Employee values(7373, 'Hasan', 'Shahriar', 'Manager', 'M', '06/10/1996', 22200, 30);
insert into Employee values(7374, 'Kazi', 'Maruf', 'Manager', 'M', '02/22/2000', 22550, 40);
insert into Employee values(7375, 'Sakhina', 'Rashid', 'Assistant', 'F', '11/25/1999', 11400, 10);

SELECT (e.FirstName+' '+ e.LastName)as Name , (b.area + ', '+b.District+', '+b.Postcode) as WorkAddress
FROM employee e JOIN branch b
ON e.BranchNo = b.BranchNo
where e.EmployeeID=7369;

SELECT e.EmployeeID, (e.FirstName+' '+ e.LastName)as Name ,e.Position,e.Gender, e.Salary, e.BranchNo,DATEDIFF(year, e.DateOfBirth, CONVERT(VARCHAR(10),GETDATE(),111)) AS Age , (b.area + ', '+b.District+', '+b.Postcode) as WorkAddress
FROM employee e JOIN branch b
ON e.BranchNo = b.BranchNo
where e.Position='Assistant'
and e.Gender='m'
and (b.District like '%dhaka%');

SELECT e.EmployeeID, (e.FirstName+' '+ e.LastName)as Name ,e.Position,e.Gender, e.Salary, e.BranchNo,DATEDIFF(year, e.DateOfBirth, CONVERT(VARCHAR(10),GETDATE(),111)) AS Age , (b.area + ', '+b.District+', '+b.Postcode) as WorkAddress
FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo 
where e.Gender='M' 
AND (b.District LIKE '%z%' or b.Area LIKE '%dha%' or b.Postcode = '"+one.getText()+"' or b.BranchNo =234);



create table Owner
(
OwnerNo int primary key,
FirstName varchar(50),
LastName varchar(50),
ContactNo varchar(50));

insert into Owner values(1, 'Kazi', 'Hasan', '01912584349');
insert into Owner values(2, 'Kamran', 'Rashid', '01677515829');
insert into Owner values(3, 'Khan', 'Tahmeed', '01688370555');
insert into Owner values(4, 'Elon', 'Mask', '01551182170');
insert into Owner values(5, 'Chris', 'Evans', '01745698532');

create table users
(
ID int not null FOREIGN KEY REFERENCES Employee (EmployeeID),
username varchar(50),
password varchar(50) 
);
insert into users values(7369, 'Tonny', '122');
insert into users values(7370, 'Zahid', '136');



create table Product
(
productId int primary key identity(101,1),
productName varchar(50),
category varchar(50) default 'Components',
price int);

insert into Product values( 'Nvidia gtx 1050', 'Graphics Card', 15000);
insert into Product values('LG 21" wide monitor', 'Display', 8000);
insert into Product values('Intel corei3 11th gen', 'Processor', 10000);
insert into product values('Ryzen 4700u', 'Processor', 1203);


