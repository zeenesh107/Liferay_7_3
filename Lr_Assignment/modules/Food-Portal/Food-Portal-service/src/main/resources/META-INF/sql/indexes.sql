create index IX_B515992F on FOOD_ItemRequest (groupId, status);
create index IX_782A49BB on FOOD_ItemRequest (userId);
create index IX_8B6C4635 on FOOD_ItemRequest (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_AC4AD5F7 on FOOD_ItemRequest (uuid_[$COLUMN_LENGTH:75$], groupId);