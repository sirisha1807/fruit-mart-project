package com.sheryians.major.global;

import com.sheryians.major.model.product;
import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<product> cart;
    static{
        cart = new ArrayList<product>();
    }

}
