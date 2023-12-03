package c2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import b2.c;
import c2.c;
import hs.i;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kc.f;
import kotlin.jvm.internal.k;
import v.h;
/* compiled from: FrameworkSQLiteOpenHelper.kt */
/* loaded from: classes.dex */
public final class c implements b2.c {
    public boolean A;

    /* renamed from: u  reason: collision with root package name */
    public final Context f4744u;

    /* renamed from: v  reason: collision with root package name */
    public final String f4745v;

    /* renamed from: w  reason: collision with root package name */
    public final c.a f4746w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f4747x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f4748y;

    /* renamed from: z  reason: collision with root package name */
    public final i f4749z;

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public c2.b f4750a = null;
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    /* loaded from: classes.dex */
    public static final class b extends SQLiteOpenHelper {
        public static final /* synthetic */ int B = 0;
        public boolean A;

        /* renamed from: u  reason: collision with root package name */
        public final Context f4751u;

        /* renamed from: v  reason: collision with root package name */
        public final a f4752v;

        /* renamed from: w  reason: collision with root package name */
        public final c.a f4753w;

        /* renamed from: x  reason: collision with root package name */
        public final boolean f4754x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f4755y;

        /* renamed from: z  reason: collision with root package name */
        public final d2.a f4756z;

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        /* loaded from: classes.dex */
        public static final class a extends RuntimeException {

            /* renamed from: u  reason: collision with root package name */
            public final int f4757u;

