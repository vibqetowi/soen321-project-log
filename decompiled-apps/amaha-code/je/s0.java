package je;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import je.p;
/* compiled from: SQLitePersistence.java */
/* loaded from: classes.dex */
public final class s0 extends androidx.work.k {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f21920k = 0;

    /* renamed from: b  reason: collision with root package name */
    public final c f21921b;

    /* renamed from: c  reason: collision with root package name */
    public final i f21922c;

    /* renamed from: d  reason: collision with root package name */
    public final y0 f21923d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f21924e;
    public final u0 f;

    /* renamed from: g  reason: collision with root package name */
    public final o0 f21925g;

    /* renamed from: h  reason: collision with root package name */
    public final a f21926h;

    /* renamed from: i  reason: collision with root package name */
    public SQLiteDatabase f21927i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f21928j;

    /* compiled from: SQLitePersistence.java */
    /* loaded from: classes.dex */
    public static class c extends SQLiteOpenHelper {

        /* renamed from: u  reason: collision with root package name */
        public final i f21935u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f21936v;

        public c(Context context, i iVar, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 16);
            this.f21935u = iVar;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f21936v = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (!this.f21936v) {
                onConfigure(sQLiteDatabase);
            }
            new x0(sQLiteDatabase, this.f21935u).c(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
            if (!this.f21936v) {
                onConfigure(sQLiteDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f21936v) {
                onConfigure(sQLiteDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
            if (!this.f21936v) {
                onConfigure(sQLiteDatabase);
            }
            new x0(sQLiteDatabase, this.f21935u).c(i6);
        }
    }

    /* compiled from: SQLitePersistence.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final SQLiteDatabase f21937a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21938b;

        /* renamed from: c  reason: collision with root package name */
        public c2.a f21939c;

        public d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f21937a = sQLiteDatabase;
            this.f21938b = str;
        }

        public final void a(Object... objArr) {
            this.f21939c = new c2.a(2, objArr);
        }

        public final int b(oe.d<Cursor> dVar) {
            Cursor e10 = e();
            try {
                if (e10.moveToFirst()) {
                    dVar.accept(e10);
                    e10.close();
                    return 1;
                }
                e10.close();
                return 0;
            } catch (Throwable th2) {
                if (e10 != null) {
                    try {
                        e10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        public final <T> T c(oe.i<Cursor, T> iVar) {
            Cursor e10 = e();
            try {
                if (e10.moveToFirst()) {
                    T apply = iVar.apply(e10);
                    e10.close();
                    return apply;
                }
                e10.close();
                return null;
            } catch (Throwable th2) {
                if (e10 != null) {
                    try {
                        e10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        public final int d(oe.d<Cursor> dVar) {
            Cursor e10 = e();
            int i6 = 0;
            while (e10.moveToNext()) {
                try {
                    i6++;
                    dVar.accept(e10);
                } catch (Throwable th2) {
                    if (e10 != null) {
                        try {
                            e10.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            e10.close();
            return i6;
        }

        public final Cursor e() {
            c2.a aVar = this.f21939c;
            String str = this.f21938b;
            SQLiteDatabase sQLiteDatabase = this.f21937a;
            if (aVar != null) {
                return sQLiteDatabase.rawQueryWithFactory(aVar, str, null, null);
            }
            return sQLiteDatabase.rawQuery(str, null);
        }
    }

    public s0(Context context, String str, ke.f fVar, i iVar, p.b bVar) {
        try {
            c cVar = new c(context, iVar, "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.f23269u, "utf-8") + "." + URLEncoder.encode(fVar.f23270v, "utf-8"));
            this.f21926h = new a();
            this.f21921b = cVar;
            this.f21922c = iVar;
            this.f21923d = new y0(this, iVar);
            this.f21924e = new d0();
            this.f = new u0(this, iVar);
            this.f21925g = new o0(this, bVar);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public static void D(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i6 = 0; i6 < objArr.length; i6++) {
            Object obj = objArr[i6];
            if (obj == null) {
                sQLiteProgram.bindNull(i6 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i6 + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i6 + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i6 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i6 + 1, ((Double) obj).doubleValue());
            } else if (obj instanceof byte[]) {
                sQLiteProgram.bindBlob(i6 + 1, (byte[]) obj);
            } else {
                ca.a.V("Unknown argument %s of type %s", obj, obj.getClass());
                throw null;
            }
        }
    }

    public static int E(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        D(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    @Override // androidx.work.k
    public final void A(String str, Runnable runnable) {
        kc.f.A(1, "k", "Starting transaction: %s", str);
        this.f21927i.beginTransactionWithListener(this.f21926h);
        try {
            runnable.run();
            this.f21927i.setTransactionSuccessful();
        } finally {
            this.f21927i.endTransaction();
        }
    }

    @Override // androidx.work.k
    public final void B() {
        boolean z10 = true;
        ca.a.u0(!this.f21928j, "SQLitePersistence double-started!", new Object[0]);
        this.f21928j = true;
        try {
            this.f21927i = this.f21921b.getWritableDatabase();
            y0 y0Var = this.f21923d;
            if (y0Var.f21971a.G("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").b(new j0(4, y0Var)) != 1) {
                z10 = false;
            }
            ca.a.u0(z10, "Missing target_globals entry", new Object[0]);
            long j10 = y0Var.f21974d;
            o0 o0Var = this.f21925g;
            o0Var.getClass();
            o0Var.f21887v = new u7.s(j10);
        } catch (SQLiteDatabaseLockedException e10) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e10);
        }
    }

    public final void F(String str, Object... objArr) {
        this.f21927i.execSQL(str, objArr);
    }

    public final d G(String str) {
        return new d(this.f21927i, str);
    }

    @Override // androidx.work.k
    public final je.a m() {
        return this.f21924e;
    }

    @Override // androidx.work.k
    public final je.b n(ge.e eVar) {
        return new g0(this, this.f21922c, eVar);
    }

    @Override // androidx.work.k
    public final f o(ge.e eVar) {
        return new m0(this, this.f21922c, eVar);
    }

    @Override // androidx.work.k
    public final w p(ge.e eVar, f fVar) {
        return new q0(this, this.f21922c, eVar, fVar);
    }

    @Override // androidx.work.k
    public final x q() {
        return new r0(this);
    }

    @Override // androidx.work.k
    public final b0 r() {
        return this.f21925g;
    }

    @Override // androidx.work.k
    public final c0 s() {
        return this.f;
    }

    @Override // androidx.work.k
    public final a1 t() {
        return this.f21923d;
    }

    @Override // androidx.work.k
    public final boolean u() {
        return this.f21928j;
    }

    @Override // androidx.work.k
    public final <T> T z(String str, oe.l<T> lVar) {
        kc.f.A(1, "k", "Starting transaction: %s", str);
        this.f21927i.beginTransactionWithListener(this.f21926h);
        try {
            T t3 = lVar.get();
            this.f21927i.setTransactionSuccessful();
            return t3;
        } finally {
            this.f21927i.endTransaction();
        }
    }

    /* compiled from: SQLitePersistence.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f21930a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21931b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21932c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Object> f21933d;

        /* renamed from: e  reason: collision with root package name */
        public int f21934e;
        public final Iterator<Object> f;

        public b(s0 s0Var, ArrayList arrayList) {
            this.f21934e = 0;
            this.f21930a = s0Var;
            this.f21931b = "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (";
            this.f21933d = Collections.emptyList();
            this.f21932c = ") ORDER BY path";
            this.f = arrayList.iterator();
        }

        public final d a() {
            this.f21934e++;
            List<Object> list = this.f21933d;
            ArrayList arrayList = new ArrayList(list);
            int i6 = 0;
            while (true) {
                Iterator<Object> it = this.f;
                if (!it.hasNext() || i6 >= 900 - list.size()) {
                    break;
                }
                arrayList.add(it.next());
                i6++;
            }
            Object[] array = arrayList.toArray();
            d G = this.f21930a.G(this.f21931b + ((Object) oe.n.g("?", array.length, ", ")) + this.f21932c);
            G.a(array);
            return G;
        }

        public b(s0 s0Var, String str, List list, ArrayList arrayList, String str2) {
            this.f21934e = 0;
            this.f21930a = s0Var;
            this.f21931b = str;
            this.f21933d = list;
            this.f21932c = str2;
            this.f = arrayList.iterator();
        }
    }

    /* compiled from: SQLitePersistence.java */
    /* loaded from: classes.dex */
    public class a implements SQLiteTransactionListener {
        public a() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public final void onBegin() {
            s0.this.f21925g.c();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public final void onCommit() {
            s0.this.f21925g.b();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public final void onRollback() {
        }
    }
}
