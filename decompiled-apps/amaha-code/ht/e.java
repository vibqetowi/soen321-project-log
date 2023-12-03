package ht;

import ta.v;
/* compiled from: AnnotationUseSiteTarget.kt */
/* loaded from: classes2.dex */
public enum e {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: u  reason: collision with root package name */
    public final String f19488u;

    e(String str) {
        this.f19488u = str == null ? v.R(name()) : str;
    }
}
