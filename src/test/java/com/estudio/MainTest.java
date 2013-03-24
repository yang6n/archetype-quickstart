/*
 * -----------------------------------------------------------------
 * Copyright (c) 2012 EStudio, All Rights Reserved.
 * This software is the proprietary information of EStudio,
 * Use is subject to strict licensing terms.
 * -----------------------------------------------------------------
 */
package com.estudio;

import static org.junit.Assert.*;

import org.junit.Test;

import com.estudio.utils.log.L;

/**
 * @author yang
 * @version 1.0 - Sep 26, 2012
 *
 */
public class MainTest
{

    @Test
    public void test()
    {
    	new Main();
    	Main.main(null);
        assertTrue("Dummy test", true);
        L.debug(getClass(), "What");
    }

}
