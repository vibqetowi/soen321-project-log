package k7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import d7.s;
import g7.a;
import g7.c;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import l7.a;
/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
public final class o implements d, l7.a, c {

    /* renamed from: z  reason: collision with root package name */
    public static final a7.b f23051z = new a7.b("proto");

    /* renamed from: u  reason: collision with root package name */
    public final q f23052u;

    /* renamed from: v  reason: collision with root package name */
    public final m7.a f23053v;

    /* renamed from: w  reason: collision with root package name */
    public final m7.a f23054w;

    /* renamed from: x  reason: collision with root package name */
    public final e f23055x;

    /* renamed from: y  reason: collision with root package name */
    public final gs.a<String> f23056y;

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public interface a<T, U> {
        U apply(T t3);
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f23057a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23058b;

        public b(String str, String str2) {
            this.f23057a = str;
            this.f23058b = str2;
        }
    }

    public o(m7.a aVar, m7.a aVar2, e eVar, q qVar, gs.a<String> aVar3) {
        this.f23052u = qVar;
        this.f23053v = aVar;
        this.f23054w = aVar2;
        this.f23055x = eVar;
        this.f23056y = aVar3;
    }

    public static String I(Iterable<i> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T J(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long m(SQLiteDatabase sQLiteDatabase, s sVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(sVar.b(), String.valueOf(n7.a.a(sVar.d()))));
        if (sVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) J(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new p7.b(24));
    }

    @Override // k7.d
    public final Iterable<s> D() {
        return (Iterable) o(new p7.b(19));
    }

    public final Object G(f0.b bVar, p7.b bVar2) {
        m7.a aVar = this.f23054w;
        long a10 = aVar.a();
        while (true) {
            try {
                int i6 = bVar.f14602u;
                Object obj = bVar.f14603v;
                switch (i6) {
                    case 12:
                        return ((q) obj).getWritableDatabase();
                    default:
                        ((SQLiteDatabase) obj).beginTransaction();
                        return null;
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= this.f23055x.a() + a10) {
                    return bVar2.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // k7.d
    public final Iterable<i> H0(s sVar) {
        return (Iterable) o(new k(this, sVar, 1));
    }

    @Override // k7.d
    public final long Y(s sVar) {
        return ((Long) J(j().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(n7.a.a(sVar.d()))}), new p7.b(21))).longValue();
    }

    @Override // k7.c
    public final void a() {
        o(new l(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23052u.close();
    }

    @Override // l7.a
    public final <T> T e(a.InterfaceC0377a<T> interfaceC0377a) {
        SQLiteDatabase j10 = j();
        G(new f0.b(13, j10), new p7.b(22));
        try {
            T g5 = interfaceC0377a.g();
            j10.setTransactionSuccessful();
            return g5;
        } finally {
            j10.endTransaction();
        }
    }

    @Override // k7.c
    public final void g(long j10, c.a aVar, String str) {
        o(new j7.i(j10, str, aVar));
    }

    @Override // k7.c
    public final g7.a h() {
        int i6 = g7.a.f16353e;
        a.C0246a c0246a = new a.C0246a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase j10 = j();
        j10.beginTransaction();
        try {
            g7.a aVar = (g7.a) J(j10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new i7.a(4, this, hashMap, c0246a));
            j10.setTransactionSuccessful();
            return aVar;
        } finally {
            j10.endTransaction();
        }
    }

    public final SQLiteDatabase j() {
        q qVar = this.f23052u;
        Objects.requireNonNull(qVar);
        return (SQLiteDatabase) G(new f0.b(12, qVar), new p7.b(20));
    }

    @Override // k7.d
    public final int k() {
        return ((Integer) o(new j(0, this.f23053v.a() - this.f23055x.b(), this))).intValue();
    }

    @Override // k7.d
    public final void l(Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        j().compileStatement("DELETE FROM events WHERE _id in " + I(iterable)).execute();
    }

    @Override // k7.d
    public final void m0(long j10, s sVar) {
        o(new j(j10, sVar));
    }

    public final <T> T o(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase j10 = j();
        j10.beginTransaction();
        try {
            T apply = aVar.apply(j10);
            j10.setTransactionSuccessful();
            return apply;
        } finally {
            j10.endTransaction();
        }
    }

    @Override // k7.d
    public final k7.b r(s sVar, d7.n nVar) {
        Object[] objArr = {sVar.d(), nVar.g(), sVar.b()};
        String c10 = h7.a.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long longValue = ((Long) o(new i7.a(this, nVar, sVar, 1))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new k7.b(longValue, sVar, nVar);
    }

    public final ArrayList s(SQLiteDatabase sQLiteDatabase, s sVar, int i6) {
        ArrayList arrayList = new ArrayList();
        Long m10 = m(sQLiteDatabase, sVar);
        if (m10 == null) {
            return arrayList;
        }
        J(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m10.toString()}, null, null, null, String.valueOf(i6)), new i7.a(this, arrayList, sVar, 3));
        return arrayList;
    }

    @Override // k7.d
    public final boolean x(s sVar) {
        return ((Boolean) o(new k(this, sVar, 0))).booleanValue();
    }

    @Override // k7.d
    public final void z0(Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        o(new i7.a(2, this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + I(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
    }
}
