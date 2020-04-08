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
    `describe`      LONGTEXT                                   COMMENT '描述',
    `img`           TEXT                NOT NULL               COMMENT '图片',
    `blog_id`       BIGINT(13)          NOT NULL               COMMENT '博客Id',
    `created_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `updated_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `banner_blog_id_index` (`blog_id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

-- 博客
CREATE TABLE `blog`
(
    `id`            BIGINT(13)          NOT NULL AUTO_INCREMENT,
    `name`          TEXT                NOT NULL               COMMENT '博客名',
    `describe`      LONGTEXT                                   COMMENT '描述',
    `context`       LONGTEXT            NOT NULL               COMMENT '富文本内容',
    `type`          INT(1)              NOT NULL DEFAULT 1     COMMENT '博客类型 1-可回收 2-有害 3-干 4-湿 5-厨余 6-其它',
    `article_type`  INT(1)              NOT NULL DEFAULT 1     COMMENT '文章类型 1-新闻 2-教学 3-信息',
    `pv`            BIGINT(20)          NOT NULL DEFAULT 0     COMMENT '博客访问量',
    `created_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `updated_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

-- 博客背景图
CREATE TABLE `blog_bg`
(
    `id`            BIGINT(13)          NOT NULL AUTO_INCREMENT,
    `name`          VARCHAR(255)        NOT NULL               COMMENT '标题',
    `describe`      VARCHAR(255)                               COMMENT '描述',
    `img`           TEXT                NOT NULL               COMMENT '图片',
    `type`          INT(1)              NOT NULL DEFAULT 1     COMMENT '博客类型 1-可回收 2-有害 3-干 4-湿 5-厨余 6-其它',
    `created_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `updated_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `blog_bg_type_index` (`type`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

-- 分类资讯
CREATE TABLE `information`
(
    `id`            BIGINT(13)          NOT NULL AUTO_INCREMENT,
    `name`          VARCHAR(255)        NOT NULL               COMMENT '标题',
    `describe`      VARCHAR(255)                               COMMENT '描述',
    `img`           TEXT                NOT NULL               COMMENT '视频封面图',
    `video`         TEXT                NOT NULL               COMMENT '视频链接',
    `type`          INT(1)              NOT NULL DEFAULT 1     COMMENT '资讯类型 1-可回收 2-有害 3-干 4-湿 5-厨余 6-其它',
    `pv`            BIGINT(20)          NOT NULL DEFAULT 0     COMMENT '资讯访问量',
    `created_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `updated_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `information_type_index` (`type`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;

-- 问答帖子
CREATE TABLE `posts`
(
    `id`            BIGINT(13)          NOT NULL AUTO_INCREMENT,
    `name`          VARCHAR(255)        NOT NULL               COMMENT '标题',
    `describe`      VARCHAR(255)                               COMMENT '描述',
    `pv`            BIGINT(20)          NOT NULL DEFAULT 0     COMMENT '帖子评论数',
    `type`          INT(1)              NOT NULL DEFAULT 1     COMMENT '帖子状态 1-可评论 0-已完贴',
    `stick`         INT(1)              NOT NULL DEFAULT 0     COMMENT '置顶状态 0-否 1-是',
    `check`         INT(1)              NOT NULL DEFAULT 0     COMMENT '审核状态 0-拒绝 1-通过',
    `user_id`       BIGINT(13)          NOT NULL               COMMENT '用户Id',
    `created_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '创建时间',
    `updated_at`    DATETIME            NOT NULL DEFAULT NOW() COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY `posts_name_index` (`name`),
    KEY `posts_check_index` (`check`),
    KEY `posts_user_id_index` (`user_id`),
    KEY `posts_updated_at_index` (`updated_at`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;
