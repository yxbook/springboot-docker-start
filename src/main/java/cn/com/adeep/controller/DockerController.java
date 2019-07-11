package cn.com.adeep.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述.
 *
 * @author yx
 * @version 1.0
 * @since 19-7-11下午5:08
 */
@RestController
public class DockerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    public String hello() {
        logger.info("接收到请求》》》》》》》》》》》》》》》》》》》》》》》");
        return "<h1>Hello Spring-Boot Maven Docker</h1>";
    }
}