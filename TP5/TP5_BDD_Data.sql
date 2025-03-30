INSERT INTO transaction (idTransaction, valTransaction) VALUES
('TXN001', 100),
('TXN002', 250.50),
('TXN003', 500),
('TXN004', 75.25);


UPDATE transaction SET valTransaction = 300.75 WHERE idTransaction = 'TXN002';


delete FROM transaction WHERE idTransaction = "TXN004";

ROLLBACK;
