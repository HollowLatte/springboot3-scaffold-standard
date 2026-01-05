#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
package ${package}.infrastructure.config.threadpool;

import cn.hutool.core.thread.RejectPolicy;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "thread.pool.executor.config", ignoreInvalidFields = true)
public class ThreadPoolConfigProperties {

    /**
     * 核心线程数
     */
    private Integer corePoolSize;
    /**
     * 最大线程数
     */
    private Integer maxPoolSize;
    /**
     * 最大等待时间，单位秒
     */
    private Long keepAliveTime;
    /**
     * 最大队列数
     */
    private Integer blockQueueSize;
    /**
     * 拒接策略
     */
    private RejectPolicy rejectPolicy;
    /**
     * 线程名称前缀
     */
    private String threadNamePrefix;

}
