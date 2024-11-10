
    <%@page import="java.util.ArrayList"%>
<%@page import="model.ChuDe"%>
<%@page import="dao.ChuDeDAO"%>
<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ChuDeDAO chude = new ChuDeDAO();
    ArrayList<ChuDe> dsLoai = chude.getAll();
%>
<div class="card mb-3">
    <h3 class="card-header">Chủ đề sách</h3>  
    <%
    for(ChuDe s:dsLoai){
    %>
        <ul class="list-group list-group-flush">
            <li class="list-group-item"> <a href="product.jsp?macd=<%=s.getMaCd() %>" class="text-decoration-none"> <i class="bi bi-arrow-right-circle"></i> <%=s.getTenCd() %> </a> </li>
            
        </ul>   
            <%
                }
            %>
</div>
