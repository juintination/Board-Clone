# Board-Clone
Implementation of a clone of Board from the [book(코드로 배우는 스프링 부트 웹 프로젝트)](https://m.yes24.com/Goods/Detail/96051853) and the [Github(zk2840174/sboot_ch05)](https://github.com/zk2840174/sboot_ch05).

Additionally, membership features were implemented using Spring Security, based on the guidance provided in the [YouTube playlist by "개발자 유미" (스프링 시큐리티)](https://www.youtube.com/@xxxjjhhh/playlists).

This project uses the [Udacity Nanoderee Style](https://udacity.github.io/git-styleguide/) as a git commit message rule.

## Technical Stack

- Language
  - Java 17.0.10
  - HTML
- Framework
  - Spring boot 3.2.3
- Template Engine
  - Thymeleaf
- Database
  - MySQL
- ORM
  - JPA
  - querydsl
- Test
  - JUnit

## Run Application with docker

1. Git clone repository

```
git clone https://github.com/juintination/Board-Clone.git

cd Board-Clone/board
```

2. Build docker image

```
docker build -t board-image .
```

3. Run with docker enviornment

```
docker compose up -d
```

4. Remove docker environment

```
docker compose down
```
