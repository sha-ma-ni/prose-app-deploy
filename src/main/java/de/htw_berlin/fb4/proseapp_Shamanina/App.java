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
import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.proseapp_Shamanina.inplementations.SimpleProse;
import de.htw_berlin.fb4.proseapp_Shamanina.inplementations.SimpleSentence;

import java.util.List;

public class App 
{
    public static void main(String[] args) {
        Sentence s1 = new SimpleSentence("Ich habe meinem Wecker verboten zu klingeln");
        Sentence s2 = new SimpleSentence("Jetzt bellt er nur noch leise wie ein schuechterner Pudding!");

        Prose prose = new SimpleProse(List.of(s1, s2));

        System.out.println(prose.get());  // Output: Hello world. GitHub Packages are cool.
    }
}
