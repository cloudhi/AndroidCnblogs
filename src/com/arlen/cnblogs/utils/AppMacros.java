package com.arlen.cnblogs.utils;

public class AppMacros {
	// �������
	public final static String AUTHOR_NAME = "Zhang Tingkuo";
	public final static String AUTHOR_EMAIL = "1757887521@qq.com";

	// �ʼ�(������Ϣ)
	public final static String MAIL_SERVER_HOST = "smtp.163.com";
	public final static String MAIL_SERVER_PORT = "25";
	public final static String MAIL_ACCUNT = "cnblogs@163.com";
	public final static String MAIL_PASSWORD = "Cnblogs.com";
	public final static String MAIL_SUBJECT = "Cnblogs������Ϣ(Android)";

	// ���ڸ�ʽ
	public final static String SIMPLE_DATA_FORMATE = "yyyy-MM-dd hh:mm:ss";

	// ��ʱͼƬ�ļ�
	public static final String TEMP_IMAGES_LOCATION = "ArlenCnblogs/images/";
	
	//��ҳ��С(���š����͡��û�������)
	public static final int PAGE_SIZE = 10;

	// ����
	// ���ͷ�ҳ��С
	public static final int BLOG_PAGE_SIZE = 20;
	// 48Сʱ�Ķ�����
	public static final String TOP_VIEW_POSTS_48_HOUR = "http://wcf.open.cnblogs.com/blog/48HoursTopViewPosts/{ITEMCOUNT}";
	// ��ҳ��ȡ�Ƽ������б�(����)
	public static final String RECOMMEND_BLOGS_PAGED = "http://wcf.open.cnblogs.com/blog/bloggers/recommend/{PAGEINDEX}/{PAGESIZE}";
	// ��ȡ�Ƽ���������
	public static final String RECOMMEND_BLOGS_COUNT = "http://wcf.open.cnblogs.com/blog/bloggers/recommend/count";
	// ������������������
	public static final String SEARCH_AUTHOR_BY_NAME = "http://wcf.open.cnblogs.com/blog/bloggers/search?t={TERM}";
	// ��ȡ��������
	public static final String BLOGS_COMMENTS = "http://wcf.open.cnblogs.com/blog/post/{POSTID}/comments/{PAGEINDEX}/{PAGESIZE}";
	// ��ȡ��������
	public static final String BLOGS_CONTENTS = "http://wcf.open.cnblogs.com/blog/post/body/{POSTID}";
	// ��ȡ��ҳ�����б�
	public static final String RECENT_BLOGS = "http://wcf.open.cnblogs.com/blog/sitehome/recent/{ITEMCOUNT}";
	// ��ҳ��ȡ��ҳ�����б�
	public static final String RECENT_BLOGS_PAGED = "http://wcf.open.cnblogs.com/blog/sitehome/paged/{PAGEINDEX}/{PAGESIZE}";
	// 10�����Ƽ�����
	public static final String TEN_DAYS_TOP_DIGG_POSTS = "http://wcf.open.cnblogs.com/blog/TenDaysTopDiggPosts/{ITEMCOUNT}";
	// ��ҳ��ȡ���˲��������б�
	public static final String USER_BLOGS_LIST_PAGED = "http://wcf.open.cnblogs.com/blog/u/{BLOGAPP}/posts/{PAGEINDEX}/{PAGESIZE}";

	// ����
	// ���ŷ�ҳ��С
	public static final int News_PAGE_SIZE = 30;
	// ��ȡ�����б�
	public static final String NEWS_LIST = "http://wcf.open.cnblogs.com/news/GetData";
	// ��ȡ���������б�
	public static final String HOT_NEWS_LIST = "http://wcf.open.cnblogs.com/news/hot/{ITEMCOUNT}";
	// ��ȡ��������
	public static final String NEWS_CONTENT = "http://wcf.open.cnblogs.com/news/item/{CONTENTID}";
	// ��ȡ��������
	public static final String NEWS_COMMENTS = "http://wcf.open.cnblogs.com/news/item/{CONTENTID}/comments/{PAGEINDEX}/{PAGESIZE}";
	// ��ȡ���������б�
	public static final String RECENT_NEWS = "http://wcf.open.cnblogs.com/news/recent/{ITEMCOUNT}";
	// ��ҳ��ȡ���������б�
	public static final String RECENT_NEWS_PAGED = "http://wcf.open.cnblogs.com/news/recent/paged/{PAGEINDEX}/{PAGESIZE}";
	// ��ҳ��ȡ�Ƽ������б�
	public static final String RECOMMEND_NEWS_PAGED = "http://wcf.open.cnblogs.com/news/recommend/paged/{PAGEINDEX}/{PAGESIZE}";

	// �Ƽ�����
	public static final int USER_PAGE_SIZE = 20;
	
	// ����
	public static final int COMMENT_PAGE_SIZE = 10;

	// ��¼ ...
	public static boolean FLAG_LOGIN = false;
	public static boolean FLAG_VISITOR = true;
	public static final String LOGIN_RUL = "http://passport.cnblogs.com/login.aspx";
	public static final String INDEX_RUL = "http://www.cnblogs.com/";
	public static final String MESSAGE_URL = "http://msg.cnblogs.com/msg/compose";

	// ���ݿ�
	public static final int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "cnblogs.db";

}
