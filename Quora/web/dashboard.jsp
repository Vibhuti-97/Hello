<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.FileOutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    HttpSession nsession = request.getSession(false);
    if(nsession!=null) {
       String Email1=(String)session.getAttribute("Useremail");
       String Username=(String)request.getAttribute( "username" );
       String Question=(String)session.getAttribute("Question");
       session.setAttribute("Username",Username);
       session.setAttribute("Useremail",Email1);
       out.println(Question);
       try
        {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/quora?useSSL=false","root","shivangi**");
            String sql_query="select * from Registration where Email=?";
            PreparedStatement pstmt=conn.prepareStatement(sql_query);
            pstmt.setString(1,Email1);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                Blob blob=rs.getBlob(5);
                byte byteArray[]=blob.getBytes(1, (int)blob.length());
                FileOutputStream fout=new FileOutputStream("C:/Users/hp/Documents/NetBeansProjects/Quora/web/images/avatar.png");
                fout.write(byteArray);
%>  
<!DOCTYPE html>
<html lang="en">
  <head>
  	<meta charset="utf-8">
    <title>Index</title>
    <link rel="stylesheet" type="text/css" href="mystyle.css" >
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,300italic,700' rel='stylesheet' type='text/css' >
    <script type="text/javascript" src="script.js"> </script>
  </head>

  <body onload="updateMostRecent(); setInterval( function() { refreshIndex(); }, 5000);">
  	<header id="fixed-header">
  		<a href="index.jsp"> <img id="logo" src="logo.png" alt="Quora"/> </a>
	    <a href="index.jsp" id="header-login">Logout</a>
	</header>
	<a href="form-question.jsp"><img src="FAB.png" alt="Submit a question" title="Submit a question" id="FAB" /></a>
	<div id="question-list">

	

		<div class="question-display">

			<a href="question-detail.html" class="question"><!--<?php echo $row["question_text"]; ?>--></a>
			<img src="images/avatar.png" alt="Avatar" class="question-avatar">
                        <br /><br>
			<p class="date"><!--<?php echo $row["time_asked"]; ?>--></p>
			
			<a href= "question-detail.jsp" class="num-answers"><?php echo $row["num_answers"]; ?>Top Answers</a>
                        <a href="form-answer.jsp" class="answer-button">Your Answer</a>
			<br />
			<hr />

			<aside class="answer-bottom-section">
				
				
				<p class="top-answer"></p>
				
                                <p class="answer-button">General Feed</p>
			<%
                            int c=0,c1=0;
                            
                            String query3="select * from Question";
                            String query4="select * from Answer";
                            String query5="select * from Question";
                            PreparedStatement ps3=conn.prepareStatement(query3);
                            PreparedStatement ps4=conn.prepareStatement(query4);
                            PreparedStatement ps5=conn.prepareStatement(query5);
                            ResultSet rs4=ps3.executeQuery();
                            ResultSet rs5=ps4.executeQuery();
                            ResultSet rs6=ps5.executeQuery();
                            int x=0;
                            while(rs6.next())
                                x++;
                            String[] arr=new String[x];
                            int i=0;
                            while(rs4.next())
                            {
                                arr[i++]=rs4.getString(2);
                                c++;
                            }
                            for(int j=0;j<i;j++)
                                System.out.println(arr[j]+" ");
                            while(rs5.next())
                                c1++;
                            System.out.println(c+" "+c1);
                            String query1="select * from Question";
                            String query2="select * from Answer";
                            PreparedStatement ps1=conn.prepareStatement(query1);
                            PreparedStatement ps2=conn.prepareStatement(query2);
                            ResultSet rs2=ps1.executeQuery();
                            ResultSet rs3=ps2.executeQuery();
                            int diff=0;
                            i=0;
                            while(rs2.next())
                            {%>
                            <div class="question-display post-display">
                                <span style="color:#e53935;font-weight:bold;margin-left:-155px;position: absolute"><%=arr[arr.length-1-i]
                                    %></span><br><br>
                                        
                                        
                          <%
                              //rs3=ps2.executeQuery();
                              if(diff+c1>=c){
                              if(rs3.next())
                              {
                                  
                                 %>
                                 <span style="margin-left:-13px;font-weight:bold;"><%out.println(rs3.getString(2));%></span><br>
   
                                 <% 
                                
                                 }}
                              else
                              {%>
                              
                              <span style="margin-left:-32px;font-weight:bold;"><%out.println("There are no answers yet!!");%></span>
                                <%   } 
                          %>
                            </div>
                        <%
                            i++;
                            diff++;
                            }
                        %>

				
			</aside>

		</div>

        <div class="question-display">
            <p class="answer-button">Questions</p>
			<%String query="select * from Question";
                            PreparedStatement ps=conn.prepareStatement(query);
                            ps.executeQuery();
                            ResultSet rs1=ps.executeQuery();
                            while(rs1.next())
                            {%>
                            <div class="question-display post-display">
                                <b><a href="form-answer.jsp"><%out.println(rs1.getString(2));
                                        %></a></b>
            <p>by</p>
                             <%out.println(rs1.getString(3));%><br><br></div>
                        <%
                            }
                        %>
		
        </div>
	</div>

  </body>
</html>
<%}}
catch(Exception e)
{
    out.println(e);
}
}
else
  response.sendRedirect("index.jsp");
%>