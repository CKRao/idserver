package top.clarkrao.idserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.clarkrao.idserver.entity.Result;
import top.clarkrao.idserver.entity.ReturnStatus;

import java.util.HashMap;
import java.util.Map;

import static top.clarkrao.idserver.entity.ReturnStatus.SUCCESS;


/**
 * @Author: ClarkRao
 * @Date: 2019/10/13 21:57
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{test}")
    public Result test(@PathVariable("test") String testStr) {
        Map<String, String> data = new HashMap<>();
        data.put("testVal", null);
        return Result.builder()
                .code(SUCCESS.getCode())
                .data(data)
                .isSuccess(true)
                .msg(SUCCESS.getMsg())
                .build();
    }
}
