package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editarcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/tablascroll.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/fontawesome-all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Cookie\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.11.1/css/lightbox.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Login-Form-Dark.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Pretty-Footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles-1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tablascroll.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\" data-whatever=\"@mdo\">Open modal for @mdo</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\" data-whatever=\"@fat\">Open modal for @fat</button>\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\" data-whatever=\"@getbootstrap\">Open modal for @getbootstrap</button>\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">New message</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <form>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"recipient-name\" class=\"col-form-label\">Recipient:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"recipient-name\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"message-text\" class=\"col-form-label\">Message:</label>\n");
      out.write("            <textarea class=\"form-control\" id=\"message-text\"></textarea>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Send message</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.11.1/js/lightbox-plus-jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/tablascroll.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
