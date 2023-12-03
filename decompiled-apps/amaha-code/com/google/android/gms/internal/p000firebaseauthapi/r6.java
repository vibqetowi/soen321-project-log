package com.google.android.gms.internal.p000firebaseauthapi;

import v.h;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r6  reason: invalid package */
/* loaded from: classes.dex */
public final class r6 extends d7 {

    /* renamed from: b  reason: collision with root package name */
    public final String f8106b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8107c;

    public /* synthetic */ r6(String str, int i6) {
        super(2);
        this.f8106b = str;
        this.f8107c = i6;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.f8106b;
        int d10 = h.d(this.f8107c);
        if (d10 != 1) {
            if (d10 != 2) {
                if (d10 != 3) {
                    if (d10 != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
