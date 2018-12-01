/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

/**
 *
 * @author Modupe Okenla
 */
public interface iBaseRate {
    default double getBaseRate() {
        return 2.5;
    }
}
