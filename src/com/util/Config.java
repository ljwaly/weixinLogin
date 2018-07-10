package com.util;

import java.util.HashMap;
import java.util.Map;



public class Config {
	/**
	 * 会话ID
	 */
	public static String UID;
	/**
	 * 储存cookie容器
	 */
	public static Map<String,String> CONTAINER = new HashMap<String, String>();
	/**
	 * 储存初始化信�?
	 */

	/**
	 * 请求超时,或请求错�?:408
	 */
	public final static String OVERTIME = "408";
	/**
	 * 等待状�??:201
	 */
	public final static String WAIT = "201";
	/**
	 * 请求成功:200
	 */
	public final static String SUCCESS = "200";
	/**
	 * 请求失效:400
	 */
	public final static String INVALID = "400";
	
	/**
	 * 微信SELECTOR状�?�：0（无任何请求�?
	 */
	public final static String SELECTOR_ZERO = "0";
	/**
	 * 微信SELECTOR状�?�：2（接收或发�?�消息）
	 */
	public final static String SELECTOR_TWO = "2";
	/**
	 * 微信RETCODE状�?�：0（无消息�?
	 */
	public final static String RETCODE_ZERO = "0";
	/**
	 * 微信RETCODE状�?�：1100（已�?出）
	 */
	public final static String RETCODE_ESC = "1100";
	
	/**
	 * 获取会话ID地址(GET请求)
	 */
	public final static String GET_SID_URL = "https://login.weixin.qq.com/jslogin?appid=wx782c26e4c19acffb&redirect_uri=https%3A%2F%2Fwx.qq.com%2Fcgi-bin%2Fmmwebwx-bin%2Fwebwxnewloginpage&fun=new&lang=zh_CN&_={time}";
	/**
	 * 获取登录二维�?(GET请求)
	 */
	public final static String GET_QRCODE_URL = "https://login.weixin.qq.com/qrcode/{SID}";
	/**
	 * 监听微信登录(GET请求)
	 */
	public final static String MONITRO_LOGIN_URL = "https://login.weixin.qq.com/cgi-bin/mmwebwx-bin/login?loginicon=true&uuid={uuid}&tip=1&r=915670167&_={time}";
	/**
	 * 初始化微�?(POST请求)
	 */
	public final static String INIT_WEIXIN = "https://wx2.qq.com/cgi-bin/mmwebwx-bin/webwxinit?r={r}&lang=zh_CN&pass_ticket={pass_ticket}";
	/**
	 * 与手机进行同步�?�知
	 */
	public final static String PHONE_SYNC = "https://wx2.qq.com/cgi-bin/mmwebwx-bin/webwxstatusnotify?lang=zh_CN&pass_ticket={pass_ticket}";
	/**
	 * 微信状�?��?�知(GET请求)
	 */
	public final static String MOINTRO_STATE_URL = "https://webpush2.weixin.qq.com/cgi-bin/mmwebwx-bin/synccheck?r={r}&skey={skey}&sid={sid}&uin={uin}&deviceid={deviceid}&synckey={synckey}&_={_}";
	/**
	 * 更新参数(POST)请求
	 */
	public final static String UPDATE_PARAM_URL = "https://wx2.qq.com/cgi-bin/mmwebwx-bin/webwxsync?sid={sid}&skey={skey}&lang=zh_CN&pass_ticket={pass_ticket}";
	/**
	 * 发�?�消息接�?(POST请求)
	 */
	public final static String SEND_MESSAGE_URL = "https://wx2.qq.com/cgi-bin/mmwebwx-bin/webwxsendmsg?lang=zh_CN&pass_ticket={pass_ticket}";
}
