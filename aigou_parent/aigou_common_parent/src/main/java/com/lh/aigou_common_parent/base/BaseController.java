package com.lh.aigou_common_parent.base;

import com.lh.aigou_common_parent.bean.ResponseBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lzl
 * @date 2018/4/10
 */
@Slf4j
public abstract class BaseController {

    @Autowired
    private HttpServletRequest request;


    /**
     * 成功了 --- 多用于 post 请求进行数据的修改
     */
    protected <T> ResponseBean<T> success() {
        return new ResponseBean<>(null);
    }

    /**
     * 成功了 --- 多用于 post 请求进行数据的修改
     */
    protected <T> ResponseBean<T> successMsg(String msg) {
        return new ResponseBean<>(msg, null);
    }

    /**
     * 成功了反回数据 --- 多用于 get 请求获取属于
     */
    protected <T> ResponseBean<T> successData(T data) {
        return new ResponseBean<>(data);
    }

    /**
     * 成功了 --- 多用于 post 请求进行数据的修改
     */
    protected <T> ResponseBean<T> successMsgData(String msg, T data) {
        return new ResponseBean<>(msg, data);
    }

    /**
     * 失败了返回失败消息 --- 多用于 post 请求进行数据的修改
     */
    protected <T> ResponseBean<T> failedMsg(String msg) {
        return new ResponseBean<>(200, msg, null);
    }

    /**
     * 失败了返回失败消息 --- 多用于 post 请求进行数据的修改
     */
    protected <T> ResponseBean<T> failedMsgs(List<String> msg) {
        String str = msg.stream().collect(Collectors.joining("\n"));
        return new ResponseBean<>(200, str, null);
    }

    /**
     * 失败了返回失败消息 --- 多用于 post 请求进行数据的修改
     */
    protected <T> ResponseBean<T> failedMsgData(String msg, T data) {
        return new ResponseBean<>(200, msg, data);
    }
}
