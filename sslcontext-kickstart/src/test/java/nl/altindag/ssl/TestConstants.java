/*
 * Copyright 2019 Thunderberry.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.altindag.ssl;

/**
 * @author Hakan Altindag
 */
public class TestConstants {

    public static final String IDENTITY_FILE_NAME = "identity.jks";
    public static final String TRUSTSTORE_FILE_NAME = "truststore.jks";

    public static final char[] IDENTITY_PASSWORD = "secret".toCharArray();
    public static final char[] TRUSTSTORE_PASSWORD = "secret".toCharArray();
    public static final String KEYSTORE_LOCATION = "keystore/";
    public static final String HOME_DIRECTORY = System.getProperty("user.home");
    public static final String EMPTY = "";

}
