package com.google.protobuf;
/* compiled from: ExtensionSchemas.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final p f10015a = new p();

    /* renamed from: b  reason: collision with root package name */
    public static final o<?> f10016b;

    static {
        o<?> oVar;
        try {
            oVar = (o) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            oVar = null;
        }
        f10016b = oVar;
    }
}
