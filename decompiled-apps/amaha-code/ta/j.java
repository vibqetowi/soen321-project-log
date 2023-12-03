package ta;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class j extends SQLiteOpenHelper {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f32636u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f32636u = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SQLiteDatabase getWritableDatabase() {
        boolean z10;
        k kVar = this.f32636u;
        fs.c cVar = kVar.f32688y;
        y3 y3Var = kVar.f32943u;
        y3Var.getClass();
        if (cVar.f15848a != 0) {
            ((kotlin.jvm.internal.b0) ((aa.c) cVar.f15849b)).getClass();
            if (SystemClock.elapsedRealtime() - cVar.f15848a < 3600000) {
                z10 = false;
                if (!z10) {
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException unused) {
                        fs.c cVar2 = kVar.f32688y;
                        ((kotlin.jvm.internal.b0) ((aa.c) cVar2.f15849b)).getClass();
                        cVar2.f15848a = SystemClock.elapsedRealtime();
                        w2 w2Var = y3Var.C;
                        y3.k(w2Var);
                        w2Var.f32925z.b("Opening the database failed, dropping and recreating it");
                        y3Var.getClass();
                        if (!y3Var.f32953u.getDatabasePath("google_app_measurement.db").delete()) {
                            w2 w2Var2 = y3Var.C;
                            y3.k(w2Var2);
                            w2Var2.f32925z.c("google_app_measurement.db", "Failed to delete corrupted db file");
                        }
                        try {
                            SQLiteDatabase writableDatabase = super.getWritableDatabase();
                            cVar2.f15848a = 0L;
                            return writableDatabase;
                        } catch (SQLiteException e10) {
                            w2 w2Var3 = y3Var.C;
                            y3.k(w2Var3);
                            w2Var3.f32925z.c(e10, "Failed to open freshly created database");
                            throw e10;
                        }
                    }
                }
                throw new SQLiteException("Database open failed");
            }
        }
        z10 = true;
        if (!z10) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        w2 w2Var = this.f32636u.f32943u.C;
        y3.k(w2Var);
        l.b(w2Var, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        k kVar = this.f32636u;
        w2 w2Var = kVar.f32943u.C;
        y3.k(w2Var);
        l.a(w2Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", k.f32686z);
        w2 w2Var2 = kVar.f32943u.C;
        y3.k(w2Var2);
        l.a(w2Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        w2 w2Var3 = kVar.f32943u.C;
        y3.k(w2Var3);
        l.a(w2Var3, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", k.A);
        w2 w2Var4 = kVar.f32943u.C;
        y3.k(w2Var4);
        l.a(w2Var4, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", k.B);
        w2 w2Var5 = kVar.f32943u.C;
        y3.k(w2Var5);
        l.a(w2Var5, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", k.D);
        w2 w2Var6 = kVar.f32943u.C;
        y3.k(w2Var6);
        l.a(w2Var6, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        w2 w2Var7 = kVar.f32943u.C;
        y3.k(w2Var7);
        l.a(w2Var7, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", k.C);
        w2 w2Var8 = kVar.f32943u.C;
        y3.k(w2Var8);
        l.a(w2Var8, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", k.E);
        w2 w2Var9 = kVar.f32943u.C;
        y3.k(w2Var9);
        l.a(w2Var9, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", k.F);
        w2 w2Var10 = kVar.f32943u.C;
        y3.k(w2Var10);
        l.a(w2Var10, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        w2 w2Var11 = kVar.f32943u.C;
        y3.k(w2Var11);
        l.a(w2Var11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", k.G);
        w2 w2Var12 = kVar.f32943u.C;
        y3.k(w2Var12);
        l.a(w2Var12, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        w2 w2Var13 = kVar.f32943u.C;
        y3.k(w2Var13);
        l.a(w2Var13, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        w2 w2Var14 = kVar.f32943u.C;
        y3.k(w2Var14);
        l.a(w2Var14, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }
}
