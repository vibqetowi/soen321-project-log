package ta;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class q6 implements lv.f {

    /* renamed from: a  reason: collision with root package name */
    public long f32833a;

    /* renamed from: b  reason: collision with root package name */
    public Object f32834b;

    /* renamed from: c  reason: collision with root package name */
    public Object f32835c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f32836d;

    public /* synthetic */ q6(b bVar) {
        this.f32836d = bVar;
    }

    @Override // lv.f
    public final void a(pv.d dVar, IOException iOException) {
        lv.z zVar = dVar.f29049v;
        if (zVar != null) {
            lv.t tVar = zVar.f24751a;
            if (tVar != null) {
                try {
                    ((ef.d) this.f32835c).k(new URL(tVar.f24693i).toString());
                } catch (MalformedURLException e10) {
                    throw new RuntimeException(e10);
                }
            }
            String str = zVar.f24752b;
            if (str != null) {
                ((ef.d) this.f32835c).d(str);
            }
        }
        ((ef.d) this.f32835c).g(this.f32833a);
        ((ef.d) this.f32835c).j(((kf.i) this.f32836d).a());
        gf.g.c((ef.d) this.f32835c);
        ((lv.f) this.f32834b).a(dVar, iOException);
    }

    @Override // lv.f
    public final void b(pv.d dVar, lv.d0 d0Var) {
        FirebasePerfOkHttpClient.a(d0Var, (ef.d) this.f32835c, this.f32833a, ((kf.i) this.f32836d).a());
        ((lv.f) this.f32834b).b(dVar, d0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
        if (r5 == null) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.measurement.m2 c(com.google.android.gms.internal.measurement.m2 m2Var, String str) {
        Cursor cursor;
        Pair pair;
        Object obj;
        String B = m2Var.B();
        com.google.android.gms.internal.measurement.b6 C = m2Var.C();
        b bVar = (b) this.f32836d;
        bVar.f32947v.O();
        Long l2 = (Long) f6.m(m2Var, "_eid");
        if (l2 != null) {
            if (B.equals("_ep")) {
                bVar.f32947v.O();
                String str2 = (String) f6.m(m2Var, "_en");
                Cursor cursor2 = null;
                if (TextUtils.isEmpty(str2)) {
                    w2 w2Var = bVar.f32943u.C;
                    y3.k(w2Var);
                    w2Var.A.c(l2, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((com.google.android.gms.internal.measurement.m2) this.f32834b) == null || ((Long) this.f32835c) == null || l2.longValue() != ((Long) this.f32835c).longValue()) {
                    k kVar = bVar.f32947v.f32532w;
                    d6.H(kVar);
                    y3 y3Var = kVar.f32943u;
                    kVar.h();
                    kVar.i();
                    try {
                        try {
                            cursor = kVar.A().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l2.toString()});
                            try {
                            } catch (SQLiteException e10) {
                                e = e10;
                                w2 w2Var2 = y3Var.C;
                                y3.k(w2Var2);
                                w2Var2.f32925z.c(e, "Error selecting main event");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        cursor = null;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                    if (!cursor.moveToFirst()) {
                        w2 w2Var3 = y3Var.C;
                        y3.k(w2Var3);
                        w2Var3.H.b("Main event not found");
                    } else {
                        try {
                            pair = Pair.create((com.google.android.gms.internal.measurement.m2) ((com.google.android.gms.internal.measurement.l2) f6.z(com.google.android.gms.internal.measurement.m2.y(), cursor.getBlob(0))).f(), Long.valueOf(cursor.getLong(1)));
                            cursor.close();
                        } catch (IOException e12) {
                            w2 w2Var4 = y3Var.C;
                            y3.k(w2Var4);
                            w2Var4.f32925z.e("Failed to merge main event. appId, eventId", w2.q(str), l2, e12);
                        }
                        if (pair == null && (obj = pair.first) != null) {
                            this.f32834b = (com.google.android.gms.internal.measurement.m2) obj;
                            this.f32833a = ((Long) pair.second).longValue();
                            bVar.f32947v.O();
                            this.f32835c = (Long) f6.m((com.google.android.gms.internal.measurement.m2) this.f32834b, "_eid");
                        } else {
                            w2 w2Var5 = bVar.f32943u.C;
                            y3.k(w2Var5);
                            w2Var5.A.d("Extra parameter without existing main event. eventName, eventId", str2, l2);
                            return null;
                        }
                    }
                    cursor.close();
                    pair = null;
                    if (pair == null) {
                    }
                    w2 w2Var52 = bVar.f32943u.C;
                    y3.k(w2Var52);
                    w2Var52.A.d("Extra parameter without existing main event. eventName, eventId", str2, l2);
                    return null;
                }
                long j10 = this.f32833a - 1;
                this.f32833a = j10;
                if (j10 <= 0) {
                    k kVar2 = bVar.f32947v.f32532w;
                    d6.H(kVar2);
                    kVar2.h();
                    y3 y3Var2 = kVar2.f32943u;
                    w2 w2Var6 = y3Var2.C;
                    y3.k(w2Var6);
                    w2Var6.H.c(str, "Clearing complex main event info. appId");
                    try {
                        kVar2.A().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        w2 w2Var7 = y3Var2.C;
                        y3.k(w2Var7);
                        w2Var7.f32925z.c(e13, "Error clearing complex main event");
                    }
                } else {
                    k kVar3 = bVar.f32947v.f32532w;
                    d6.H(kVar3);
                    kVar3.q(str, l2, this.f32833a, (com.google.android.gms.internal.measurement.m2) this.f32834b);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.q2 q2Var : ((com.google.android.gms.internal.measurement.m2) this.f32834b).C()) {
                    bVar.f32947v.O();
                    if (f6.l(m2Var, q2Var.A()) == null) {
                        arrayList.add(q2Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.addAll(C);
                    C = arrayList;
                } else {
                    w2 w2Var8 = bVar.f32943u.C;
                    y3.k(w2Var8);
                    w2Var8.A.c(str2, "No unique parameters in main event. eventName");
                }
                B = str2;
            } else {
                this.f32835c = l2;
                this.f32834b = m2Var;
                bVar.f32947v.O();
                Object obj2 = 0L;
                Object m10 = f6.m(m2Var, "_epc");
                if (m10 != null) {
                    obj2 = m10;
                }
                long longValue = ((Long) obj2).longValue();
                this.f32833a = longValue;
                if (longValue <= 0) {
                    w2 w2Var9 = bVar.f32943u.C;
                    y3.k(w2Var9);
                    w2Var9.A.c(B, "Complex event with zero extra param count. eventName");
                } else {
                    k kVar4 = bVar.f32947v.f32532w;
                    d6.H(kVar4);
                    kVar4.q(str, l2, this.f32833a, m2Var);
                }
            }
        }
        com.google.android.gms.internal.measurement.l2 l2Var = (com.google.android.gms.internal.measurement.l2) m2Var.r();
        l2Var.i();
        com.google.android.gms.internal.measurement.m2.I((com.google.android.gms.internal.measurement.m2) l2Var.f8613v, B);
        l2Var.i();
        com.google.android.gms.internal.measurement.m2.G((com.google.android.gms.internal.measurement.m2) l2Var.f8613v);
        l2Var.i();
        com.google.android.gms.internal.measurement.m2.F((com.google.android.gms.internal.measurement.m2) l2Var.f8613v, C);
        return (com.google.android.gms.internal.measurement.m2) l2Var.f();
    }

    public q6(lv.f fVar, jf.e eVar, kf.i iVar, long j10) {
        this.f32834b = fVar;
        this.f32835c = new ef.d(eVar);
        this.f32833a = j10;
        this.f32836d = iVar;
    }
}
