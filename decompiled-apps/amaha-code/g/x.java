package g;

import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.p000firebaseauthapi.b6;
import com.google.android.gms.internal.p000firebaseauthapi.fb;
import com.google.android.gms.internal.p000firebaseauthapi.jf;
import com.google.android.gms.internal.p000firebaseauthapi.kd;
import com.google.android.gms.internal.p000firebaseauthapi.ke;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.android.gms.internal.p000firebaseauthapi.me;
import com.google.android.gms.internal.p000firebaseauthapi.n0;
import com.google.android.gms.internal.p000firebaseauthapi.p2;
import com.google.android.gms.internal.p000firebaseauthapi.qd;
import com.google.android.gms.internal.p000firebaseauthapi.r1;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.gms.internal.p000firebaseauthapi.se;
import com.google.android.gms.internal.p000firebaseauthapi.w5;
import com.google.android.gms.internal.p000firebaseauthapi.x5;
import com.google.android.gms.internal.p000firebaseauthapi.yd;
import com.google.android.gms.internal.p000firebaseauthapi.z5;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.crypto.Mac;
import k9.e0;
import k9.f0;
import ta.j6;
import ta.r3;
import ta.t4;
import ta.u2;
import ta.w2;
import ta.y3;
/* compiled from: LayoutIncludeDetector.java */
/* loaded from: classes.dex */
public final class x implements h4.d, v4.b, com.google.android.exoplayer2.source.q, com.google.android.gms.common.api.internal.n, r1, w5, se, j6, mc.o {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f16142u;

    /* renamed from: v  reason: collision with root package name */
    public Object f16143v;

    public /* synthetic */ x() {
        this.f16142u = 28;
    }

    public static void D(x xVar, com.google.android.gms.internal.p000firebaseauthapi.m mVar, p2 p2Var, se seVar) {
        boolean z10;
        Status a10;
        if (!mVar.f7970u && TextUtils.isEmpty(mVar.F)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            fd.x a11 = mVar.a();
            String str = mVar.f7974y;
            String str2 = mVar.H;
            if (mVar.f7970u) {
                a10 = new Status(17012, null);
            } else {
                a10 = gd.i.a(mVar.F);
            }
            kd kdVar = new kd(a10, a11, str, str2);
            p2Var.getClass();
            try {
                ((yd) p2Var.f8038v).f(kdVar);
                return;
            } catch (RemoteException e10) {
                ((y9.a) p2Var.f8039w).b("RemoteException when sending failure result with credential", e10, new Object[0]);
                return;
            }
        }
        xVar.z(new jf(mVar.f7972w, mVar.f7971v, Long.valueOf(mVar.f7973x), "Bearer"), mVar.A, mVar.f7975z, Boolean.valueOf(mVar.B), mVar.a(), p2Var, seVar);
    }

    public static void E(x xVar, j7.k kVar, p2 p2Var, se seVar, jf jfVar) {
        v9.o.h(p2Var);
        v9.o.h(jfVar);
        v9.o.h(seVar);
        ((com.android.volley.toolbox.a) xVar.f16143v).D(new s5(jfVar.f7923v, 1), new q.f(xVar, kVar, p2Var, seVar, jfVar));
    }

