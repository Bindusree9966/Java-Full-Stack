package JDBC.BASICS;


import java.sql.*;

public class JD {
    private static final String url = "jdbc:mysql://localhost:3306/sms2";
    private static final String userName = "root";
    private static final String password = "Bindu@9966";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);
        //   Statement st=con.createStatement();
        //String query = "Select * from Student";
//        PreparedStatement ps = con.prepareStatement(query);
//        ResultSet rs = ps.executeQuery(query);
//        while (rs.next()) {
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            String email = rs.getString("email");
//            int marks = rs.getInt("marks");
//
//            System.out.println(id);
//            System.out.println(name);
//            System.out.println(email);
//            System.out.println(marks);
//        }
//    }
//}
        //Insert values
//        String query = "INSERT INTO student (id, name, email, marks) VALUES (?, ?, ?, ?)";
//
//        PreparedStatement ps = con.prepareStatement(query);
//
//        ps.setInt(1, 2);
//        ps.setString(2, "hema");
//        ps.setString(3, "hema@gmail.com");
//        ps.setInt(4, 90);
//
//        int myRes = ps.executeUpdate();
//
//        if (myRes > 0) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Fail");
//        }
//    }
//}

        //Update values

//        String query=String.format("Update Student SET marks =%d where id=%d",80,2);
//        int res=st.executeUpdate(query);
//        if(res>0){
//            System.out.println("Success");
//        }
//        else{
//            System.out.println("Failed");
//        }
//        String query = "UPDATE Student SET marks = ? WHERE id = ?";
//
//        PreparedStatement ps = con.prepareStatement(query);
//
//        ps.setInt(1, 80); // marks
//        ps.setInt(2, 2);  // id
//
//        int res = ps.executeUpdate();
//
//        if (res > 0) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Failed");
//        }
//    }
//}

        //Delete
//
//        String query=String.format("Delete from student where id=%d",2);
//        int rowsFull=st.executeUpdate(query);
//        if(rowsFull>0){
//            System.out.println("Deleted");
//        }
//        else{
//            System.out.println("Not Deleted");
//        }
//
//    }
//}
        String query = "DELETE FROM student WHERE id = ?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, 2); // id

        int rowsFull = ps.executeUpdate();

        if (rowsFull > 0) {
            System.out.println("Deleted");
        } else {
            System.out.println("Not Deleted");
        }
    }
}
