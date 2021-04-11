/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yasir
 */
public class Kumanda {
    
    private ArrayList<ICommand> komutlar = new ArrayList<>();
    
    public void komutEkle(ICommand komut)
    {
        komutlar.add(komut);
    }
    
    public void menu()
    {
        int girdi=0;
        Scanner scanner = new Scanner(System.in);
        
        while(girdi != -1)
        {
            menuyuYazdir();
            girdi = scanner.nextInt();
            try{
                komutlar.get(girdi-1).Command();
            }catch(IndexOutOfBoundsException e){}
        }   
    }
    
    private void menuyuYazdir()
    {
        System.out.println("Asagidan bir komut seciniz: ");
        for(int i=0;i<komutlar.size();i++)
        {
             System.out.println((i+1) +". " + komutlar.get(i));
        }
        System.out.println("Cikis icin -1 giriniz.");
        System.out.println("Seciminiz: ");
    }
}
