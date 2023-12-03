package ie;

import com.google.protobuf.h;
import java.math.RoundingMode;
/* compiled from: IndexByteEncoder.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final f f19995a = new f();

    /* renamed from: b  reason: collision with root package name */
    public final a f19996b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final b f19997c = new b();

    /* compiled from: IndexByteEncoder.java */
    /* loaded from: classes.dex */
    public class a extends com.android.volley.toolbox.a {
        public a() {
        }

        @Override // com.android.volley.toolbox.a
        public final void t(h hVar) {
            f fVar = c.this.f19995a;
            fVar.getClass();
            for (int i6 = 0; i6 < hVar.size(); i6++) {
                fVar.b(hVar.m(i6));
            }
            fVar.d((byte) 0);
            fVar.d((byte) 1);
        }

        @Override // com.android.volley.toolbox.a
        public final void u(double d10) {
            long j10;
            f fVar = c.this.f19995a;
            fVar.getClass();
            long doubleToLongBits = Double.doubleToLongBits(d10);
            if (doubleToLongBits < 0) {
                j10 = -1;
            } else {
                j10 = Long.MIN_VALUE;
            }
            long j11 = doubleToLongBits ^ j10;
            int a10 = e.a(64 - Long.numberOfLeadingZeros(j11), 8, RoundingMode.UP);
            fVar.a(a10 + 1);
            byte[] bArr = fVar.f20002a;
            int i6 = fVar.f20003b;
            int i10 = i6 + 1;
            fVar.f20003b = i10;
            bArr[i6] = (byte) a10;
            int i11 = i10 + a10;
            while (true) {
                i11--;
                int i12 = fVar.f20003b;
                if (i11 >= i12) {
                    fVar.f20002a[i11] = (byte) (255 & j11);
                    j11 >>>= 8;
                } else {
                    fVar.f20003b = i12 + a10;
                    return;
                }
            }
        }

        @Override // com.android.volley.toolbox.a
        public final void v() {
            f fVar = c.this.f19995a;
            fVar.d((byte) -1);
            fVar.d((byte) -1);
        }

        @Override // com.android.volley.toolbox.a
        public final void x(long j10) {
            c.this.f19995a.f(j10);
        }

        @Override // com.android.volley.toolbox.a
        public final void y(String str) {
            f fVar = c.this.f19995a;
            fVar.getClass();
            int length = str.length();
            int i6 = 0;
            while (i6 < length) {
                char charAt = str.charAt(i6);
                if (charAt < 128) {
                    fVar.b((byte) charAt);
                } else if (charAt < 2048) {
                    fVar.b((byte) ((charAt >>> 6) | 960));
                    fVar.b((byte) ((charAt & '?') | 128));
                } else if (charAt >= 55296 && 57343 >= charAt) {
                    int codePointAt = Character.codePointAt(str, i6);
                    i6++;
                    fVar.b((byte) ((codePointAt >>> 18) | 240));
                    fVar.b((byte) (((codePointAt >>> 12) & 63) | 128));
                    fVar.b((byte) (((codePointAt >>> 6) & 63) | 128));
                    fVar.b((byte) ((codePointAt & 63) | 128));
                } else {
                    fVar.b((byte) ((charAt >>> '\f') | 480));
                    fVar.b((byte) (((charAt >>> 6) & 63) | 128));
                    fVar.b((byte) ((charAt & '?') | 128));
                }
                i6++;
            }
            fVar.d((byte) 0);
            fVar.d((byte) 1);
        }
    }

    /* compiled from: IndexByteEncoder.java */
    /* loaded from: classes.dex */
    public class b extends com.android.volley.toolbox.a {
        public b() {
        }

        @Override // com.android.volley.toolbox.a
        public final void t(h hVar) {
            f fVar = c.this.f19995a;
            fVar.getClass();
            for (int i6 = 0; i6 < hVar.size(); i6++) {
                fVar.c(hVar.m(i6));
            }
            fVar.e((byte) 0);
            fVar.e((byte) 1);
        }

        @Override // com.android.volley.toolbox.a
        public final void u(double d10) {
            long j10;
            f fVar = c.this.f19995a;
            fVar.getClass();
            long doubleToLongBits = Double.doubleToLongBits(d10);
            if (doubleToLongBits < 0) {
                j10 = -1;
            } else {
                j10 = Long.MIN_VALUE;
            }
            long j11 = doubleToLongBits ^ j10;
            int a10 = e.a(64 - Long.numberOfLeadingZeros(j11), 8, RoundingMode.UP);
            fVar.a(a10 + 1);
            byte[] bArr = fVar.f20002a;
            int i6 = fVar.f20003b;
            int i10 = i6 + 1;
            fVar.f20003b = i10;
            bArr[i6] = (byte) (~a10);
            int i11 = i10 + a10;
            while (true) {
                i11--;
                int i12 = fVar.f20003b;
                if (i11 >= i12) {
                    fVar.f20002a[i11] = (byte) (~(255 & j11));
                    j11 >>>= 8;
                } else {
                    fVar.f20003b = i12 + a10;
                    return;
                }
            }
        }

        @Override // com.android.volley.toolbox.a
        public final void v() {
            f fVar = c.this.f19995a;
            fVar.e((byte) -1);
            fVar.e((byte) -1);
        }

        @Override // com.android.volley.toolbox.a
        public final void x(long j10) {
            c.this.f19995a.f(~j10);
        }

        @Override // com.android.volley.toolbox.a
        public final void y(String str) {
            f fVar = c.this.f19995a;
            fVar.getClass();
            int length = str.length();
            int i6 = 0;
            while (i6 < length) {
                char charAt = str.charAt(i6);
                if (charAt < 128) {
                    fVar.c((byte) charAt);
                } else if (charAt < 2048) {
                    fVar.c((byte) ((charAt >>> 6) | 960));
                    fVar.c((byte) ((charAt & '?') | 128));
                } else if (charAt >= 55296 && 57343 >= charAt) {
                    int codePointAt = Character.codePointAt(str, i6);
                    i6++;
                    fVar.c((byte) ((codePointAt >>> 18) | 240));
                    fVar.c((byte) (((codePointAt >>> 12) & 63) | 128));
                    fVar.c((byte) (((codePointAt >>> 6) & 63) | 128));
                    fVar.c((byte) ((codePointAt & 63) | 128));
                } else {
                    fVar.c((byte) ((charAt >>> '\f') | 480));
                    fVar.c((byte) (((charAt >>> 6) & 63) | 128));
                    fVar.c((byte) ((charAt & '?') | 128));
                }
                i6++;
            }
            fVar.e((byte) 0);
            fVar.e((byte) 1);
        }
    }

    public final com.android.volley.toolbox.a a(int i6) {
        boolean z10;
        if (i6 != 0) {
            if (i6 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return this.f19997c;
            }
            return this.f19996b;
        }
        throw null;
    }
}
