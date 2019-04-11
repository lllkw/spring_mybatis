package com.lkw;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class HttpClient_Test {
    @Test
    public void httpClient_Test() throws IOException {
        String url = "http://www.baidu.com";

        //编码格式

        String charset = "UTF-8";

        //请求内容

        String content = "{username:'lkw',password:'123456'}";

        //使用帮助类HttpClients创建CloseableHttpClient对象.

        CloseableHttpClient client = HttpClients.createDefault();

        //HTTP请求类型创建HttpPost实例

        HttpPost post = new HttpPost(url);

        //使用addHeader方法添加请求头部,诸如User-Agent, Accept-Encoding等参数.

        post.setHeader("Content-Type", "application/json;charset=UTF-8");

        //组织数据
        StringEntity se = new StringEntity(content);

        //设置编码格式

        se.setContentEncoding(charset);

        //设置数据类型

        se.setContentType("application/json");

        //对于POST请求,把请求体填充进HttpPost实体.

        post.setEntity(se);

        //通过执行HttpPost请求获取CloseableHttpResponse实例 ,从此CloseableHttpResponse实例中获取状态码,错误信息,以及响应页面等等.

        CloseableHttpResponse response = client.execute(post);

        //通过HttpResponse接口的getEntity方法返回响应信息，并进行相应的处理 

        HttpEntity entity = response.getEntity();

        String resData = EntityUtils.toString(response.getEntity());

        //最后关闭HttpClient资源.

        client.close();

    }
}
