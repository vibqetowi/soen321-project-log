package com.google.android.gms.internal.p000firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l2  reason: invalid package */
/* loaded from: classes.dex */
public final class l2 implements z1 {

    /* renamed from: a  reason: collision with root package name */
    public final b2 f7955a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7956b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f7957c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7958d;

    public l2(e1 e1Var, String str, Object[] objArr) {
        this.f7955a = e1Var;
        this.f7956b = str;
        this.f7957c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7958d = charAt;
            return;
        }
        int i6 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i6 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.f7958d = i6 | (charAt2 << i11);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z1
    public final b2 a() {
        return this.f7955a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z1
    public final boolean b() {
        if ((this.f7958d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z1
    public final int c() {
        if ((this.f7958d & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final String d() {
        return this.f7956b;
    }

    public final Object[] e() {
        return this.f7957c;
    }
}
