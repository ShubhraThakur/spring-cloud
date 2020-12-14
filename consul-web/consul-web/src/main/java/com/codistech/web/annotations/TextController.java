/**
 * Class Name:			TextController
 * Created On:			6:29:59 pm, 07-Aug-2014
 *
 * Copyright (c) 2014 Cordis Technology. All rights reserved.
 *
 * Use is subject to license terms.
 */

package com.codistech.web.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface TextController {

	String value() default "";
}