            /* renamed from: v  reason: collision with root package name */
            public final Throwable f4758v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i6, Throwable th2) {
                super(th2);
                defpackage.d.j(i6, "callbackName");
                this.f4757u = i6;
                this.f4758v = th2;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f4758v;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        /* renamed from: c2.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0102b {
            public static c2.b a(a refHolder, SQLiteDatabase sqLiteDatabase) {
                kotlin.jvm.internal.i.g(refHolder, "refHolder");
                kotlin.jvm.internal.i.g(sqLiteDatabase, "sqLiteDatabase");
                c2.b bVar = refHolder.f4750a;
                if (bVar == null || !kotlin.jvm.internal.i.b(bVar.f4741u, sqLiteDatabase)) {
                    c2.b bVar2 = new c2.b(sqLiteDatabase);
                    refHolder.f4750a = bVar2;
                    return bVar2;
                }
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, final a aVar, final c.a callback, boolean z10) {
            super(context, str, null, callback.f3937a, new DatabaseErrorHandler() { // from class: c2.d
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase dbObj) {
                    c.a callback2 = c.a.this;
                    kotlin.jvm.internal.i.g(callback2, "$callback");
                    c.a dbRef = aVar;
                    kotlin.jvm.internal.i.g(dbRef, "$dbRef");
                    int i6 = c.b.B;
                    kotlin.jvm.internal.i.f(dbObj, "dbObj");
                    b a10 = c.b.C0102b.a(dbRef, dbObj);
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + a10 + ".path");
                    if (!a10.isOpen()) {
                        String e10 = a10.e();
                        if (e10 != null) {
                            c.a.a(e10);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> list = null;
                    try {
                        try {
                            list = a10.f4742v;
                        } catch (SQLiteException unused) {
                        }
                        try {
                            a10.close();
                        } catch (IOException unused2) {
                        }
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                kotlin.jvm.internal.i.f(obj, "p.second");
                                c.a.a((String) obj);
                            }
                        } else {
                            String e11 = a10.e();
                            if (e11 != null) {
                                c.a.a(e11);
                            }
                        }
                    }
                }
            });
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(callback, "callback");
            this.f4751u = context;
            this.f4752v = aVar;
            this.f4753w = callback;
            this.f4754x = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                kotlin.jvm.internal.i.f(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            kotlin.jvm.internal.i.f(cacheDir, "context.cacheDir");
            this.f4756z = new d2.a(str, cacheDir, false);
        }

        public final b2.b a(boolean z10) {
            boolean z11;
            d2.a aVar = this.f4756z;
            try {
                if (!this.A && getDatabaseName() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                aVar.a(z11);
                this.f4755y = false;
                SQLiteDatabase h10 = h(z10);
                if (this.f4755y) {
                    close();
                    return a(z10);
                }
                return e(h10);
            } finally {
                aVar.b();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            d2.a aVar = this.f4756z;
            try {
                aVar.a(aVar.f12134a);
                super.close();
                this.f4752v.f4750a = null;
                this.A = false;
            } finally {
                aVar.b();
            }
        }

        public final c2.b e(SQLiteDatabase sqLiteDatabase) {
            kotlin.jvm.internal.i.g(sqLiteDatabase, "sqLiteDatabase");
            return C0102b.a(this.f4752v, sqLiteDatabase);
        }

        public final SQLiteDatabase g(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                kotlin.jvm.internal.i.f(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            kotlin.jvm.internal.i.f(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase h(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            Context context = this.f4751u;
            if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return g(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return g(z10);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        int d10 = h.d(aVar.f4757u);
                        Throwable th3 = aVar.f4758v;
                        if (d10 != 0 && d10 != 1 && d10 != 2 && d10 != 3) {
                            if (!(th3 instanceof SQLiteException)) {
                                throw th3;
                            }
                        } else {
                            throw th3;
                        }
                    } else if (th2 instanceof SQLiteException) {
                        if (databaseName == null || !this.f4754x) {
                            throw th2;
                        }
                    } else {
                        throw th2;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return g(z10);
                    } catch (a e10) {
                        throw e10.f4758v;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase db2) {
            kotlin.jvm.internal.i.g(db2, "db");
            try {
                this.f4753w.b(e(db2));
            } catch (Throwable th2) {
                throw new a(1, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sqLiteDatabase) {
            kotlin.jvm.internal.i.g(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f4753w.c(e(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(2, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase db2, int i6, int i10) {
            kotlin.jvm.internal.i.g(db2, "db");
            this.f4755y = true;
            try {
                this.f4753w.d(e(db2), i6, i10);
            } catch (Throwable th2) {
                throw new a(4, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase db2) {
            kotlin.jvm.internal.i.g(db2, "db");
            if (!this.f4755y) {
                try {
                    this.f4753w.e(e(db2));
                } catch (Throwable th2) {
                    throw new a(5, th2);
                }
            }
            this.A = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i6, int i10) {
            kotlin.jvm.internal.i.g(sqLiteDatabase, "sqLiteDatabase");
            this.f4755y = true;
            try {
                this.f4753w.f(e(sqLiteDatabase), i6, i10);
            } catch (Throwable th2) {
                throw new a(3, th2);
            }
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    /* renamed from: c2.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0103c extends k implements ss.a<b> {
        public C0103c() {
            super(0);
        }

        @Override // ss.a
        public final b invoke() {
            b bVar;
            int i6 = Build.VERSION.SDK_INT;
            c cVar = c.this;
            if (i6 >= 23 && cVar.f4745v != null && cVar.f4747x) {
                Context context = cVar.f4744u;
                kotlin.jvm.internal.i.g(context, "context");
                File noBackupFilesDir = context.getNoBackupFilesDir();
                kotlin.jvm.internal.i.f(noBackupFilesDir, "context.noBackupFilesDir");
                bVar = new b(cVar.f4744u, new File(noBackupFilesDir, cVar.f4745v).getAbsolutePath(), new a(), cVar.f4746w, cVar.f4748y);
            } else {
                bVar = new b(cVar.f4744u, cVar.f4745v, new a(), cVar.f4746w, cVar.f4748y);
            }
            bVar.setWriteAheadLoggingEnabled(cVar.A);
            return bVar;
        }
    }

    public c(Context context, String str, c.a callback, boolean z10, boolean z11) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(callback, "callback");
        this.f4744u = context;
        this.f4745v = str;
        this.f4746w = callback;
        this.f4747x = z10;
        this.f4748y = z11;
        this.f4749z = sp.b.O(new C0103c());
    }

    @Override // b2.c
    public final b2.b U() {
        return ((b) this.f4749z.getValue()).a(true);
    }

    @Override // b2.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        if (this.f4749z.f19471v != f.c0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((b) this.f4749z.getValue()).close();
        }
    }

    @Override // b2.c
    public final String getDatabaseName() {
        return this.f4745v;
    }

    @Override // b2.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        boolean z11;
        if (this.f4749z.f19471v != f.c0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            b sQLiteOpenHelper = (b) this.f4749z.getValue();
            kotlin.jvm.internal.i.g(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
        }
        this.A = z10;
    }
}
