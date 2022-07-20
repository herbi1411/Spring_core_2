package hello.core2;

import hello.core2.member.Grade;
import hello.core2.member.Member;
import hello.core2.member.MemberServiceImpl;
import hello.core2.order.Order;
import hello.core2.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberServiceImpl memberService = new MemberServiceImpl();
        OrderServiceImpl orderService = new OrderServiceImpl();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}