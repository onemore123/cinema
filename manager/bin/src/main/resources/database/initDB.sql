DROP TABLE IF EXISTS customer CASCADE;
CREATE TABLE customer (
  id         SERIAL,
  email       TEXT,
  username      TEXT,

  PRIMARY KEY (id)
);

INSERT INTO public.cusotmer (
  id, title, author)
VALUES (1, 'customer@cinema.tld', 'customer');

CREATE SEQUENCE hibernate_sequence START 1;
SELECT setval('hibernate_sequence', (SELECT max(id) FROM public.customer));