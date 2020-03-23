CREATE TABLE `admin`
(
    `id`         BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
    `account`    VARCHAR(32)         NOT NULL COMMENT '账号',
    `password`   VARCHAR(64)         NOT NULL COMMENT '密码',
    `created_at` BIGINT(13) UNSIGNED NOT NULL DEFAULT 0 COMMENT '创建时间',
    `updated_at` BIGINT(13) UNSIGNED NOT NULL DEFAULT 0 COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `admin_account_unique` (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `user`
(
    `id`                BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
    `phone`             VARCHAR(32)         NOT NULL DEFAULT '' COMMENT '手机号',
    `password`          VARCHAR(64)         NOT NULL DEFAULT '' COMMENT '密码',
    `name`              VARCHAR(64)         NOT NULL DEFAULT '' COMMENT '昵称',
    `last_login_at`     BIGINT(13) UNSIGNED NOT NULL DEFAULT 0 COMMENT '最新登录时间',
    `created_at`        BIGINT(13) UNSIGNED NOT NULL DEFAULT 0 COMMENT '创建时间',
    `updated_at`        BIGINT(13) UNSIGNED NOT NULL DEFAULT 0 COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `user_phone_unique` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;