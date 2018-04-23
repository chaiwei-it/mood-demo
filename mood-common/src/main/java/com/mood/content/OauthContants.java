package com.mood.content;

/**
 * 应用模块
 * @author chaiwei
 * @time 2018-01-07 下午08:00
 */
public class OauthContants {

	public static final String CLIENTID = "123456";

	public static final String CLIENTKEY = "abcdef";

	// 令牌过期时间,单位秒
	public static final int EXPIRESIN = 604800;

	public static final String MEMBER_ID = "memberId";

	public static final String USERNAME = "username";

	//key为令牌，value为用户信息
	public static final String ACCESS_TOKEN = "otoken";

	//key为刷新令牌，value为用户信息
	public static final String REFRESH_TOKEN = "rtoken";

	//key为令牌，value为用户信息
	public static final String ACCESS_TOKEN_ID = "otokenid";

	//key为刷新令牌，value为用户信息
	public static final String REFRESH_TOKEN_ID = "rtokenid";

	//key值为用户id，value为用户令牌
	public static final String USER_ACCESS_TOKEN = "user.otoken.";

	//key为用户id，value为刷新令牌
	public static final String USER_REFRESH_TOKEN = "user.rtoken.";

	//用户错误登录信息,key为用户登录名，value为错误信息
	public static final String USER_ERROR_LOGIN="user.errorlogin.info.";
	

}
