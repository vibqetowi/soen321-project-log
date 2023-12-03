package androidx.appcompat.widget;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.measurement.k3;
import com.google.android.gms.internal.measurement.l3;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.u3;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import e1.a;
import e1.g;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ta.b3;
import ta.d6;
import ta.g3;
import ta.s5;
import ta.v5;
import ta.w2;
import ta.y2;
import ta.y3;
import w3.j;
/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class l implements h4.j, f7.b, n9.a, p9.m, com.google.android.gms.common.api.internal.n, ya.b, y2, ic.c, mc.o {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f1470u;

    /* renamed from: v  reason: collision with root package name */
    public Object f1471v;

    /* renamed from: w  reason: collision with root package name */
    public Object f1472w;

    public /* synthetic */ l(int i6, int i10) {
        this.f1470u = i6;
    }

    public static v3.a g(w3.h hVar, v3.a aVar) {
        if (aVar != null) {
            if (hVar == null) {
                return null;
            }
            synchronized (hVar.f36382a) {
                for (w3.j jVar : hVar.f36382a) {
                    if (aVar != null) {
                        if (jVar instanceof w3.a) {
                            try {
                                ((w3.a) jVar).i(aVar);
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        } else if (jVar instanceof w3.g) {
                            aVar = jVar.h(aVar);
                            if (aVar instanceof v3.c) {
                                w3.g gVar = (w3.g) jVar;
                                if (aVar != null) {
                                    aVar = gVar.e((v3.c) aVar);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.amplitude.core.events.IdentifyEvent");
                                }
                            } else if (aVar instanceof v3.b) {
                                w3.g gVar2 = (w3.g) jVar;
                                if (aVar != null) {
                                    aVar = gVar2.f((v3.b) aVar);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.amplitude.core.events.GroupIdentifyEvent");
                                }
                            } else if (aVar instanceof v3.f) {
                                w3.g gVar3 = (w3.g) jVar;
                                if (aVar != null) {
                                    aVar = gVar3.b((v3.f) aVar);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.amplitude.core.events.RevenueEvent");
                                }
                            } else if (aVar != null) {
                                aVar = ((w3.g) jVar).d(aVar);
                            }
                        } else {
                            aVar = jVar.h(aVar);
                        }
                    }
                }
            }
            return aVar;
        }
        return aVar;
    }

    public static String k(String str, j3.a aVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        String str2 = aVar.f21659u;
        if (z10) {
            str2 = ".temp" + str2;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public final void A(com.google.android.gms.internal.measurement.t tVar) {
        Iterator it = tVar.f8618a.iterator();
        while (it.hasNext()) {
            ((Map) this.f1471v).put(Integer.valueOf(((com.google.android.gms.internal.measurement.x) it.next()).f8677u).toString(), tVar);
        }
    }

    public final void B() {
        c4.b0 b0Var = (c4.b0) this.f1472w;
        Context context = (Context) this.f1471v;
        if (b0Var.f4899b) {
            context.unregisterReceiver((c4.b0) b0Var.f4900c.f1472w);
            b0Var.f4899b = false;
            return;
        }
        oa.i.f("BillingBroadcastManager", "Receiver is not registered.");
    }

    @Override // ic.c, mc.a
    public final Object a() {
        String str;
        switch (this.f1470u) {
            case 23:
                String str2 = (String) this.f1472w;
                ContentResolver contentResolver = ((u3) this.f1471v).f8620a.getContentResolver();
                Uri uri = m3.f8464a;
                synchronized (m3.class) {
                    if (m3.f8468e == null) {
                        m3.f8467d.set(false);
                        m3.f8468e = new HashMap();
                        m3.f8472j = new Object();
                        contentResolver.registerContentObserver(m3.f8464a, true, new k3(0));
                    } else if (m3.f8467d.getAndSet(false)) {
                        m3.f8468e.clear();
                        m3.f.clear();
                        m3.f8469g.clear();
                        m3.f8470h.clear();
                        m3.f8471i.clear();
                        m3.f8472j = new Object();
                    }
                    Object obj = m3.f8472j;
                    str = null;
                    if (m3.f8468e.containsKey(str2)) {
                        String str3 = (String) m3.f8468e.get(str2);
                        if (str3 != null) {
                            str = str3;
                        }
                    } else {
                        int length = m3.f8473k.length;
                        Cursor query = contentResolver.query(m3.f8464a, null, null, new String[]{str2}, null);
                        if (query != null) {
                            try {
                                if (!query.moveToFirst()) {
                                    m3.a(str2, null, obj);
                                } else {
                                    String string = query.getString(1);
                                    if (string != null && string.equals(null)) {
                                        string = null;
                                    }
                                    m3.a(str2, string, obj);
                                    if (string != null) {
                                        str = string;
                                    }
                                }
                            } finally {
                                query.close();
                            }
                        }
                    }
                }
                return str;
            case 28:
                Context context = ((hc.h) ((ic.c) this.f1471v)).f17379u.f8726u;
                if (context != null) {
                    return new hc.k(context, (hc.l) ((ic.c) this.f1472w).a());
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new kc.j((Context) ((mc.a) this.f1471v).a(), (mc.g) ((mc.a) this.f1472w).a());
        }
    }

    @Override // n9.a
    public final void b(Bitmap bitmap) {
        l lVar = (l) this.f1471v;
        lVar.f1472w = bitmap;
        Object obj = this.f1472w;
        ((MediaNotificationService) obj).F = lVar;
        ((MediaNotificationService) obj).c();
    }

    @Override // ta.y2
    public final void c(String str, int i6, Throwable th2, byte[] bArr, Map map) {
        ta.k kVar;
        long longValue;
        d6 d6Var = (d6) this.f1472w;
        d6Var.a().h();
        d6Var.g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                d6Var.N = false;
                d6Var.A();
            }
        }
        ArrayList arrayList = d6Var.R;
        v9.o.h(arrayList);
        d6Var.R = null;
        if (i6 != 200) {
            if (i6 == 204) {
                i6 = 204;
            }
            d6Var.b().H.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i6), th2);
            g3 g3Var = d6Var.C.B;
            ((kotlin.jvm.internal.b0) d6Var.c()).getClass();
            g3Var.b(System.currentTimeMillis());
            if (i6 != 503 || i6 == 429) {
                g3 g3Var2 = d6Var.C.f32772z;
                ((kotlin.jvm.internal.b0) d6Var.c()).getClass();
                g3Var2.b(System.currentTimeMillis());
            }
            ta.k kVar2 = d6Var.f32532w;
            d6.H(kVar2);
            kVar2.P(arrayList);
            d6Var.C();
        }
        if (th2 == null) {
            try {
                g3 g3Var3 = d6Var.C.A;
                ((kotlin.jvm.internal.b0) d6Var.c()).getClass();
                g3Var3.b(System.currentTimeMillis());
                d6Var.C.B.b(0L);
                d6Var.C();
                d6Var.b().H.d("Successful upload. Got network response. code, size", Integer.valueOf(i6), Integer.valueOf(bArr.length));
                ta.k kVar3 = d6Var.f32532w;
                d6.H(kVar3);
                kVar3.N();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Long l2 = (Long) it.next();
                        try {
                            kVar = d6Var.f32532w;
                            d6.H(kVar);
                            longValue = l2.longValue();
                            kVar.h();
                            kVar.i();
                            try {
                            } catch (SQLiteException e10) {
                                w2 w2Var = kVar.f32943u.C;
                                y3.k(w2Var);
                                w2Var.f32925z.c(e10, "Failed to delete a bundle in a queue table");
                                throw e10;
                                break;
                            }
                        } catch (SQLiteException e11) {
                            ArrayList arrayList2 = d6Var.S;
                            if (arrayList2 == null || !arrayList2.contains(l2)) {
                                throw e11;
                            }
                        }
                        if (kVar.A().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    }
                    ta.k kVar4 = d6Var.f32532w;
                    d6.H(kVar4);
                    kVar4.m();
                    ta.k kVar5 = d6Var.f32532w;
                    d6.H(kVar5);
                    kVar5.O();
                    d6Var.S = null;
                    b3 b3Var = d6Var.f32531v;
                    d6.H(b3Var);
                    if (b3Var.g() && d6Var.E()) {
                        d6Var.t();
                    } else {
                        d6Var.T = -1L;
                        d6Var.C();
                    }
                    d6Var.I = 0L;
                } catch (Throwable th3) {
                    ta.k kVar6 = d6Var.f32532w;
                    d6.H(kVar6);
                    kVar6.O();
                    throw th3;
                }
            } catch (SQLiteException e12) {
                d6Var.b().f32925z.c(e12, "Database error while trying to delete uploaded bundles");
                ((kotlin.jvm.internal.b0) d6Var.c()).getClass();
                d6Var.I = SystemClock.elapsedRealtime();
                d6Var.b().H.c(Long.valueOf(d6Var.I), "Disable upload, time");
            }
        }
        d6Var.b().H.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i6), th2);
        g3 g3Var4 = d6Var.C.B;
        ((kotlin.jvm.internal.b0) d6Var.c()).getClass();
        g3Var4.b(System.currentTimeMillis());
        if (i6 != 503) {
        }
        g3 g3Var22 = d6Var.C.f32772z;
        ((kotlin.jvm.internal.b0) d6Var.c()).getClass();
        g3Var22.b(System.currentTimeMillis());
        ta.k kVar22 = d6Var.f32532w;
        d6.H(kVar22);
        kVar22.P(arrayList);
        d6Var.C();
    }

    @Override // p9.m
    public final void d(long j10) {
        switch (this.f1470u) {
            case 16:
                p9.m mVar = (p9.m) this.f1471v;
                if (mVar != null) {
                    mVar.d(j10);
                    return;
                }
                return;
            default:
                ((v5) this.f1472w).f32943u.H.getClass();
                s5 s5Var = new s5(this, System.currentTimeMillis(), j10);
                this.f1471v = s5Var;
                ((v5) this.f1472w).f32915w.postDelayed(s5Var, 2000L);
                return;
        }
    }

    @Override // p9.m
    public final void e(int i6, long j10, p9.k kVar) {
        ((p9.l) this.f1472w).B = null;
        p9.m mVar = (p9.m) this.f1471v;
        if (mVar != null) {
            mVar.e(i6, j10, kVar);
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f1470u) {
            case 3:
                if (!(obj instanceof s0.c)) {
                    return false;
                }
                s0.c cVar = (s0.c) obj;
                Object obj2 = cVar.f31064a;
                Object obj3 = this.f1471v;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return false;
                }
                Object obj4 = this.f1472w;
                Object obj5 = cVar.f31065b;
                if (obj5 != obj4 && (obj5 == null || !obj5.equals(obj4))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public final void f(w3.j jVar) {
        u3.b bVar = (u3.b) this.f1472w;
        if (bVar != null) {
            jVar.g(bVar);
            w3.h hVar = (w3.h) ((Map) this.f1471v).get(jVar.a());
            if (hVar != null) {
                synchronized (hVar.f36382a) {
                    hVar.f36382a.add(jVar);
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.i.q("amplitude");
        throw null;
    }

    @Override // gs.a
    public final Object get() {
        return new e7.k((Context) ((gs.a) this.f1471v).get(), (e7.i) ((gs.a) this.f1472w).get());
    }

    public final v3.a h(j.a aVar, v3.a aVar2) {
        return g((w3.h) ((Map) this.f1471v).get(aVar), aVar2);
    }

    public final int hashCode() {
        int hashCode;
        switch (this.f1470u) {
            case 3:
                Object obj = this.f1471v;
                int i6 = 0;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                Object obj2 = this.f1472w;
                if (obj2 != null) {
                    i6 = obj2.hashCode();
                }
                return hashCode ^ i6;
            default:
                return super.hashCode();
        }
    }

    public final void i() {
        this.f1471v = null;
        this.f1472w = null;
    }

    public final boolean j(v2.l lVar) {
        boolean containsKey;
        synchronized (this.f1471v) {
            containsKey = ((Map) this.f1472w).containsKey(lVar);
        }
        return containsKey;
    }

    public final File l(String str) {
        File file = new File(((Context) this.f1471v).getCacheDir(), k(str, j3.a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(((Context) this.f1471v).getCacheDir(), k(str, j3.a.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public final KeyListener m(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((e1.a) this.f1472w).f13699a.getClass();
            if (!(keyListener instanceof e1.e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new e1.e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public final String n(String str) {
        int identifier = ((Resources) this.f1471v).getIdentifier(str, "string", (String) this.f1472w);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f1471v).getString(identifier);
    }

    @Override // h4.d
    public final boolean o(Object obj, File file, h4.g gVar) {
        return ((h4.j) this.f1472w).o(new r4.c(((BitmapDrawable) ((k4.v) obj).get()).getBitmap(), (l4.d) this.f1471v), file, gVar);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void p(a.e eVar, Object obj) {
        k9.f0 f0Var = (k9.f0) this.f1471v;
        ya.i<Status> iVar = (ya.i) obj;
        f0Var.h();
        p9.e eVar2 = (p9.e) ((p9.z) eVar).y();
        Parcel z10 = eVar2.z();
        z10.writeString((String) this.f1472w);
        eVar2.S1(z10, 5);
        synchronized (f0Var.f23126s) {
            if (f0Var.f23124p != null) {
                iVar.a(f6.b.x0(new Status(2001, null)));
            } else {
                f0Var.f23124p = iVar;
            }
        }
    }

    public final void q(AttributeSet attributeSet, int i6) {
        TypedArray obtainStyledAttributes = ((EditText) this.f1471v).getContext().obtainStyledAttributes(attributeSet, kc.f.H, i6, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            w(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final InputConnection r(InputConnection inputConnection, EditorInfo editorInfo) {
        e1.a aVar = (e1.a) this.f1472w;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0213a c0213a = aVar.f13699a;
        c0213a.getClass();
        if (!(inputConnection instanceof e1.c)) {
            return new e1.c(c0213a.f13700a, inputConnection, editorInfo);
        }
        return inputConnection;
    }

    public final void s(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((t.b) this.f1472w)) {
            ((t.b) this.f1472w).put(new d5.i(cls, cls2, cls3), list);
        }
    }

    public final List t(String workSpecId) {
        List I2;
        kotlin.jvm.internal.i.g(workSpecId, "workSpecId");
        synchronized (this.f1471v) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) this.f1472w).entrySet()) {
                if (kotlin.jvm.internal.i.b(((v2.l) entry.getKey()).f34722a, workSpecId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (v2.l lVar : linkedHashMap.keySet()) {
                ((Map) this.f1472w).remove(lVar);
            }
            I2 = is.u.I2(linkedHashMap.values());
        }
        return I2;
    }

    @Override // ya.b
    public final Object then(ya.h hVar) {
        boolean z10;
        r9.c cVar = (r9.c) this.f1471v;
        Bundle bundle = (Bundle) this.f1472w;
        cVar.getClass();
        if (hVar.isSuccessful()) {
            Bundle bundle2 = (Bundle) hVar.getResult();
            if (bundle2 != null && bundle2.containsKey("google.messenger")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return cVar.a(bundle).onSuccessTask(r9.r.f30649u, hc.d.f17368b0);
            }
            return hVar;
        }
        return hVar;
    }

    public final String toString() {
        switch (this.f1470u) {
            case 3:
                return "Pair{" + String.valueOf(this.f1471v) + " " + String.valueOf(this.f1472w) + "}";
            default:
                return super.toString();
        }
    }

    public final n2.t u(v2.l id2) {
        n2.t tVar;
        kotlin.jvm.internal.i.g(id2, "id");
        synchronized (this.f1471v) {
            tVar = (n2.t) ((Map) this.f1472w).remove(id2);
        }
        return tVar;
    }

    @Override // h4.j
    public final h4.c v(h4.g gVar) {
        return ((h4.j) this.f1472w).v(gVar);
    }

    public final void w(boolean z10) {
        e1.g gVar = ((e1.a) this.f1472w).f13699a.f13701b;
        if (gVar.f13721x != z10) {
            if (gVar.f13720w != null) {
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                g.a aVar = gVar.f13720w;
                a10.getClass();
                kc.f.q(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f2035a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f2036b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f13721x = z10;
            if (z10) {
                e1.g.a(gVar.f13718u, androidx.emoji2.text.f.a().b());
            }
        }
    }

    public final n2.t x(v2.l lVar) {
        n2.t tVar;
        synchronized (this.f1471v) {
            Map map = (Map) this.f1472w;
            Object obj = map.get(lVar);
            if (obj == null) {
                obj = new n2.t(lVar);
                map.put(lVar, obj);
            }
            tVar = (n2.t) obj;
        }
        return tVar;
    }

    public final File y(InputStream inputStream, j3.a aVar) {
        File file = new File(((Context) this.f1471v).getCacheDir(), k((String) this.f1472w, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    public final com.google.android.gms.internal.measurement.o z(v.c cVar, com.google.android.gms.internal.measurement.o oVar) {
        com.google.android.gms.internal.measurement.u uVar;
        l3.c(cVar);
        if (oVar instanceof com.google.android.gms.internal.measurement.p) {
            com.google.android.gms.internal.measurement.p pVar = (com.google.android.gms.internal.measurement.p) oVar;
            ArrayList arrayList = pVar.f8546v;
            String str = pVar.f8545u;
            if (((Map) this.f1471v).containsKey(str)) {
                uVar = (com.google.android.gms.internal.measurement.u) ((Map) this.f1471v).get(str);
            } else {
                uVar = (com.google.android.gms.internal.measurement.t) this.f1472w;
            }
            return uVar.a(str, cVar, arrayList);
        }
        return oVar;
    }

    public l(IBinder iBinder) {
        this.f1470u = 18;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f1471v = new Messenger(iBinder);
            this.f1472w = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f1472w = new r9.h(iBinder);
            this.f1471v = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    public l(com.google.android.gms.common.api.internal.b1 b1Var, AlertDialog alertDialog) {
        this.f1470u = 20;
        this.f1472w = b1Var;
        this.f1471v = alertDialog;
    }

    public /* synthetic */ l(Object obj, int i6, Object obj2) {
        this.f1470u = i6;
        this.f1471v = obj;
        this.f1472w = obj2;
    }

    public /* synthetic */ l(Object obj, Object obj2, int i6) {
        this.f1470u = i6;
        this.f1472w = obj;
        this.f1471v = obj2;
    }

    public l(v5 v5Var) {
        this.f1470u = 25;
        this.f1472w = v5Var;
    }

    public l(u9.a aVar) {
        this.f1470u = 15;
        this.f1471v = aVar == null ? null : aVar.f33969v;
    }

    public l(x1.n database) {
        this.f1470u = 1;
        kotlin.jvm.internal.i.g(database, "database");
        this.f1471v = database;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.i.f(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f1472w = newSetFromMap;
    }

    public l(Context context) {
        this.f1470u = 21;
        v9.o.h(context);
        Resources resources = context.getResources();
        this.f1471v = resources;
        this.f1472w = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public l(Context context, c4.o oVar) {
        this.f1470u = 6;
        this.f1471v = context;
        this.f1472w = new c4.b0(this, oVar);
    }

    public l(Context context, String str) {
        this.f1470u = 4;
        this.f1471v = context.getApplicationContext();
        this.f1472w = str;
    }

    public l(h5.o oVar) {
        this.f1470u = 10;
        this.f1472w = new CountDownLatch(1);
        h5.p.c().execute(new FutureTask(new w5.u(this, 0, oVar)));
    }

    public l(int i6) {
        this.f1470u = i6;
        if (i6 == 5) {
            this.f1471v = is.e0.u0(new hs.f(j.a.Before, new w3.h(new ArrayList())), new hs.f(j.a.Enrichment, new w3.h(new ArrayList())), new hs.f(j.a.Destination, new w3.h(new ArrayList())), new hs.f(j.a.Utility, new w3.h(new ArrayList())));
        } else if (i6 == 8) {
            this.f1471v = new AtomicReference();
            this.f1472w = new t.b();
        } else if (i6 == 13) {
            this.f1471v = new ByteArrayOutputStream(512);
            this.f1472w = new DataOutputStream((ByteArrayOutputStream) this.f1471v);
        } else if (i6 != 22) {
            this.f1471v = new Object();
            this.f1472w = new LinkedHashMap();
        } else {
            this.f1471v = new HashMap();
            this.f1472w = new com.google.android.gms.internal.measurement.t(6);
            A(new com.google.android.gms.internal.measurement.t(0));
            A(new com.google.android.gms.internal.measurement.t(1));
            A(new com.google.android.gms.internal.measurement.t(2));
            A(new com.google.android.gms.internal.measurement.t(3));
            A(new com.google.android.gms.internal.measurement.t(4));
            A(new com.google.android.gms.internal.measurement.t(5));
            A(new com.google.android.gms.internal.measurement.t(7));
        }
    }

    public l(EditText editText) {
        this.f1470u = 0;
        this.f1471v = editText;
        this.f1472w = new e1.a(editText);
    }
}
