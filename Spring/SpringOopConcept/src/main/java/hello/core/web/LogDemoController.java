package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

    private final LogDemoService logDemoService;
    private final ObjectProvider<MyLogger> myLoggerProvider; //주입시점을 뒤로 미룰수 있다.

    @SneakyThrows
    @RequestMapping("log-demo")
    @ResponseBody
    public String logDemo(HttpServletRequest request){
        String requestURL = request.getRequestURL().toString();
        MyLogger myLogger = myLoggerProvider.getObject(); // 내가 필요한 시점에 이렇게 불러올수 있다
        myLogger.setRequestURL(requestURL);

        Thread.sleep(1000);

        myLogger.log("controller test");
        logDemoService.logic("testId");

        return "OK";

    }
}
