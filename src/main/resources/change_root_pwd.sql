UPDATE mysql.user
SET authentication_string = PASSWORD('root'), password_expired = 'N'
WHERE User = 'root' AND Host = 'localhost';
FLUSH PRIVILEGES;