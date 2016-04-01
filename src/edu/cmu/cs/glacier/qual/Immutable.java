package edu.cmu.cs.glacier.qual;

import java.lang.annotation.Target;

import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.ImplicitFor;
import javax.lang.model.type.TypeKind;

import java.lang.annotation.ElementType;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({GlacierTop.class})
@ImplicitFor(types = {  TypeKind.BOOLEAN, TypeKind.BYTE,
						TypeKind.CHAR, TypeKind.DOUBLE,
        				TypeKind.FLOAT, TypeKind.INT,
        				TypeKind.LONG, TypeKind.SHORT })
public @interface Immutable { }
