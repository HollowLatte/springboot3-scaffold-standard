package ${package}.config.xxljob;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(XxlJobProperties.PREFIX)
public class XxlJobProperties {

    public static final String PREFIX = "xxl.job";

    /**
     * 是否开启
     */
    private Boolean enabled;

    /**
     * 控制器配置
     */
    private AdminProperties admin;
    /**
     * 执行器配置
     */
    private ExecutorProperties executor;

    /**
     * XXL-Job 调度器配置类
     */
    @Data
    public static class AdminProperties {
        /**
         * 调度器地址
         */
        private String addresses;
        /**
         * 访问令牌
         */
        private String accessToken;
        /**
         * 超时时间，秒
         */
        private int timeout = 3;
    }

    /**
     * XXL-Job 执行器配置类
     */
    @Data
    public static class ExecutorProperties {

        /**
         * 默认端口
         * 这里使用 -1 表示随机
         */
        private static final Integer PORT_DEFAULT = -1;

        /**
         * 默认日志保留天数
         * 如果想永久保留，则设置为 -1
         */
        private static final Integer LOG_RETENTION_DAYS_DEFAULT = 30;

        /**
         * 应用名
         */
        private String appName;
        /**
         * 执行器注册地址
         */
        private String address;
        /**
         * 执行器的 IP
         */
        private String ip;
        /**
         * 执行器的 Port
         */
        private int port = PORT_DEFAULT;
        /**
         * 日志地址
         */
        private String logPath;
        /**
         * 日志保留天数
         */
        private int logRetentionDays = LOG_RETENTION_DAYS_DEFAULT;
    }
}
