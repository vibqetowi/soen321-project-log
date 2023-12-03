package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class f7 implements t6 {

    /* renamed from: a  reason: collision with root package name */
    public final v6 f8378a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8379b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f8380c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8381d;

    public f7(w5 w5Var, String str, Object[] objArr) {
        this.f8378a = w5Var;
        this.f8379b = str;
        this.f8380c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f8381d = charAt;
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
                this.f8381d = i6 | (charAt2 << i11);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.t6
    public final v6 a() {
        return this.f8378a;
    }

    @Override // com.google.android.gms.internal.measurement.t6
    public final boolean b() {
        if ((this.f8381d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.t6
    public final int c() {
        if ((this.f8381d & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final String d() {
        return this.f8379b;
    }

    public final Object[] e() {
        return this.f8380c;
    }
}
