/*
 * This file is generated by jOOQ.
 */
package generated;


import generated.tables.Admin;
import generated.tables.Banner;
import generated.tables.Blog;
import generated.tables.BlogBg;
import generated.tables.User;
import generated.tables.records.AdminRecord;
import generated.tables.records.BannerRecord;
import generated.tables.records.BlogBgRecord;
import generated.tables.records.BlogRecord;
import generated.tables.records.UserRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>bysj</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AdminRecord, Long> IDENTITY_ADMIN = Identities0.IDENTITY_ADMIN;
    public static final Identity<BannerRecord, Long> IDENTITY_BANNER = Identities0.IDENTITY_BANNER;
    public static final Identity<BlogRecord, Long> IDENTITY_BLOG = Identities0.IDENTITY_BLOG;
    public static final Identity<BlogBgRecord, Long> IDENTITY_BLOG_BG = Identities0.IDENTITY_BLOG_BG;
    public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AdminRecord> KEY_ADMIN_PRIMARY = UniqueKeys0.KEY_ADMIN_PRIMARY;
    public static final UniqueKey<AdminRecord> KEY_ADMIN_ADMIN_ACCOUNT_UNIQUE = UniqueKeys0.KEY_ADMIN_ADMIN_ACCOUNT_UNIQUE;
    public static final UniqueKey<BannerRecord> KEY_BANNER_PRIMARY = UniqueKeys0.KEY_BANNER_PRIMARY;
    public static final UniqueKey<BlogRecord> KEY_BLOG_PRIMARY = UniqueKeys0.KEY_BLOG_PRIMARY;
    public static final UniqueKey<BlogBgRecord> KEY_BLOG_BG_PRIMARY = UniqueKeys0.KEY_BLOG_BG_PRIMARY;
    public static final UniqueKey<BlogBgRecord> KEY_BLOG_BG_BLOG_BG_TYPE_UNIQUE = UniqueKeys0.KEY_BLOG_BG_BLOG_BG_TYPE_UNIQUE;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_USER_EMAIL_UNIQUE = UniqueKeys0.KEY_USER_USER_EMAIL_UNIQUE;
    public static final UniqueKey<UserRecord> KEY_USER_USER_PHONE_UNIQUE = UniqueKeys0.KEY_USER_USER_PHONE_UNIQUE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AdminRecord, Long> IDENTITY_ADMIN = Internal.createIdentity(Admin.ADMIN, Admin.ADMIN.ID);
        public static Identity<BannerRecord, Long> IDENTITY_BANNER = Internal.createIdentity(Banner.BANNER, Banner.BANNER.ID);
        public static Identity<BlogRecord, Long> IDENTITY_BLOG = Internal.createIdentity(Blog.BLOG, Blog.BLOG.ID);
        public static Identity<BlogBgRecord, Long> IDENTITY_BLOG_BG = Internal.createIdentity(BlogBg.BLOG_BG, BlogBg.BLOG_BG.ID);
        public static Identity<UserRecord, Long> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AdminRecord> KEY_ADMIN_PRIMARY = Internal.createUniqueKey(Admin.ADMIN, "KEY_admin_PRIMARY", Admin.ADMIN.ID);
        public static final UniqueKey<AdminRecord> KEY_ADMIN_ADMIN_ACCOUNT_UNIQUE = Internal.createUniqueKey(Admin.ADMIN, "KEY_admin_admin_account_unique", Admin.ADMIN.ACCOUNT);
        public static final UniqueKey<BannerRecord> KEY_BANNER_PRIMARY = Internal.createUniqueKey(Banner.BANNER, "KEY_banner_PRIMARY", Banner.BANNER.ID);
        public static final UniqueKey<BlogRecord> KEY_BLOG_PRIMARY = Internal.createUniqueKey(Blog.BLOG, "KEY_blog_PRIMARY", Blog.BLOG.ID);
        public static final UniqueKey<BlogBgRecord> KEY_BLOG_BG_PRIMARY = Internal.createUniqueKey(BlogBg.BLOG_BG, "KEY_blog_bg_PRIMARY", BlogBg.BLOG_BG.ID);
        public static final UniqueKey<BlogBgRecord> KEY_BLOG_BG_BLOG_BG_TYPE_UNIQUE = Internal.createUniqueKey(BlogBg.BLOG_BG, "KEY_blog_bg_blog_bg_type_unique", BlogBg.BLOG_BG.TYPE);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRecord> KEY_USER_USER_EMAIL_UNIQUE = Internal.createUniqueKey(User.USER, "KEY_user_user_email_unique", User.USER.EMAIL);
        public static final UniqueKey<UserRecord> KEY_USER_USER_PHONE_UNIQUE = Internal.createUniqueKey(User.USER, "KEY_user_user_phone_unique", User.USER.PHONE);
    }
}
