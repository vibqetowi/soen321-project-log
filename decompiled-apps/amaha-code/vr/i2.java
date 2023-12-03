package vr;

import io.grpc.StatusRuntimeException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import tr.f;
/* compiled from: MessageFramer.java */
/* loaded from: classes2.dex */
public final class i2 implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final c f35699a;

    /* renamed from: c  reason: collision with root package name */
    public n3 f35701c;

    /* renamed from: g  reason: collision with root package name */
    public final o3 f35704g;

    /* renamed from: h  reason: collision with root package name */
    public final g3 f35705h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f35706i;

    /* renamed from: j  reason: collision with root package name */
    public int f35707j;

    /* renamed from: l  reason: collision with root package name */
    public long f35709l;

    /* renamed from: b  reason: collision with root package name */
    public int f35700b = -1;

    /* renamed from: d  reason: collision with root package name */
    public tr.h f35702d = f.b.f33465a;

    /* renamed from: e  reason: collision with root package name */
    public final b f35703e = new b();
    public final ByteBuffer f = ByteBuffer.allocate(5);

    /* renamed from: k  reason: collision with root package name */
    public int f35708k = -1;

    /* compiled from: MessageFramer.java */
    /* loaded from: classes2.dex */
    public class b extends OutputStream {
        public b() {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i6, int i10) {
            i2.this.e(bArr, i6, i10);
        }

        @Override // java.io.OutputStream
        public final void write(int i6) {
            write(new byte[]{(byte) i6}, 0, 1);
        }
    }

    /* compiled from: MessageFramer.java */
    /* loaded from: classes2.dex */
    public interface c {
        void d(n3 n3Var, boolean z10, boolean z11, int i6);
    }

    public i2(c cVar, ca.a aVar, g3 g3Var) {
        sc.b.w(cVar, "sink");
        this.f35699a = cVar;
        this.f35704g = aVar;
        this.f35705h = g3Var;
    }

    public static int f(InputStream inputStream, OutputStream outputStream) {
        boolean z10;
        if (inputStream instanceof tr.p) {
            return ((tr.p) inputStream).a(outputStream);
        }
        int i6 = oc.a.f27348a;
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            z10 = false;
            if (read == -1) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
        if (j10 <= 2147483647L) {
            z10 = true;
        }
        sc.b.o("Message size overflow: %s", j10, z10);
        return (int) j10;
    }

    @Override // vr.s0
    public final s0 a(tr.h hVar) {
        sc.b.w(hVar, "Can't pass an empty compressor");
        this.f35702d = hVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[LOOP:1: B:28:0x0076->B:29:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[LOOP:2: B:31:0x0084->B:32:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[LOOP:3: B:34:0x0091->B:35:0x0093, LOOP_END] */
    @Override // vr.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(InputStream inputStream) {
        boolean z10;
        int available;
        int g5;
        if (!this.f35706i) {
            this.f35707j++;
            this.f35708k++;
            this.f35709l = 0L;
            g3 g3Var = this.f35705h;
            for (com.android.volley.toolbox.a aVar : g3Var.f35635a) {
                aVar.getClass();
            }
            if (this.f35702d != f.b.f33465a) {
                z10 = true;
            } else {
                z10 = false;
            }
            try {
                if (!(inputStream instanceof tr.a0) && !(inputStream instanceof ByteArrayInputStream)) {
                    available = -1;
                    if (available == 0 && z10) {
                        g5 = d(inputStream);
                    } else {
                        g5 = g(inputStream, available);
                    }
                    if (available == -1 && g5 != available) {
                        throw new StatusRuntimeException(tr.i0.f33487l.g(String.format("Message length inaccurate %s != %s", Integer.valueOf(g5), Integer.valueOf(available))));
                    }
                    com.android.volley.toolbox.a[] aVarArr = g3Var.f35635a;
                    for (com.android.volley.toolbox.a aVar2 : aVarArr) {
                        aVar2.getClass();
                    }
                    long j10 = this.f35709l;
                    for (com.android.volley.toolbox.a aVar3 : aVarArr) {
                        aVar3.o(j10);
                    }
                    for (com.android.volley.toolbox.a aVar4 : g3Var.f35635a) {
                        aVar4.getClass();
                    }
                    return;
                }
                available = inputStream.available();
                if (available == 0) {
                }
                g5 = g(inputStream, available);
                if (available == -1) {
                }
                com.android.volley.toolbox.a[] aVarArr2 = g3Var.f35635a;
                while (r2 < r0) {
                }
                long j102 = this.f35709l;
                while (r4 < r0) {
                }
                while (r5 < r0) {
                }
                return;
            } catch (IOException e10) {
                throw new StatusRuntimeException(tr.i0.f33487l.g("Failed to frame message").f(e10));
            } catch (RuntimeException e11) {
                throw new StatusRuntimeException(tr.i0.f33487l.g("Failed to frame message").f(e11));
            }
        }
        throw new IllegalStateException("Framer already closed");
    }

    public final void c(a aVar, boolean z10) {
        ArrayList arrayList = aVar.f35710u;
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((n3) it.next()).b();
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z10 ? (byte) 1 : (byte) 0).putInt(i6);
        wr.n d10 = this.f35704g.d(5);
        d10.write(byteBuffer.array(), 0, byteBuffer.position());
        if (i6 == 0) {
            this.f35701c = d10;
            return;
        }
        c cVar = this.f35699a;
        cVar.d(d10, false, false, this.f35707j - 1);
        this.f35707j = 1;
        for (int i10 = 0; i10 < arrayList.size() - 1; i10++) {
            cVar.d((n3) arrayList.get(i10), false, false, 0);
        }
        this.f35701c = (n3) arrayList.get(arrayList.size() - 1);
        this.f35709l = i6;
    }

    @Override // vr.s0
    public final void close() {
        n3 n3Var;
        if (!this.f35706i) {
            this.f35706i = true;
            n3 n3Var2 = this.f35701c;
            if (n3Var2 != null && n3Var2.b() == 0 && (n3Var = this.f35701c) != null) {
                n3Var.a();
                this.f35701c = null;
            }
            n3 n3Var3 = this.f35701c;
            this.f35701c = null;
            this.f35699a.d(n3Var3, true, true, this.f35707j);
            this.f35707j = 0;
        }
    }

    public final int d(InputStream inputStream) {
        a aVar = new a();
        OutputStream c10 = this.f35702d.c(aVar);
        try {
            int f = f(inputStream, c10);
            c10.close();
            int i6 = this.f35700b;
            if (i6 >= 0 && f > i6) {
                throw new StatusRuntimeException(tr.i0.f33486k.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(f), Integer.valueOf(this.f35700b))));
            }
            c(aVar, true);
            return f;
        } catch (Throwable th2) {
            c10.close();
            throw th2;
        }
    }

    public final void e(byte[] bArr, int i6, int i10) {
        while (i10 > 0) {
            n3 n3Var = this.f35701c;
            if (n3Var != null && n3Var.c() == 0) {
                n3 n3Var2 = this.f35701c;
                this.f35701c = null;
                this.f35699a.d(n3Var2, false, false, this.f35707j);
                this.f35707j = 0;
            }
            if (this.f35701c == null) {
                this.f35701c = this.f35704g.d(i10);
            }
            int min = Math.min(i10, this.f35701c.c());
            this.f35701c.write(bArr, i6, min);
            i6 += min;
            i10 -= min;
        }
    }

    @Override // vr.s0
    public final void flush() {
        n3 n3Var = this.f35701c;
        if (n3Var != null && n3Var.b() > 0) {
            n3 n3Var2 = this.f35701c;
            this.f35701c = null;
            this.f35699a.d(n3Var2, false, true, this.f35707j);
            this.f35707j = 0;
        }
    }

    public final int g(InputStream inputStream, int i6) {
        if (i6 != -1) {
            this.f35709l = i6;
            int i10 = this.f35700b;
            if (i10 >= 0 && i6 > i10) {
                throw new StatusRuntimeException(tr.i0.f33486k.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i6), Integer.valueOf(this.f35700b))));
            }
            ByteBuffer byteBuffer = this.f;
            byteBuffer.clear();
            byteBuffer.put((byte) 0).putInt(i6);
            if (this.f35701c == null) {
                this.f35701c = this.f35704g.d(byteBuffer.position() + i6);
            }
            e(byteBuffer.array(), 0, byteBuffer.position());
            return f(inputStream, this.f35703e);
        }
        a aVar = new a();
        int f = f(inputStream, aVar);
        int i11 = this.f35700b;
        if (i11 >= 0 && f > i11) {
            throw new StatusRuntimeException(tr.i0.f33486k.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(f), Integer.valueOf(this.f35700b))));
        }
        c(aVar, false);
        return f;
    }

    @Override // vr.s0
    public final void h(int i6) {
        boolean z10;
        if (this.f35700b == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("max size already set", z10);
        this.f35700b = i6;
    }

    @Override // vr.s0
    public final boolean isClosed() {
        return this.f35706i;
    }

    /* compiled from: MessageFramer.java */
    /* loaded from: classes2.dex */
    public final class a extends OutputStream {

        /* renamed from: u  reason: collision with root package name */
        public final ArrayList f35710u = new ArrayList();

        /* renamed from: v  reason: collision with root package name */
        public n3 f35711v;

        public a() {
        }

        @Override // java.io.OutputStream
        public final void write(int i6) {
            n3 n3Var = this.f35711v;
            if (n3Var != null && n3Var.c() > 0) {
                this.f35711v.d((byte) i6);
            } else {
                write(new byte[]{(byte) i6}, 0, 1);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i6, int i10) {
            n3 n3Var = this.f35711v;
            ArrayList arrayList = this.f35710u;
            i2 i2Var = i2.this;
            if (n3Var == null) {
                wr.n d10 = i2Var.f35704g.d(i10);
                this.f35711v = d10;
                arrayList.add(d10);
            }
            while (i10 > 0) {
                int min = Math.min(i10, this.f35711v.c());
                if (min == 0) {
                    wr.n d11 = i2Var.f35704g.d(Math.max(i10, this.f35711v.b() * 2));
                    this.f35711v = d11;
                    arrayList.add(d11);
                } else {
                    this.f35711v.write(bArr, i6, min);
                    i6 += min;
                    i10 -= min;
                }
            }
        }
    }
}
