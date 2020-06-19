INSERT IGNORE INTO `admin` ( `id`, `name`, `account`, `password`, `updated_at`, `created_at`)
VALUES( 1, 'Liang', 'admin', '123456', NOW(), NOW());

INSERT IGNORE INTO `user` ( `id`, `email`, `phone`, `password`, `name`, `updated_at`, `created_at`)
VALUES( 1, '386229680@qq.com', '13018592726', '123456', 'ShaDiao', NOW(), NOW());