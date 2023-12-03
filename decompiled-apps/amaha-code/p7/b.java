package p7;

import a6.a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import c9.j;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.f;
import d7.j;
import d7.s;
import h5.g0;
import h5.p;
import h5.q;
import h5.t;
import h5.v;
import h5.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.o;
import w5.d0;
import w5.e0;
import w5.f0;
import w5.l;
import w5.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements j.a, l.a, a7.h, o.a, f.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27951u;

    public /* synthetic */ b(int i6) {
        this.f27951u = i6;
    }

    private static void a(boolean z10) {
        if (z10) {
            AtomicBoolean atomicBoolean = z5.c.f39196a;
            synchronized (z5.c.class) {
                if (!b6.a.b(z5.c.class)) {
                    if (!z5.c.f39196a.getAndSet(true)) {
                        p pVar = p.f17269a;
                        if (g0.b()) {
                            z5.c.a();
                        }
                        int i6 = z5.a.f39190a;
                        if (!b6.a.b(z5.a.class)) {
                            z5.a.f39191b.scheduleAtFixedRate(z5.a.f39193d, 0L, 500, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            }
        }
    }

    @Override // k7.o.a
    public Object apply(Object obj) {
        byte[] decode;
        boolean z10 = true;
        switch (this.f27951u) {
            case 19:
                a7.b bVar = k7.o.f23051z;
                return (List) k7.o.J(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b(23));
            case 20:
                a7.b bVar2 = k7.o.f23051z;
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            case 21:
                Cursor cursor = (Cursor) obj;
                a7.b bVar3 = k7.o.f23051z;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 22:
                a7.b bVar4 = k7.o.f23051z;
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 23:
                Cursor cursor2 = (Cursor) obj;
                a7.b bVar5 = k7.o.f23051z;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    j.a a10 = s.a();
                    a10.b(cursor2.getString(1));
                    a10.c(n7.a.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    if (string == null) {
                        decode = null;
                    } else {
                        decode = Base64.decode(string, 0);
                    }
                    a10.f12245b = decode;
                    arrayList.add(a10.a());
                }
                return arrayList;
            case 24:
                Cursor cursor3 = (Cursor) obj;
                a7.b bVar6 = k7.o.f23051z;
                if (!cursor3.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor3.getLong(0));
            case 25:
                a7.b bVar7 = k7.o.f23051z;
                if (((Cursor) obj).getCount() <= 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 26:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                Cursor cursor4 = (Cursor) obj;
                a7.b bVar8 = k7.o.f23051z;
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                while (cursor4.moveToNext()) {
                    byte[] blob = cursor4.getBlob(0);
                    arrayList2.add(blob);
                    i6 += blob.length;
                }
                byte[] bArr = new byte[i6];
                int i10 = 0;
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i11);
                    System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                    i10 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // com.google.android.exoplayer2.f.a
    public com.google.android.exoplayer2.f c(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    @Override // w5.l.a
    public void e(boolean z10) {
        File[] listFiles;
        File[] listFiles2;
        boolean z11;
        switch (this.f27951u) {
            case 1:
                p pVar = p.f17269a;
                if (z10 && g0.b()) {
                    w5.l lVar = w5.l.f36497a;
                    w5.n.c(new w5.m(new b(14), l.b.CrashReport));
                    w5.n.c(new w5.m(new b(15), l.b.ErrorReport));
                    w5.n.c(new w5.m(new b(16), l.b.AnrReport));
                    return;
                }
                return;
            case 2:
                p pVar2 = p.f17269a;
                if (z10) {
                    int i6 = i5.k.f19866a;
                    if (!b6.a.b(i5.k.class)) {
                        try {
                            w5.p.f.add(new i5.j());
                            w5.p.c();
                            return;
                        } catch (Throwable th2) {
                            b6.a.a(i5.k.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                if (z10) {
                    p.f17280m = true;
                    return;
                } else {
                    p pVar3 = p.f17269a;
                    return;
                }
            case 4:
                if (z10) {
                    p.f17281n = true;
                    return;
                } else {
                    p pVar4 = p.f17269a;
                    return;
                }
            case 5:
                if (z10) {
                    p.f17282o = true;
                    return;
                } else {
                    p pVar5 = p.f17269a;
                    return;
                }
            case 6:
            default:
                a(z10);
                return;
            case 7:
                if (z10) {
                    j5.a aVar = j5.a.f21671a;
                    if (!b6.a.b(j5.a.class)) {
                        try {
                            try {
                                p.c().execute(new i5.b(4));
                                return;
                            } catch (Exception unused) {
                                e0 e0Var = e0.f36453a;
                                p pVar6 = p.f17269a;
                                return;
                            }
                        } catch (Throwable th3) {
                            b6.a.a(j5.a.class, th3);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                if (z10) {
                    t5.a aVar2 = t5.a.f32410a;
                    if (!b6.a.b(t5.a.class)) {
                        try {
                            t5.a.f32411b = true;
                            t5.a.f32410a.b();
                            return;
                        } catch (Throwable th4) {
                            b6.a.a(t5.a.class, th4);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                if (z10) {
                    r5.c cVar = r5.c.f30467a;
                    if (!b6.a.b(r5.c.class)) {
                        try {
                            i5.b bVar = new i5.b(10);
                            e0 e0Var2 = e0.f36453a;
                            try {
                                p.c().execute(bVar);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        } catch (Throwable th5) {
                            b6.a.a(r5.c.class, th5);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 10:
                if (z10) {
                    n5.a aVar3 = n5.a.f25885a;
                    if (!b6.a.b(n5.a.class)) {
                        try {
                            n5.a.f25886b = true;
                            n5.a.f25885a.a();
                            return;
                        } catch (Throwable th6) {
                            b6.a.a(n5.a.class, th6);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                if (z10) {
                    o5.h hVar = o5.h.f27163a;
                    if (!b6.a.b(o5.h.class)) {
                        try {
                            o5.h.f27164b.set(true);
                            o5.h.a();
                            return;
                        } catch (Throwable th7) {
                            b6.a.a(o5.h.class, th7);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 12:
                if (z10) {
                    String str = k5.d.f22972b;
                    w wVar = w.APP_EVENTS;
                    try {
                        q qVar = new q(null, kotlin.jvm.internal.i.n("/cloudbridge_settings", p.b()), null, v.GET, new k5.c(0), 32);
                        v.a aVar4 = w5.v.f36544d;
                        if (str != null) {
                            p.i(wVar);
                            qVar.d();
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    } catch (JSONException e10) {
                        v.a aVar5 = w5.v.f36544d;
                        if (str != null) {
                            ca.a.o1(e10);
                            p.i(wVar);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                return;
            case 13:
                q5.c cVar2 = q5.c.f29137a;
                if (z10) {
                    l5.b bVar2 = l5.b.f24059a;
                    if (!b6.a.b(l5.b.class)) {
                        try {
                            l5.b.f.set(true);
                            return;
                        } catch (Throwable th8) {
                            b6.a.a(l5.b.class, th8);
                            return;
                        }
                    }
                    return;
                }
                l5.b bVar3 = l5.b.f24059a;
                if (!b6.a.b(l5.b.class)) {
                    try {
                        l5.b.f.set(false);
                        return;
                    } catch (Throwable th9) {
                        b6.a.a(l5.b.class, th9);
                        return;
                    }
                }
                return;
            case 14:
                if (z10) {
                    synchronized (a6.a.f327b) {
                        p pVar7 = p.f17269a;
                        if (g0.b()) {
                            a.C0009a.a();
                        }
                        if (a6.a.f328c != null) {
                            Log.w("a6.a", "Already enabled!");
                        } else {
                            a6.a aVar6 = new a6.a(Thread.getDefaultUncaughtExceptionHandler());
                            a6.a.f328c = aVar6;
                            Thread.setDefaultUncaughtExceptionHandler(aVar6);
                        }
                    }
                    w5.l lVar2 = w5.l.f36497a;
                    if (w5.l.c(l.b.CrashShield)) {
                        ug.l.f34119a = true;
                        if (g0.b() && !e0.y()) {
                            File B = sp.b.B();
                            if (B == null) {
                                listFiles = new File[0];
                            } else {
                                listFiles = B.listFiles(new d0(2));
                                if (listFiles == null) {
                                    listFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = listFiles.length;
                            int i10 = 0;
                            while (i10 < length) {
                                File file = listFiles[i10];
                                i10++;
                                kotlin.jvm.internal.i.g(file, "file");
                                y5.a aVar7 = new y5.a(file);
                                if (aVar7.b()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", aVar7.toString());
                                        String str2 = q.f17287j;
                                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{p.b()}, 1));
                                        kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
                                        arrayList.add(q.c.h(null, format, jSONObject, new h5.d(3, aVar7)));
                                    } catch (JSONException unused3) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                t tVar = new t(arrayList);
                                String str3 = q.f17287j;
                                f0.c(tVar);
                                new h5.s(tVar).executeOnExecutor(p.c(), new Void[0]);
                            }
                        }
                        b6.a.f3947b = true;
                    }
                    w5.l lVar3 = w5.l.f36497a;
                    if (w5.l.c(l.b.ThreadCheck)) {
                        int i11 = d6.a.f12204a;
                        return;
                    }
                    return;
                }
                return;
            case 15:
                if (z10) {
                    p pVar8 = p.f17269a;
                    if (g0.b() && !e0.y()) {
                        File B2 = sp.b.B();
                        if (B2 == null) {
                            listFiles2 = new File[0];
                        } else {
                            listFiles2 = B2.listFiles(new d0(4));
                            kotlin.jvm.internal.i.f(listFiles2, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int length2 = listFiles2.length;
                        int i12 = 0;
                        while (i12 < length2) {
                            File file2 = listFiles2[i12];
                            i12++;
                            c6.a aVar8 = new c6.a(file2);
                            if (aVar8.f4990b != null && aVar8.f4991c != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                arrayList2.add(aVar8);
                            }
                        }
                        is.p.P1(arrayList2, new p0.d(4));
                        JSONArray jSONArray = new JSONArray();
                        for (int i13 = 0; i13 < arrayList2.size() && i13 < 1000; i13++) {
                            jSONArray.put(arrayList2.get(i13));
                        }
                        sp.b.X("error_reports", jSONArray, new h5.d(4, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // c9.j.a
    public void invoke(Object obj) {
        switch (this.f27951u) {
            case 0:
                ((o) obj).R();
                return;
            case 1:
                ((o) obj).A();
                return;
            case 2:
                ((o) obj).Z();
                return;
            default:
                ((o) obj).s();
                return;
        }
    }

    public /* synthetic */ b(o.a aVar, Exception exc, int i6) {
        this.f27951u = i6;
    }

    @Override // a7.h
    public void b(Exception exc) {
    }
}
