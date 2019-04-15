//package com.mood.user.service;
//
//import com.mood.entity.user.User;
//
///**
// * 应用模块
// * @author chaiwei
// * @time 2018-01-07 下午08:00
// */
//public interface UserCacheService {
//
//	/**
//	 * fetch data by rule id
//	 *
//	 * @param key rule id
//	 * @return Result<XxxxDO>
//	 */
//	User get(String key);
//
//	/**
//	 * fetch data by rule id
//	 *
//	 * @param key rule id
//	 * @param member rule id
//	 * @param exp rule id
//	 * @return Result<XxxxDO>
//	 */
//	void set(String key, User member, int exp);
//
//	/**
//	 * fetch data by rule id
//	 *
//	 * @param key rule id
//	 * @return Result<XxxxDO>
//	 */
//	boolean exists(String key);
//
//	/**
//	 * fetch data by rule id
//	 *
//	 * @param key rule id
//	 * @return Result<XxxxDO>
//	 */
//	void del(String key);
//
//	/**
//	 * 获取用户手机验证码
//	 * @param phone 手机号
//	 * @return
//	 */
//	Integer getPhoneCode(String phone);
//
//	/**
//	 * 获取用户手机获取验证码的次数
//	 * @param phone 手机号
//	 * @return
//	 */
//	Integer getPhoneNum(final String phone);
//
//	/**
//	 * 获取手机验证创建时间
//	 * @param phone
//	 * @return
//	 */
//	Long getPhoneTime(final String phone);
//
//
//	/**
//	 * 添加用户手机验证码到redis
//	 * @param phone 手机号
//	 * @param phonecode
//	 */
//	void savePhoneCode(final String phone, final Integer phonecode);
//
//
//	/**
//	 * 手机验证码是否存在
//	 * @param phone
//	 * @return
//	 */
//	public boolean existsPhonceCode(final String phone);
//
//
//
//	/**
//	 * 手机验证码获取次数是否存在
//	 * @param phone
//	 * @return
//	 */
//	public boolean existsPhonceNum(final String phone);
//
//	/**
//	 * 手机验证码创建时间是否存在
//	 * @param phone
//	 * @return
//	 */
//	public boolean existsPhonceTime(final String phone);
//
//
//
//}
