/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikum;

/**
 *
 * @author Dewa Pradipta
 */
public class test {
    public static void main(String[]args)
    {
        Recta r1 = new Recta(1, 1, 4, 4);
        Recta r2 = new Recta(2, 3, 5, 6);
        Recta u = r1.union(r2);
        Recta i = r1.intersection(r2);
        
        if(u.isInside(r2.x1,r2.y1))
            System.out.println("("+r2.x1 + ","+r2.y1+") is inside the union ");
            System.out.println(r1 + "union" +r2+ "=" + u);
            System.out.println(r1 + "Intersect" +r2+ "=" + 1);
            
    }
}
