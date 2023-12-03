package c2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import je.s0;
import kotlin.jvm.internal.i;
import ss.r;
import x1.m;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4737a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4738b;

    public /* synthetic */ a(int i6, Object obj) {
        this.f4737a = i6;
        this.f4738b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        int i6 = this.f4737a;
        Object obj = this.f4738b;
        switch (i6) {
            case 0:
                b2.e query = (b2.e) obj;
                i.g(query, "$query");
                i.d(sQLiteQuery);
                query.e(new m(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 1:
                r tmp0 = (r) obj;
                i.g(tmp0, "$tmp0");
                return (Cursor) tmp0.r(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            default:
                s0.D(sQLiteQuery, (Object[]) obj);
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
