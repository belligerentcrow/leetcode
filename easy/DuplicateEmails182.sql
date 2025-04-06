SELECT Email
FROM Person
GROUP BY Email
HAVING Count(*)>1