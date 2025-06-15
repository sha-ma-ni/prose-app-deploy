/*
 * Copyright (c) 2025 Lyubov Shamanina
 * SPDX-License-Identifier: MIT
 *
 * This file is part of prose-app-deploy.
 *
 * This software is released under the MIT License.
 * See the LICENSE file in the project root for full license information.
 */
package de.htw_berlin.fb4.proseapp_Shamanina;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
