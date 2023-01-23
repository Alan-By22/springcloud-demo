package cn.itcast.user.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @className: PatternProperties
 * @author: Mr.BingYu
 * @description:
 * @date: 2023/01/12 20:04
 **/

@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {

    private String dateformat;

    private String name;

    private int age;
}
