package gu;

import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
/* compiled from: MessageLite.java */
/* loaded from: classes2.dex */
public interface n extends o {

    /* compiled from: MessageLite.java */
    /* loaded from: classes2.dex */
    public interface a extends Cloneable, o {
        a R(d dVar, e eVar);

        n build();
    }

    a a();

    int b();

    a c();

    void f(CodedOutputStream codedOutputStream);
}
