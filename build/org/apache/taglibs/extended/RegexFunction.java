/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package org.apache.taglibs.extended;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Provides regular expression based methods to the EL
 */
public class RegexFunction {

    /**
     * Run a regex replace on the first match in the input String.
     * Akin to java.lang.String.replaceFirst
     */
    public static String replaceFirst(String input, String regex, String with) {
        return input.replaceFirst(regex, with);
    }

    /**
     * Run a regex replace on the all matches in the input String.
     * Akin to java.lang.String.replaceAll
     */
    public static String replaceAll(String input, String regex, String with) {
        return input.replaceAll(regex, with);
    }

}
