package k7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import g7.c;
import k7.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements o.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23043u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f23044v;

    public /* synthetic */ l(o oVar, int i6) {
        this.f23043u = i6;
        this.f23044v = oVar;
    }

    @Override // k7.o.a
    public final Object apply(Object obj) {
        int i6 = this.f23043u;
        o oVar = this.f23044v;
        switch (i6) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                oVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + oVar.f23053v.a()).execute();
                return null;
            case 1:
                Cursor cursor = (Cursor) obj;
                oVar.getClass();
                while (cursor.moveToNext()) {
                    int i10 = cursor.getInt(0);
                    oVar.g(i10, c.a.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                oVar.getClass();
                while (cursor2.moveToNext()) {
                    int i11 = cursor2.getInt(0);
                    oVar.g(i11, c.a.MAX_RETRIES_REACHED, cursor2.getString(1));
                }
                return null;
        }
    }
}
