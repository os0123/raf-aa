PRACTICAL NO---1
1	Write a program in java application using swing to generate a login page
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
   Login() {
      // Username Label
      user_label = new JLabel();
      user_label.setText("User Name :");
      userName_text = new JTextField();
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");
      password_text = new JPasswordField();
      // Submit
      submit = new JButton("SUBMIT");
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Please Login Here !");
      setSize(450,350);
      setVisible(true);
   }
   public static void main(String[] args) {
      new Login();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
      String userName = userName_text.getText();
      String password = password_text.getText();
      if (userName.trim().equals("admin") && password.trim().equals("admin")) {
         message.setText(" Hello " + userName + "");
      } else {
         message.setText(" Invalid user.. ");
      }
   }
}

PRACTICAL N0---2
REGISTRATION FORM

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
    extends JFrame
    implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    // constructor, to initialize the components
    // with default values.
    public MyFrame()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        c.add(year);

        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Name : "
                    + tname.getText() + "\n"
                    + "Mobile : "
                    + tmno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2
                    = "DOB : "
                    + (String)date.getSelectedItem()
                    + "/" + (String)month.getSelectedItem()
                    + "/" + (String)year.getSelectedItem()
                    + "\n";

                String data3 = "Address : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}

// Driver Code
class Registration {

    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}

PRACTICAL NO---3

• AIM: Create a simple calculator application using servlet.
Code:    
index.html
<html>	
	<head>
		<title>CALCULATOR</title>
	</head>
	<body>
		<h3>CALCULATOR</h3>
		<form action="calculate" method="get">
		<table><tr>
			<td><input name="opr1" type="text"/>
			</td>
			<td><select name="operation">
				<option value="+">+</option>
				<option value="-">-</option>
				<option value="*">*</option>
				<option value="/">/</option>
				<option value="%">%</option>
			    </select>
			</td>
			<td><input name="opr2" type="text"/>
			</td>
			<td><input name="result" type="submit"/>
			</td>
		       </tr>
		</table>
		</form>
	</body></html>
  
  calculate.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/calculate"})
public class calculate extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        try
        {
            Integer opr1=Integer.parseInt(request.getParameter("opr1"));
            Integer opr2=Integer.parseInt(request.getParameter("opr2"));
            Integer result=null;
            String operation=request.getParameter("operation");
            if("+".equals(operation)) 
            { 
                result=opr1+opr2;
            } 
            if("-".equals(operation)) 
            { 
                result=opr1-opr2; 
            } 
            if("*".equals(operation)) 
            { 
                result=opr1*opr2; 
            } 
            if("/".equals(operation)) 
            { 
                result=opr1/opr2; 
            } 
            if("%".equals(operation)) 
            { 
                result=opr1%opr2; 
            } 
            out.println("<html>"); 
            out.println("<head>"); 
            out.println("<title>Servlet cal</title>"); 
            out.println("</head>"); 
            out.println("<body>"); 
            out.println("<h2>Result is: "+result+"</h2>");
            out.println("</body>"); 
            out.println("</html>"); 
        }
        finally
        {
            out.close();
        }
    }
}

PRACTICAL NO---4
   PRACTICAL NO : 4
• AIM: Create a servlet for a login page. If the username and password are correct then it says message ”Hello<username>” else a message “Login failed”.
Code:
index.html
<html> 
    <head> 
        <title>Login form</title>
    </head>
    <body>
          <center>
          <h1>Login Form</h1>
         <form action="Login" method="post">
          Name:<input type="text" name="userName"/><br><br>
          Password:<input type="password" name="userPass"/><br><br>
         <input type="submit" value="Submit"/>
         <input type=”reset” value=”Reset”/>
         </form>
         </center>
   </body>
</html>
 
