package jg;

import java.lang.reflect.Array;
/* compiled from: ByteMatrix.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22013a;

    /* renamed from: b  reason: collision with root package name */
    public int f22014b;

    /* renamed from: c  reason: collision with root package name */
    public int f22015c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f22016d;

    public b() {
        this.f22013a = 1;
        this.f22016d = new Object[16];
    }

    public final byte a(int i6, int i10) {
        return ((byte[][]) this.f22016d)[i10][i6];
    }

    public final void b(int i6, int i10, int i11) {
        ((byte[][]) this.f22016d)[i10][i6] = (byte) i11;
    }

    public final void c(int i6, int i10, boolean z10) {
        ((byte[][]) this.f22016d)[i10][i6] = z10 ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        switch (this.f22013a) {
            case 0:
                StringBuilder sb2 = new StringBuilder((this.f22014b * 2 * this.f22015c) + 2);
                for (int i6 = 0; i6 < this.f22015c; i6++) {
                    byte[] bArr = ((byte[][]) this.f22016d)[i6];
                    for (int i10 = 0; i10 < this.f22014b; i10++) {
                        byte b10 = bArr[i10];
                        if (b10 != 0) {
                            if (b10 != 1) {
                                sb2.append("  ");
                            } else {
                                sb2.append(" 1");
                            }
                        } else {
                            sb2.append(" 0");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b(int i6, int i10) {
        this.f22013a = 0;
        this.f22016d = (byte[][]) Array.newInstance(Byte.TYPE, i10, i6);
        this.f22014b = i6;
        this.f22015c = i10;
    }
}
