package top.clarkrao.idserver.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: ClarkRao
 * @Date: 2019/10/13 22:12
 * @Description: 控制器返回结果实体
 */
@Data
@Builder
public class Result<T> {
    /**
     * 业务编码 业务编码和返回信息需在 ReturnStatus 枚举中定义
     * {@link top.clarkrao.idserver.entity.ReturnStatus}
     */
    private int code;

    /**
     * 返回信息 在 ReturnStatus 枚举中配合状态码定义
     * {@link top.clarkrao.idserver.entity.ReturnStatus}
     */
    private String msg;

    /**
     * 数据对象
     */
    private T data;

    /**
     * 是否成功
     */
    private boolean isSuccess;
}
