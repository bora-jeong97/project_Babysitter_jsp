/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-04-24 08:28:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.BabyMemberDao;
import sitterboard.SitterBoardDao;
import sitterboard.SitterBoardDto;
import java.util.List;
import main.BabyMemberDto;
import main.BabyMemberDto;

public final class sitterBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/./include/footer.jsp", Long.valueOf(1587715415236L));
    _jspx_dependants.put("/./include/header.jsp", Long.valueOf(1587715415244L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("main.BabyMemberDao");
    _jspx_imports_classes.add("sitterboard.SitterBoardDao");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("main.BabyMemberDto");
    _jspx_imports_classes.add("sitterboard.SitterBoardDto");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("/* -------------- 게시판 ---------------*/\r\n");
      out.write(".bdList th {\r\n");
      out.write("\tbackground: #f8f8f8;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tcolor: #231815;\r\n");
      out.write("\tfont-weight: 500;\r\n");
      out.write("\tpadding: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table th, table td {\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bdList td.toe {\r\n");
      out.write("\theight: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("\tfont-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tline-height: 1;\r\n");
      out.write("\tletter-spacing: -0.5px;\r\n");
      out.write("\tdisplay: table-cell;\r\n");
      out.write("\ttext-align: -internal-center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".a {\r\n");
      out.write("\tcolor: #545454;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".writebtn {\r\n");
      out.write("\tcolor: #fff !important;\r\n");
      out.write("\tbackground-color: #bbb8b2 !important;\r\n");
      out.write("\tborder-color: #bbb8b2 !important;\r\n");
      out.write("\tbox-shadow: none !important;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\tpadding: 5px 5px 5px 6px;\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sitterBoard .inner {\r\n");
      out.write("\t/* \tmargin: 0 150px; */\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sitterBoard .bdList table {\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\twidth: 1000px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sub {\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("}\r\n");
      out.write(".paging{\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- content 영역 -->\r\n");

	/* BabyMemberDto babyMemberDto = (BabyMemberDto)session.getAttribute("login");
	if(babyMemberDto != null){
		System.out.println("로그인후 dto" + babyMemberDto.toString());
	} */

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Oh My Baby</title>\r\n");
      out.write("\r\n");
      out.write("<!-- favicon 16, 24, 32, 64, 152 -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"./images/front/favicon.ico\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"./images/front/icon_57.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\"\r\n");
      out.write("\thref=\"./images/front/icon_72.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\"\r\n");
      out.write("\thref=\"./images/front/icon_114.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"144x144\"\r\n");
      out.write("\thref=\"./images/front/icon_144.png\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"./css/front/reset.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"./css/front/common.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"./css/front/layout.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"./css/front/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/front/jquery-3.1.0.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/front/jquery.bxslider.js\"></script>\r\n");
      out.write("<script src=\"js/front/common.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<!-- 합쳐지고 최소화된 최신 CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\">\r\n");
      out.write("<!-- 부가적인 테마 -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- 합쳐지고 최소화된 최신 자바스크립트 -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");

	BabyMemberDto babyMemberDto = (BabyMemberDto) session.getAttribute("login");
	if (babyMemberDto != null) {
		System.out.println("로그인후 dto" + babyMemberDto.toString());
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<header class=\"headerWrap\">\r\n");
      out.write("\t\t<div class=\"header clearfix tr\">\r\n");
      out.write("\t\t\t<div class=\"header_topSec clearfix\">\r\n");
      out.write("\t\t\t\t");

					if (babyMemberDto != null) {
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					if (babyMemberDto.getAuth() == 1) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t<li>");
      out.print(babyMemberDto.getName());
      out.write("님 환영합니다</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"admin?type=moveAdmin\" id=\"loginBtn\">관리자페이지</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"login?type=logout\" id=\"loginBtn\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t<li>");
      out.print(babyMemberDto.getName());
      out.write("님 환영합니다</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mypage_point.jsp\" id=\"loginBtn\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"login?type=logout\" id=\"loginBtn\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"login?type=moveLogin\" id=\"loginBtn\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"register?type=moveRegister\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"inner_header clearfix\">\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t<a href=\"main.jsp\" class=\"logo\"> <img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"images/front/logo.png\"> <!-- <span>내 아이를 부탁해</span> -->\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t");

					if (babyMemberDto != null) {
						if (babyMemberDto.getAuth() == 1) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"gnb clearfix\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mypage_point.jsp\">회원정보관리</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <li><a href=\"\">회원정보 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\"></a></li> -->\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Mypage</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mypage_main.jsp\">예약내역 확인</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mypage_imageUpdate.jsp\">프로필 사진 업데이트</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mypage_point.jsp\">내 포인트 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mypage_profile.jsp\">내 계정 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"employee.jsp\">Service</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"employee.jsp\">돌봄 신청</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"searchSitterBoard\">구인구직</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"\">고객센터</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"comHere.jsp\">오시는길</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"qna.jsp\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- <li><a href=\"\">커뮤니티</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">후기게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">자유게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");
	}else {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"gnb clearfix\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mypage_point.jsp\">Mypage</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mypage_main.jsp\">예약내역 확인</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"mypage_imageUpdate.jsp\">프로필 사진 업데이트</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mypage_point.jsp\">내 포인트 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mypage_profile.jsp\">내 계정 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"employee.jsp\">Service</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"employee.jsp\">돌봄 신청</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"searchSitterBoard\">구인구직</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"\">고객센터</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"comHere.jsp\">오시는길</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"qna.jsp\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- <li><a href=\"\">커뮤니티</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">후기게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">자유게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");

					}
					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"gnb clearfix\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"employee.jsp\">Service</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"employee.jsp\">돌봄 신청</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"searchSitterBoard\">구인구직</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"\">고객센터</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"comHere.jsp\">오시는길</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"qna.jsp\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- <li><a href=\"\">커뮤니티</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">후기게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">자유게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");

					}
					
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!--// header -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	BabyMemberDto login = (BabyMemberDto) session.getAttribute("login");

      out.write("\r\n");
      out.write("\r\n");

	List<SitterBoardDto> list = (List<SitterBoardDto>) request.getAttribute("searchList");
	String choice = (String) request.getAttribute("choice");
	String searchWord = (String) request.getAttribute("searchWord");
	int boardPage = (int) request.getAttribute("boardPage");
	System.out.println("보드페이지:" + boardPage);
	
	
	int pageNumber = (int) request.getAttribute("pageNumber");
	System.out.println("pageNumber:" + pageNumber);
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"containerWrap sitterBoard\">\r\n");
      out.write("\t<div class=\"container_inner\">\r\n");
      out.write("\t\t<!-- 필요 없으면 div 삭제 (필요한거 남기고!) 배결색은 style만 삭제하면 되요~~!! -->\r\n");
      out.write("\t\t<div class=\"cont1 content clearfix\">\r\n");
      out.write("\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t");

					if (login.getAuth() == 5) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"writebtn\" id=\"btnWrite\">글쓰기</button>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"bdList\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<table style=\"border: 2px;\">\r\n");
      out.write("\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"100px\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 번호 -->\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"130px\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 구분1 -->\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"200px\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 제목 -->\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"120px\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 첨부파일여부(공지사항) 그 외(작성자) -->\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"150px\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 등록일 -->\r\n");
      out.write("\t\t\t\t\t\t\t<col width=\"100px\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 조회수 -->\r\n");
      out.write("\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"1.5\" bgcolor=\"#000\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"6\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>구분</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>등록일</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"0.5\" bgcolor=\"#dddddd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"6\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

								if (list.size() == 0 || list == null) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"6\" align=\"center\">작성 된 글이 없습니다.</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"0.5\" bgcolor=\"#dddddd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"6\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
									String mail1 = null;
									for (int i = 0; i < list.size(); i++) {
										SitterBoardDto dto = list.get(i);
										if (dto.getId() != null) {
											String mail = dto.getId();
											int idx = dto.getId().indexOf("@");
											mail1 = mail.substring(0, idx);
											System.out.println("idx:" + idx);
											//mail1 = dto.getId().split("@");
											//System.out.println(mail1[0] + " " + mail1[1]);
											System.out.println("mail:" + mail);
											//System.out.println("mail1:" + mail1);

										}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(i + 1);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><img src=\"./images/lock.png\" style=\"width: 15px; height: 15px;\"></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

								if(dto.getDel() == 0) {
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"subject toe\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"sitterDetail?seq=");
      out.print(dto.getSeq());
      out.write("&type=detail&filename=");
      out.print(dto.getOriginalFileName());
      out.write("&id=");
      out.print(login.getId() );
      out.write("&auth=");
      out.print(login.getAuth() );
      out.write("&wid=");
      out.print(dto.getId() );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"a\" id=\"a_go\" onclick=\"userCheck('");
      out.print(dto.getId());
      out.write("')\">");
      out.print(dto.getTitle());
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

								}else if(dto.getDel() == 1){
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"subject toe\">삭제 된 글입니다.</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

								}
								
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"writerMail\">");
      out.print(mail1);
      out.write(" <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(mail1);
      out.write("\" id=\"writerMail\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(dto.getRegisterDate());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(dto.getreadCount());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"0.5\" bgcolor=\"#dddddd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"6\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
								}
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- </form> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"cont2 content clearfix\" style=\"\">\r\n");
      out.write("\t\t<div align=\"center\" class=\"paging\">\r\n");
      out.write("\t\t\t");

				for (int i = 0; i < boardPage; i++) {
					if (pageNumber == i) { // 현재페이지
			
      out.write("\r\n");
      out.write("\t\t\t<span style=\"font-size: 15pt; color: #9393ce; font-weight: bold;\">\r\n");
      out.write("\t\t\t\t");
      out.print(i + 1);
      out.write("\r\n");
      out.write("\t\t\t</span>&nbsp;\r\n");
      out.write("\t\t\t");

				} else { // 나머지
			
      out.write("\r\n");
      out.write("\t\t\t<a href=\"#none\" title=\"");
      out.print(i + 1);
      out.write("페이지\" onclick=\"goPage(");
      out.print(i);
      out.write(")\"\r\n");
      out.write("\t\t\t\tstyle=\"font-size: 15pt; color: #000; font-weight: bold; text-decoration: none\">\r\n");
      out.write("\t\t\t\t[");
      out.print(i + 1);
      out.write("]\r\n");
      out.write("\t\t\t</a>&nbsp;\r\n");
      out.write("\t\t\t");

				}
			}
			
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t\t<select id=\"choice\">\r\n");
      out.write("\t\t\t\t<option value=\"sel\">선택</option>\r\n");
      out.write("\t\t\t\t<option value=\"title\">제목</option>\r\n");
      out.write("\t\t\t\t<option value=\"writer\">작성자</option>\r\n");
      out.write("\t\t\t\t<option value=\"content\">내용</option>\r\n");
      out.write("\t\t\t</select> <input type=\"text\" id=\"search\" value=\"\" placeholder=\"검색어를 입력하세요\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<button type=\"button\" onclick=\"searchSitterBoard()\">검색</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tfunction searchSitterBoard() {\r\n");
      out.write("\t\t\t\t\talert(\"클릭\");\r\n");
      out.write("\t\t\t\t\tvar choice = document.getElementById(\"choice\").value;\r\n");
      out.write("\t\t\t\t\tvar word = $(\"#search\").val();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tlocation.href = \"searchSitterBoard?searchWord=\" + word + \"&choice=\"+choice;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tfunction goPage(pageNum) {\r\n");
      out.write("\t\t\t\t\tvar choice = $(\"#choice\").val();\r\n");
      out.write("\t\t\t\t\tvar word = $(\"#search\").val();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\talert(\"pageNum: \" + pageNum);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(word == \"\"){\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"choice\").value = 'sel';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar linkStr = \"searchSitterBoard?pageNumber=\" + pageNum;\r\n");
      out.write("\t\t\t\t\tif(choice != 'sel' && word != \"\"){\r\n");
      out.write("\t\t\t\t\t\tlinkStr=linkStr + \"&searchWord=\" + word + \"&choice=\" + choice;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tlocation.href = linkStr;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- \t\t<div class=\"cont3 content clearfix\" style=\"background-color: #ccc;\"></div> -->\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--// container -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("\tvar _choice = '");
      out.print(choice );
      out.write("';\r\n");
      out.write("\tvar _searchWord = '");
      out.print(searchWord );
      out.write("';\r\n");
      out.write("\tif(_choice != '' && _choice != 'sel'){\t\t\r\n");
      out.write("\t\tif(_searchWord != \"\"){\t\t\t\r\n");
      out.write("\t\t\t$(\"#choice\").val(_choice);\r\n");
      out.write("\t\t\t$(\"#search\").val(_searchWord);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(\"#btnWrite\").click(function() {\r\n");
      out.write("\t\talert(\"클릭\");\r\n");
      out.write("\t\tlocation.href = \"sitterWrite.jsp\";\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer class=\"footerWrap\">\r\n");
      out.write("\t\t<div class=\"footer clearfix\">\r\n");
      out.write("\t\t\t<!-- <img src=\"images/front/\" alt=\"\" class=\"footer__logo\"> -->\r\n");
      out.write("\t\t\t<!-- <p>오마이베이비</p> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<address class=\"footer__info\">\r\n");
      out.write("\t\t\t\t<p class=\"mb10\"></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"footer__menu\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"inner_list clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>대표이사: </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>사업자 등록번호: </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>주소:서울특별시 </li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"inner_list clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#n\">통신판매업신고 : </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#n\" class=\"btn_policy\">이용약관</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#n\" class=\"btn_personal\">개인정보취급방침</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>E-mail : </li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"inner_list clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>TEL : </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>FAX : </li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>COPYRIGHT Corporation. ALL RIGHTS RESERVED.</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</address>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- // footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 로그인 팝업창 -->\r\n");
      out.write("\t<div class=\"lp_bg\"></div>\r\n");
      out.write("\t<div class=\"lp_box lp_box_s lp_login\">\r\n");
      out.write("\t\t<h3 class=\"lp_sbj font_square\"><a href=\"index.html\">\r\n");
      out.write("\t\t\t\t<p>로그인</p>\r\n");
      out.write("\t\t\t</a></h3>\r\n");
      out.write("\t\t<a href=\"#n\" class=\"btn_close_lp\"><img src=\"images/front/ico_close_lp_s.png\" alt=\"닫기\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"lp_cn tc\">\r\n");
      out.write("\t\t\t<input type=\"email\" class=\"user_email mb5\" placeholder=\"이메일\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t<input type=\"password\" class=\"user_pw\" placeholder=\"비밀번호\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t<p class=\"login_setting mb10 clearfix tl\">\r\n");
      out.write("\t\t\t\t<span class=\"pr10\"><input type=\"checkbox\"><label>ID 저장</label></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"#n\" class=\"btn_gray_s fr pw_reset_info\">비밀번호 설정</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<a href=\"#n\" class=\"btn_blue_l btn_lp_login2\">로그인</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
