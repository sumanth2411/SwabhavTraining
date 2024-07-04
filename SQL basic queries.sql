use organization;
#1. Display all employee names in ascending order
SELECT EName FROM emp order by EName Asc ;

#2.Display all employee names, salary, commision of employees in dept 10
select EName,sal,com from emp where DeptNo=10;

#3. Display all employees(all columns) in department 20 and 30
SELECT * FROM emp where DeptNo=20 or DeptNo=30;

#4. Display all the employees who are managers
SELECT * FROM emp where Job="manager";

#5. Display all the employees whose salary is between 2000 and 5000
SELECT * FROM emp where SAL Between 2000 and 5000 ;

#6. Display all the employees whose commission is null
SELECT * FROM emp where COMM is null;

#7.Display employee name, salary, commission in descending order based on salary
SELECT EName,SAL,COMM  FROM emp order by SAL desc;

#8.Display average, max, min and sum of salaries of employees
Select min(SAL) as minimumsalary,max(SAL) as maximumsalary,avg(SAL) as averagesalary ,sum(SAL) as totalsalary  FROM emp;

#9. Display hire_date, current_date, tenure(calculated col) of the empl
SELECT HireDate,current_date(),concat(timestampdiff(year,HireDate,current_date()),' years ',(timestampdiff(month,HireDate,current_date()))%12,' months') as tenure from emp;
#9.1. Display hire_date, current_date, tenure(calculated col) of the employee in months
SELECT HireDate,current_date(),concat((timestampdiff(month,HireDate,current_date())),' months') as tenure from emp;

#10. Display all the employees whose name starts with s
SELECT * FROM emp where EName like "s%";

#11. Display unique department numbers from the employee table
SELECT DISTINCT DeptNo FROM emp;

#12. Display emp_name and job in lower case
SELECT lower(EName),lower(Job) FROM emp;

#13. Select top 3 salary earning employee
SELECT SAL FROM emp  order by SAL desc limit 3;

# 14.Select clerks and Managers in department 10
 SELECT EName,Job,DeptNo FROM emp where DeptNo=10 and (Job="CLERK" or  Job='MANAGER');

#15. Display all clerks in ascending order of deptno
SELECT * from emp where Job='clerk' order by DeptNo;

#16.Display all employees department wise
select e.EName,d.DName from emp e join department d on e.deptno=d.DeptNo order by d.DName;

#17. Display how many employees are there for each job
SELECT Job,count(Job) FROM emp group by Job;

#18.Display what jobs are there for each department and number of employees for each job
SELECT DeptNo,Job,count(*) as noofemployees FROM emp group by Job,DeptNo;

#19.Display how many employees are there for each department
SELECT DeptNo,count(DeptNo) FROM emp group by DeptNo;

#20.Display the rank of each employee with respect to their salary (highest salary will be rank 1)
select EName,SAL, rank() over (order by SAL desc) as rankings from emp;