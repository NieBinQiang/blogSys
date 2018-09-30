package com.nbq.blog.apiserver.config;

import com.nbq.blog.apiserver.entity.Response;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalErrorController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @RequestMapping(value = ERROR_PATH)
    public Response handleError() {
        return Response.failBy404();
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

}
