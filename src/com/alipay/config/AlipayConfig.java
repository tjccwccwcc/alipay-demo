package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000122693219";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDXnBC5ReU3A2zxAt4EDKlO8lMzSm1+TVG3Aa59zN4QMSIykUQThH7+0ZHZKqbTozCghUoTZxkSCe1Siu/jnodhpGW7eKWrcPHoeFe++oT3/4wCft9K16XNv6/dCXbLyPecCBpiad/N4jBb+9R+ggu18NW+H14qJ9cCV4JCiPNO8f39HGX/WfAnLYaZJZvqznjXGwgXCsNtT1nHNZK7RuvFBJPfzZt6U4Cw1zzbMviuObzEB7IPmzyb4EMb20mXMLEnRXn4bsNpvsaJqyPBpADQjH19QdJdd2mJKiEK1vOmP9bT2LYhXm6LID1wbgJM4PhEe824g9cEGOg8k0HqgwjpAgMBAAECggEBAKjIBBN1Er0hElwM2Y2j97nUWqsxHUuc7VXsnBLgmAlm3RVmwDrjIqMJnTm6eMP94KgYD2fm8io72SsfljDCPcqC7hx2koIFtWk9I7td009sHccqWFP3QlUxNFM9AGEAnkznzvexV8CMyzyGg87QsKgpsrjVR1qKu3aa2F6LZKQrvWmQqhpxBaIJPkxUItiudQL3RPgYJT9TSsErly7vzzaET53YkggNMZTI8h1ASxDRdlKHEbk+93wDafGrOY3V4iSqnjGKocIzrG56vYfpR0KZkniPjKrXhUaj3dGUGQmvaD8MRnDEDYKELop3ZqoVCReHUu06GcRMnddBK2XslYECgYEA9dvYM439phySGkrCybhlslFCWU69o7lF5AKbNlSuOPRpIhN1Bfs7ft4ijx9XhJhtijMCSYd0HEOHRGA0jp5PcnunyUB30vjrz9fqJVyuXuMJiYq2hRPhNWCo4f0eZSkCX8HlPolGZkIKPRTInrjcJOQMrK4HqqFmDL9HqpFCVLECgYEA4IDNxuTFz8MbSL/3IcC2JDE5qbiFvkRVfyWUxoEysB5gzUS3ywVK7TCPMIea9ixCg4idtzZE5I97c3FcImJEAt93xbSh1sNhfmaMn8Bi86YkFVrE9bOh6Nvg2MCOe7ApEkzx26M9Lmal5ELi2svDYahbefB6LCTfAgM4hrtKZbkCgYEAoxzwG4QgvIxIAlmHUf2cuulec5HiDzVkQRnZj/oufGrrNUhjY0yC9HC7zOimT7oxMncVFWNgjT/gBmUteVFetD2F2+eBl9691G8TUSZkKV/HfBEjdrbxu1Adu5ELEWJbyNwDE7JPmphF4rBfSa6rn24NWqM7QuFBq0NccLVepIECgYBxypeCkn55GkmADFz07LrliVXS4sZXdEdplODd5KqOfjdOk+ActWgO5SgOzw0KbdCg3uQh8w3kU52dG/45J1mVozMQMMg/FPUbnlr0tgzxtmpfsIxYhV4xqxFCjAcsRlPrBLkqPIlMNZcsJYLap6E2pKEJI4ypR18JpBxInjHNcQKBgA5rY+sOjaelwMb7JAJ4MD5JxpaakRxFqD82g9hnzZV1PKKFCMzisLTrvSEYmKnDBTzhFTtalS5JP1vlQmilMHC8zHr8RFi/tYK5ezXm8ikf76Y+rRTlA/LJwIPnL7IP4kl/oRP8G5QexIybn1nGJ0zrahSl4nduFGnWi9zsXu8v";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoCifh8h8MS/mMvwcnhCTaQlodwAwtmecQAlGa1rMx/7csH7HRwoaKKDtesMshLCcvrBAIedbji24hPm/vkT5dfkYTIurFSGijlT+3pjmG2YAncRp28KrzD/G5v+WDB9e9+frauErvhXSx5D4p4mTmIX/hIhw9pB46U7FdfffaODgQAa45EviKhE8SFtmBxSZRqN3Z4OPWQkC15OYrkb/jMSvWbM0iUH5HiBeLQNYIsq1B0RNQznCLN+7hXJgi68DSpwdhVewobecdG48lzXy1hVvw4bJg7YOmAw8KaAhXFiL8lnZiyOAkan7ZZom9jzWo2raz+IR6HlKLsRGcgmk5wIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://si2s2x.natappfree.cc/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://si2s2x.natappfree.cc/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关  alipaydev
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

