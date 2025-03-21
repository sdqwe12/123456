package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ItemDB {

    private String dburl = "jdbc:mysql://127.0.0.1:3306/aaa";
    private String dbUser = "root";
    private String dbPassword = "1234";

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public List<Item> findAll() {
        List<Item> list = new ArrayList<>();


        try {
            con = DriverManager.getConnection(dburl, dbUser, dbPassword);
            pstmt = con.prepareStatement("select * from item");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Item item1 = new Item();
                item1.setItem_nm(rs.getString("item_nm"));
                item1.setPrice(rs.getInt("price"));
                item1.setItem_id(rs.getLong("item_id"));
                item1.setReg_time(rs.getString("reg_time"));
                item1.setItem_detail(rs.getString("item_detail"));
                item1.setItem_sell_status(rs.getString("item_sell_status"));
                item1.setPrice(1000);

                list.add(item1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


//        Item item2 = new Item();
//        item1.setItem_nm("사과");
//        item1.setPrice(2000);
//
//        Item item3 = new Item();
//        item1.setItem_nm("바나나");
//        item1.setPrice(3000);


//        list.add(item2);
//        list.add(item3);

        return list;


    }
}
