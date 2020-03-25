package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <title>sistemainternet</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/fontawesome-all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Cookie\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.11.1/css/lightbox.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Login-Form-Dark.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Pretty-Footer.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles-1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/tablascroll.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-light navbar-expand-md sticky-top\">\n");
      out.write("        <div class=\"container\"><a class=\"navbar-brand\" href=\"#\"><img src=\"img/logo.jpg\" id=\"logo\"><strong>J&amp;C Navarro</strong></a><button class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("            <div\n");
      out.write("                class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"#\">Ir a Sitio</a></li>\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"#\">Consultar</a></li>\n");
      out.write("                </ul>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div id=\"promo\">\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <h1 class=\"text-center\">Servicios de internet J&amp;C Navarro</h1>\n");
      out.write("            <p>J&amp;C Navarro ofrece servicios de instalacion de internet a Domicilio Con los mejores planes mensuales para su navegacion en los diferentes sitios Web, con un servicio 24/7 ilimitado. Ademas se ofrece servicio de instalacion de Sistemas\n");
      out.write("                Operativos, mantenimientos preventivos y correctivos de PC's y Laptop's&nbsp;</p>\n");
      out.write("            <p><a class=\"btn btn-primary active btn-lg\" role=\"button\" href=\"#\">Consulta de servicios</a></p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"dark-section\">\n");
      out.write("        <div class=\"container site-section\" id=\"why\">\n");
      out.write("            <h1>Encabezado</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 item\"><i class=\"fa fa-signal\"></i>\n");
      out.write("                    <h2>Encabezado</h2>\n");
      out.write("                    <p><br><strong>Lorem Ipsum</strong>&nbsp;es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona\n");
      out.write("                        que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos\n");
      out.write("                        electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por\n");
      out.write("                        ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.<br><br></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 item\"><i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                    <h2>Encabezado2</h2>\n");
      out.write("                    <p><br><strong>Lorem Ipsum</strong>&nbsp;es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona\n");
      out.write("                        que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos\n");
      out.write("                        electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por\n");
      out.write("                        ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.<br><br></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 item\"><i class=\"fa fa-film\"></i>\n");
      out.write("                    <h2>Encabezado3</h2>\n");
      out.write("                    <p><br><strong>Lorem Ipsum</strong>&nbsp;es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona\n");
      out.write("                        que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos\n");
      out.write("                        electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por\n");
      out.write("                        ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.<br><br></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container site-section\" id=\"welcome\">\n");
      out.write("            <h1>Gallery</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\"><a href=\"img/litebeam.jpg\" target=\"_blank\" data-lightbox=\"internet\"><img class=\"img-fluid\" src=\"assets/img/litebeam.jpg\"></a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\"><a href=\"img/access-point.jpg\" target=\"_blank\" data-lightbox=\"internet\"><img class=\"img-fluid\" src=\"assets/img/access-point.jpg\"></a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card\"><a href=\"img/kitwifi.jpg\" target=\"_blank\" data-lightbox=\"internet\"><img class=\"img-fluid\" src=\"assets/img/kitwifi.jpg\"></a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6 col-md-4 footer-navigation\">\n");
      out.write("                <h3><a href=\"#\">J&amp;C Navarro</a></h3>\n");
      out.write("                <p class=\"links\"><a href=\"#\">Inicio</a><strong> · </strong><a href=\"#\">Contactanos</a><strong> ·&nbsp;</strong></p>\n");
      out.write("                <p class=\"company-name\">Company Soto Solutions © 2020</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6 col-md-4 footer-contacts\">\n");
      out.write("                <div><span class=\"fa fa-map-marker footer-contacts-icon\"> </span>\n");
      out.write("                    <p><span class=\"new-line-span\">Av. Panamericana s/n Nomara</span> La Huaca, Paita</p>\n");
      out.write("                </div>\n");
      out.write("                <div><i class=\"fa fa-phone footer-contacts-icon\"></i>\n");
      out.write("                    <p class=\"footer-center-info email text-left\">+51 950234204</p>\n");
      out.write("                </div>\n");
      out.write("                <div><i class=\"fa fa-envelope footer-contacts-icon\"></i>\n");
      out.write("                    <p> <a href=\"#\" target=\"_blank\">jcnavarro@gamil.com</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"col-md-4 footer-about\">\n");
      out.write("                <h4>Acerca de nosotros</h4>\n");
      out.write("                <p>Somos una empresa con &nbsp;mucho tiempo en el rubro de la tecnologia, contamos con el mejor servicio de internet las 24 horas del dia.</p>\n");
      out.write("                <div class=\"social-links social-icons\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a><a href=\"#\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a><a href=\"#\"><i class=\"fa fa-github\"></i></a></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.11.1/js/lightbox-plus-jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/tablascroll.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
