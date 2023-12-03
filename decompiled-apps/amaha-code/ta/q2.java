package ta;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class q2 extends m3 {

    /* renamed from: w  reason: collision with root package name */
    public final o2 f32824w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f32825x;

    public q2(y3 y3Var) {
        super(y3Var);
        this.f32824w = new o2(this, this.f32943u.f32953u);
    }

    @Override // ta.m3
    public final boolean k() {
        return false;
    }

    public final SQLiteDatabase l() {
        if (this.f32825x) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f32824w.getWritableDatabase();
        if (writableDatabase == null) {
            this.f32825x = true;
            return null;
        }
        return writableDatabase;
    }

    public final void m() {
        int delete;
        y3 y3Var = this.f32943u;
        h();
        try {
            SQLiteDatabase l2 = l();
            if (l2 != null && (delete = l2.delete("messages", null, null)) > 0) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.H.c(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e10) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.f32925z.c(e10, "Error resetting local analytics data. error");
        }
    }

    public final void n() {
        h();
        if (this.f32825x) {
            return;
        }
        y3 y3Var = this.f32943u;
        if (y3Var.f32953u.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i6 = 5;
            for (int i10 = 0; i10 < 5; i10++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase l2 = l();
                    if (l2 == null) {
                        this.f32825x = true;
                        return;
                    }
                    l2.beginTransaction();
                    l2.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    l2.setTransactionSuccessful();
                    l2.endTransaction();
                    l2.close();
                    return;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i6);
                    i6 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e10) {
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.f32925z.c(e10, "Error deleting app launch break from local database");
                    this.f32825x = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    w2 w2Var2 = y3Var.C;
                    y3.k(w2Var2);
                    w2Var2.f32925z.c(e11, "Error deleting app launch break from local database");
                    this.f32825x = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            w2 w2Var3 = y3Var.C;
            y3.k(w2Var3);
            w2Var3.C.b("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[Catch: all -> 0x004d, SQLiteException -> 0x004f, SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, TRY_ENTER, TryCatch #9 {SQLiteDatabaseLockedException -> 0x00b2, SQLiteFullException -> 0x0051, SQLiteException -> 0x004f, all -> 0x004d, blocks: (B:15:0x0042, B:17:0x0048, B:28:0x005e, B:30:0x007f, B:33:0x0099), top: B:100:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0137  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(byte[] bArr, int i6) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor3;
        long j10;
        String str;
        h();
        ?? r22 = 0;
        if (this.f32825x) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i6));
        contentValues.put("entry", bArr);
        y3 y3Var = this.f32943u;
        y3Var.getClass();
        int i10 = 5;
        int i11 = 0;
        int i12 = 5;
        while (true) {
            w2 w2Var = y3Var.C;
            if (i11 < i10) {
                try {
                    sQLiteDatabase = l();
                    if (sQLiteDatabase == null) {
                        this.f32825x = true;
                        return r22;
                    }
                    try {
                        sQLiteDatabase.beginTransaction();
                        Cursor rawQuery = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                        if (rawQuery != null) {
                            try {
                                if (rawQuery.moveToFirst()) {
                                    j10 = rawQuery.getLong(r22);
                                    if (j10 < 100000) {
                                        y3.k(w2Var);
                                        w2Var.f32925z.b("Data loss, local db full");
                                        long j11 = (100000 - j10) + 1;
                                        String[] strArr = new String[1];
                                        strArr[r22] = Long.toString(j11);
                                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                                        if (delete != j11) {
                                            y3.k(w2Var);
                                            w2Var.f32925z.e("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(delete), Long.valueOf(j11 - delete));
                                        }
                                        str = null;
                                    } else {
                                        str = null;
                                    }
                                    sQLiteDatabase.insertOrThrow("messages", str, contentValues);
                                    sQLiteDatabase.setTransactionSuccessful();
                                    sQLiteDatabase.endTransaction();
                                    if (rawQuery != 0) {
                                        rawQuery.close();
                                    }
                                    sQLiteDatabase.close();
                                    return true;
                                }
                            } catch (SQLiteDatabaseLockedException unused) {
                                cursor = rawQuery;
                                try {
                                    SystemClock.sleep(i12);
                                    i12 += 20;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i11++;
                                    r22 = 0;
                                    i10 = 5;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteFullException e10) {
                                e = e10;
                                cursor3 = rawQuery;
                                try {
                                    y3.k(w2Var);
                                    w2Var.f32925z.c(e, "Error writing entry; local database full");
                                    this.f32825x = true;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        sQLiteDatabase2.close();
                                        i11++;
                                        r22 = 0;
                                        i10 = 5;
                                    } else {
                                        i11++;
                                        r22 = 0;
                                        i10 = 5;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor = cursor2;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                sQLiteDatabase2 = sQLiteDatabase;
                                cursor2 = rawQuery;
                                if (sQLiteDatabase2 != null) {
                                    try {
                                        if (sQLiteDatabase2.inTransaction()) {
                                            sQLiteDatabase2.endTransaction();
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                                y3.k(w2Var);
                                w2Var.f32925z.c(e, "Error writing entry to local database");
                                this.f32825x = true;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase2 == null) {
                                    i11++;
                                    r22 = 0;
                                    i10 = 5;
                                }
                                sQLiteDatabase2.close();
                                i11++;
                                r22 = 0;
                                i10 = 5;
                            } catch (Throwable th5) {
                                th = th5;
                                cursor = rawQuery;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        j10 = 0;
                        if (j10 < 100000) {
                        }
                        sQLiteDatabase.insertOrThrow("messages", str, contentValues);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        if (rawQuery != 0) {
                        }
                        sQLiteDatabase.close();
                        return true;
                    } catch (SQLiteDatabaseLockedException unused2) {
                        cursor = null;
                    } catch (SQLiteFullException e12) {
                        e = e12;
                        cursor3 = null;
                    } catch (SQLiteException e13) {
                        e = e13;
                        cursor2 = null;
                        sQLiteDatabase2 = sQLiteDatabase;
                    } catch (Throwable th6) {
                        th = th6;
                        cursor2 = null;
                        cursor = cursor2;
                        if (cursor != null) {
                        }
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteDatabaseLockedException unused3) {
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteFullException e14) {
                    e = e14;
                    cursor3 = null;
                    sQLiteDatabase = null;
                } catch (SQLiteException e15) {
                    e = e15;
                    cursor2 = null;
                    sQLiteDatabase2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    cursor = null;
                    sQLiteDatabase = null;
                }
            } else {
                y3.k(w2Var);
                w2Var.H.b("Failed to write entry to local database");
                return false;
            }
            i11++;
            r22 = 0;
            i10 = 5;
        }
    }
}
