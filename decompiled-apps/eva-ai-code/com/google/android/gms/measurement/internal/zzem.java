package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzem extends zzf {
    private final zzel zza;
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzem(zzgd zzgdVar) {
        super(zzgdVar);
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        this.zza = new zzel(this, zzaw, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzq(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        zzg();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        this.zzt.zzf();
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            Cursor cursor2 = null;
            cursor2 = null;
            cursor2 = null;
            r8 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = zzh();
                try {
                    if (sQLiteDatabase == null) {
                        this.zzb = true;
                        return r2;
                    }
                    sQLiteDatabase.beginTransaction();
                    cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                    long j = 0;
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                j = cursor.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor2 = cursor;
                            try {
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor2 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            sQLiteDatabase2 = sQLiteDatabase;
                            this.zzt.zzaA().zzd().zzb("Error writing entry; local database full", e);
                            this.zzb = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i2++;
                                r2 = 0;
                            }
                            sQLiteDatabase2.close();
                            i2++;
                            r2 = 0;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            if (sQLiteDatabase2 != null) {
                                try {
                                    if (sQLiteDatabase2.inTransaction()) {
                                        sQLiteDatabase2.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzaA().zzd().zzb("Error writing entry to local database", e);
                            this.zzb = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i2++;
                                r2 = 0;
                            }
                            sQLiteDatabase2.close();
                            i2++;
                            r2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        this.zzt.zzaA().zzd().zza("Data loss, local db full");
                        String[] strArr = new String[1];
                        long j2 = (100000 - j) + 1;
                        strArr[r2] = Long.toString(j2);
                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (delete != j2) {
                            this.zzt.zzaA().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                        }
                    }
                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (cursor != 0) {
                        cursor.close();
                    }
                    sQLiteDatabase.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                    cursor = null;
                } catch (SQLiteException e4) {
                    e = e4;
                    cursor = null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabase = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                cursor = null;
            } catch (SQLiteException e6) {
                e = e6;
                cursor = null;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabase = null;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        }
        this.zzt.zzaA().zzj().zza("Failed to write entry to local database");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase == null) {
            this.zzb = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0258 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzi(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor2;
        long j;
        String str;
        String[] strArr;
        Parcel obtain;
        zzlk zzlkVar;
        zzac zzacVar;
        zzg();
        Cursor cursor3 = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (zzl()) {
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    SQLiteDatabase zzh = zzh();
                    if (zzh == null) {
                        this.zzb = true;
                        return null;
                    }
                    try {
                        zzh.beginTransaction();
                        try {
                        } catch (Throwable th) {
                            th = th;
                            sQLiteDatabase2 = zzh;
                        }
                        try {
                            cursor2 = zzh.query("messages", new String[]{"rowid"}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
                            try {
                                long j2 = -1;
                                try {
                                    if (cursor2.moveToFirst()) {
                                        j = cursor2.getLong(0);
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    } else {
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        j = -1;
                                    }
                                    if (j != -1) {
                                        str = "rowid<?";
                                        strArr = new String[]{String.valueOf(j)};
                                    } else {
                                        str = null;
                                        strArr = null;
                                    }
                                    cursor = zzh.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                    while (cursor.moveToNext()) {
                                        try {
                                            j2 = cursor.getLong(0);
                                            int i5 = cursor.getInt(1);
                                            byte[] blob = cursor.getBlob(2);
                                            if (i5 == 0) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, 0, blob.length);
                                                        obtain.setDataPosition(0);
                                                        zzau createFromParcel = zzau.CREATOR.createFromParcel(obtain);
                                                        if (createFromParcel != null) {
                                                            arrayList.add(createFromParcel);
                                                        }
                                                    } catch (SafeParcelReader.ParseException unused) {
                                                        this.zzt.zzaA().zzd().zza("Failed to load event from local database");
                                                        obtain.recycle();
                                                    }
                                                } finally {
                                                }
                                            } else if (i5 == 1) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, 0, blob.length);
                                                        obtain.setDataPosition(0);
                                                        zzlkVar = zzlk.CREATOR.createFromParcel(obtain);
                                                    } catch (SafeParcelReader.ParseException unused2) {
                                                        this.zzt.zzaA().zzd().zza("Failed to load user property from local database");
                                                        obtain.recycle();
                                                        zzlkVar = null;
                                                    }
                                                    if (zzlkVar != null) {
                                                        arrayList.add(zzlkVar);
                                                    }
                                                } finally {
                                                }
                                            } else if (i5 == 2) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, 0, blob.length);
                                                        obtain.setDataPosition(0);
                                                        zzacVar = zzac.CREATOR.createFromParcel(obtain);
                                                    } catch (SafeParcelReader.ParseException unused3) {
                                                        this.zzt.zzaA().zzd().zza("Failed to load conditional user property from local database");
                                                        obtain.recycle();
                                                        zzacVar = null;
                                                    }
                                                    if (zzacVar != null) {
                                                        arrayList.add(zzacVar);
                                                    }
                                                } finally {
                                                }
                                            } else if (i5 == 3) {
                                                this.zzt.zzaA().zzk().zza("Skipping app launch break");
                                            } else {
                                                this.zzt.zzaA().zzd().zza("Unknown record type in local database");
                                            }
                                        } catch (SQLiteDatabaseLockedException unused4) {
                                            sQLiteDatabase2 = zzh;
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            sQLiteDatabase2 = zzh;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            sQLiteDatabase2 = zzh;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase2 = zzh;
                                        }
                                    }
                                    sQLiteDatabase2 = zzh;
                                } catch (SQLiteDatabaseLockedException unused5) {
                                    sQLiteDatabase2 = zzh;
                                    cursor = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i3++;
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                } catch (SQLiteFullException e3) {
                                    e = e3;
                                    sQLiteDatabase2 = zzh;
                                    cursor = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i3++;
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    sQLiteDatabase2 = zzh;
                                    cursor = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                        try {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor3 = cursor;
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i3++;
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sQLiteDatabase2 = zzh;
                                }
                                try {
                                    if (sQLiteDatabase2.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                                        this.zzt.zzaA().zzd().zza("Fewer entries removed from local database than expected");
                                    }
                                    sQLiteDatabase2.setTransactionSuccessful();
                                    sQLiteDatabase2.endTransaction();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    sQLiteDatabase2.close();
                                    return arrayList;
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                    }
                                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor3 = cursor;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (cursor3 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                sQLiteDatabase2 = zzh;
                                if (cursor2 != null) {
                                    try {
                                        cursor2.close();
                                    } catch (SQLiteDatabaseLockedException unused7) {
                                        cursor = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                    } catch (SQLiteFullException e7) {
                                        e = e7;
                                        cursor = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        cursor = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                        }
                                        this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor3 != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                                throw th;
                                break;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteDatabase2 = zzh;
                            cursor2 = null;
                            if (cursor2 != null) {
                            }
                            throw th;
                            break;
                            break;
                        }
                    } catch (SQLiteDatabaseLockedException unused8) {
                        sQLiteDatabase2 = zzh;
                    } catch (SQLiteFullException e9) {
                        e = e9;
                        sQLiteDatabase2 = zzh;
                    } catch (SQLiteException e10) {
                        e = e10;
                        sQLiteDatabase2 = zzh;
                    } catch (Throwable th9) {
                        th = th9;
                        sQLiteDatabase2 = zzh;
                    }
                } catch (SQLiteDatabaseLockedException unused9) {
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteFullException e11) {
                    e = e11;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (Throwable th10) {
                    th = th10;
                    sQLiteDatabase = null;
                }
            }
            this.zzt.zzaA().zzk().zza("Failed to read events from database in reasonable time");
            return null;
        }
        return arrayList;
    }

    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzaA().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    final boolean zzl() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        int i;
        zzg();
        if (!this.zzb && zzl()) {
            int i2 = 5;
            for (i = 0; i < 5; i = i + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase zzh = zzh();
                    if (zzh == null) {
                        this.zzb = true;
                        return false;
                    }
                    zzh.beginTransaction();
                    zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    zzh.setTransactionSuccessful();
                    zzh.endTransaction();
                    zzh.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e) {
                    this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e);
                    this.zzb = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzt.zzaA().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] zzap = this.zzt.zzv().zzap(zzacVar);
        if (zzap.length > 131072) {
            this.zzt.zzaA().zzh().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(2, zzap);
    }

    public final boolean zzo(zzau zzauVar) {
        Parcel obtain = Parcel.obtain();
        zzav.zza(zzauVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzt.zzaA().zzh().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zzq(0, marshall);
    }

    public final boolean zzp(zzlk zzlkVar) {
        Parcel obtain = Parcel.obtain();
        zzll.zza(zzlkVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzt.zzaA().zzh().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(1, marshall);
    }
}
