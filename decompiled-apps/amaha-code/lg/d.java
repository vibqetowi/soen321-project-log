package lg;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import kotlin.jvm.internal.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: MPDbAdapter.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f24305b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final String f24306c = "CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')";

    /* renamed from: d  reason: collision with root package name */
    public static final String f24307d = "CREATE TABLE people (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')";

    /* renamed from: e  reason: collision with root package name */
    public static final String f24308e = "CREATE TABLE groups (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')";
    public static final String f = "CREATE TABLE anonymous_people (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')";

    /* renamed from: g  reason: collision with root package name */
    public static final String f24309g = "CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);";

    /* renamed from: h  reason: collision with root package name */
    public static final String f24310h = "CREATE INDEX IF NOT EXISTS time_idx ON people (created_at);";

    /* renamed from: i  reason: collision with root package name */
    public static final String f24311i = "CREATE INDEX IF NOT EXISTS time_idx ON groups (created_at);";

    /* renamed from: j  reason: collision with root package name */
    public static final String f24312j = "CREATE INDEX IF NOT EXISTS time_idx ON anonymous_people (created_at);";

    /* renamed from: a  reason: collision with root package name */
    public final a f24313a;

    /* compiled from: MPDbAdapter.java */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: u  reason: collision with root package name */
        public final File f24314u;

        /* renamed from: v  reason: collision with root package name */
        public final c f24315v;

        /* renamed from: w  reason: collision with root package name */
        public final Context f24316w;

        /* compiled from: MPDbAdapter.java */
        /* renamed from: lg.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0383a implements FilenameFilter {
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.startsWith("com.mixpanel.android.mpmetrics.MixpanelAPI_");
            }
        }

        public a(Context context) {
            super(context, "mixpanel", (SQLiteDatabase.CursorFactory) null, 7);
            this.f24314u = context.getDatabasePath("mixpanel");
            this.f24315v = c.b(context);
            this.f24316w = context;
        }

        public final void a() {
            close();
            this.f24314u.delete();
        }

        public final void e(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(d.f);
            sQLiteDatabase.execSQL(d.f24312j);
            Context context = this.f24316w;
            File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
            if (file.exists() && file.isDirectory()) {
                for (String str : file.list(new C0383a())) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(str.split("\\.xml")[0], 0);
                    String string = sharedPreferences.getString("waiting_array", null);
                    if (string != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(string);
                            sQLiteDatabase.beginTransaction();
                            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i6);
                                    String string2 = jSONObject.getString("$token");
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("data", jSONObject.toString());
                                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("automatic_data", Boolean.FALSE);
                                    contentValues.put("token", string2);
                                    sQLiteDatabase.insert("anonymous_people", null, contentValues);
                                } catch (JSONException unused) {
                                }
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                        } catch (JSONException unused2) {
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.remove("waiting_array");
                        edit.apply();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            b0.t("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
            sQLiteDatabase.execSQL(d.f24306c);
            sQLiteDatabase.execSQL(d.f24307d);
            sQLiteDatabase.execSQL(d.f24308e);
            sQLiteDatabase.execSQL(d.f);
            sQLiteDatabase.execSQL(d.f24309g);
            sQLiteDatabase.execSQL(d.f24310h);
            sQLiteDatabase.execSQL(d.f24311i);
            sQLiteDatabase.execSQL(d.f24312j);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i6, int i10) {
            int i11;
            int i12;
            String string;
            int i13;
            int i14;
            int i15;
            String string2;
            int i16;
            b0.t("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
            if (i6 >= 4 && i10 <= 7) {
                if (i6 == 4) {
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN automatic_data INTEGER DEFAULT 0");
                    sQLiteDatabase.execSQL("ALTER TABLE people ADD COLUMN automatic_data INTEGER DEFAULT 0");
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN token STRING NOT NULL DEFAULT ''");
                    sQLiteDatabase.execSQL("ALTER TABLE people ADD COLUMN token STRING NOT NULL DEFAULT ''");
                    Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM events", null);
                    while (rawQuery.moveToNext()) {
                        try {
                            if (rawQuery.getColumnIndex("data") >= 0) {
                                i15 = rawQuery.getColumnIndex("data");
                            } else {
                                i15 = 1;
                            }
                            string2 = new JSONObject(rawQuery.getString(i15)).getJSONObject("properties").getString("token");
                            if (rawQuery.getColumnIndex("_id") >= 0) {
                                i16 = rawQuery.getColumnIndex("_id");
                            } else {
                                i16 = 0;
                            }
                            i14 = rawQuery.getInt(i16);
                        } catch (JSONException unused) {
                            i14 = 0;
                        }
                        try {
                            sQLiteDatabase.execSQL("UPDATE events SET token = '" + string2 + "' WHERE _id = " + i14);
                        } catch (JSONException unused2) {
                            sQLiteDatabase.delete("events", "_id = " + i14, null);
                        }
                    }
                    Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM people", null);
                    while (rawQuery2.moveToNext()) {
                        try {
                            if (rawQuery2.getColumnIndex("data") >= 0) {
                                i12 = rawQuery2.getColumnIndex("data");
                            } else {
                                i12 = 1;
                            }
                            string = new JSONObject(rawQuery2.getString(i12)).getString("$token");
                            if (rawQuery2.getColumnIndex("_id") >= 0) {
                                i13 = rawQuery2.getColumnIndex("_id");
                            } else {
                                i13 = 0;
                            }
                            i11 = rawQuery2.getInt(i13);
                        } catch (JSONException unused3) {
                            i11 = 0;
                        }
                        try {
                            sQLiteDatabase.execSQL("UPDATE people SET token = '" + string + "' WHERE _id = " + i11);
                        } catch (JSONException unused4) {
                            sQLiteDatabase.delete("people", "_id = " + i11, null);
                        }
                    }
                    sQLiteDatabase.execSQL(d.f24308e);
                    sQLiteDatabase.execSQL(d.f24311i);
                    e(sQLiteDatabase);
                }
                if (i6 == 5) {
                    sQLiteDatabase.execSQL(d.f24308e);
                    sQLiteDatabase.execSQL(d.f24311i);
                    e(sQLiteDatabase);
                }
                if (i6 == 6) {
                    e(sQLiteDatabase);
                    return;
                }
                return;
            }
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS people");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS groups");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS anonymous_people");
            sQLiteDatabase.execSQL(d.f24306c);
            sQLiteDatabase.execSQL(d.f24307d);
            sQLiteDatabase.execSQL(d.f24308e);
            sQLiteDatabase.execSQL(d.f);
            sQLiteDatabase.execSQL(d.f24309g);
            sQLiteDatabase.execSQL(d.f24310h);
            sQLiteDatabase.execSQL(d.f24311i);
            sQLiteDatabase.execSQL(d.f24312j);
        }
    }

    public d(Context context) {
        this.f24313a = new a(context);
    }

    public static d f(Context context) {
        d dVar;
        HashMap hashMap = f24305b;
        synchronized (hashMap) {
            Context applicationContext = context.getApplicationContext();
            if (!hashMap.containsKey(applicationContext)) {
                dVar = new d(applicationContext);
                hashMap.put(applicationContext, dVar);
            } else {
                dVar = (d) hashMap.get(applicationContext);
            }
        }
        return dVar;
    }

    public final boolean a() {
        a aVar = this.f24313a;
        File file = aVar.f24314u;
        if (file.exists()) {
            long length = file.length();
            long usableSpace = file.getUsableSpace();
            c cVar = aVar.f24315v;
            if (length > Math.max(usableSpace, cVar.f24293e) || file.length() > cVar.f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
        return -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(JSONObject jSONObject, String str, int i6) {
        Cursor cursor;
        a aVar = this.f24313a;
        if (a()) {
            b0.m("MixpanelAPI.Database", "There is not enough space left on the device or the data was over the maximum size limit so it was discarded");
            return -2;
        }
        String b10 = defpackage.d.b(i6);
        Cursor cursor2 = 0;
        try {
            try {
                try {
                    SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data", jSONObject.toString());
                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("token", str);
                    writableDatabase.insert(b10, null, contentValues);
                    cursor = writableDatabase.rawQuery("SELECT COUNT(*) FROM " + b10 + " WHERE token='" + str + "'", null);
                    try {
                        cursor.moveToFirst();
                        int i10 = cursor.getInt(0);
                        cursor.close();
                        aVar.close();
                        return i10;
                    } catch (SQLiteException unused) {
                        b0.m("MixpanelAPI.Database", "Could not add Mixpanel data to table");
                        if (cursor != null) {
                            cursor.close();
                        } else {
                            cursor2 = cursor;
                        }
                        aVar.a();
                    } catch (OutOfMemoryError unused2) {
                        cursor2 = cursor;
                        b0.m("MixpanelAPI.Database", "Out of memory when adding Mixpanel data to table");
                    }
                } catch (Throwable th2) {
                    cursor2 = jSONObject;
                    th = th2;
                    if (cursor2 != 0) {
                        cursor2.close();
                    }
                    aVar.close();
                    throw th;
                }
            } catch (SQLiteException unused3) {
                cursor = null;
            } catch (OutOfMemoryError unused4) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void c(int i6, String str) {
        a aVar = this.f24313a;
        String b10 = defpackage.d.b(i6);
        try {
            try {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.delete(b10, "token = '" + str + "'", null);
            } catch (SQLiteException e10) {
                b0.n("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + b10 + ". Re-initializing database.", e10);
                aVar.a();
            }
        } finally {
            aVar.close();
        }
    }

    public final void d(long j10, int i6) {
        a aVar = this.f24313a;
        String b10 = defpackage.d.b(i6);
        try {
            try {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.delete(b10, "created_at <= " + j10, null);
            } catch (SQLiteException e10) {
                b0.n("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + b10 + ". Re-initializing database.", e10);
                aVar.a();
            }
        } finally {
            aVar.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String[] e(int i6, String str) {
        ?? r42;
        Cursor cursor;
        String str2;
        String str3;
        String str4;
        StringBuffer stringBuffer;
        int i10;
        int i11;
        ?? r32 = "' ";
        String str5 = "ORDER BY created_at ASC LIMIT ";
        String b10 = defpackage.d.b(i6);
        a aVar = this.f24313a;
        SQLiteDatabase readableDatabase = aVar.getReadableDatabase();
        Cursor cursor2 = null;
        try {
            try {
                StringBuffer stringBuffer2 = new StringBuffer("SELECT * FROM " + b10 + " WHERE token = '" + str + "' ");
                stringBuffer = new StringBuffer("SELECT COUNT(*) FROM " + b10 + " WHERE token = '" + str + "' ");
                StringBuilder sb2 = new StringBuilder("ORDER BY created_at ASC LIMIT ");
                sb2.append(Integer.toString(aVar.f24315v.f24299l));
                stringBuffer2.append(sb2.toString());
                r32 = readableDatabase.rawQuery(stringBuffer2.toString(), null);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                cursor = readableDatabase.rawQuery(stringBuffer.toString(), null);
                try {
                    cursor.moveToFirst();
                    str2 = String.valueOf(cursor.getInt(0));
                } catch (SQLiteException e10) {
                    e = e10;
                    str2 = null;
                }
                try {
                    JSONArray jSONArray = new JSONArray();
                    str4 = null;
                    while (r32.moveToNext()) {
                        if (r32.isLast()) {
                            if (r32.getColumnIndex("_id") >= 0) {
                                i11 = r32.getColumnIndex("_id");
                            } else {
                                i11 = 0;
                            }
                            str4 = r32.getString(i11);
                        }
                        try {
                            if (r32.getColumnIndex("data") >= 0) {
                                i10 = r32.getColumnIndex("data");
                            } else {
                                i10 = 1;
                            }
                            jSONArray.put(new JSONObject(r32.getString(i10)));
                        } catch (JSONException unused) {
                        }
                    }
                    if (jSONArray.length() > 0) {
                        str3 = jSONArray.toString();
                    } else {
                        str3 = null;
                    }
                    aVar.close();
                    r32.close();
                    cursor.close();
                } catch (SQLiteException e11) {
                    e = e11;
                    b0.n("MixpanelAPI.Database", "Could not pull records for Mixpanel out of database " + b10 + ". Waiting to send.", e);
                    aVar.close();
                    if (r32 != 0) {
                        r32.close();
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    str3 = null;
                    str4 = null;
                    if (str4 != null) {
                    }
                    return null;
                }
            } catch (SQLiteException e12) {
                e = e12;
                cursor = null;
                str2 = null;
                b0.n("MixpanelAPI.Database", "Could not pull records for Mixpanel out of database " + b10 + ". Waiting to send.", e);
                aVar.close();
                if (r32 != 0) {
                }
                if (cursor != null) {
                }
                str3 = null;
                str4 = null;
                if (str4 != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                str5 = null;
                cursor2 = r32;
                r42 = str5;
                aVar.close();
                if (cursor2 != null) {
                    cursor2.close();
                }
                if (r42 != 0) {
                    r42.close();
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e = e13;
            r32 = 0;
        } catch (Throwable th4) {
            th = th4;
            r42 = 0;
            aVar.close();
            if (cursor2 != null) {
            }
            if (r42 != 0) {
            }
            throw th;
        }
        if (str4 != null || str3 == null) {
            return null;
        }
        return new String[]{str4, str3, str2};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        a aVar = this.f24313a;
        if (a()) {
            b0.m("MixpanelAPI.Database", "There is not enough space left on the device or the data was over the maximum size limit so it was discarded");
            return -2;
        }
        Object obj = null;
        int i14 = -1;
        try {
            try {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                StringBuilder sb2 = new StringBuilder("SELECT * FROM anonymous_people WHERE token = '");
                sb2.append(str);
                sb2.append("'");
                cursor3 = writableDatabase.rawQuery(new StringBuffer(sb2.toString()).toString(), null);
                try {
                    writableDatabase.beginTransaction();
                    cursor2 = sb2;
                    while (cursor3.moveToNext()) {
                        try {
                            try {
                                try {
                                    ContentValues contentValues = new ContentValues();
                                    if (cursor3.getColumnIndex("created_at") >= 0) {
                                        i6 = cursor3.getColumnIndex("created_at");
                                    } else {
                                        i6 = 2;
                                    }
                                    contentValues.put("created_at", Long.valueOf(cursor3.getLong(i6)));
                                    if (cursor3.getColumnIndex("automatic_data") >= 0) {
                                        i10 = cursor3.getColumnIndex("automatic_data");
                                    } else {
                                        i10 = 3;
                                    }
                                    contentValues.put("automatic_data", Integer.valueOf(cursor3.getInt(i10)));
                                    if (cursor3.getColumnIndex("token") >= 0) {
                                        i11 = cursor3.getColumnIndex("token");
                                    } else {
                                        i11 = 4;
                                    }
                                    contentValues.put("token", cursor3.getString(i11));
                                    if (cursor3.getColumnIndex("data") >= 0) {
                                        i12 = cursor3.getColumnIndex("data");
                                    } else {
                                        i12 = 1;
                                    }
                                    JSONObject jSONObject = new JSONObject(cursor3.getString(i12));
                                    try {
                                        jSONObject.put("$distinct_id", str2);
                                        contentValues.put("data", jSONObject.toString());
                                        try {
                                            writableDatabase.insert("people", null, contentValues);
                                            if (cursor3.getColumnIndex("_id") >= 0) {
                                                i13 = cursor3.getColumnIndex("_id");
                                            } else {
                                                i13 = 0;
                                            }
                                            cursor4 = null;
                                            cursor4 = null;
                                            try {
                                                try {
                                                    writableDatabase.delete("anonymous_people", "_id = " + cursor3.getInt(i13), null);
                                                    i14++;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    writableDatabase.endTransaction();
                                                    throw th;
                                                }
                                            } catch (JSONException unused) {
                                            }
                                        } catch (JSONException unused2) {
                                            cursor4 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            writableDatabase.endTransaction();
                                            throw th;
                                        }
                                    } catch (JSONException unused3) {
                                        cursor4 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (JSONException unused4) {
                                    cursor4 = obj;
                                }
                                obj = cursor4;
                                cursor2 = cursor4;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            b0.n("MixpanelAPI.Database", "Could not push anonymous updates records from anonymous_people. Re-initializing database.", e);
                            if (cursor3 != null) {
                                cursor3.close();
                                cursor = cursor2;
                            } else {
                                cursor = cursor3;
                            }
                            try {
                                aVar.a();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                aVar.close();
                                return i14;
                            } catch (Throwable th6) {
                                th = th6;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                aVar.close();
                                throw th;
                            }
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    cursor3.close();
                } catch (SQLiteException e11) {
                    e = e11;
                    cursor2 = null;
                }
            } catch (Throwable th7) {
                th = th7;
                cursor = "SELECT * FROM anonymous_people WHERE token = '";
                if (cursor != null) {
                }
                aVar.close();
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursor2 = null;
            cursor3 = null;
        } catch (Throwable th8) {
            th = th8;
            cursor = null;
            if (cursor != null) {
            }
            aVar.close();
            throw th;
        }
        aVar.close();
        return i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final int h(String str) {
        SQLiteException e10;
        Cursor cursor;
        SQLiteDatabase writableDatabase;
        int i6;
        a aVar = this.f24313a;
        if (a()) {
            b0.m("MixpanelAPI.Database", "There is not enough space left on the device or the data was over the maximum size limit so it was discarded");
            return -2;
        }
        Cursor cursor2 = 0;
        cursor2 = 0;
        Cursor cursor3 = null;
        try {
            try {
                try {
                    writableDatabase = aVar.getWritableDatabase();
                    cursor = writableDatabase.rawQuery(new StringBuffer("SELECT * FROM events WHERE token = '" + str + "'").toString(), null);
                } catch (Throwable th2) {
                    cursor2 = str;
                    th = th2;
                    if (cursor2 != 0) {
                        cursor2.close();
                    }
                    aVar.close();
                    throw th;
                }
            } catch (SQLiteException e11) {
                e10 = e11;
                cursor = null;
            }
            try {
                writableDatabase.beginTransaction();
                while (cursor.moveToNext()) {
                    try {
                        try {
                            new ContentValues();
                            if (cursor.getColumnIndex("data") >= 0) {
                                i6 = cursor.getColumnIndex("data");
                            } else {
                                i6 = 1;
                            }
                            new JSONObject(cursor.getString(i6)).getJSONObject("properties");
                            throw null;
                        } catch (JSONException unused) {
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                cursor.close();
            } catch (SQLiteException e12) {
                e10 = e12;
                b0.n("MixpanelAPI.Database", "Could not re-write events history. Re-initializing database.", e10);
                if (cursor != null) {
                    cursor.close();
                } else {
                    cursor3 = cursor;
                }
                aVar.a();
                cursor2 = cursor3;
                if (cursor3 != null) {
                    cursor3.close();
                    cursor2 = cursor3;
                }
                aVar.close();
                return 0;
            }
            aVar.close();
            return 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
