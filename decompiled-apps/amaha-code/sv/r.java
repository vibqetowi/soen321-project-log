package sv;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sv.c;
/* compiled from: Http2Writer.kt */
/* loaded from: classes2.dex */
public final class r implements Closeable {
    public static final Logger A = Logger.getLogger(d.class.getName());

    /* renamed from: u  reason: collision with root package name */
    public final zv.g f32207u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f32208v;

    /* renamed from: w  reason: collision with root package name */
    public final zv.e f32209w;

    /* renamed from: x  reason: collision with root package name */
    public int f32210x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f32211y;

    /* renamed from: z  reason: collision with root package name */
    public final c.b f32212z;

    public r(zv.g gVar, boolean z10) {
        this.f32207u = gVar;
        this.f32208v = z10;
        zv.e eVar = new zv.e();
        this.f32209w = eVar;
        this.f32210x = 16384;
        this.f32212z = new c.b(eVar);
    }

    public final synchronized void P(boolean z10, int i6, zv.e eVar, int i10) {
        if (!this.f32211y) {
            e(i6, i10, 0, z10 ? 1 : 0);
            if (i10 > 0) {
                kotlin.jvm.internal.i.d(eVar);
                this.f32207u.n(eVar, i10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(u peerSettings) {
        int i6;
        int i10;
        kotlin.jvm.internal.i.g(peerSettings, "peerSettings");
        if (!this.f32211y) {
            int i11 = this.f32210x;
            int i12 = peerSettings.f32220a;
            if ((i12 & 32) != 0) {
                i11 = peerSettings.f32221b[5];
            }
            this.f32210x = i11;
            if ((i12 & 2) != 0) {
                i6 = peerSettings.f32221b[1];
            } else {
                i6 = -1;
            }
            if (i6 != -1) {
                c.b bVar = this.f32212z;
                if ((i12 & 2) != 0) {
                    i10 = peerSettings.f32221b[1];
                } else {
                    i10 = -1;
                }
                bVar.getClass();
                int min = Math.min(i10, 16384);
                int i13 = bVar.f32118e;
                if (i13 != min) {
                    if (min < i13) {
                        bVar.f32116c = Math.min(bVar.f32116c, min);
                    }
                    bVar.f32117d = true;
                    bVar.f32118e = min;
                    int i14 = bVar.f32121i;
                    if (min < i14) {
                        if (min == 0) {
                            is.i.N1(bVar.f, null);
                            bVar.f32119g = bVar.f.length - 1;
                            bVar.f32120h = 0;
                            bVar.f32121i = 0;
                        } else {
                            bVar.a(i14 - min);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.f32207u.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f32211y = true;
        this.f32207u.close();
    }

    public final void e(int i6, int i10, int i11, int i12) {
        boolean z10;
        Level level = Level.FINE;
        Logger logger = A;
        boolean z11 = false;
        if (logger.isLoggable(level)) {
            d.f32122a.getClass();
            logger.fine(d.a(i6, i10, i11, i12, false));
        }
        if (i10 <= this.f32210x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((Integer.MIN_VALUE & i6) == 0) {
                z11 = true;
            }
            if (z11) {
                byte[] bArr = mv.b.f25755a;
                zv.g gVar = this.f32207u;
                kotlin.jvm.internal.i.g(gVar, "<this>");
                gVar.writeByte((i10 >>> 16) & 255);
                gVar.writeByte((i10 >>> 8) & 255);
                gVar.writeByte(i10 & 255);
                gVar.writeByte(i11 & 255);
                gVar.writeByte(i12 & 255);
                gVar.writeInt(i6 & SubsamplingScaleImageView.TILE_SIZE_AUTO);
                return;
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Integer.valueOf(i6), "reserved bit set: ").toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f32210x + ": " + i10).toString());
    }

    public final synchronized void f(int i6, long j10) {
        boolean z10;
        if (!this.f32211y) {
            if (j10 != 0 && j10 <= 2147483647L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                e(i6, 4, 8, 0);
                this.f32207u.writeInt((int) j10);
                this.f32207u.flush();
            } else {
                throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f32211y) {
            this.f32207u.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(int i6, a aVar, byte[] bArr) {
        boolean z10;
        if (!this.f32211y) {
            boolean z11 = false;
            if (aVar.f32096u != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                e(0, bArr.length + 8, 7, 0);
                this.f32207u.writeInt(i6);
                this.f32207u.writeInt(aVar.f32096u);
                if (bArr.length == 0) {
                    z11 = true;
                }
                if (!z11) {
                    this.f32207u.write(bArr);
                }
                this.f32207u.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(int i6, ArrayList arrayList, boolean z10) {
        int i10;
        if (!this.f32211y) {
            this.f32212z.d(arrayList);
            long j10 = this.f32209w.f39885v;
            long min = Math.min(this.f32210x, j10);
            int i11 = (j10 > min ? 1 : (j10 == min ? 0 : -1));
            if (i11 == 0) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (z10) {
                i10 |= 1;
            }
            e(i6, (int) min, 1, i10);
            this.f32207u.n(this.f32209w, min);
            if (i11 > 0) {
                o(i6, j10 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void i(int i6, int i10, boolean z10) {
        int i11;
        if (!this.f32211y) {
            if (z10) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            e(0, 8, 6, i11);
            this.f32207u.writeInt(i6);
            this.f32207u.writeInt(i10);
            this.f32207u.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void j(int i6, a errorCode) {
        boolean z10;
        kotlin.jvm.internal.i.g(errorCode, "errorCode");
        if (!this.f32211y) {
            if (errorCode.f32096u != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                e(i6, 4, 3, 0);
                this.f32207u.writeInt(errorCode.f32096u);
                this.f32207u.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m(u settings) {
        int i6;
        kotlin.jvm.internal.i.g(settings, "settings");
        if (!this.f32211y) {
            e(0, Integer.bitCount(settings.f32220a) * 6, 4, 0);
            int i10 = 0;
            while (i10 < 10) {
                int i11 = i10 + 1;
                boolean z10 = true;
                if (((1 << i10) & settings.f32220a) == 0) {
                    z10 = false;
                }
                if (z10) {
                    if (i10 != 4) {
                        if (i10 != 7) {
                            i6 = i10;
                        } else {
                            i6 = 4;
                        }
                    } else {
                        i6 = 3;
                    }
                    this.f32207u.writeShort(i6);
                    this.f32207u.writeInt(settings.f32221b[i10]);
                }
                i10 = i11;
            }
            this.f32207u.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void o(int i6, long j10) {
        int i10;
        while (j10 > 0) {
            long min = Math.min(this.f32210x, j10);
            j10 -= min;
            int i11 = (int) min;
            if (j10 == 0) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            e(i6, i11, 9, i10);
            this.f32207u.n(this.f32209w, min);
        }
    }
}
