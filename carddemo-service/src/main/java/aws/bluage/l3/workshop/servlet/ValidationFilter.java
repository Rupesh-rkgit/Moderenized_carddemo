package aws.bluage.l3.workshop.servlet;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * HTTP request filter.
 */
public class ValidationFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//NO-OP on purpose.
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(new ValidatingHttpRequest((HttpServletRequest) request), response);
	}

	@Override
	public void destroy() {
		//NO-OP on purpose.
	}

}
