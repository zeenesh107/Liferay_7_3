create table FOOD_ItemRequest (
	uuid_ VARCHAR(75) null,
	requestId LONG not null primary key,
	itemName VARCHAR(75) null,
	quantity INTEGER,
	metric VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);