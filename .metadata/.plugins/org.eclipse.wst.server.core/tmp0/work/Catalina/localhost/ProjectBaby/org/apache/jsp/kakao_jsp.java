/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-04-24 08:18:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.BabyMemberDto;
import main.BabyMemberDto;

public final class kakao_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("main.BabyMemberDto");
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
      out.write("    \r\n");
      out.write("    \r\n");


     String id = (String)request.getParameter("id");
     String stotalPrice = (String)request.getParameter("totalPrice");
     int totalPrice = Integer.parseInt(stotalPrice);
    
     System.out.println("id: "+id);
     System.out.println("stotalPrice: "+stotalPrice);
     System.out.println("totalPrice: "+totalPrice);
     BabyMemberDto babyMemberDTO = (BabyMemberDto) session.getAttribute("login");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>kakao</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.12.4.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdn.iamport.kr/js/iamport.payment-1.1.5.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
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
      out.write("    <script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("        var IMP = window.IMP; // 생략가능\r\n");
      out.write("        IMP.init('imp23418340'); // 'iamport' 대신 부여받은 \"가맹점 식별코드\"를 사용\r\n");
      out.write("        var msg;\r\n");
      out.write("        \r\n");
      out.write("        IMP.request_pay({\r\n");
      out.write("            pg : 'kakaopay',\r\n");
      out.write("            pay_method : 'card',\r\n");
      out.write("            merchant_uid : 'merchant_' + new Date().getTime(),\r\n");
      out.write("            name : 'OhMyBaby',\r\n");
      out.write("            amount : ");
      out.print(totalPrice);
      out.write(',');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("            buyer_postcode : '123-456',\r\n");
      out.write("            //m_redirect_url : 'http://www.naver.com'\r\n");
      out.write("        }, function(rsp) {\r\n");
      out.write("            if ( rsp.success ) {\r\n");
      out.write("                //[1] 서버단에서 결제정보 조회를 위해 jQuery ajax로 imp_uid 전달하기\r\n");
      out.write("                jQuery.ajax({\r\n");
      out.write("                    url: \"/payments/complete\", //cross-domain error가 발생하지 않도록 주의해주세요\r\n");
      out.write("                    type: 'POST',\r\n");
      out.write("                    dataType: 'json',\r\n");
      out.write("                    data: {\r\n");
      out.write("                        imp_uid : rsp.imp_uid\r\n");
      out.write("                        //기타 필요한 데이터가 있으면 추가 전달\r\n");
      out.write("                    }\r\n");
      out.write("                }).done(function(data) {\r\n");
      out.write("                    //[2] 서버에서 REST API로 결제정보확인 및 서비스루틴이 정상적인 경우\r\n");
      out.write("                    if ( everythings_fine ) {\r\n");
      out.write("                        msg = '결제가 완료되었습니다.';\r\n");
      out.write("                        msg += '\\n고유ID : ' + rsp.imp_uid;\r\n");
      out.write("                        msg += '\\n상점 거래ID : ' + rsp.merchant_uid;\r\n");
      out.write("                        msg += '\\결제 금액 : ' + rsp.paid_amount;\r\n");
      out.write("                        msg += '카드 승인번호 : ' + rsp.apply_num;\r\n");
      out.write("                        \r\n");
      out.write("                        alert(msg);\r\n");
      out.write("                    } else {\r\n");
      out.write("                        //[3] 아직 제대로 결제가 되지 않았습니다.\r\n");
      out.write("                        //[4] 결제된 금액이 요청한 금액과 달라 결제를 자동취소처리하였습니다.\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                //성공시 이동할 페이지\r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("               /* alert(\"point 충전을 성공하셨습니다.\"); */             \r\n");
      out.write("                /* location.href='mypage_point.jsp'; */\r\n");
      out.write("                location.href=\"kakao?type=payAfter&money=");
      out.print(totalPrice);
      out.write("&id=");
      out.print(babyMemberDTO.getId());
      out.write("\";\r\n");
      out.write("            }\r\n");
      out.write("         \r\n");
      out.write("            \r\n");
      out.write("            else {\r\n");
      out.write("                msg = '결제에 실패하였습니다.';\r\n");
      out.write("                msg += '에러내용 : ' + rsp.error_msg;\r\n");
      out.write("                //실패시 이동할 페이지\r\n");
      out.write("                /* location.href='mypage_point.jsp'; */\r\n");
      out.write("                /*alert(\"point 충전을 실패하셨습니다\"); */\r\n");
      out.write("                location.href=\"kakao?type=payAfter\";                \r\n");
      out.write("           \r\n");
      out.write("             ");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("    });\r\n");
      out.write("    </script> \r\n");
      out.write("    ");
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
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
