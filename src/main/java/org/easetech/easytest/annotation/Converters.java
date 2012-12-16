package org.easetech.easytest.annotation;

import org.easetech.easytest.converter.Converter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to be used for declaring the converters
 * to be used in the Test Class.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD , ElementType.TYPE})
public @interface Converters {
    
    /**
     * An array of {@link Converter} classes to be registered with the EasyTest framework
     * @return an array of {@link Converter}s
     */
    Class<? extends Converter>[] value() ;

}