Login.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class login extends HttpServlet
{
protected void processRequest(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException 
	{
      	}
	@Override
      	 public void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException 
	{
response.setContentType("text/html");
 		PrintWriter out = response.getWriter();
                    	String n=request.getParameter("userName");
                    	String p=request.getParameter("userPass");
if(n.equals("Dimple")&&p.equals("dimple"))
		{
                 		out.println("Hello "+n);
}
 		else
		{
out.println(“Login failed");
  		}
 	}
}

PRACTICAL NO---5

 PRACTICAL NO : 5
• AIM: Create a servlet program for simple registration form.
Code:
index.html
<html>
    <head>
        <title>REGISTRATION</title>
     </head>
    <body>
	

    </body>
</html>


Registration.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("username");
            String age = request.getParameter("age");
            String gender = request.getParameter("gender");
            String hobbies = request.getParameter("hobbies");
            String contact = request.getParameter("numbers");
            String email = request.getParameter("email");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registration</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Registration Details</h1>");
            out.println("<p>Name: " + name + "</p>");
            out.println("<p>Age: " + age + "</p>");
            out.println("<p>Gender: " + gender + "</p>");
            out.println("<p>Hobbies: " + hobbies + "</p>");
            out.println("<p>Contact: " + contact + "</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

PRACTICAL NO---6

• AIM: Write a servlet program to find out whether the given number is 
even or odd. 
Code:
index.html
<html>
    <head>
        <title>even odd no</title>
   </head>
    <body>
   	 <form action="evenodd" method="get">
             Enter Number: <input type="text" name="txtno"><br><br>
            	                <input type="submit" value ="Submit ">
                                     <input type="reset" value="Reset">
              </form>
    </body>
</html>

evenodd.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class evenodd extends HttpServlet 
{
        protected void processRequest(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException 
        {
        }
       @Override
        protected void doGet(HttpServletRequest request, 
        HttpServletResponse response) throws ServletException, IOException
        {
	   response.setContentType("text/html;charset=UTF-8");
      	   PrintWriter out = response.getWriter();
       	   try
              {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet evenodd</title>");            
                    out.println("</head>");
                    out.println("<body> <center>");
                    int no;
                    no=Integer.parseInt(request.getParameter("txtno"));
           	if(no % 2 == 0)
                		out.println(no + " is even ");
            	else 
                 		out.println(no + " is odd ");
                    out.println("</center> </body>");
                    out.println("</html>");
       }
          finally{
               out.close();
           }
    }
}

  PRACTICAL NO----7
  • AIM: Write a Servlet Program to find the cube of the number.
Code:
index.html
<html>
    <head>
        <title>Cube</title>
    </head>
    <body>
        <form action="cube" method="get">
          Enter Number:<input type="text" value="" name="txtnm">
            		 <input type="submit" value="Submit">
            		 <input type="reset" value="Reset">
        </form>
    </body>
</html>

cube.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(urlPatterns = {"/cube"})	
public class cube extends HttpServlet { 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8"); 
        try (PrintWriter out = response.getWriter())  
        {
            int no=Integer.parseInt(request.getParameter("txtnm")); 
            int Result; 
            Result=no*no*no; 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet factorial</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cube of the number:" + Result + "</h1>");
            out.println("</body>"); 
            out.println("</html>"); 
        }
    }
}

PRACTICAL NO----8
• AIM: Write a servlet program to find out the factorial of the given number.
Code:
index.html
<html>
    <head>
        <title> factorial</title>
    </head>
    <body>
    	<form action="factorial" method="get">
             Enter number <input type="text" name="textno"><br>
         	 		    <input type="submit" value="Submit">
        	 		    <input type="reset" value="Reset">
        	 </form>
     </body>
</html>

factorial.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class factorial extends HttpServlet
{
 protected void processRequest (HttpServletRequest  request,   
 HttpServletResponse response) throws ServletException, IOException 
	{
           }
    	@Override
   	 protected void doGet(HttpServletRequest request, 
 HttpServletResponse response) throws ServletException, IOException 
	 {
        		response.setContentType("text/html;charset=UTF-8");
        		try (PrintWriter out = response.getWriter()) 
		{
           			out.println("<!DOCTYPE html>");
            			out.println("<html>");
            			out.println("<head>");
            			out.println("<title>Servlet factorialno</title>");            
            			out.println("</head>");
            			out.println("<body>");
            			int num;
            			num=Integer.parseInt(request.getParameter("textno"));
            			out.println("num=" + num ) ;
            			int f=fact(num);
            			out.println("<br>n!="+f);
            			 out.println("</body>");
            			 out.println("</html>");
       		 }
   	 }
	private int fact(int n)
	{
    		if(n==0)
        		return 1;
    		else 
        		return n * fact(n-1);
	}
    
}

PRACTICAL NO----9
•AIM: Using Request Dispatcher Interface create a servlet which will validate the password entered by the user, if the user has “Servlet” as password, then he will be forwarded to Welcome Servlet else the user will stay on the index.html page and an error message will be displayed.
Code:
index.html
<html>
    <head>
        <title>Login form</title>
    </head>
    <body>
          <centre>
          <h1>Login Form</h1>
          <form action="Login" method="post">
            Name:<input type="text" name="userName"/><br><br>
            Password:<input type="password" name="userPass"/><br><br>
           <input type="submit" value="Login"/>
            </form>
           </center>
    </body>
</html>

Login.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
public class Login extends HttpServlet
{
    protected void processRequest(HttpServletRequest request, 
    HttpServletResponse response) throws ServletException, IOException 
    {
     }
    @Override
     public void doPost(HttpServletRequest request, 
     HttpServletResponse    response) throws ServletException, IOException 
     {
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         String n=request.getParameter("userName");
         String p=request.getParameter("userPass");
         if(p.equals("Servlet"))
         {
              RequestDispatcher rd=request.getRequestDispatcher("Welcome");
 	   rd.forward(request, response);
         }
         else
         {
     	   out.println("<center>");
 	   out.print("<h2>Error in Login!</h2>");
  	   out.println("<br>");
   	   out.println("<br>");
 	   RequestDispatcher rd=request.getRequestDispatcher("/index.html");
              rd.include(request, response);

        }
    }
}

Welcome.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/Welcome"})
public class Welcome extends HttpServlet
 {
@Override
   	protected void doPost(HttpServletRequest request, 
           HttpServletResponse response) throws ServletException, IOException
 {
        		response.setContentType("text/html"); 
 PrintWriter out = response.getWriter();
String n=request.getParameter("userName");
out.print("Hello "+n);
 }	}

PRACTICAL NO-----10
•AIM: Create  cookies object and accessing it in another servlet.
Code:
index.html
<html>
<head>
<title>Cookie Demo</title>
</head>
<body>
<form action="Page1" >
 		Enter Your Name <input type="text" name="txtName"><br>
<input type="submit" value=" Click to Enter ">
</form>
</body>
</html>















Page1.java
package mypack;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class Page1 extends HttpServlet 
{
public void doGet(HttpServletRequest request,
 HttpServletResponse response)throws ServletException, IOException 
{
               response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
               out.println("<html><head><title>Page1</title></head>");
 	    out.println("<body bgcolor=pink >");
    String uname = request.getParameter("txtName");
 	    out.println("<h1>~~~ Welcome "+uname+"</h1>");
 	    Cookie ck1 = new Cookie("username", uname);
 	    Cookie ck2 = new Cookie("visit","1");
 	    response.addCookie(ck1); response.addCookie(ck2);
               out.println("<h1><a href=Page2 >Click to visit Page 2 </a></h1>");
               out.println("</body>");
               out.println("</html>");
 }
 }

Page2.java
package mypack;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Page2 extends HttpServlet 
{
public void doGet(HttpServletRequest request, 
HttpServletResponse response) throws ServletException, IOException 
{
     response.setContentType("text/html;charset=UTF-8");
                PrintWriter out = response.getWriter();
                out.println("<html><head><title>Page2</title></head>");
                out.println("<body bgcolor=yellow >");
                Cookie [] ck = request.getCookies();
                for(int i=0;i<ck.length;i++){
 	     if(ck[i].getName().equals("visit")){
     int count = Integer.parseInt(ck[i].getValue())+1;
 	     out.println("<h1>Visit No : "+count+"</h1>");
 	     ck[i] = new Cookie("visit",count+"");
                response.addCookie(ck[i]);
           }
else 
{
 		out.println(ck[i].getName()+ " = "+ck[i].getValue()); }
 		out.println("<h1><a href=Page3 >Click to visit Page 3 </a></h1>");
 		out.println("<h1><a href=Page4 >Click to visit Page 4 </a></h1>");
 		out.println("<h1><a href=Page5 >Click to visit Page 5 </a></h1>");
out.println("</body>");
 		out.println("</html>");
 }
 }
}

PRACTICAL NO----11
• AIM: Develop a simple jsp application to display values obtained from the use 
        of Implicit Objects.
Code:
index.html
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html>
<head>
<title>JSP Page</title>
</head> 
<body>
 	       <h1>Use of Intrinsic Objects in JSP</h1> 
                  <h1>Request Object </h1>         
                   Query String <%=request.getQueryString() %><br>         
                   Context Path <%=request.getContextPath() %><br>         
                   Remote Host  <%=request.getRemoteHost()  %><br> 
                  <h1>Response Object </h1>        
 	        Character Encoding Type<%=response.getCharacterEncoding()%><br>          
                   Content Type <%=response.getContentType()  %><br>        
                   Locale  <%=response.getLocale()  %><br>
                  <h1>Session Object </h1>        
                  ID <%=session.getId() %><br>        
               Creation Time <%=new java.util.Date(session.getCreationTime()) %><br>        
             Last Access Time<%=newjava.util.Date
                                                (session.getLastAccessedTime())  %><br> 
</body> 
</html> 

PRACTICAL NO---12
•AIM: Create a  simple JSP Registration form page .
Code:
Registration.jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>JSP Page</title>
</head>
<body>
<center>
<h1> Register Form</h1>
<form action="register" method="post">
<table style="with:50%">
<center>
<table border="2">
<tr><td><b>User Name:</b></td>
<td><input type="text" name="uname"></td>
</tr>
<tr>
<td><b>Email-ID:</b></td>
<td><input type="email" name="uemail"></td>
</tr>
<tr>
<td><b>Create Password:</b></td>
<td><input type="password" name="upass"></td>
</tr>
<tr>
<td><b>Confirm Password:</b></td>
<td><input type="password" name="upass"></td>
</tr>
<tr>
<td><b>D.O.B</b></td>
<td><input type="text" name="udob"></td>
</tr>
<tr>
<td><b>Gender:</b></td>
<td><input type="radio" name="ugender" value="Male">Male<br>
<input type="radio" name="ugender" value="Female">Female</td>
</tr>
<tr>
<td><b>Phone No:</b></td>
<td><input type="text" name="uphone"></td>
</tr>
<tr>
<td><b>Country:</b></td>
<td><input type="text" name="uloc"></td>
</tr>
<tr rowspan="2">
<td><input type="submit" value="SignUp">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Reset"></td>
</tr>
</table></form></center>
</body>
</html>

PRACTICAL N0----13

• AIM: Create a simple EJB application to message  hello world.
Code:
index.html
<html>
    <head>
        <title>Hello World</title>
    </head>
    <body>
        <form action="ejbhello" method="get">
        <input type="text" value="" name="name">
        <input type="submit" value="Submit">
        </form>
    </body>
</html>















ejbhello.java
package ejb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
@WebServlet(name="ejbhello", urlPatterns={"/welcomeServlet"})
public class ejbhello extends HttpServlet 
{
      protected void processRequest(HttpServletRequest request,   
      HttpServletResponse response) throws ServletException, IOException 
      {
       }
    @Override
    protected void doGet(HttpServletRequest request, 
    HttpServletResponse response)throws ServletException, IOException 
    {
         response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
            WelcomeBean test=new WelcomeBean();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Welcome EJB</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(test.Welcome(request.getParameter("name")));
            out.println("</br>Click<a href='index.html'> here </a> to go back");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

welcomeBean.java
package ejb;
import javax.ejb.Stateless;
@Stateless
public class WelcomeBean 
{
public String Welcome(String user)
{
    		return "Hello"+" " +user.toUpperCase()+" "+
"Welcome to the world of EJB";
}
 }

PRACTICAL NO----14
• AIM: Create a Currency Converter application using EJB.
Code:
index.html
<html>
<head>	
<title>Currency Converter</title>
</head>
           <body>
        	<form action="CCServlet" >
            Enter Amount <input type="text" name="amt"><br>
            Select Conversion Type
            <input type="radio" name="type" value="r2d" checked>Rupees to Dollar
            <input type="radio" name="type" value="d2r" >Dollor to Rupees<br>
            <input type="reset" ><input type="submit" value="CONVERT" >
        </form>
    </body>
</html>












CCServlet.java
package mypack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.ejb.EJB;
import mybeans.CCBean;
public class CCServlet extends HttpServlet 
{
    @EJB CCBean obj;
     public void doGet(HttpServletRequest request, 
     HttpServletResponse response) throws ServletException, IOException
     {
         response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
         double amt = Double.parseDouble(request.getParameter("amt"));
         if(request.getParameter("type").equals("r2d"))
         {
             out.println("<h1>"+amt+ " Rupees = "+obj.r2Dollor(amt)+" Dollors</h1>");
          }
          if(request.getParameter("type").equals("d2r"))
{
  out.println("<h1>"+amt+ " Dollors = "+obj.d2Rupees(amt)+" Rupees</h1>");
}
     }
}




CCBean.ejb
package mybeans;
import javax.ejb.Stateless;
@Stateless
public class CCBean 
{	
public CCBean(){}
public double r2Dollor(double r){   return r/82.54;  }
public double d2Rupees(double d){   return d*82.54;  }
}

PRACTICAL NO----15
• AIM: Create a registration servlet in Java using JDBC. Accept the details such as Username, Password, Email, and Country from the user using HTML Form and store the registration details in the database. 
Code:
Index.html
<html>
    <head>
        <title>Practical14</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="Registration" method="get">
            <table>
                <tr>
                    <td>User ID:</td>
                    <td><input type="text" name="uid"></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="fname"></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="sname"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="pwd"></td>
                </tr>
                <tr>
                    <td>Confirm Password:</td>
                    <td><input type="password" name="pwd1"></td>
                </tr>
                <tr>
                    <td>Town:</td>
                    <td><input type="text" name="town"></td>
                </tr>
                <tr>
                    <td>Country:</td>
                    <td><input type="text" name="country"></td>
                </tr>
                <tr>
                    <td>Zip Code:</td>
                    <td><input type="text" name="zip"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Register"></td>
                    <td><input type="reset" value="Reset"></td>
                </tr>
            </table>        </form>  

    </body>
</html>

Registration.java

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class Registration extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String ConnectionURL = "jdbc:mysql://localhost:3306/registration";
            Connection con = null;
            ResultSet rs;
            String uid = request.getParameter("uid");
            String fname = request.getParameter("fname");
            String sname = request.getParameter("sname");
            String pwd = request.getParameter("pwd");
            String pwd1 = request.getParameter("pwd1");
            String town = request.getParameter("town");
            String country = request.getParameter("country");
            String zipcode = request.getParameter("zip");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(ConnectionURL, "root", "");
                String sql = "insert into register values(?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, uid);
                pst.setString(2, fname);
                pst.setString(3, sname);
                pst.setString(4, pwd);
                pst.setString(5, pwd1);
                pst.setString(6, town);
                pst.setString(7, country);
                pst.setString(8, zipcode);
                int numRowsChanged = pst.executeUpdate();
                out.println("<h1> Welcome:");
                out.println(" '" + fname + "' </h1>");
                pst.close();
            } catch (ClassNotFoundException e) {
                out.println("Couldn't load database driver:" + e.getMessage());
            } catch (SQLException e) {
                out.println("SQLException caught : " + e.getMessage());
            } catch (Exception e) {
                out.println(e);
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ignored) {
                    out.println(ignored);
                }

            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

PRACTICAL NO------16
•AIM: Create a JSP page to demonstrate the use of Expression language.
Code:
index.jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    application.setAttribute("author","Siddharth Malhotra");
    session.setAttribute("country","India");
%>
<!DOCTYPE html>
<html>
    <head>
     <title>Expression Language</title>
    </head>
    <body>
        <form action="show.jsp">
            User First Name:<input type="text" name="ufname"/><br>
            User Last Name:<input type="text" name="ulname"/><br>
            <input type="submit" value="Check EL Use!!"/>
        </form></body></html>

Show.jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%pageContext.setAttribute("colour","blue");%>
<!DOCTYPE html>
<html>
    <head>
       <title>Display Page</title>
    </head>
    <body bgcolor="${pageScope.colour}">
        <b>Welcome ${param.ufname}${param.ulname} </b><br>
          Below we are accessing Application object:
        <p>
            Author Name:<b>${applicationScope.author}</b>
        </p>
        Below we are accessing Session object:
        <p>
            Author Country:<b>${sessionScope.country}</b>
        </p>
        Below we are showing some basic comparisons Using EL:
        <p>
            Is 1 less than 2?${1<2}<br>
            Does 5 equal 5?${5==5}<br>
            Is 6 greater than 7?${6 gt 7}<br>
            <p>Now for some maths:<br>
            6 + 7=${6+7}<br>
            8 X 9=${8*9}<br>
          <hr>You appear to be using the following browser:
        ${header["user-agent"]}
</p></body></html>

PRACTICAL NO----17

AIM: Create a JSP application to demonstrate the use of JSTL.
Code:
index.jsp
<%@page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-eqiv="Content-Type" content="text/html;charset=ISO-8859-1">
        <title>Index Page</title>
    </head>
    <body>
        <form action="jstlDemo.jsp" method="post">
            First Name:<input type="text" name="fname"/><br/>
            Last Name:<input type="text" name="lname"/><br/>
            <input type="submit" value="Check JSTL Demo"/>
        </form></body></html>

jstlDemo.jsp
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        First Name:<b><c:out value="${param.fname}"></c:out></b><br/>
               Last Name:<b><c:out value="${param.lname}"></c:out></b><br/>
               Use of if statement
               <br>
               <c:set var="mycount" value="25"/>
               <c:if test="${mycount==25}">
                   <b><c:out value="Your count is 25"/></b>
               </c:if>
                   <br/>
                  Use of forEach statement
               <br>
               <c:forEach var="count" begin="101" end="105">
              <b><c:out value="${count}"/></b>
               </c:forEach><br/>
                  Exception catching example
                   <p><c:catch var="myException">
                           <%int number=10/0;%>
                       </c:catch>
                       <b>The Exception is:${myException}</b>
                   </p></body></html>
PRACTICAL NO----18
AIM: Develop simple EJB application to demonstrate Servlet Hit count using Singleton Session Beans.
Code:
index.html
<html>
    <head>
        <title>Hit count Demo</title>
       </head>
    <body>
        <form action="ShowHitCountServlet" method="post">
 <input type=submit value="Take hit Count demo with EJB Session Singleton Bean"/>
        </form> </body></html>

ShowHitCountServlet.java
package EJPracts;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowHitCountServlet extends HttpServlet {
@EJB
  STHitCountBean cntBean;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowHitCountServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>You visited this page: " + cntBean.incrHitCount() +"time/s</h1>");
            out.println("</body>");
            out.println("</html>");
        }}}
STHitCountBean.ejb
package EJPracts;
import javax.ejb.Singleton;
@Singleton
public class STHitCountBean {
private int count;
   public synchronized int incrHitCount()
   {
       return count++;
   }
}

PRACTICAL NO---19
• AIM: Develop a Simple Room Reservation System Application Using EJB.
Code:
index.jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Room Reservation</title>
    </head>
    <body>
        <p><b>Enter Details For Room Reservation</b></p>
        <form method="post" action="ReservationServlet">
            Customers Name:<input type="text" name="cname" value="" size="20"/>
            <br><br>
            Address:<input type="text" name="cadd" value="" size="20"/><br><br>
            Phone Number:<input type="text" name="cph" value="" size="12"/><br><br>
            Room Type:
            <select name="roomtype">
            <option id="g">General</option>
            <option id="d">Deluxe</option>
            <option id="s">Suite</option>
            </select><br/><br/><br/><br/>
            Check IN Date(DD/MM/YYYY):<input type="text" name="checkindate"/><br>
            Check OUT Date(DD/MM/YYYY):<input type="text" name="checkoutdate"/><br>
            Payment Mode:
            <select name="paymode">
                <option id="cash">CASH</option>
                      <option id="credit">CREDIT CARD</option>
            </select><br><br><br><br>
            <input name="cmdsubmit" type="submit" value="Submit" alt="Convert"/>
        </form></body></html>

ReservationServlet.java
package servlet;
import EJPracts.ReservationBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ReservationServlet extends HttpServlet {
    @EJB
    ReservationBean rb;
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
            {
        
            }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
            {
                response.setContentType("text/html;charset=UTF-8");
                String cname=request.getParameter("cname");
                String add=request.getParameter("cadd");
                String ph=request.getParameter("cph");
                String roomtype=request.getParameter("roomtype");
                String chkin=request.getParameter("checkindate");
                String chkout=request.getParameter("checkoutdate");
                String paymode=request.getParameter("paymode");
                PrintWriter out = response.getWriter();
                rb=new ReservationBean();
                int i=0;
                ArrayList<String>list1=rb.reserve(cname,add,ph,chkin,chkout,roomtype,paymode);
                try
                {
                    rb.reserve(cname,add,ph,chkin,chkout,roomtype,paymode);
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Reservation EJB</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println(rb.welcome(cname));
                    out.println("<br/>");
                    out.println(rb.payment(roomtype));
                    out.println("<br/>");
                    out.println("<br/>");
                    out.println("Your Details:");
                    int n=list1.size();
                    out.println("<Table border=1>");
                    out.println("<tr><th>Name</th><th>Address</th><th>Phone</th><th>Check In Date</th>");
                    out.println("<th>Check Out Date</th><th>Room</th><th>Payment mode</th></tr>");
                    out.println("<tr/>");
                    for(i=0;i<n;i++)
                    {
                        out.println("<TD>");
                        out.println(list1.get(i));
                        out.println("</TD>");
                    }
                    out.println("</tr>");
                    out.println("</Table>");
                    out.println("<br/>Click <a href='index.jsp'> here</a>to go back");
                    out.println("</body>");
                    out.println("</html>");
                }finally
                {
                    out.close();
                }
            }
}

ReservationBean.ejb
package EJPracts;
import javax.ejb.Stateless;
import java.util.ArrayList;
@Stateless
public class ReservationBean 
{
    public String welcome(String customer)
    {
        return "Hello"+" "+customer.toUpperCase()+" "+"Welcome to Our Hotel";
    }
    public String roomType(String roomtype)
    {
        return "You have Selected"+" "+roomtype.toUpperCase()+" "+"Room";
    }
    public String payment(String roomtype)
    {
     System.out.print(roomtype);
     System.out.print(roomtype);
     
     if(roomtype.equalsIgnoreCase("SUITE"))
     {
         return "You have to pay 8000 Rs";
     }
     else if(roomtype.equalsIgnoreCase("DELUXE"))
     {
         return "You have to pay 4000 Rs";
     }
     else
     return "You have to pay 2000 Rs";
     }
   public ArrayList<String>reserve(String customer,String add,String ph,String checkin,String checkout,String roomtype,String paymode)
     {
         ArrayList<String>a=new ArrayList();
        a.add(customer);
         a.add(add);
         a.add(ph);
         a.add(checkin);
         a.add(checkout);
         a.add(roomtype);
         a.add(paymode);
         return a;
     }
}

PRACTICAL NO----20
• AIM: Develop a Guestbook Application Using JPA.
Code:
GuestBook.java
package asif; 
import javax.persistence.*; 
@Entity 
@Table(name="GuestBook") 
public class GuestBook { 
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column(name="VisitorNo", unique=true, updatable=false) 
private Integer visitorNo; 
@Column(name="VisitorName") 
private String visitorName; 
@Column(name="Message") 
private String message; 
@Column(name="MessageDate") 
private String messageDate; 
public GuestBook() { 
} 
public Integer getVisitorNo() { 
return visitorNo; 
} 
public void setVisitorNo(Integer visitorNo) { 
this.visitorNo = visitorNo; 
} 
public String getVisitorName() { 
return visitorName;
} 
public void setVisitorName(String visitorName) { 
this.visitorName = visitorName; 
} 
public String getMessage() { 
return message; 
} 
public void setMessage(String message) { 
this.message = message; 
} 
public String getMessageDate() { 
return messageDate; 
} 
public void setMessageDate(String messageDate) { 
this.messageDate = messageDate; 
} 
}

index.jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
<body style="background-color: pink;"> 
Sign the Guest Book 
<form action="GuestBookView.jsp" method="post"> 
Visitor Name: <input name="guest" maxlength="25" size="50" /> 
Message: <textarea rows="5" cols="36" name="message"></textarea> 
<input type="submit" name="btnSubmit" value="Submit" /> 
</form> </body> </html>

GuestBookView.jsp
<%@page import="java.util.*,javax.persistence.*,asif.GuestBook" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<%! 
private EntityManagerFactory entityManagerFactory; 
private EntityManager entityManager; 
private EntityTransaction entityTransaction; 
List<GuestBook> guestbook; 
%> 
<%
entityManagerFactory = Persistence.createEntityManagerFactory("JPAApplication1PU"); 
entityManager = entityManagerFactory.createEntityManager(); 
String submit = request.getParameter("btnSubmit"); 
if(submit != null && ("Submit").equals(submit)) { 
try { 
String guest = request.getParameter("guest"); 
String message = request.getParameter("message"); 
String messageDate = new java.util.Date().toString(); 
GuestBook gb = new GuestBook(); 
gb.setVisitorName(guest); 
gb.setMessage(message); 
gb.setMessageDate(messageDate); 
entityTransaction = entityManager.getTransaction(); 
entityTransaction.begin(); 
entityManager.persist(gb); 
entityTransaction.commit(); 
} catch (RuntimeException e) { 
if(entityTransaction != null) entityTransaction.rollback(); 
throw e; 
} 
response.sendRedirect("GuestBookView.jsp"); 
} 
try { 
guestbook = entityManager.createQuery("SELECT g from GuestBook g").getResultList(); 
} catch (RuntimeException e) { } 
entityManager.close(); 
%> 
<html> 
<body> 
View the Guest Book <b>Click <a href="index.jsp"> here</a> to sign the guestbook.</b> 
<hr /> 
<% 
Iterator iterator = guestbook.iterator(); 
while (iterator.hasNext()) { 
GuestBook obj = (GuestBook) iterator.next(); 
%> 
On <%= obj.getMessageDate() %>,<br /> 
<b><%= obj.getVisitorName() %>:</b> 
<%= obj.getMessage() %> 
<br /><br /> 
<% 
} 
%> 
</body></html>

PRACTICAL NO----21

•AIM: Develop Simple Servlet Question Answer Application using Database..
Code:
index.html 
<html><head><title>Quiz Application</title></head> 
<body> 
<h1>Welcome to Quiz Servlet </h1> 
<h1><a href="QuizServlet" >CLICK TO START QUIZ</a></h1> 
</body> 
</html>

QuizServlet.java 
package mypack; 
import java.io.*; 
import java.sql.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
public class QuizServlet extends HttpServlet { 
public void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException { 
response.setContentType("text/html;charset=UTF-8"); 
PrintWriter out = response.getWriter(); 
out.println("<form action=ShowResult >");
try { 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qadb","root","root"); 
Statement stmt = con.createStatement(); 
ResultSet res = stmt.executeQuery("select * from quiz"); 
out.println("<table border=1 >"); 
int qno=0; 
while(res.next()){
  qno++;
out.println("<tr><td>"+res.getString(1)+"</td>"); 
out.println("<td>"+res.getString(2)+"</td></tr>"); 
out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(3)+"></td><td>"+res.getString(3)+"</td></tr>"); 
out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(4)+"></td><td>"+res.getString(4)+"</td></tr>"); 
out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(5)+"></td><td>"+res.getString(5)+"</td></tr>"); 
out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(6)+"></td><td>"+res.getString(6)+"</td></tr>"); 
} 
}catch(Exception e){out.println(e);} 
out.println("</table>"); 
out.println("<input type=reset >"); 
out.println("<input type=submit value=SUBMIT >"); 
out.println("</form>"); } }


ShowResult.java

package mypack; 
import java.io.*; 
import java.sql.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
public class ShowResult extends HttpServlet { 
public void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException { 
response.setContentType("text/html;charset=UTF-8"); 
PrintWriter out = response.getWriter(); 
try { 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qadb","root","root"); 
Statement stmt = con.createStatement(); 
ResultSet res = stmt.executeQuery("select ans from quiz"); 
int count =0, qno=0; 
while(res. next()){ 
if(res.getString(1).equals(request.getParameter(""+(++qno)))) 
{ count++; 
out.println("<h1>Correct </h1>"); 
} 
else { 
out.println("<h1>Incorrect </h1>"); 
} 
} 
out.println("<h1>Your Score is "+count+" </h1>"); 
}catch(Exception e){out.println(e);}}}¬¬





