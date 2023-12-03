package c8;

import c9.q;
import java.io.EOFException;
/* compiled from: OggPacket.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f5091a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final q f5092b = new q(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    public int f5093c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f5094d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5095e;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(u7.i iVar) {
        boolean z10;
        int i6;
        int i10;
        boolean z11;
        int i11;
        boolean z12 = this.f5095e;
        q qVar = this.f5092b;
        if (z12) {
            this.f5095e = false;
            qVar.x(0);
        }
        while (true) {
            boolean z13 = true;
            if (this.f5095e) {
                return true;
            }
            int i12 = this.f5093c;
            e eVar = this.f5091a;
            if (i12 < 0) {
                if (!eVar.b(iVar, -1L) || !eVar.a(iVar, true)) {
                    break;
                }
                int i13 = eVar.f5099d;
                if ((eVar.f5096a & 1) == 1 && qVar.f5188c == 0) {
                    this.f5094d = 0;
                    int i14 = 0;
                    do {
                        int i15 = this.f5094d;
                        int i16 = 0 + i15;
                        if (i16 >= eVar.f5098c) {
                            break;
                        }
                        this.f5094d = i15 + 1;
                        i11 = eVar.f[i16];
                        i14 += i11;
                    } while (i11 == 255);
                    i13 += i14;
                    i10 = this.f5094d + 0;
                } else {
                    i10 = 0;
                }
                try {
                    iVar.l(i13);
                    z11 = true;
                } catch (EOFException unused) {
                    z11 = false;
                }
                if (!z11) {
                    return false;
                }
                this.f5093c = i10;
            }
            int i17 = this.f5093c;
            this.f5094d = 0;
            int i18 = 0;
            do {
                int i19 = this.f5094d;
                int i20 = i17 + i19;
                if (i20 >= eVar.f5098c) {
                    break;
                }
                this.f5094d = i19 + 1;
                i6 = eVar.f[i20];
                i18 += i6;
            } while (i6 == 255);
            int i21 = this.f5093c + this.f5094d;
            if (i18 > 0) {
                qVar.a(qVar.f5188c + i18);
                try {
                    iVar.readFully(qVar.f5186a, qVar.f5188c, i18);
                    z10 = true;
                } catch (EOFException unused2) {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
                qVar.z(qVar.f5188c + i18);
                if (eVar.f[i21 - 1] == 255) {
                    z13 = false;
                }
                this.f5095e = z13;
            }
            if (i21 == eVar.f5098c) {
                i21 = -1;
            }
            this.f5093c = i21;
        }
    }
}
