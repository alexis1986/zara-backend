CREATE TABLE IF NOT EXISTS prices (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    brand_id INT,
    start_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    end_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    price_list INT NOT NULL,
    product_id INT,
    priority INT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    curr VARCHAR(3) NOT NULL
);