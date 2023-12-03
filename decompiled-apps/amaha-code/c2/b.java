package c2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import b2.a;
import b2.f;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.r;
import x1.m;
/* compiled from: FrameworkSQLiteDatabase.kt */
/* loaded from: classes.dex */
public final class b implements b2.b {

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f4739w = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f4740x = new String[0];

    /* renamed from: u  reason: collision with root package name */
    public final SQLiteDatabase f4741u;

    /* renamed from: v  reason: collision with root package name */
    public final List<Pair<String, String>> f4742v;

    /* compiled from: FrameworkSQLiteDatabase.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ b2.e f4743u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b2.e eVar) {
            super(4);
            this.f4743u = eVar;
        }

        @Override // ss.r
        public final SQLiteCursor r(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            SQLiteQuery sQLiteQuery2 = sQLiteQuery;
            i.d(sQLiteQuery2);
            this.f4743u.e(new m(sQLiteQuery2));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery2);
        }
    }

    public b(SQLiteDatabase delegate) {
        i.g(delegate, "delegate");
        this.f4741u = delegate;
        this.f4742v = delegate.getAttachedDbs();
    }

    @Override // b2.b
    public final Cursor A(b2.e query) {
        i.g(query, "query");
        Cursor rawQueryWithFactory = this.f4741u.rawQueryWithFactory(new c2.a(1, new a(query)), query.a(), f4740x, null);
        i.f(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // b2.b
    public final void Q() {
        this.f4741u.beginTransactionNonExclusive();
    }

    @Override // b2.b
    public final Cursor X(b2.e query, CancellationSignal cancellationSignal) {
        i.g(query, "query");
        String sql = query.a();
        String[] strArr = f4740x;
        i.d(cancellationSignal);
        c2.a aVar = new c2.a(0, query);
        SQLiteDatabase sQLiteDatabase = this.f4741u;
        i.g(sQLiteDatabase, "sQLiteDatabase");
        i.g(sql, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, sql, strArr, null, cancellationSignal);
        i.f(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public final void a(String sql, Object[] bindArgs) {
        i.g(sql, "sql");
        i.g(bindArgs, "bindArgs");
        this.f4741u.execSQL(sql, bindArgs);
    }

    @Override // b2.b
    public final void beginTransaction() {
        this.f4741u.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4741u.close();
    }

    public final String e() {
        return this.f4741u.getPath();
    }

    @Override // b2.b
    public final void endTransaction() {
        this.f4741u.endTransaction();
    }

    public final Cursor g(String query) {
        i.g(query, "query");
        return A(new b2.a(query));
    }

    public final int h(String table, int i6, ContentValues values, String str, Object[] objArr) {
        boolean z10;
        int length;
        String str2;
        i.g(table, "table");
        i.g(values, "values");
        int i10 = 0;
        if (values.size() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int size = values.size();
            if (objArr == null) {
                length = size;
            } else {
                length = objArr.length + size;
            }
            Object[] objArr2 = new Object[length];
            StringBuilder sb2 = new StringBuilder("UPDATE ");
            sb2.append(f4739w[i6]);
            sb2.append(table);
            sb2.append(" SET ");
            for (String str3 : values.keySet()) {
                if (i10 > 0) {
                    str2 = ",";
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(str3);
                objArr2[i10] = values.get(str3);
                sb2.append("=?");
                i10++;
            }
            if (objArr != null) {
                for (int i11 = size; i11 < length; i11++) {
                    objArr2[i11] = objArr[i11 - size];
                }
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append(" WHERE ");
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            i.f(sb3, "StringBuilder().apply(builderAction).toString()");
            f w10 = w(sb3);
            a.C0073a.a((m) w10, objArr2);
            return ((e) w10).v();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    @Override // b2.b
    public final boolean isOpen() {
        return this.f4741u.isOpen();
    }

    @Override // b2.b
    public final boolean n0() {
        return this.f4741u.inTransaction();
    }

    @Override // b2.b
    public final void q(String sql) {
        i.g(sql, "sql");
        this.f4741u.execSQL(sql);
    }

    @Override // b2.b
    public final boolean s0() {
        SQLiteDatabase sQLiteDatabase = this.f4741u;
        i.g(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // b2.b
    public final void setTransactionSuccessful() {
        this.f4741u.setTransactionSuccessful();
    }

    @Override // b2.b
    public final f w(String sql) {
        i.g(sql, "sql");
        SQLiteStatement compileStatement = this.f4741u.compileStatement(sql);
        i.f(compileStatement, "delegate.compileStatement(sql)");
        return new e(compileStatement);
    }
}
