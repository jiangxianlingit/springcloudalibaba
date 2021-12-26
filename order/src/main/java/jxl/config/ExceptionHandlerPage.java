package jxl.config;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.aspectj.apache.bcel.classfile.Code;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常
 *
 * @author jiangxinlin
 * @create 2021-12-23-16:21
 */
@Component
public class ExceptionHandlerPage implements BlockExceptionHandler {
    ResponseData1 resData= null;
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, BlockException e) throws Exception {
        if (e instanceof FlowException) {
              resData = new ResponseData1(-1,"接口被限流了");
        } else if (e instanceof DegradeException) {
              resData = new ResponseData1(-2,"降级了");
        } else if (e instanceof ParamFlowException) {
              resData = new ResponseData1(-3,"热点参数限流");
        } else if (e instanceof SystemBlockException) {
              resData = new ResponseData1(-4,"系统规则（负载/...不满足要求）");
        } else if (e instanceof AuthorityException) {
              resData = new ResponseData1(-5,"授权规则不通过");
        }
//        response.setStatus(500);
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "application/json;charset=utf-8");
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(resData));

    }
}
@Data
class ResponseData1{
    public ResponseData1(){

    };
    public ResponseData1(int code,String meg){
        this.code = code;
        this.meg = meg;
    };

    private int code;
    private String meg;

}