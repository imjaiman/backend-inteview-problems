/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package objectOrientedDesign.lift;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

/**
 * @author rahul.jaiman
 * @version $Id: LiftProgram.java, v 0.1 2020-05-05 23:41 rahul.jaiman Exp $$
 */
public class LiftProgram {
    public static void main(String args[]){
        Lift lift = new LiftImpl(2,4);


    }
}