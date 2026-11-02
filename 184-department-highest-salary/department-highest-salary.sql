# Write your MySQL query statement below
select
d.name as Department,
e.name as Employee,
e.salary as Salary
From Employee e
INNER JOIN Department d
ON e.departmentId=d.id
where e.salary=(
    select MAX(e2.salary)
    from Employee e2
    where e2.departmentId=e.departmentId
)