package ${package}.config.database.mybatisplus;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.driver.api.yaml.YamlShardingSphereDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;


@Slf4j
@Configuration
public class ShardingJdbcConfig {

    // @Bean
    // public DataSource shardingJdbcDataSource() throws SQLException, IOException {
    //     String filePath = "sharding-jdbc/table-sharding.yaml";
    //     File file;
    //
    //     ClassPathResource classPathResource = new ClassPathResource(filePath);
    //     file = classPathResource.getFile();
    //
    //     DataSource dataSource = YamlShardingSphereDataSourceFactory.createDataSource(file);
    //     log.info("Create shardingJdbcDataSource success");
    //     return dataSource;
    // }
}
