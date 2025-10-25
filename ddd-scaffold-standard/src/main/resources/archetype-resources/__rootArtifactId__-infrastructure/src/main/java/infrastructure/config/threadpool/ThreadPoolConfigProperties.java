#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
package ${package}.infrastructure.config.threadpool;

import cn.hutool.core.thread.RejectPolicy;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.RejectedExecutionHandler;

@Data
@ConfigurationProperties(prefix = "thread.pool.executor.config", ignoreInvalidFields = true)
public class ThreadPoolConfigProperties {

    /**
     * 核心线程数
     */
    private Integer corePoolSize = 20;
    /**
     * 最大线程数
     */
    private Integer maxPoolSize = 200;
    /**
     * 最大等待时间
     */
    private Long keepAliveTime = 10L;
    /**
     * 最大队列数
     */
    private Integer blockQueueSize = 5000;
    /**
     * 拒接策略
     */
    private RejectPolicy rejectPolicy = RejectPolicy.ABORT;
    /**
     * 线程名称前缀
     */
    private String threadNamePrefix = "common-pool";

}
