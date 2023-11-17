/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.doaa;

/**
 *
 * @author top net
 */
public class Doaa {

    public static int FindIntersection(Node x, Node y) {
    // Initialize two pointers, 'a' and 'b', to the head nodes of the input linked lists
    Node a = x, b = y;
    // Traverse the linked lists until the pointers meet or reach the end of the lists
    while (a != b) {
        // If pointer 'a' reaches the end of its list, reset it to the head of the other list
        if (a == null) {
            a = y;
        } else {
            // Move pointer 'a' to the next node in its list
            a = a.next;
        }
        // If pointer 'b' reaches the end of its list, reset it to the head of the other list
        if (b == null) {
            b = x;
        } else {
            // Move pointer 'b' to the next node in its list
            b = b.next;
        }
    }
    // Check if both pointers are null, indicating no intersection point was found
    if (a == null || b == null) {
        // Return a sentinel value (-1000) to indicate no intersection
        return -1000;
    }
    // Return the data value at the intersection point
    return a.data;
}

    public static void main(String[] args) {
        Node head = new Node();

        head.data = 20;

        head.next = new Node();

        head.next.data = 30;

        head.next.next = new Node();

        head.next.next.data = 40;

        head.next.next.next = new Node();

        head.next.next.next.data = 9;

        head.next.next.next.next = new Node();
        head.next.next.next.next.data = 18;
        head.next.next.next.next.next = new Node();
        head.next.next.next.next.next.data = 35;
        Node head2 = new Node();
        head2.data = 3;
        head2.next = new Node();
        head2.next.data = 6;
        head2.next.next = head.next.next.next;
        int joinPointData = FindIntersection(head, head2);
        System.out.println("Name: Doa'a Osama 202211770");
        System.out.println("The point is : "+joinPointData); // 9
    }
}
