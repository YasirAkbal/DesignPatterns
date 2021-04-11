package Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasir
 */
public interface IIterator<T> {
    public T next();
    public boolean hasNext();
}
