/**
 * Copyright (c) 2016, Mingle. All rights reserved.
 */
package org.mingle.pear.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * 邮件工具类
 *
 * @author Mingle
 * @since 1.8
 */
public abstract class MailUtils {
    public static String decryptPassword(String password) {
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword("password");

        return basicTextEncryptor.decrypt(password);
    }
}