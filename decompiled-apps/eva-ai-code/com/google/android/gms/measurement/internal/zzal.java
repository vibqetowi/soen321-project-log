package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzal {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r0 == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zza(zzet zzetVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        Cursor cursor;
        String[] split;
        if (zzetVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        ?? r14 = 0;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    zzetVar.zzk().zzc("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    try {
                        HashSet hashSet = new HashSet();
                        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                        Collections.addAll(hashSet, rawQuery.getColumnNames());
                        rawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (!hashSet.remove(str4)) {
                                throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                            }
                        }
                        if (strArr != null) {
                            for (int i = 0; i < strArr.length; i += 2) {
                                if (!hashSet.remove(strArr[i])) {
                                    sQLiteDatabase.execSQL(strArr[i + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                            return;
                        }
                        zzetVar.zzk().zzc("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                    } catch (SQLiteException e2) {
                        zzetVar.zzd().zzb("Failed to verify columns on table that was just created", str);
                        throw e2;
                    }
                }
            } catch (Throwable th) {
                th = th;
                r14 = str2;
                if (r14 != 0) {
                    r14.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r14 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(zzet zzetVar, SQLiteDatabase sQLiteDatabase) {
        if (zzetVar != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                zzetVar.zzk().zza("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzetVar.zzk().zza("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzetVar.zzk().zza("Failed to turn on database read permission for owner");
            }
            if (file.setWritable(true, true)) {
                return;
            }
            zzetVar.zzk().zza("Failed to turn on database write permission for owner");
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
