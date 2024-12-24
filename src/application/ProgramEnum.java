package application;

import java.util.Date;

import entities.OrderEnum;
import entities_enums.OrderStatus;

public class ProgramEnum {

    public static void main(String[] args) {

        OrderEnum orderenum = new OrderEnum(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(orderenum);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }

}
