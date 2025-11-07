package ${package}.infrastructure.config.database.mybatisplus.handler;

import cn.hutool.core.lang.func.LambdaUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import ${package}.infrastructure.common.po.BasePO;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

public class DataObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByNameIfNull(LambdaUtil.getFieldName(BasePO::getCreateTime), new Date(), metaObject);
        this.setFieldValByNameIfNull(LambdaUtil.getFieldName(BasePO::getUpdateTime), new Date(), metaObject);
        this.setFieldValByName(LambdaUtil.getFieldName(BasePO::getDeleted), Boolean.FALSE, metaObject);
        this.setFieldValByName(LambdaUtil.getFieldName(BasePO::getLockVersion), 0, metaObject);
    }

    /**
     * 当没有值的时候再设置属性，如果有值则不设置。主要是方便单元测试
     *
     * @param fieldName
     * @param fieldVal
     * @param metaObject
     */
    private void setFieldValByNameIfNull(String fieldName, Object fieldVal, MetaObject metaObject) {
        if (metaObject.getValue(fieldName) == null) {
            this.setFieldValByName(fieldName, fieldVal, metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName(LambdaUtil.getFieldName(BasePO::getUpdateTime), new Date(), metaObject);
    }
}
