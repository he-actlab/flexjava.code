/*
 * @test /nodynamiccopyright/
 * @bug 6843077
 * @summary check for invalid annotatins given the target
 * @author Mahmood Ali
 * @compile/fail/ref=InvalidLocation.out -XDrawDiagnostics -source 1.8 InvalidLocation.java
 */

class InvalidLocation<K extends @A Object> {
}

@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
@interface A { }
