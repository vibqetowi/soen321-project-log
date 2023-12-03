package je;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import je.r;
/* compiled from: SQLiteSchema.java */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteDatabase f21967a;

    /* renamed from: b  reason: collision with root package name */
    public final i f21968b;

    public x0(SQLiteDatabase sQLiteDatabase, i iVar) {
        this.f21967a = sQLiteDatabase;
        this.f21968b = iVar;
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        Cursor rawQuery = this.f21967a.rawQuery("SELECT target_id, target_proto FROM targets", null);
        while (rawQuery.moveToNext()) {
            try {
                w0Var.accept(rawQuery);
            } catch (Throwable th2) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        rawQuery.close();
    }

    public final void b(String[] strArr, v0 v0Var) {
        String sb2;
        String b10 = r1.b0.b(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z10 = false;
        for (int i6 = 0; i6 < strArr.length; i6++) {
            String str = strArr[i6];
            boolean e10 = e(str);
            if (i6 == 0) {
                z10 = e10;
            } else if (e10 != z10) {
                String m10 = defpackage.b.m("Expected all of ", b10, " to either exist or not, but ");
                if (z10) {
                    StringBuilder c10 = v.h.c(m10);
                    c10.append(strArr[0]);
                    c10.append(" exists and ");
                    c10.append(str);
                    c10.append(" does not");
                    sb2 = c10.toString();
                } else {
                    StringBuilder c11 = v.h.c(m10);
                    c11.append(strArr[0]);
                    c11.append(" does not exist and ");
                    c11.append(str);
                    c11.append(" does");
                    sb2 = c11.toString();
                }
                throw new IllegalStateException(sb2);
            }
        }
        if (!z10) {
            v0Var.run();
        } else {
            kc.f.A(1, "SQLiteSchema", defpackage.b.m("Skipping migration because all of ", b10, " already exist"), new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033b  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i6) {
        int i10;
        boolean z10;
        boolean z11;
        Object obj;
        boolean z12;
        boolean z13;
        boolean z14;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z15 = true;
        if (i6 < 1) {
            b(new String[]{"mutation_queues", "mutations", "document_mutations"}, new v0(this, 6));
            b(new String[]{"targets", "target_globals", "target_documents"}, new v0(this, 0));
            b(new String[]{"remote_documents"}, new v0(this, 4));
        }
        SQLiteDatabase sQLiteDatabase = this.f21967a;
        if (i6 < 3 && i6 != 0) {
            if (e("targets")) {
                sQLiteDatabase.execSQL("DROP TABLE targets");
            }
            if (e("target_globals")) {
                sQLiteDatabase.execSQL("DROP TABLE target_globals");
            }
            if (e("target_documents")) {
                sQLiteDatabase.execSQL("DROP TABLE target_documents");
            }
            b(new String[]{"targets", "target_globals", "target_documents"}, new v0(this, 0));
        }
        ?? r14 = 0;
        if (i6 < 4) {
            if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "target_globals") == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                sQLiteDatabase.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
            }
            if (!d("target_globals", "target_count")) {
                sQLiteDatabase.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
            }
            long queryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, "targets");
            ContentValues contentValues = new ContentValues();
            contentValues.put("target_count", Long.valueOf(queryNumEntries));
            sQLiteDatabase.update("target_globals", contentValues, null, null);
        }
        if (i6 < 5 && !d("target_documents", "sequence_number")) {
            sQLiteDatabase.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
        }
        if (i6 < 6) {
            w0 w0Var = new w0(this, 1);
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT uid, last_acknowledged_batch_id FROM mutation_queues", null);
            while (rawQuery.moveToNext()) {
                try {
                    w0Var.accept(rawQuery);
                } finally {
                }
            }
            rawQuery.close();
        }
        int i11 = 2;
        if (i6 < 7) {
            d9.p pVar = new d9.p(28);
            Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT highest_listen_sequence_number FROM target_globals LIMIT 1", null);
            try {
                if (rawQuery2.moveToFirst()) {
                    obj = pVar.apply(rawQuery2);
                    rawQuery2.close();
                } else {
                    rawQuery2.close();
                    obj = null;
                }
                Long l2 = (Long) obj;
                if (l2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ca.a.u0(z12, "Missing highest sequence number", new Object[0]);
                long longValue = l2.longValue();
                SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
                c2.a aVar = new c2.a(2, new Object[]{100});
                boolean[] zArr = new boolean[1];
                while (true) {
                    zArr[0] = false;
                    Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?", r14, r14);
                    while (rawQueryWithFactory.moveToNext()) {
                        try {
                            zArr[0] = z15;
                            compileStatement.clearBindings();
                            compileStatement.bindString(z15 ? 1 : 0, rawQueryWithFactory.getString(0));
                            compileStatement.bindLong(i11, longValue);
                            if (compileStatement.executeInsert() != -1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            ca.a.u0(z13, "Failed to insert a sentinel row", new Object[0]);
                            z15 = true;
                            i11 = 2;
                        } finally {
                        }
                    }
                    rawQueryWithFactory.close();
                    if (!zArr[0]) {
                        break;
                    }
                    z15 = true;
                    i11 = 2;
                    r14 = 0;
                }
            } finally {
            }
        }
        if (i6 < 8) {
            b(new String[]{"collection_parents"}, new v0(this, 7));
            l0 l0Var = new l0(new r.a(), 2, sQLiteDatabase.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"));
            Cursor rawQuery3 = sQLiteDatabase.rawQuery("SELECT path FROM remote_documents", null);
            while (rawQuery3.moveToNext()) {
                try {
                    l0Var.accept(ca.a.O(rawQuery3.getString(0)).t());
                } finally {
                    if (rawQuery3 != null) {
                        try {
                            rawQuery3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
            }
            rawQuery3.close();
            Cursor rawQuery4 = sQLiteDatabase.rawQuery("SELECT path FROM document_mutations", null);
            while (rawQuery4.moveToNext()) {
                try {
                    l0Var.accept(ca.a.O(rawQuery4.getString(0)).t());
                } finally {
                    if (rawQuery4 != null) {
                        try {
                            rawQuery4.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                }
            }
            rawQuery4.close();
        }
        if (i6 < 9) {
            boolean d10 = d("remote_documents", "read_time_seconds");
            boolean d11 = d("remote_documents", "read_time_nanos");
            if (d10 == d11) {
                z10 = true;
            } else {
                z10 = false;
            }
            ca.a.u0(z10, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
            if (d10 && d11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                sQLiteDatabase.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
            } else {
                a();
            }
        }
        if (i6 == 9) {
            a();
        }
        if (i6 < 11) {
            w0 w0Var2 = new w0(this, 0);
            Cursor rawQuery5 = sQLiteDatabase.rawQuery("SELECT target_id, target_proto FROM targets", null);
            while (rawQuery5.moveToNext()) {
                try {
                    w0Var2.accept(rawQuery5);
                } finally {
                    if (rawQuery5 != null) {
                        try {
                            rawQuery5.close();
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                    }
                }
            }
            rawQuery5.close();
        }
        if (i6 < 12) {
            b(new String[]{"bundles", "named_queries"}, new v0(this, 5));
        }
        if (i6 < 13) {
            if (!d("remote_documents", "path_length")) {
                sQLiteDatabase.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
            }
            c2.a aVar2 = new c2.a(2, new Object[]{100});
            SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
            boolean[] zArr2 = new boolean[1];
            do {
                zArr2[0] = false;
                l0 l0Var2 = new l0(zArr2, 3, compileStatement2);
                Cursor rawQueryWithFactory2 = sQLiteDatabase.rawQueryWithFactory(aVar2, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?", null, null);
                while (rawQueryWithFactory2.moveToNext()) {
                    try {
                        l0Var2.accept(rawQueryWithFactory2);
                    } finally {
                    }
                }
                rawQueryWithFactory2.close();
            } while (zArr2[0]);
            if (i6 < 14) {
            }
            if (i6 < 15) {
            }
            if (i6 >= 16) {
            }
            Object[] objArr = new Object[i10];
            objArr[0] = Integer.valueOf(i6);
            objArr[1] = 16;
            objArr[2] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            kc.f.A(1, "SQLiteSchema", "Migration from version %s to %s took %s milliseconds", objArr);
        }
        if (i6 < 14) {
            b(new String[]{"document_overlays"}, new v0(this, 2));
            b(new String[]{"data_migrations"}, new v0(this, 1));
            int i12 = androidx.work.k.f3323a;
            sQLiteDatabase.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{"BUILD_OVERLAYS"});
        }
        if (i6 < 15) {
            sQLiteDatabase.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
        }
        if (i6 >= 16) {
            i10 = 3;
            b(new String[]{"index_configuration", "index_state", "index_entries"}, new v0(this, 3));
        } else {
            i10 = 3;
        }
        Object[] objArr2 = new Object[i10];
        objArr2[0] = Integer.valueOf(i6);
        objArr2[1] = 16;
        objArr2[2] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        kc.f.A(1, "SQLiteSchema", "Migration from version %s to %s took %s milliseconds", objArr2);
    }

    public final boolean d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f21967a;
            cursor = sQLiteDatabase.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursor.getColumnIndex(SessionManager.KEY_NAME);
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(columnIndex));
            }
            cursor.close();
            if (arrayList.indexOf(str2) != -1) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final boolean e(String str) {
        Cursor rawQueryWithFactory = this.f21967a.rawQueryWithFactory(new c2.a(2, new Object[]{str}), "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?", null, null);
        try {
            boolean z10 = !rawQueryWithFactory.moveToFirst();
            rawQueryWithFactory.close();
            return !z10;
        } catch (Throwable th2) {
            if (rawQueryWithFactory != null) {
                try {
                    rawQueryWithFactory.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
