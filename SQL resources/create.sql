CREATE TABLE description (
  ID        int(10) NOT NULL AUTO_INCREMENT, 
  note      varchar(500) NOT NULL, 
  fk_pub_id int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE field_type (
  ID              int(10) NOT NULL AUTO_INCREMENT, 
  type            varchar(50) NOT NULL UNIQUE, 
  fk_pub_field_id int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE field_values (
  ID              int(10) NOT NULL AUTO_INCREMENT, 
  value           varchar(100) NOT NULL, 
  fk_pub_id       int(10) NOT NULL, 
  fk_pub_field_id int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE link (
  ID        int(10) NOT NULL AUTO_INCREMENT, 
  url       varchar(255) NOT NULL, 
  fk_pub_id int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE publication (
  ID             int(10) NOT NULL AUTO_INCREMENT, 
  title          varchar(100) NOT NULL, 
  release_date   date NOT NULL comment 'Describes release date of publication.', 
  fk_user_id     int(10) NOT NULL, 
  fk_pub_type_id int(10) NOT NULL, 
  accepted       varchar(3), 
  CONSTRAINT ID 
    PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE publication_field (
  ID             int(10) NOT NULL AUTO_INCREMENT, 
  name           varchar(20) NOT NULL, 
  fb_pub_type_id int(10) NOT NULL, 
  PRIMARY KEY (ID), 
  INDEX (name)) CHARACTER SET UTF8;
CREATE TABLE publication_type (
  ID        int(10) NOT NULL AUTO_INCREMENT, 
  type_name varchar(40) NOT NULL, 
  CONSTRAINT ID 
    PRIMARY KEY (ID), 
  UNIQUE INDEX (type_name)) CHARACTER SET UTF8;
CREATE TABLE reminder (
  ID        int(10) NOT NULL AUTO_INCREMENT, 
  `date`    date NOT NULL, 
  notices   varchar(255), 
  fk_pub_id int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE `user` (
  ID        int(10) NOT NULL AUTO_INCREMENT, 
  email     varchar(50) NOT NULL, 
  firstname varchar(40) NOT NULL, 
  lastname  varchar(40) NOT NULL, 
  password  varchar(30) NOT NULL, 
  admin     varchar(2), 
  phone     varchar(15), 
  PRIMARY KEY (ID), 
  UNIQUE INDEX (email)) CHARACTER SET UTF8;
ALTER TABLE reminder ADD INDEX FKreminder406504 (fk_pub_id), ADD CONSTRAINT FKreminder406504 FOREIGN KEY (fk_pub_id) REFERENCES publication (ID);
ALTER TABLE field_values ADD INDEX FKfield_valu710230 (fk_pub_field_id), ADD CONSTRAINT FKfield_valu710230 FOREIGN KEY (fk_pub_field_id) REFERENCES publication_field (ID);
ALTER TABLE publication_field ADD INDEX FKpublicatio445352 (fb_pub_type_id), ADD CONSTRAINT FKpublicatio445352 FOREIGN KEY (fb_pub_type_id) REFERENCES publication_type (ID);
ALTER TABLE publication ADD INDEX FKpublicatio138389 (fk_user_id), ADD CONSTRAINT FKpublicatio138389 FOREIGN KEY (fk_user_id) REFERENCES `user` (ID);
ALTER TABLE publication ADD INDEX FKpublicatio672461 (fk_pub_type_id), ADD CONSTRAINT FKpublicatio672461 FOREIGN KEY (fk_pub_type_id) REFERENCES publication_type (ID);
ALTER TABLE description ADD INDEX FKdescriptio620466 (fk_pub_id), ADD CONSTRAINT FKdescriptio620466 FOREIGN KEY (fk_pub_id) REFERENCES publication (ID);
ALTER TABLE link ADD INDEX FKlink481494 (fk_pub_id), ADD CONSTRAINT FKlink481494 FOREIGN KEY (fk_pub_id) REFERENCES publication (ID);
ALTER TABLE field_values ADD INDEX FKfield_valu147825 (fk_pub_id), ADD CONSTRAINT FKfield_valu147825 FOREIGN KEY (fk_pub_id) REFERENCES publication (ID);
ALTER TABLE field_type ADD INDEX FKfield_type504153 (fk_pub_field_id), ADD CONSTRAINT FKfield_type504153 FOREIGN KEY (fk_pub_field_id) REFERENCES publication_field (ID);
ALTER TABLE field_values ADD INDEX FKfield_valu710231 (fk_pub_field_id), ADD CONSTRAINT FKfield_valu710231 FOREIGN KEY (fk_pub_field_id) REFERENCES publication_field (ID);
ALTER TABLE reminder ADD INDEX FKreminder406505 (fk_pub_id), ADD CONSTRAINT FKreminder406505 FOREIGN KEY (fk_pub_id) REFERENCES publication (ID);
