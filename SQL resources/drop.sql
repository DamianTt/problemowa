ALTER TABLE reminder DROP FOREIGN KEY FKreminder406504;
ALTER TABLE field_values DROP FOREIGN KEY FKfield_valu710230;
ALTER TABLE publication_field DROP FOREIGN KEY FKpublicatio445352;
ALTER TABLE publication DROP FOREIGN KEY FKpublicatio138389;
ALTER TABLE publication DROP FOREIGN KEY FKpublicatio672461;
ALTER TABLE description DROP FOREIGN KEY FKdescriptio620466;
ALTER TABLE link DROP FOREIGN KEY FKlink481494;
ALTER TABLE field_values DROP FOREIGN KEY FKfield_valu147825;
ALTER TABLE field_type DROP FOREIGN KEY FKfield_type504153;
ALTER TABLE field_values DROP FOREIGN KEY FKfield_valu710231;
ALTER TABLE reminder DROP FOREIGN KEY FKreminder406505;
DROP TABLE IF EXISTS description;
DROP TABLE IF EXISTS field_type;
DROP TABLE IF EXISTS field_values;
DROP TABLE IF EXISTS link;
DROP TABLE IF EXISTS publication;
DROP TABLE IF EXISTS publication_field;
DROP TABLE IF EXISTS publication_type;
DROP TABLE IF EXISTS reminder;
DROP TABLE IF EXISTS `user`;
