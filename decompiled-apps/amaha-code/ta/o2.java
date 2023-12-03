package ta;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class o2 extends SQLiteOpenHelper {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q2 f32780u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(q2 q2Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f32780u = q2Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            q2 q2Var = this.f32780u;
            w2 w2Var = q2Var.f32943u.C;
            y3.k(w2Var);
            w2Var.f32925z.b("Opening the local database failed, dropping and recreating it");
            q2Var.f32943u.getClass();
            if (!q2Var.f32943u.f32953u.getDatabasePath("google_app_measurement_local.db").delete()) {
                w2 w2Var2 = q2Var.f32943u.C;
                y3.k(w2Var2);
                w2Var2.f32925z.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                w2 w2Var3 = q2Var.f32943u.C;
                y3.k(w2Var3);
                w2Var3.f32925z.c(e11, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        w2 w2Var = this.f32780u.f32943u.C;
        y3.k(w2Var);
        l.b(w2Var, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        w2 w2Var = this.f32780u.f32943u.C;
        y3.k(w2Var);
        l.a(w2Var, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }
}
