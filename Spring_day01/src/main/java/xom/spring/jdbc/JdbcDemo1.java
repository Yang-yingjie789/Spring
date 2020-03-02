package xom.spring.jdbc;

import java.sql.*;

/***
 * 程序的耦合
 *     耦合：程序间的依赖关系
 *         包括：类之间的依赖
 *               方法见的依赖
 *     解耦合
 *         降低程序间的依赖关系
 *         实际开发中：
 *          应该做到，编译期不依赖，运行时才依赖
 *      解耦合的思路：
 *          第一步：使用反射来创建对象，而避免使用new关键字
 *          第二步：通过读取配置文件来获取要创建的对象全限定类名
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws SQLException {
        //注册驱动
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        //获取连接
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel?useSSL=true&serverTimezone=GMT","root","123");
        //获取操作数据库的预处理对象
        PreparedStatement pstm=connection.prepareStatement("SELECT * FROM tab_category");
        //执行查询条件，得到结果集
        ResultSet result=pstm.executeQuery();
        //遍历结果集合
        while (result.next()){

            System.out.println(result.getString("cid")+"--"+result.getString("cname"));
        }
        //释放资源
        result.close();
        pstm.close();
        connection.close();


    }
}

