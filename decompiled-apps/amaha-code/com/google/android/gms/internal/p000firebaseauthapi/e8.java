package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e8  reason: invalid package */
/* loaded from: classes.dex */
public final class e8 {

    /* renamed from: a  reason: collision with root package name */
    public final b8 f7822a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7823b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f7824c;

    public /* synthetic */ e8(b8 b8Var, List list, Integer num) {
        this.f7822a = b8Var;
        this.f7823b = list;
        this.f7824c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        if (this.f7822a.equals(e8Var.f7822a) && this.f7823b.equals(e8Var.f7823b)) {
            Integer num = this.f7824c;
            Integer num2 = e8Var.f7824c;
            if (num != num2) {
                if (num != null && num.equals(num2)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7822a, this.f7823b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f7822a, this.f7823b, this.f7824c);
    }
}
