-- setup script for initial data
-- 5f4dcc3b5aa765d61d8327deb882cf99 = 'password'
insert into users(email, password_digest, name, creation_date, version, last_updated_date) VALUES ('vaishnav.durgesh@gmail.com', '5f4dcc3b5aa765d61d8327deb882cf99', 'Durgesh Vaishnav', now(), 0, now());
