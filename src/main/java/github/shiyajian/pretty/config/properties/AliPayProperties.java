package github.shiyajian.pretty.config.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shiyajian
 * create: 2019-04-10
 */
@Component
@Data
public class AliPayProperties {

    /**
     * 支付宝商户id
     */
    @Value("shiyajian.properties.ali.mrchId")
    private String mrchId;
}
