-- 管理员
CREATE TABLE `admin`
(
    `id`         BIGINT(13)          NOT NULL AUTO_INCREMENT,
    `name`       VARCHAR(255)        NOT NULL COMMENT '姓名',
    `account`    VARCHAR(32)         NOT NULL COMMENT '账号',
    `password`   VARCHAR(64)         NOT NULL COMMENT '密码',
    `created_at` DATETIME            NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `updated_at` DATETIME            NOT NULL DEFAULT NOW() COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `admin_account_unique` (`account`),
    KEY `admin_name_index` (`name`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT '管理员';

-- 用户
CREATE TABLE `user`
(
    `id`            BIGINT(13)          NOT NULL AUTO_INCREMENT,
    `email`         VARCHAR(32)         NOT NULL DEFAULT ''      COMMENT '邮箱',
    `phone`         VARCHAR(32)         NOT NULL DEFAULT ''      COMMENT '手机号',
    `password`      VARCHAR(64)         NOT NULL DEFAULT ''      COMMENT '密码',
    `name`          VARCHAR(64)         NOT NULL DEFAULT ''      COMMENT '昵称',
    `last_login_at` DATETIME                                     COMMENT '最新登录时间',
    `created_at`    DATETIME            NOT NULL DEFAULT NOW()   COMMENT '创建时间',
    `updated_at`    DATETIME            NOT NULL DEFAULT NOW()   COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `user_email_unique` (`email`),
    UNIQUE KEY `user_phone_unique` (`phone`),
    KEY `user_name_index` (`name`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

-- 轮播图
CREATE TABLE `banner`
(
    `id`            BIGINT(13)          NOT NULL AUTO_INCREMENT,
    `name`          VARCHAR(255)        NOT NULL               COMMENT '标题',
    `describe`      VARCHAR(255)                                COMMENT '描述',
    `img`           VARCHAR(255)        NOT NULL               COMMENT '图片',
    `article_id`    BIGINT(13)          NOT NULL               COMMENT '文章Id',
    `created_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `updated_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `banner_article_id_index` (`article_id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;