create table tax_committee (
  id bigserial not null primary key,
  parent_id bigint default 1 references tax_committee(id),
  name varchar(255) not null
);

insert into tax_committee (id, parent_id, name)  values (1, null, 'object');