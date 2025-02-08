-- DDL
create table characters(
	id bigint primary key,
    name varchar(100) not null,
    body_type varchar(10) not null,
    clazz varchar(10) not null
);

CREATE TABLE attribute_points (
    id BIGINT PRIMARY KEY,
    level INT NOT NULL,
    vitality INT NOT NULL,
    endurance INT NOT NULL,
    strength INT NOT NULL,
    intelligence INT NOT NULL
);

create table items(
	id bigint primary key,
    name varchar(50) unique not null,
    type varchar(50) not null
);

create table item_actions(
	id bigint primary key,
    is_infinite bool not null,
    is_usable bool not null,
    is_drop bool not null,
    action varchar(255) not null
);

create table characters_items(
	character_id bigint not null,
	item_id bigint not null,
    quantity int not null
);

alter table attribute_points
add column character_id bigint unique not null,
add constraint attribute_points_character_id_fk foreign key (character_id) references characters(id);

alter table attribute_points
add constraint attribute_points_character_id_fk foreign key (character_id) references characters(id);

alter table item_actions
add column item_id bigint unique not null, 
add constraint foreign key (item_id) references items(id);

alter table item_actions
add constraint foreign key item_actions_item_id_fk (item_id) references items(id);

alter table uitem rename to items;

alter table characters_items
add constraint foreign key characters_items_character_id_fk (character_id) references characters(id),
add constraint foreign key characters_items_item_id_fk (item_id) references items(id);


alter table attribute_points
drop column vitality;

alter table attribute_points
add column vitality int not null after level;

alter table item_actions
drop foreign key item_actions_ibfk_1;

-- -------------------------------------------------------------------------------------------------
-- DML
insert into characters (name, body_type, clazz) 
values ("JUDITE", "FEMALE", "SORCERER");

delete from characters 
where id = 2;

insert into attribute_points (level, vitality, endurance, strength, intelligence, character_id)
values (20, 5, 5, 6, 4, 1);

insert into items (name, type) 
values ("Estus", "HEALING");

insert into item_actions (is_infinite, is_usable, is_drop, action, item_id)
values (0, 1, 0, "Cura", 1);

insert into characters_items (character_id, item_id, quantity)
values (1, 1, 5);

update item_actions
set action = "Cura 25%"
where id = 1;
-- -------------------------------------------------------------------------------------------------
-- DQL
select * from characters;

select * from attribute_points;

select * from items;

select * from item_actions;

select * from characters_items;


select characters.name, attribute_points.level, items.name, characters_items.quantity, item_actions.action from characters
inner join attribute_points on characters.id = attribute_points.character_id
inner join characters_items on characters.id = characters_items.character_id
inner join items on characters_items.item_id = items.id
inner join item_actions on items.id = item_actions.item_id