package ta;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class l {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r0 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: SQLiteException -> 0x00d8, TryCatch #8 {SQLiteException -> 0x00d8, blocks: (B:26:0x004f, B:28:0x0070, B:30:0x007f, B:32:0x0087, B:33:0x008a, B:34:0x00a8, B:37:0x00ac, B:39:0x00af, B:41:0x00b7, B:42:0x00be, B:43:0x00c1, B:45:0x00c7, B:27:0x0069), top: B:61:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: SQLiteException -> 0x00d8, TryCatch #8 {SQLiteException -> 0x00d8, blocks: (B:26:0x004f, B:28:0x0070, B:30:0x007f, B:32:0x0087, B:33:0x008a, B:34:0x00a8, B:37:0x00ac, B:39:0x00af, B:41:0x00b7, B:42:0x00be, B:43:0x00c1, B:45:0x00c7, B:27:0x0069), top: B:61:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(w2 w2Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        String[] strArr2;
        HashSet hashSet;
        String[] split;
        u2 u2Var = w2Var.C;
        Cursor cursor = null;
        try {
            try {
                strArr2 = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{SessionManager.KEY_NAME}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e10) {
                    e = e10;
                    u2Var.d("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    try {
                        hashSet = new HashSet();
                        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", strArr2);
                        Collections.addAll(hashSet, rawQuery.getColumnNames());
                        rawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (!hashSet.remove(str4)) {
                                throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                            }
                        }
                        if (strArr != null) {
                            for (int i6 = 0; i6 < strArr.length; i6 += 2) {
                                if (!hashSet.remove(strArr[i6])) {
                                    sQLiteDatabase.execSQL(strArr[i6 + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                            u2Var.d("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                        }
                    } catch (SQLiteException e11) {
                        w2Var.f32925z.c(str, "Failed to verify columns on table that was just created");
                        throw e11;
                    }
                }
            } catch (SQLiteException e12) {
                e = e12;
                cursor = strArr2;
                u2Var.d("Error querying for table", str, e);
                if (cursor != null) {
                }
                sQLiteDatabase.execSQL(str2);
                hashSet = new HashSet();
                Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", strArr2);
                Collections.addAll(hashSet, rawQuery2.getColumnNames());
                rawQuery2.close();
                while (r4 < r3) {
                }
                if (strArr != null) {
                }
                if (hashSet.isEmpty()) {
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = strArr2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e = e13;
            strArr2 = null;
        } catch (Throwable th4) {
            th = th4;
            strArr2 = null;
        }
    }

    public static void b(w2 w2Var, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        u2 u2Var = w2Var.C;
        if (!readable) {
            u2Var.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            u2Var.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            u2Var.b("Failed to turn on database read permission for owner");
        }
        if (!file.setWritable(true, true)) {
            u2Var.b("Failed to turn on database write permission for owner");
        }
    }
}
