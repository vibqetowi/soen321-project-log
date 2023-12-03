package k7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import k7.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements o.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23049u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f23050v;

    public /* synthetic */ n(int i6, long j10) {
        this.f23049u = i6;
        this.f23050v = j10;
    }

    @Override // k7.o.a
    public final Object apply(Object obj) {
        int i6 = this.f23049u;
        long j10 = this.f23050v;
        switch (i6) {
            case 0:
                return (g7.f) o.J(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new n(1, j10));
            default:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new g7.f(cursor.getLong(0), j10);
        }
    }
}
