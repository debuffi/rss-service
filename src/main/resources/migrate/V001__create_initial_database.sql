CREATE TABLE items  (
  id             INT                AUTO_INCREMENT  PRIMARY KEY,
  guid           VARCHAR(250)       NOT NULL,
  author         VARCHAR(250)       NOT NULL,
  title          VARCHAR(250)       NOT NULL,
  link           VARCHAR(250)       NOT NULL,
  description    VARCHAR(1000)      NOT NULL,
  pubDate        TIMESTAMP          NOT NULL,
  enclosure_id   INT                NOT NULL,
  category       VARCHAR(250)       NOT NULL
);

CREATE TABLE enclosures  (
  id          INT                 AUTO_INCREMENT  PRIMARY KEY,
  url         VARCHAR(250)        NOT NULL,
  "type"      VARCHAR(250)        NOT NULL,
  "length"    INT                 NOT NULL
);