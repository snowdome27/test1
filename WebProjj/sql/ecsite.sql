set names utf-8;
set foreign_key_checks =0;

drop database if not exsits ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists lgin_user_transaction;

create table login_yser_transaction(
	id int not primary key auto_increment,
	login_id varchar(16),unique,
	login_pass varchar(16),
	user_name varchar(50),
	insert_date datetime,
	updateted_date datetime
	);

	drop table if exist user_buy_item_transaction;

	create table user_buy_item_transaction(
		id int not null primary key auto_increment,
		item_transaction_id int,
		total_price int,
		total_count int,
		user_master_id varchar(16),
		pay varchar(30),
		insert_date datetime,
		delete_date datetime
		);

		INSERT INTO item_into_transaction(login_name,item_price,item_stock) VALUES("ノートBook",100,50);
		INSERT INTO login_user_transaction(login_id,login_pass,user_name) VALUES("internou","internous01","test");

