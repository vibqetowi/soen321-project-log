package com.google.protobuf;
/* compiled from: RawMessageInfo.java */
/* loaded from: classes.dex */
public final class d1 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f9900a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9901b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f9902c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9903d;

    public d1(v vVar, String str, Object[] objArr) {
        this.f9900a = vVar;
        this.f9901b = str;
        this.f9902c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9903d = charAt;
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
                this.f9903d = i6 | (charAt2 << i11);
                return;
            }
        }
    }

    @Override // com.google.protobuf.o0
    public final boolean a() {
        if ((this.f9903d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.o0
    public final q0 b() {
        return this.f9900a;
    }

    @Override // com.google.protobuf.o0
    public final int c() {
        if ((this.f9903d & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final Object[] d() {
        return this.f9902c;
    }

    public final String e() {
        return this.f9901b;
    }
}
