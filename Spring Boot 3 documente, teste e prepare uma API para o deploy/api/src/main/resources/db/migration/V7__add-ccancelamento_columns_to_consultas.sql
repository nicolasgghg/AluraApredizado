ALTER TABLE consultas
    ADD COLUMN cancelada TINYINT(1) DEFAULT 0 NOT NULL,
    ADD COLUMN motivo_cancelamento VARCHAR(255);
