package bi;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import org.json.JSONObject;
import s1.s;
/* compiled from: MoEDatabaseHelper.java */
/* loaded from: classes.dex */
public final class p extends SQLiteOpenHelper {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f4320w = 0;

    /* renamed from: u  reason: collision with root package name */
    public final ih.p f4321u;

    /* renamed from: v  reason: collision with root package name */
    public final n f4322v;

    public p(Context context, ih.p pVar, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 19);
        this.f4321u = pVar;
        this.f4322v = new n(context, pVar);
    }

    public static boolean a(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(MESSAGES)", null);
        ArrayList arrayList = new ArrayList();
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        int columnIndex = rawQuery.getColumnIndex(SessionManager.KEY_NAME);
                        if (columnIndex != -1) {
                            arrayList.add(rawQuery.getString(columnIndex));
                        }
                    } while (rawQuery.moveToNext());
                }
            } finally {
                rawQuery.close();
            }
        }
        if (rawQuery != null) {
        }
        return arrayList.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean g(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z10;
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("select DISTINCT tbl_name from sqlite_master where tbl_name = '" + str + "'", null);
            if (cursor != null) {
                if (cursor.getCount() > 0) {
                    z10 = true;
                    return z10;
                }
            }
            z10 = false;
            return z10;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(SQLiteDatabase sQLiteDatabase) {
        int i6;
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
        } catch (Exception e10) {
            e = e10;
            i6 = 0;
        }
        if (!sQLiteDatabase.isOpen()) {
            return false;
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM sqlite_master WHERE type = ? AND name = ?", new String[]{"table", "INAPPS"});
        if (!rawQuery.moveToFirst()) {
            return false;
        }
        i6 = rawQuery.getInt(0);
        try {
            rawQuery.close();
        } catch (Exception e11) {
            e = e11;
            this.f4321u.f20105d.a(1, e, new xg.i(14));
            if (i6 > 0) {
            }
        }
        if (i6 > 0) {
            return false;
        }
        return true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db2) {
        n nVar = this.f4322v;
        nVar.getClass();
        kotlin.jvm.internal.i.g(db2, "db");
        db2.execSQL("CREATE TABLE IF NOT EXISTS MESSAGES ( _id INTEGER PRIMARY KEY, msg TEXT, msgclicked INTEGER DEFAULT 0, msgttl INTEGER, gtime INTEGER, msg_tag TEXT, campaign_id TEXT )");
        db2.execSQL("CREATE TABLE IF NOT EXISTS INAPPMSG ( _id INTEGER PRIMARY KEY, gtime INTEGER, campaign_id TEXT, align_type TEXT, inapp_type TEXT, ttl INTEGER DEFAULT 0, min_delay INTEGER DEFAULT 0, max_times INTEGER DEFAULT 0, shown_count INTEGER DEFAULT 0, persistent INTEGER DEFAULT 0, priority INTEGER DEFAULT 0, context TEXT, last_shown INTEGER DEFAULT 0, is_clicked INTEGER DEFAULT 0, has_errors INTEGER DEFAULT 0, auto_dismiss INTEGER DEFAULT 0, cancelable INTEGER DEFAULT 0, content TEXT, show_only_in TEXT, status TEXT, dim_style TEXT );");
        db2.execSQL("CREATE TABLE IF NOT EXISTS USERATTRIBUTES ( _id INTEGER PRIMARY KEY, attribute_name TEXT, attribute_value TEXT ); ");
        db2.execSQL("CREATE TABLE IF NOT EXISTS CAMPAIGNLIST ( _id INTEGER PRIMARY KEY, campaign_id TEXT, ttl INTEGER );");
        db2.execSQL("CREATE TABLE IF NOT EXISTS DATAPOINTS ( _id INTEGER PRIMARY KEY, gtime INTEGER, details TEXT  ); ");
        db2.execSQL("CREATE TABLE IF NOT EXISTS BATCH_DATA ( _id INTEGER PRIMARY KEY, batch_data TEXT );");
        db2.execSQL("CREATE TABLE IF NOT EXISTS DEVICE_TRIGGERS ( _id INTEGER PRIMARY KEY, campaign_id TEXT, event_name TEXT, payload TEXT, campaign_payload TEXT, campaign_type TEXT, max_count INTEGER DEFAULT 0, minimum_delay INTEGER DEFAULT 0, should_show_offline INTEGER DEFAULT 0, max_sync_delay_time INTEGER DEFAULT 0, expiry_time INTEGER, priority INTEGER DEFAULT 3, last_show_time INTEGER DEFAULT 0, show_count INTEGER DEFAULT 0, last_updated_time INTEGER DEFAULT 0, status TEXT, should_ignore_dnd INTEGER DEFAULT 0, delay_before_showing INTEGER DEFAULT 0  ) ");
        hh.g.b(nVar.f4316b.f20105d, 0, new f(nVar), 3);
        db2.execSQL("CREATE TABLE IF NOT EXISTS ATTRIBUTE_CACHE ( _id INTEGER PRIMARY KEY, name TEXT, value TEXT, last_tracked_time INTEGER DEFAULT 0, datatype TEXT  ) ");
        db2.execSQL("CREATE TABLE IF NOT EXISTS INAPP_STATS ( _id INTEGER PRIMARY KEY, timestamp INTEGER, payload TEXT, request_id TEXT  ) ");
        db2.execSQL("CREATE TABLE IF NOT EXISTS INAPP_V3 ( _id INTEGER PRIMARY KEY, campaign_id TEXT, type TEXT, status TEXT, state TEXT, priority INTEGER, last_updated_time INTEGER, template_type TEXT, deletion_time INTEGER, last_received_time INTEGER DEFAULT 0, campaign_meta TEXT  ) ");
        db2.execSQL("CREATE TABLE IF NOT EXISTS CARDS ( _id INTEGER PRIMARY KEY, card_id TEXT, category TEXT, campaign_state TEXT, visibility_status TEXT, last_updated_time INTEGER, campaign_payload TEXT, is_pinned INTEGER, deletion_time INTEGER, is_new_card INTEGER, is_deleted INTEGER DEFAULT 0, priority INTEGER DEFAULT 0  ) ");
        db2.execSQL("CREATE TABLE IF NOT EXISTS KEY_VALUE_STORE ( _id INTEGER PRIMARY KEY, key TEXT, value TEXT, timestamp INTEGER  ) ");
        db2.execSQL("CREATE TABLE IF NOT EXISTS PUSH_REPOST_CAMPAIGNS ( _id INTEGER PRIMARY KEY, campaign_id TEXT, campaign_payload TEXT, expiry_time INTEGER );");
        this.f4321u.f20105d.a(3, null, new xg.i(2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ff, code lost:
        if (r12 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0302, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02eb, code lost:
        if (r12 == null) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4 A[LOOP:1: B:39:0x0142->B:55:0x01e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a8 A[Catch: all -> 0x02e4, Exception -> 0x02e6, TryCatch #21 {Exception -> 0x02e6, all -> 0x02e4, blocks: (B:78:0x028f, B:80:0x0295, B:82:0x029c, B:88:0x02a8, B:93:0x02e8), top: B:208:0x028f }] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase db2, final int i6, final int i10) {
        ih.p pVar;
        int i11;
        Cursor cursor;
        Cursor cursor2;
        boolean z10;
        Throwable th2;
        ih.k e10;
        ih.p pVar2 = this.f4321u;
        Throwable th3 = null;
        pVar2.f20105d.a(5, null, new xg.i(3));
        int i12 = i6 + 1;
        while (true) {
            int i13 = i12;
            hh.g gVar = pVar2.f20105d;
            if (i13 <= i10) {
                n nVar = this.f4322v;
                switch (i13) {
                    case 3:
                        pVar = pVar2;
                        i11 = i13;
                        db2.beginTransaction();
                        try {
                            try {
                                nVar.getClass();
                                db2.execSQL("CREATE TABLE IF NOT EXISTS DATAPOINTS ( _id INTEGER PRIMARY KEY, gtime INTEGER, details TEXT  ); ");
                                db2.execSQL("CREATE TABLE IF NOT EXISTS MESSAGES ( _id INTEGER PRIMARY KEY, msg TEXT, msgclicked INTEGER DEFAULT 0, msgttl INTEGER, gtime INTEGER, msg_tag TEXT, campaign_id TEXT )");
                                db2.execSQL("CREATE TABLE IF NOT EXISTS INAPPMSG ( _id INTEGER PRIMARY KEY, gtime INTEGER, campaign_id TEXT, align_type TEXT, inapp_type TEXT, ttl INTEGER DEFAULT 0, min_delay INTEGER DEFAULT 0, max_times INTEGER DEFAULT 0, shown_count INTEGER DEFAULT 0, persistent INTEGER DEFAULT 0, priority INTEGER DEFAULT 0, context TEXT, last_shown INTEGER DEFAULT 0, is_clicked INTEGER DEFAULT 0, has_errors INTEGER DEFAULT 0, auto_dismiss INTEGER DEFAULT 0, cancelable INTEGER DEFAULT 0, content TEXT, show_only_in TEXT, status TEXT, dim_style TEXT );");
                                db2.execSQL("DROP TABLE IF EXISTS moeints");
                                db2.execSQL("DROP TABLE IF EXISTS moemsgs");
                                db2.execSQL("DROP TABLE IF EXISTS moeinappmsgs");
                                db2.setTransactionSuccessful();
                            } finally {
                            }
                        } catch (Exception e11) {
                            gVar.a(1, e11, new xg.i(5));
                        }
                        db2.endTransaction();
                        break;
                    case 4:
                        pVar = pVar2;
                        i11 = i13;
                        break;
                    case 5:
                        pVar = pVar2;
                        i11 = i13;
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "db");
                        db2.beginTransaction();
                        try {
                            try {
                                db2.execSQL("DROP TABLE IF EXISTS CHATS");
                                db2.setTransactionSuccessful();
                            } catch (Exception e12) {
                                nVar.f4316b.f20105d.a(1, e12, new l(nVar));
                            }
                            db2.endTransaction();
                            break;
                        } finally {
                        }
                    case 6:
                        pVar = pVar2;
                        i11 = i13;
                        db2.beginTransaction();
                        try {
                            try {
                                if (e(db2)) {
                                    db2.execSQL(" ALTER TABLE INAPPS ADD COLUMN TYPE INTEGER");
                                }
                                db2.setTransactionSuccessful();
                            } catch (Exception e13) {
                                gVar.a(1, e13, new xg.i(6));
                            }
                            db2.endTransaction();
                            break;
                        } finally {
                        }
                    case 7:
                        pVar = pVar2;
                        i11 = i13;
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "db");
                        db2.beginTransaction();
                        try {
                            try {
                                db2.execSQL("CREATE TABLE IF NOT EXISTS DATAPOINTS ( _id INTEGER PRIMARY KEY, gtime INTEGER, details TEXT  ); ");
                                db2.execSQL("DROP TABLE IF EXISTS EVENTS");
                                db2.setTransactionSuccessful();
                            } catch (Exception e14) {
                                nVar.f4316b.f20105d.a(1, e14, new m(nVar));
                            }
                            db2.endTransaction();
                            break;
                        } finally {
                        }
                    case 8:
                        pVar = pVar2;
                        i11 = i13;
                        db2.beginTransaction();
                        try {
                            try {
                                if (!a("msg_tag", db2)) {
                                    db2.execSQL(" ALTER TABLE MESSAGES ADD COLUMN msg_tag TEXT");
                                }
                                db2.setTransactionSuccessful();
                            } catch (Exception e15) {
                                gVar.a(1, e15, new xg.i(7));
                            }
                            db2.endTransaction();
                            break;
                        } finally {
                        }
                    case 9:
                        pVar = pVar2;
                        i11 = i13;
                        db2.execSQL("DROP TABLE IF EXISTS INAPPS");
                        db2.execSQL("CREATE TABLE IF NOT EXISTS INAPPMSG ( _id INTEGER PRIMARY KEY, gtime INTEGER, campaign_id TEXT, align_type TEXT, inapp_type TEXT, ttl INTEGER DEFAULT 0, min_delay INTEGER DEFAULT 0, max_times INTEGER DEFAULT 0, shown_count INTEGER DEFAULT 0, persistent INTEGER DEFAULT 0, priority INTEGER DEFAULT 0, context TEXT, last_shown INTEGER DEFAULT 0, is_clicked INTEGER DEFAULT 0, has_errors INTEGER DEFAULT 0, auto_dismiss INTEGER DEFAULT 0, cancelable INTEGER DEFAULT 0, content TEXT, show_only_in TEXT, status TEXT, dim_style TEXT );");
                        if (!a("msg_tag", db2)) {
                            db2.execSQL(" ALTER TABLE MESSAGES ADD COLUMN msg_tag TEXT");
                            break;
                        }
                        break;
                    case 10:
                        pVar = pVar2;
                        i11 = i13;
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "db");
                        db2.execSQL("CREATE TABLE IF NOT EXISTS USERATTRIBUTES ( _id INTEGER PRIMARY KEY, attribute_name TEXT, attribute_value TEXT ); ");
                        break;
                    case 11:
                        pVar = pVar2;
                        i11 = i13;
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "db");
                        db2.execSQL("CREATE TABLE IF NOT EXISTS CAMPAIGNLIST ( _id INTEGER PRIMARY KEY, campaign_id TEXT, ttl INTEGER );");
                        break;
                    case 12:
                        pVar = pVar2;
                        i11 = i13;
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "db");
                        db2.execSQL("CREATE TABLE IF NOT EXISTS BATCH_DATA ( _id INTEGER PRIMARY KEY, batch_data TEXT );");
                        break;
                    case 13:
                        pVar = pVar2;
                        i11 = i13;
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "db");
                        db2.execSQL("CREATE TABLE IF NOT EXISTS DEVICE_TRIGGERS ( _id INTEGER PRIMARY KEY, campaign_id TEXT, event_name TEXT, payload TEXT, campaign_payload TEXT, campaign_type TEXT, max_count INTEGER DEFAULT 0, minimum_delay INTEGER DEFAULT 0, should_show_offline INTEGER DEFAULT 0, max_sync_delay_time INTEGER DEFAULT 0, expiry_time INTEGER, priority INTEGER DEFAULT 3, last_show_time INTEGER DEFAULT 0, show_count INTEGER DEFAULT 0, last_updated_time INTEGER DEFAULT 0, status TEXT, should_ignore_dnd INTEGER DEFAULT 0, delay_before_showing INTEGER DEFAULT 0  ) ");
                        break;
                    case 14:
                        pVar = pVar2;
                        i11 = i13;
                        gVar.a(5, th3, new xg.i(8));
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "db");
                        ih.p pVar3 = nVar.f4316b;
                        hh.g gVar2 = pVar3.f20105d;
                        hh.g gVar3 = pVar3.f20105d;
                        hh.g.b(gVar2, 0, new i(nVar), 3);
                        hh.g.b(pVar3.f20105d, 0, new f(nVar), 3);
                        db2.execSQL("CREATE TABLE IF NOT EXISTS ATTRIBUTE_CACHE ( _id INTEGER PRIMARY KEY, name TEXT, value TEXT, last_tracked_time INTEGER DEFAULT 0, datatype TEXT  ) ");
                        try {
                            try {
                                try {
                                    hh.g.b(gVar3, 0, new g(nVar), 3);
                                    db2.beginTransaction();
                                    cursor2 = db2.rawQuery("SELECT attribute_name, attribute_value FROM USERATTRIBUTES WHERE attribute_name = ?", new String[]{"USER_ATTRIBUTE_UNIQUE_ID"});
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                String uniqueId = cursor2.getString(1);
                                                if (uniqueId != null && !gv.n.B0(uniqueId)) {
                                                    z10 = false;
                                                    if (!z10) {
                                                        kotlin.jvm.internal.i.f(uniqueId, "uniqueId");
                                                        ai.g gVar4 = ai.g.f583a;
                                                        Context context = nVar.f4315a;
                                                        gVar4.getClass();
                                                        ai.g.a(context, pVar3).f24373a.J("user_attribute_unique_id", uniqueId);
                                                        ContentValues contentValues = new ContentValues();
                                                        contentValues.put(SessionManager.KEY_NAME, "USER_ATTRIBUTE_UNIQUE_ID");
                                                        contentValues.put("value", uniqueId);
                                                        contentValues.put("last_tracked_time", (Integer) 0);
                                                        contentValues.put("datatype", "STRING");
                                                        db2.insert("ATTRIBUTE_CACHE", null, contentValues);
                                                    }
                                                }
                                                z10 = true;
                                                if (!z10) {
                                                }
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            try {
                                                gVar3.a(1, e, new h(nVar));
                                                break;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                cursor = cursor2;
                                                cursor2 = cursor;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            if (cursor2 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    db2.setTransactionSuccessful();
                                    break;
                                } catch (Exception e17) {
                                    e = e17;
                                    cursor2 = null;
                                    gVar3.a(1, e, new h(nVar));
                                }
                            } catch (Exception e18) {
                                e = e18;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            cursor = null;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            throw th;
                        }
                        break;
                    case 15:
                        pVar = pVar2;
                        i11 = i13;
                        gVar.a(5, null, new xg.i(9));
                        if (!a(Constants.CAMPAIGN_ID, db2)) {
                            gVar.a(5, null, new xg.i(15));
                            db2.execSQL(" ALTER TABLE MESSAGES ADD COLUMN campaign_id TEXT");
                        }
                        break;
                    case 16:
                        gVar.a(5, null, new xg.i(10));
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "db");
                        db2.execSQL("CREATE TABLE IF NOT EXISTS INAPP_V3 ( _id INTEGER PRIMARY KEY, campaign_id TEXT, type TEXT, status TEXT, state TEXT, priority INTEGER, last_updated_time INTEGER, template_type TEXT, deletion_time INTEGER, last_received_time INTEGER DEFAULT 0, campaign_meta TEXT  ) ");
                        try {
                            try {
                                nVar.a();
                            } catch (Exception e19) {
                                e = e19;
                                pVar = pVar2;
                                i11 = i13;
                            }
                            if (!g(db2, "INAPP_V3")) {
                                gVar.a(5, null, new xg.i(16));
                            } else if (!g(db2, "INAPPMSG")) {
                                gVar.a(5, null, new xg.i(17));
                            } else {
                                db2.beginTransaction();
                                Cursor rawQuery = db2.rawQuery("SELECT campaign_id, shown_count, last_shown, is_clicked, status, ttl, priority FROM INAPPMSG", null);
                                if (rawQuery == null || !rawQuery.moveToFirst()) {
                                    pVar = pVar2;
                                    i11 = i13;
                                } else {
                                    while (true) {
                                        ContentValues contentValues2 = new ContentValues();
                                        String string = rawQuery.getString(0);
                                        long j10 = rawQuery.getLong(5) / 1000;
                                        ih.j jVar = new ih.j(string, rawQuery.getLong(5), rawQuery.getLong(6), rawQuery.getLong(1), rawQuery.getLong(2), rawQuery.getInt(3));
                                        ch.a aVar = ch.c.f5286a;
                                        if (aVar == null) {
                                            e10 = null;
                                        } else {
                                            e10 = aVar.e(jVar);
                                        }
                                        if (e10 != null) {
                                            JSONObject jSONObject = e10.f20098a;
                                            JSONObject jSONObject2 = e10.f20099b;
                                            if (jSONObject2 != null && jSONObject != null) {
                                                pVar = pVar2;
                                                i11 = i13;
                                                try {
                                                    long max = Math.max(j10, sp.b.n() + 5184000);
                                                    contentValues2.put("state", jSONObject2.toString());
                                                    contentValues2.put("campaign_meta", jSONObject.toString());
                                                    contentValues2.put(Constants.CAMPAIGN_ID, string);
                                                    contentValues2.put("status", "IN_ACTIVE");
                                                    contentValues2.put("type", "general");
                                                    contentValues2.put("deletion_time", Long.valueOf(max));
                                                    db2.insert("INAPP_V3", null, contentValues2);
                                                    if (!rawQuery.moveToNext()) {
                                                        pVar2 = pVar;
                                                        i13 = i11;
                                                    }
                                                } catch (Exception e20) {
                                                    e = e20;
                                                    gVar.a(1, e, new xg.i(19));
                                                    db2.endTransaction();
                                                    db2.execSQL("CREATE TABLE IF NOT EXISTS INAPP_STATS ( _id INTEGER PRIMARY KEY, timestamp INTEGER, payload TEXT, request_id TEXT  ) ");
                                                    th2 = null;
                                                    i12 = i11 + 1;
                                                    th3 = th2;
                                                    pVar2 = pVar;
                                                }
                                            }
                                        }
                                        pVar = pVar2;
                                        i11 = i13;
                                        gVar.a(5, null, new xg.i(18));
                                        if (!rawQuery.moveToNext()) {
                                        }
                                    }
                                }
                                if (rawQuery != null) {
                                    rawQuery.close();
                                }
                                db2.setTransactionSuccessful();
                                db2.endTransaction();
                                db2.execSQL("CREATE TABLE IF NOT EXISTS INAPP_STATS ( _id INTEGER PRIMARY KEY, timestamp INTEGER, payload TEXT, request_id TEXT  ) ");
                            }
                            db2.endTransaction();
                            pVar = pVar2;
                            i11 = i13;
                            db2.execSQL("CREATE TABLE IF NOT EXISTS INAPP_STATS ( _id INTEGER PRIMARY KEY, timestamp INTEGER, payload TEXT, request_id TEXT  ) ");
                        } finally {
                        }
                        break;
                    case 17:
                        gVar.a(5, null, new xg.i(11));
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "database");
                        db2.execSQL("CREATE TABLE IF NOT EXISTS CARDS ( _id INTEGER PRIMARY KEY, card_id TEXT, category TEXT, campaign_state TEXT, visibility_status TEXT, last_updated_time INTEGER, campaign_payload TEXT, is_pinned INTEGER, deletion_time INTEGER, is_new_card INTEGER, is_deleted INTEGER DEFAULT 0, priority INTEGER DEFAULT 0  ) ");
                        pVar = pVar2;
                        i11 = i13;
                        break;
                    case 18:
                        gVar.a(5, th3, new xg.i(12));
                        ih.p pVar4 = nVar.f4316b;
                        kotlin.jvm.internal.i.g(db2, "db");
                        try {
                            try {
                                hh.g.b(pVar4.f20105d, 0, new j(nVar), 3);
                                db2.execSQL("CREATE TABLE IF NOT EXISTS KEY_VALUE_STORE ( _id INTEGER PRIMARY KEY, key TEXT, value TEXT, timestamp INTEGER  ) ");
                                ai.g gVar5 = ai.g.f583a;
                                Context context2 = nVar.f4315a;
                                gVar5.getClass();
                                s sVar = ai.g.a(context2, pVar4).f24373a;
                                String string2 = ((SharedPreferences) sVar.f31226x).getString("remote_configuration", null);
                                sVar.K("remote_configuration");
                                if (string2 != null) {
                                    db2.beginTransaction();
                                    ContentValues contentValues3 = new ContentValues();
                                    contentValues3.put("key", "remote_configuration");
                                    contentValues3.put("value", string2);
                                    db2.insert("KEY_VALUE_STORE", null, contentValues3);
                                    db2.setTransactionSuccessful();
                                }
                            } catch (Exception e21) {
                                pVar4.f20105d.a(1, e21, new k(nVar));
                            }
                            gVar.a(5, null, new xg.i(13));
                            nVar.getClass();
                            kotlin.jvm.internal.i.g(db2, "db");
                            db2.execSQL("CREATE TABLE IF NOT EXISTS PUSH_REPOST_CAMPAIGNS ( _id INTEGER PRIMARY KEY, campaign_id TEXT, campaign_payload TEXT, expiry_time INTEGER );");
                            pVar = pVar2;
                            i11 = i13;
                            break;
                        } finally {
                        }
                    case 19:
                        gVar.a(5, null, new xg.i(13));
                        nVar.getClass();
                        kotlin.jvm.internal.i.g(db2, "db");
                        db2.execSQL("CREATE TABLE IF NOT EXISTS PUSH_REPOST_CAMPAIGNS ( _id INTEGER PRIMARY KEY, campaign_id TEXT, campaign_payload TEXT, expiry_time INTEGER );");
                        pVar = pVar2;
                        i11 = i13;
                        break;
                    default:
                        pVar = pVar2;
                        i11 = i13;
                        th2 = null;
                        gVar.a(5, null, new ss.a() { // from class: bi.o
                            @Override // ss.a
                            public final Object invoke() {
                                return "Core_MoEDatabaseHelperFailed to upgrade from DB version" + i6 + "to DB version" + i10;
                            }
                        });
                        continue;
                        i12 = i11 + 1;
                        th3 = th2;
                        pVar2 = pVar;
                }
                th2 = null;
                i12 = i11 + 1;
                th3 = th2;
                pVar2 = pVar;
            } else {
                gVar.a(5, th3, new xg.i(4));
                return;
            }
        }
    }
}
