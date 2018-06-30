<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.json.*, edu.uclm.esi.disoft.dominio.Manager" %>

<%
	response.addHeader("Access-Control-Allow-Origin", "*");
	JSONArray resultado=Manager.get().getPlatosListos();
%>

<%= resultado %>
