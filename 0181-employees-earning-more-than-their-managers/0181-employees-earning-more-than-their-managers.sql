SELECT emp.name AS Employee 
FROM Employee emp
JOIN Employee mgr 
  ON emp.managerID = mgr.id
WHERE emp.salary > mgr.salary;
