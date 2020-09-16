package com.gmail.yurakhomenko2017;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class QuestionServlet extends javax.servlet.http.HttpServlet {

    static final int QUESTION_1_YES = 0;
    static final int QUESTION_1_NO = 1;
    static final int QUESTION_2_YES = 2;
    static final int QUESTION_2_NO = 3;

    static final String TEMPLATE = "<html>" +
          "<head> <title>Question</title></head>" +
          "<body><h1>%s</h1></body></html>";
    final int[] result = new int[4];

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
         final String q1 = request.getParameter("question1");
         final String q2 = request.getParameter("question2");

         final int que1 = "yes".equals(q1) ? QUESTION_1_YES : QUESTION_1_NO;
         final int que2 = "yes".equals(q2) ? QUESTION_2_YES : QUESTION_2_NO;

         result [que1]++;
         result [que2]++;

         String res = "<p><table border = '1'> <tr> <th>Have a car</th> <th>yes = " + result[QUESTION_1_YES] + "</th>" + "<th>" +", no = " + result[QUESTION_1_NO] + "</th>" +"</tr>" + "</p>";
         res += "<p><table border = '1'> <tr> <th>What kind</th> <th>yes = " + result[QUESTION_2_YES] + "</th>" + "<th>" +", no = " + result[QUESTION_2_NO] + "</th>" +"</tr>" + "</p>";

         response.getWriter().println(String.format(TEMPLATE, res));
    }
}
