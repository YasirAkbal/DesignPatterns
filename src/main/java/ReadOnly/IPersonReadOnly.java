/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadOnly;

/**
 *
 * @author yasir
 */
public interface IPersonReadOnly {
    /*Arayüzde sadece tam isme erişimi sağlayan get metodu var.
     *Bu sayede bu arayüz tipinden referansın tuttuğu Person nesnelerinin sadece getName metoduna erişim olacak.
     *Değerlerin değiştirilmesi engellenecek.
    */
    public String getName();
}