    public final void A(int i6, String str, List list, boolean z10, boolean z11) {
        u2 u2Var;
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        w2 w2Var = ((r3) this.f16143v).f32943u.C;
                        y3.k(w2Var);
                        u2Var = w2Var.F;
                    } else if (z10) {
                        w2 w2Var2 = ((r3) this.f16143v).f32943u.C;
                        y3.k(w2Var2);
                        u2Var = w2Var2.D;
                    } else if (!z11) {
                        w2 w2Var3 = ((r3) this.f16143v).f32943u.C;
                        y3.k(w2Var3);
                        u2Var = w2Var3.E;
                    } else {
                        w2 w2Var4 = ((r3) this.f16143v).f32943u.C;
                        y3.k(w2Var4);
                        u2Var = w2Var4.C;
                    }
                } else {
                    w2 w2Var5 = ((r3) this.f16143v).f32943u.C;
                    y3.k(w2Var5);
                    u2Var = w2Var5.H;
                }
            } else if (z10) {
                w2 w2Var6 = ((r3) this.f16143v).f32943u.C;
                y3.k(w2Var6);
                u2Var = w2Var6.A;
            } else if (!z11) {
                w2 w2Var7 = ((r3) this.f16143v).f32943u.C;
                y3.k(w2Var7);
                u2Var = w2Var7.B;
            } else {
                w2 w2Var8 = ((r3) this.f16143v).f32943u.C;
                y3.k(w2Var8);
                u2Var = w2Var8.f32925z;
            }
        } else {
            w2 w2Var9 = ((r3) this.f16143v).f32943u.C;
            y3.k(w2Var9);
            u2Var = w2Var9.G;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    u2Var.b(str);
                    return;
                } else {
                    u2Var.e(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            u2Var.d(str, list.get(0), list.get(1));
            return;
        }
        u2Var.c(list.get(0), str);
    }

    public final void B(fb fbVar) {
        try {
            OutputStream outputStream = (OutputStream) this.f16143v;
            fbVar.getClass();
            int j10 = fbVar.j();
            Logger logger = n0.f7994w;
            if (j10 > 4096) {
                j10 = 4096;
            }
            m0 m0Var = new m0(outputStream, j10);
            fbVar.h(m0Var);
            if (m0Var.A > 0) {
                m0Var.h0();
            }
        } finally {
            ((OutputStream) this.f16143v).close();
        }
    }

    @Override // mc.a
    public final Object a() {
        Map hashMap;
        switch (this.f16142u) {
            case 25:
                q3 q3Var = (q3) this.f16143v;
                Cursor query = q3Var.f8564a.query(q3Var.f8565b, q3.f8563i, null, null, null);
                if (query == null) {
                    return Collections.emptyMap();
                }
                try {
                    int count = query.getCount();
                    if (count == 0) {
                        return Collections.emptyMap();
                    }
                    if (count <= 256) {
                        hashMap = new t.b(count);
                    } else {
                        hashMap = new HashMap(count, 1.0f);
                    }
                    while (query.moveToNext()) {
                        hashMap.put(query.getString(0), query.getString(1));
                    }
                    query.close();
                    return hashMap;
                } finally {
                    query.close();
                }
            default:
                return new kc.g((kc.j) ((mc.a) this.f16143v).a());
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final byte[] b() {
        if (Arrays.equals(((s5) this.f16143v).m(), z5.f)) {
            return z5.f8277b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.exoplayer2.source.q
    public final long c() {
        long j10 = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.q qVar : (com.google.android.exoplayer2.source.q[]) this.f16143v) {
            long c10 = qVar.c();
            if (c10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, c10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.q
    public final boolean d(long j10) {
        com.google.android.exoplayer2.source.q[] qVarArr;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long c10 = c();
            if (c10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (com.google.android.exoplayer2.source.q qVar : (com.google.android.exoplayer2.source.q[]) this.f16143v) {
                long c11 = qVar.c();
                if (c11 != Long.MIN_VALUE && c11 <= j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c11 == c10 || z11) {
                    z10 |= qVar.d(j10);
                }
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void e(String str) {
        switch (this.f16142u) {
            case 21:
                ((p2) this.f16143v).g(gd.i.a(str));
                return;
            default:
                ((se) this.f16143v).e(str);
                return;
        }
    }

    @Override // com.google.android.exoplayer2.source.q
    public final boolean f() {
        for (com.google.android.exoplayer2.source.q qVar : (com.google.android.exoplayer2.source.q[]) this.f16143v) {
            if (qVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.q
    public final long g() {
        long j10 = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.q qVar : (com.google.android.exoplayer2.source.q[]) this.f16143v) {
            long g5 = qVar.g();
            if (g5 != Long.MIN_VALUE) {
                j10 = Math.min(j10, g5);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.q
    public final void h(long j10) {
        for (com.google.android.exoplayer2.source.q qVar : (com.google.android.exoplayer2.source.q[]) this.f16143v) {
            qVar.h(j10);
        }
    }

    @Override // ta.j6
    public final void i(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            t4 t4Var = (t4) this.f16143v;
            t4Var.f32943u.H.getClass();
            t4Var.n("auto", "_err", bundle, true, true, System.currentTimeMillis());
            return;
        }
        ((t4) this.f16143v).getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.se
    public final void j(ke keVar) {
        switch (this.f16142u) {
            case 21:
                jf jfVar = (jf) keVar;
                p2 p2Var = (p2) this.f16143v;
                p2Var.getClass();
                try {
                    ((yd) p2Var.f8038v).d(jfVar);
                    return;
                } catch (RemoteException e10) {
                    ((y9.a) p2Var.f8039w).b("RemoteException when sending token result.", e10, new Object[0]);
                    return;
                }
            default:
                ((se) this.f16143v).j((jf) keVar);
                return;
        }
    }

    @Override // v4.b
    public final k4.v n(k4.v vVar, h4.g gVar) {
        Resources resources = (Resources) this.f16143v;
        if (vVar == null) {
            return null;
        }
        return new r4.c(resources, vVar);
    }

    @Override // h4.d
    public final boolean o(Object obj, File file, h4.g gVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((l4.b) this.f16143v).c(65536, byte[].class);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        ((l4.b) this.f16143v).put(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        ((l4.b) this.f16143v).put(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                ((l4.b) this.f16143v).put(bArr);
                return true;
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = fileOutputStream2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void p(a.e eVar, Object obj) {
        switch (this.f16142u) {
            case 10:
                p9.z zVar = (p9.z) eVar;
                p9.e eVar2 = (p9.e) zVar.y();
                e0 e0Var = ((f0) this.f16143v).f23119k;
                Parcel z10 = eVar2.z();
                com.google.android.gms.internal.cast.d.c(z10, e0Var);
                eVar2.S1(z10, 18);
                p9.e eVar3 = (p9.e) zVar.y();
                eVar3.S1(eVar3.z(), 17);
                ((ya.i) obj).b(null);
                return;
            default:
                v9.r rVar = (v9.r) this.f16143v;
                ya.i iVar = (ya.i) obj;
                com.google.android.gms.common.api.a<v9.s> aVar = x9.c.f37693k;
                x9.a aVar2 = (x9.a) ((x9.d) eVar).y();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(aVar2.f39199c);
                int i6 = ka.a.f23206a;
                if (rVar == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    rVar.writeToParcel(obtain, 0);
                }
                try {
                    aVar2.f39198b.transact(1, obtain, null, 1);
                    obtain.recycle();
                    iVar.b(null);
                    return;
                } catch (Throwable th2) {
                    obtain.recycle();
                    throw th2;
                }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w5
    public final byte[] q(byte[] bArr, x5 x5Var) {
        b6 b6Var = (b6) x5Var;
        byte[] bArr2 = b6Var.f7727a.f8012a;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        byte[] I = tr.r.I(bArr3, bArr);
        byte[] bArr4 = b6Var.f7728b.f8012a;
        int length2 = bArr4.length;
        byte[] bArr5 = new byte[length2];
        System.arraycopy(bArr4, 0, bArr5, 0, length2);
        byte[] Q = tr.r.Q(bArr, bArr5);
        byte[] Q2 = tr.r.Q(z5.f8287m, z5.f8277b);
        s5 s5Var = (s5) this.f16143v;
        int macLength = Mac.getInstance(s5Var.f8126v).getMacLength();
        return s5Var.n(s5Var.o(tr.r.Q(z5.f8289o, Q2, "eae_prk".getBytes(StandardCharsets.UTF_8), I), null), z5.c("shared_secret", Q, Q2, macLength), macLength);
    }

    public final void x() {
        l6.d dVar = (l6.d) this.f16143v;
        dVar.f24099b.cancel();
        View view = dVar.f24098a;
        if (view.getVisibility() == 4) {
            view.setVisibility(0);
            dVar.a();
            dVar.f24100c.start();
        }
    }

    public final void y(String str, se seVar) {
        v9.o.e(str);
        jf f02 = jf.f0(str);
        if (f02.h0()) {
            seVar.j(f02);
            return;
        }
        ((com.android.volley.toolbox.a) this.f16143v).C(new com.google.android.gms.internal.p000firebaseauthapi.n(f02.f7922u), new x(22, seVar, 0));
    }

    public final void z(jf jfVar, String str, String str2, Boolean bool, fd.x xVar, p2 p2Var, se seVar) {
        v9.o.h(seVar);
        v9.o.h(p2Var);
        ((com.android.volley.toolbox.a) this.f16143v).D(new s5(jfVar.f7923v, 1), new qd(p2Var, seVar, jfVar, xVar, bool, str2, str));
    }

    public /* synthetic */ x(int i6, Object obj) {
        this.f16142u = i6;
        this.f16143v = obj;
    }

    public /* synthetic */ x(int i6, Object obj, int i10) {
        this.f16142u = i6;
        this.f16143v = obj;
    }

    public x(WorkDatabase workDatabase) {
        this.f16142u = 4;
        kotlin.jvm.internal.i.g(workDatabase, "workDatabase");
        this.f16143v = workDatabase;
    }

    public /* synthetic */ x(com.google.android.gms.internal.cast.a0 a0Var) {
        this.f16142u = 12;
        this.f16143v = a0Var;
    }

    public x(me meVar) {
        this.f16142u = 23;
        this.f16143v = meVar;
    }

    public x(ViewGroup viewGroup) {
        this.f16142u = 1;
        this.f16143v = viewGroup.getOverlay();
    }

    public x(Resources resources) {
        this.f16142u = 6;
        this.f16143v = resources;
    }

    public x(int i6) {
        Handler handler;
        Handler handler2;
        this.f16142u = i6;
        if (i6 != 3) {
            if (i6 != 7) {
                this.f16143v = new ArrayDeque();
                return;
            } else {
                this.f16143v = new ConcurrentHashMap();
                return;
            }
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler2 = Handler.createAsync(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f16143v = handler2;
            } catch (InstantiationException e11) {
                e = e11;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f16143v = handler2;
            } catch (NoSuchMethodException e12) {
                e = e12;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f16143v = handler2;
            } catch (InvocationTargetException e13) {
                Throwable cause = e13.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
            handler2 = handler;
        }
        this.f16143v = handler2;
    }
}
