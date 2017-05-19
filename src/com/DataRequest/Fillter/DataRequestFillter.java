package com.DataRequest.Fillter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by vd on 2017/5/19.
 */
@WebFilter(filterName = "Filter")
public class DataRequestFillter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
       System.out.println("fdfd");
    }

}
