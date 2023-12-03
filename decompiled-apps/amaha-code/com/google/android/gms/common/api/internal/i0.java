package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.appsflyer.R;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class i0<T> implements ya.d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f f7389a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7390b;

    /* renamed from: c  reason: collision with root package name */
    public final a<?> f7391c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7392d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7393e;

    public i0(f fVar, int i6, a aVar, long j10, long j11) {
        this.f7389a = fVar;
        this.f7390b = i6;
        this.f7391c = aVar;
        this.f7392d = j10;
        this.f7393e = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
        if (r2 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
        if (r2 == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v9.d b(b0<?> b0Var, v9.b<?> bVar, int i6) {
        v9.d dVar;
        v9.x0 x0Var = bVar.Q;
        if (x0Var == null) {
            dVar = null;
        } else {
            dVar = x0Var.f34962x;
        }
        if (dVar != null && dVar.f34872v) {
            int[] iArr = dVar.f34874x;
            boolean z10 = true;
            if (iArr == null) {
                int[] iArr2 = dVar.f34876z;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            if (iArr2[i10] == i6) {
                                break;
                            }
                            i10++;
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (b0Var.f7353l < dVar.f34875y) {
                    return dVar;
                }
            } else {
                int length2 = iArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        if (iArr[i11] == i6) {
                            break;
                        }
                        i11++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // ya.d
    public final void a(ya.h<T> hVar) {
        boolean z10;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        int i15;
        boolean z11;
        boolean z12;
        f fVar = this.f7389a;
        if (!fVar.a()) {
            return;
        }
        v9.q qVar = v9.p.a().f34931a;
        if (qVar != null && !qVar.f34933v) {
            return;
        }
        b0 b0Var = (b0) fVar.D.get(this.f7391c);
        if (b0Var != null) {
            a.e eVar = b0Var.f7344b;
            if (eVar instanceof v9.b) {
                v9.b bVar = (v9.b) eVar;
                long j11 = this.f7392d;
                int i16 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i16 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i17 = bVar.L;
                if (qVar != null) {
                    z10 &= qVar.f34934w;
                    if (bVar.Q != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i6 = qVar.f34935x;
                    i11 = qVar.f34932u;
                    if (z11 && !bVar.d()) {
                        v9.d b10 = b(b0Var, bVar, this.f7390b);
                        if (b10 == null) {
                            return;
                        }
                        if (b10.f34873w && i16 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i10 = b10.f34875y;
                        z10 = z12;
                    } else {
                        i10 = qVar.f34936y;
                    }
                } else {
                    i6 = 5000;
                    i10 = 100;
                    i11 = 0;
                }
                if (hVar.isSuccessful()) {
                    i12 = 0;
                    i13 = 0;
                } else if (hVar.isCanceled()) {
                    i12 = -1;
                    i13 = 100;
                } else {
                    Exception exception = hVar.getException();
                    if (exception instanceof ApiException) {
                        Status status = ((ApiException) exception).f7291u;
                        int i18 = status.f7298v;
                        s9.b bVar2 = status.f7301y;
                        if (bVar2 == null) {
                            i14 = -1;
                        } else {
                            i14 = bVar2.f31323v;
                        }
                        i12 = i14;
                        i13 = i18;
                    } else {
                        i12 = -1;
                        i13 = R.styleable.AppCompatTheme_switchStyle;
                    }
                }
                if (z10) {
                    long currentTimeMillis = System.currentTimeMillis();
                    i15 = (int) (SystemClock.elapsedRealtime() - this.f7393e);
                    j10 = currentTimeMillis;
                } else {
                    j11 = 0;
                    j10 = 0;
                    i15 = -1;
                }
                ka.d dVar = fVar.G;
                dVar.sendMessage(dVar.obtainMessage(18, new j0(new v9.l(this.f7390b, i13, i12, j11, j10, null, null, i17, i15), i11, i6, i10)));
            }
        }
    }
}
