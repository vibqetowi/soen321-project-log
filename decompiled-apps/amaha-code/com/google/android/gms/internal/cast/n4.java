package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class n4 implements a4 {

    /* renamed from: a  reason: collision with root package name */
    public final c4 f7607a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7608b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f7609c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7610d;

    public n4(c3 c3Var, String str, Object[] objArr) {
        char charAt;
        this.f7607a = c3Var;
        this.f7608b = str;
        this.f7609c = objArr;
        int i6 = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    charAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        charAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e10) {
                        e = e10;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                e = e11;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e12) {
                e = e12;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (charAt < 55296) {
            this.f7610d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        while (true) {
            int i12 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i6 = i12;
            } else {
                this.f7610d = (charAt2 << i11) | i10;
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.a4
    public final boolean a() {
        if ((this.f7610d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.a4
    public final c4 b() {
        return this.f7607a;
    }

    @Override // com.google.android.gms.internal.cast.a4
    public final int c() {
        if ((this.f7610d & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final String d() {
        return this.f7608b;
    }

    public final Object[] e() {
        return this.f7609c;
    }
}
