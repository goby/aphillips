package com.qrmedia.pattern.compositeannotation.validation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.qrmedia.pattern.compositeannotation.annotation.CompositeAnnotation;
import com.qrmedia.pattern.compositeannotation.annotation.LeafAnnotation;

/**
 * A composite annotation with a leaf annotation of a type without
 * {@link RetentionPolicy#RUNTIME RUNTIME} retention.
 * 
 * @author aphillips
 * @since 30 May 2009
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@CompositeAnnotation
public @interface InvalidLeafAnnotationInvalidRetention {

    // invalid as leaf members must return annotations with RUNTIME retention
    @LeafAnnotation
    ClassRetentionAnnotation invalidLeafAnnotationMember() default @ClassRetentionAnnotation;
}
