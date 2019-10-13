package top.clarkrao.idserver.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: ClarkRao
 * @Date: 2019/10/13 23:03
 * @Description: 控制器返回实体状态
 */
@Getter
public enum ReturnStatus {
    SUCCESS(200,"成功");

    int code;
    String msg;

    ReturnStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
