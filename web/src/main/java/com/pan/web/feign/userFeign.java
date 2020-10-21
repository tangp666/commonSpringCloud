package com.pan.web.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户信息feign请求
 * configuration: Feign配置类，可以自定义Feign的Encoder、Decoder、LogLevel、Contract
 * fallback: 定义容错的处理类，当调用远程接口失败或超时时，会调用对应接口的容错逻辑，fallback指定的类必须实现@FeignClient标记的接口
 * @author joy200300
 * @date 2020/10/21 17:04
 */
@FeignClient(value = "baseserver")
public interface userFeign {


}
