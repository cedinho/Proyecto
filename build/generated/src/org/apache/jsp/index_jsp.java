package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/top.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/bottom.jspf");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"global\">\n");
      out.write("<head>\n");
      out.write("\t<title>WEB-GIMNACIO</title>\n");
      out.write("\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"  href=\"bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\"  href=\"bootstrap/dist/css/bootstrap-theme.min.css\">\n");
      out.write("  \n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("\t\t<div class=\"cabecera\" >\n");
      out.write("\t\t\t<img src=\"recursos/img/gym_01.png\" width=\"50\" height=\"50\" >\n");
      out.write("\t\t\tGIMNACIO GENARUS GYM \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("\t\t        <div class=\"container\" style=\"width: auto;\">\n");
      out.write("\t\t          <div class=\"navbar-header\">\n");
      out.write("\t\t            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("\t\t              <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t              <span class=\"icon-bar\"></span>\n");
      out.write("\t\t              <span class=\"icon-bar\"></span>\n");
      out.write("\t\t              <span class=\"icon-bar\"></span>\n");
      out.write("\t\t            </button>\n");
      out.write("\t\t           \n");
      out.write("\t\t          </div>\n");
      out.write("\t\t          <div class=\"navbar-collapse collapse\">\n");
      out.write("\t\t            <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t              <li class=\"active\"><a href=\"prueba2.jsp\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t              \tMenu</a></li>\n");
      out.write("\t\t              <li><a href=\"#about\">Clientes</a></li>\n");
      out.write("\t\t              <li><a href=\"#about\">Proveedores</a></li>\n");
      out.write("\t\t              \n");
      out.write("\t\t              <li class=\"dropdown\">\n");
      out.write("\t\t                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Reporte <span class=\"caret\"></span></a>\n");
      out.write("\t\t                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t                  <li><a href=\"#\">Reporte diario</a></li>\n");
      out.write("\t\t                  <li><a href=\"#\">Reporte semanal</a></li>\n");
      out.write("\t\t                  <li><a href=\"#\">Reporte mensual</a></li>\n");
      out.write("\t\t                  <li class=\"divider\"></li>\n");
      out.write("\t\t                  <li class=\"dropdown-header\">Pago personal</li>\n");
      out.write("\t\t                  <li><a href=\"#\">Pago mosos</a></li>\n");
      out.write("\t\t                  <li><a href=\"reporte.jsp\">Pago cocineros</a></li>\n");
      out.write("\t\t                </ul>\n");
      out.write("\t\t              </li>\n");
      out.write("\t\t              <li><a href=\"#contact\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t              \tCerrar sesion</a></li>\n");
      out.write("\t\t            </ul>\n");
      out.write("\t\t          </div><!--/.nav-collapse -->\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t      </nav>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</header>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <article class=\"cuerpo1\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row marketing\">\r\n");
      out.write("            <div class=\"col-lg-6\">\r\n");
      out.write("                <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                    <!-- Indicators -->\r\n");
      out.write("                    <ol class=\"carousel-indicators\">\r\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Wrapper for slides -->\r\n");
      out.write("                    <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                        <div class=\"item active\">\r\n");
      out.write("                            <img src=\"recursos/img/descarga.jpg\" alt=\"UPEU\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"item\">\r\n");
      out.write("                            <img src=\"recursos/img/images 1.jpg\" alt=\"UPEU\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"item\">\r\n");
      out.write("                            <img src=\"recursos/img/images 2.jpg\" alt=\"UPEU\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Left and right controls -->\r\n");
      out.write("                    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("                        <span class=\"sr-only\">Next</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h4 class=\"titulo1\">Bienvenido al Gimnacio</h4>\r\n");
      out.write("                <p>Desde esta pÃ¡gina web podras realizar todas las gestiones que antes no podÃ­as.\r\n");
      out.write("                    Si no estas registrado todavÃ­a, registrate y disfruta de lo servicios que te ofrece la pÃ¡gina</p>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"container user\">\r\n");
      out.write("\r\n");
      out.write("                        <form class=\"form-inline\" role=\"form\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <h2 class=\"form-signin-heading\">Ingresa aqui</h2>\r\n");
      out.write("                                <label class=\"sr-only\" for=\"ejemplo_email_2\">Email</label>\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"ejemplo_email_2\"\r\n");
      out.write("                                       placeholder=\"Introduce tu email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"sr-only\" for=\"ejemplo_password_2\">ContraseÃ±a</label>\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"ejemplo_password_2\" \r\n");
      out.write("                                       placeholder=\"ContraseÃ±a\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"checkbox\">\r\n");
      out.write("                                <label>\r\n");
      out.write("                                    <input type=\"checkbox\"> No cerrar sesiÃ³n\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-default\">Entrar</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-6\">\r\n");
      out.write("                <div class=\"container \">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"table\" >\r\n");
      out.write("                        <table >\r\n");
      out.write("\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <form role=\"form\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <h2 class=\"form-signin-heading\">Registrate</h2>\r\n");
      out.write("                                                <label for=\"ejemplo_email_1\">Nombre</label>\r\n");
      out.write("                                                <input type=\"nombre\" class=\"form-control\" id=\"ejemplo_nombre_1\"\r\n");
      out.write("                                                       placeholder=\"Introduce tu nombre\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"ejemplo_password_1\">Apellido</label>\r\n");
      out.write("                                                <input type=\"Apellido\" class=\"form-control\" id=\"ejemplo_apellido_1\" \r\n");
      out.write("                                                       placeholder=\"Apellido\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"ejemplo_password_1\">DNI</label>\r\n");
      out.write("                                                <input type=\"DNI\" class=\"form-control\" id=\"ejemplo_DNI_1\" \r\n");
      out.write("                                                       placeholder=\"DNI\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"ejemplo_password_1\">ContraseÃ±a</label>\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"ejemplo_password_1\" \r\n");
      out.write("                                                       placeholder=\"ContraseÃ±a\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label for=\"ejemplo_password_1\">Escribe de nuevo la contrase&ntilde;a</label>\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" id=\"ejemplo_password_1\" \r\n");
      out.write("                                                       placeholder=\"ContraseÃ±a\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-default\">Enviar</button>\r\n");
      out.write("\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div> \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </article>\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer><b><em>GENARUS GYM</em></b> &copy; 2015 - Todos Los Derechos Reservados</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"jquery/jquery-1.11.2.min.js\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.js\"></script>\n");
      out.write("<script src=\"jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"bootstrap/assets/js/docs.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
