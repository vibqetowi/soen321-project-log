package ta;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.ja;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class l5 extends m3 {
    public final fs.c A;
    public final ArrayList B;
    public final g5 C;

    /* renamed from: w  reason: collision with root package name */
    public final k5 f32729w;

    /* renamed from: x  reason: collision with root package name */
    public m2 f32730x;

    /* renamed from: y  reason: collision with root package name */
    public volatile Boolean f32731y;

    /* renamed from: z  reason: collision with root package name */
    public final g5 f32732z;

    public l5(y3 y3Var) {
        super(y3Var);
        this.B = new ArrayList();
        this.A = new fs.c(y3Var.H);
        this.f32729w = new k5(this);
        this.f32732z = new g5(this, y3Var, 0);
        this.C = new g5(this, y3Var, 1);
    }

    public static void v(l5 l5Var, ComponentName componentName) {
        l5Var.h();
        if (l5Var.f32730x != null) {
            l5Var.f32730x = null;
            w2 w2Var = l5Var.f32943u.C;
            y3.k(w2Var);
            w2Var.H.c(componentName, "Disconnected from device MeasurementService");
            l5Var.h();
            l5Var.w();
        }
    }

    @Override // ta.m3
    public final boolean k() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x025e A[Catch: all -> 0x02ca, TRY_ENTER, TryCatch #20 {all -> 0x02ca, blocks: (B:30:0x00c9, B:32:0x00cf, B:34:0x00dc, B:36:0x00e2, B:40:0x00f8, B:42:0x00fd, B:140:0x025e, B:142:0x0264, B:143:0x0267, B:160:0x02a2, B:152:0x028b, B:51:0x011b, B:52:0x011e, B:50:0x0116, B:55:0x0124, B:57:0x0138, B:64:0x0150, B:65:0x0154, B:66:0x0157, B:62:0x014a, B:68:0x015a, B:70:0x016e, B:77:0x0186, B:78:0x018a, B:79:0x018d, B:75:0x0180, B:82:0x0191, B:83:0x019e, B:90:0x01bb, B:92:0x01c7, B:94:0x01d7, B:95:0x01e3), top: B:224:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(m2 m2Var, w9.a aVar, m6 m6Var) {
        int i6;
        ArrayList arrayList;
        int i10;
        int size;
        int i11;
        SQLiteDatabase sQLiteDatabase;
        String str;
        Cursor cursor;
        String str2;
        int i12;
        int i13;
        Cursor cursor2;
        Cursor cursor3;
        long j10;
        String str3;
        String[] strArr;
        Parcel obtain;
        c cVar;
        g6 g6Var;
        h();
        i();
        y3 y3Var = this.f32943u;
        y3Var.getClass();
        y3Var.getClass();
        int i14 = 100;
        int i15 = 100;
        int i16 = 0;
        loop0: while (i16 < 1001 && i15 == i14) {
            ArrayList arrayList2 = new ArrayList();
            q2 q10 = y3Var.q();
            String str4 = "rowid";
            String str5 = "Error reading entries from local database";
            q10.h();
            if (!q10.f32825x) {
                ArrayList arrayList3 = new ArrayList();
                y3 y3Var2 = q10.f32943u;
                if (y3Var2.f32953u.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i17 = 0;
                    int i18 = 5;
                    for (int i19 = 5; i17 < i19; i19 = 5) {
                        try {
                            sQLiteDatabase = q10.l();
                            if (sQLiteDatabase == null) {
                                try {
                                    try {
                                        q10.f32825x = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    i6 = i16;
                                    str = str4;
                                    str2 = str5;
                                    i13 = i18;
                                    cursor = null;
                                    SystemClock.sleep(i13);
                                    i18 = i13 + 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i17++;
                                    str5 = str2;
                                    str4 = str;
                                    i16 = i6;
                                } catch (SQLiteFullException e10) {
                                    e = e10;
                                    i6 = i16;
                                    str = str4;
                                    str2 = str5;
                                    i12 = i18;
                                    cursor = null;
                                    w2 w2Var = y3Var2.C;
                                    y3.k(w2Var);
                                    w2Var.f32925z.c(e, str2);
                                    q10.f32825x = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    i18 = i12;
                                    i17++;
                                    str5 = str2;
                                    str4 = str;
                                    i16 = i6;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    i6 = i16;
                                    str = str4;
                                    cursor = null;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                    w2 w2Var2 = y3Var2.C;
                                    y3.k(w2Var2);
                                    w2Var2.f32925z.c(e, str5);
                                    q10.f32825x = true;
                                    if (cursor != null) {
                                    }
                                    str2 = str5;
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i17++;
                                    str5 = str2;
                                    str4 = str;
                                    i16 = i6;
                                }
                            } else {
                                sQLiteDatabase.beginTransaction();
                                try {
                                    cursor3 = sQLiteDatabase.query("messages", new String[]{str4}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j11 = -1;
                                        if (cursor3.moveToFirst()) {
                                            j10 = cursor3.getLong(0);
                                            cursor3.close();
                                        } else {
                                            cursor3.close();
                                            j10 = -1;
                                        }
                                        if (j10 != -1) {
                                            str3 = "rowid<?";
                                            strArr = new String[]{String.valueOf(j10)};
                                        } else {
                                            str3 = null;
                                            strArr = null;
                                        }
                                        cursor = sQLiteDatabase.query("messages", new String[]{str4, "type", "entry"}, str3, strArr, null, null, "rowid asc", Integer.toString(100));
                                        while (cursor.moveToNext()) {
                                            try {
                                                try {
                                                    j11 = cursor.getLong(0);
                                                    int i20 = cursor.getInt(1);
                                                    str = str4;
                                                    try {
                                                        byte[] blob = cursor.getBlob(2);
                                                        if (i20 == 0) {
                                                            obtain = Parcel.obtain();
                                                            try {
                                                                i6 = i16;
                                                                try {
                                                                    try {
                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                        obtain.setDataPosition(0);
                                                                        s createFromParcel = s.CREATOR.createFromParcel(obtain);
                                                                        try {
                                                                            if (createFromParcel != null) {
                                                                                arrayList3.add(createFromParcel);
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused2) {
                                                                            str2 = str5;
                                                                            i13 = i18;
                                                                            SystemClock.sleep(i13);
                                                                            i18 = i13 + 20;
                                                                            if (cursor != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i17++;
                                                                            str5 = str2;
                                                                            str4 = str;
                                                                            i16 = i6;
                                                                        } catch (SQLiteFullException e12) {
                                                                            e = e12;
                                                                            str2 = str5;
                                                                            i12 = i18;
                                                                            w2 w2Var3 = y3Var2.C;
                                                                            y3.k(w2Var3);
                                                                            w2Var3.f32925z.c(e, str2);
                                                                            q10.f32825x = true;
                                                                            if (cursor != null) {
                                                                            }
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            i18 = i12;
                                                                            i17++;
                                                                            str5 = str2;
                                                                            str4 = str;
                                                                            i16 = i6;
                                                                        } catch (SQLiteException e13) {
                                                                            e = e13;
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            w2 w2Var22 = y3Var2.C;
                                                                            y3.k(w2Var22);
                                                                            w2Var22.f32925z.c(e, str5);
                                                                            q10.f32825x = true;
                                                                            if (cursor != null) {
                                                                            }
                                                                            str2 = str5;
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i17++;
                                                                            str5 = str2;
                                                                            str4 = str;
                                                                            i16 = i6;
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused3) {
                                                                        w2 w2Var4 = y3Var2.C;
                                                                        y3.k(w2Var4);
                                                                        w2Var4.f32925z.b("Failed to load event from local database");
                                                                        obtain.recycle();
                                                                        str4 = str;
                                                                        i16 = i6;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    throw th;
                                                                }
                                                            } catch (SafeParcelReader.ParseException unused4) {
                                                                i6 = i16;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                            }
                                                        } else {
                                                            i6 = i16;
                                                            if (i20 == 1) {
                                                                obtain = Parcel.obtain();
                                                                try {
                                                                    try {
                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                        obtain.setDataPosition(0);
                                                                        g6Var = g6.CREATOR.createFromParcel(obtain);
                                                                    } finally {
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused5) {
                                                                    w2 w2Var5 = y3Var2.C;
                                                                    y3.k(w2Var5);
                                                                    w2Var5.f32925z.b("Failed to load user property from local database");
                                                                    obtain.recycle();
                                                                    g6Var = null;
                                                                }
                                                                if (g6Var != null) {
                                                                    arrayList3.add(g6Var);
                                                                }
                                                            } else if (i20 == 2) {
                                                                obtain = Parcel.obtain();
                                                                try {
                                                                    try {
                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                        obtain.setDataPosition(0);
                                                                        cVar = c.CREATOR.createFromParcel(obtain);
                                                                    } finally {
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused6) {
                                                                    w2 w2Var6 = y3Var2.C;
                                                                    y3.k(w2Var6);
                                                                    w2Var6.f32925z.b("Failed to load conditional user property from local database");
                                                                    obtain.recycle();
                                                                    cVar = null;
                                                                }
                                                                if (cVar != null) {
                                                                    arrayList3.add(cVar);
                                                                }
                                                            } else if (i20 == 3) {
                                                                w2 w2Var7 = y3Var2.C;
                                                                y3.k(w2Var7);
                                                                w2Var7.C.b("Skipping app launch break");
                                                            } else {
                                                                w2 w2Var8 = y3Var2.C;
                                                                y3.k(w2Var8);
                                                                w2Var8.f32925z.b("Unknown record type in local database");
                                                            }
                                                        }
                                                        str4 = str;
                                                        i16 = i6;
                                                    } catch (SQLiteDatabaseLockedException unused7) {
                                                        i6 = i16;
                                                    } catch (SQLiteFullException e14) {
                                                        e = e14;
                                                        i6 = i16;
                                                    } catch (SQLiteException e15) {
                                                        e = e15;
                                                        i6 = i16;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    cursor2 = cursor;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused8) {
                                                i6 = i16;
                                                str = str4;
                                            } catch (SQLiteFullException e16) {
                                                e = e16;
                                                i6 = i16;
                                                str = str4;
                                            } catch (SQLiteException e17) {
                                                e = e17;
                                                i6 = i16;
                                                str = str4;
                                            }
                                        }
                                        i6 = i16;
                                        str = str4;
                                        String[] strArr2 = new String[1];
                                        try {
                                            strArr2[0] = Long.toString(j11);
                                            if (sQLiteDatabase.delete("messages", "rowid <= ?", strArr2) < arrayList3.size()) {
                                                w2 w2Var9 = y3Var2.C;
                                                y3.k(w2Var9);
                                                w2Var9.f32925z.b("Fewer entries removed from local database than expected");
                                            }
                                            sQLiteDatabase.setTransactionSuccessful();
                                            sQLiteDatabase.endTransaction();
                                            cursor.close();
                                            sQLiteDatabase.close();
                                        } catch (SQLiteDatabaseLockedException unused9) {
                                            str2 = str5;
                                            i13 = i18;
                                            SystemClock.sleep(i13);
                                            i18 = i13 + 20;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i17++;
                                            str5 = str2;
                                            str4 = str;
                                            i16 = i6;
                                        } catch (SQLiteFullException e18) {
                                            e = e18;
                                            str2 = str5;
                                            i12 = i18;
                                            w2 w2Var32 = y3Var2.C;
                                            y3.k(w2Var32);
                                            w2Var32.f32925z.c(e, str2);
                                            q10.f32825x = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            i18 = i12;
                                            i17++;
                                            str5 = str2;
                                            str4 = str;
                                            i16 = i6;
                                        } catch (SQLiteException e19) {
                                            e = e19;
                                            if (sQLiteDatabase != null) {
                                            }
                                            w2 w2Var222 = y3Var2.C;
                                            y3.k(w2Var222);
                                            w2Var222.f32925z.c(e, str5);
                                            q10.f32825x = true;
                                            if (cursor != null) {
                                            }
                                            str2 = str5;
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i17++;
                                            str5 = str2;
                                            str4 = str;
                                            i16 = i6;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        i6 = i16;
                                        str = str4;
                                        if (cursor3 != null) {
                                            try {
                                                cursor3.close();
                                            } catch (SQLiteDatabaseLockedException unused10) {
                                                str2 = str5;
                                                i13 = i18;
                                                cursor = null;
                                                SystemClock.sleep(i13);
                                                i18 = i13 + 20;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase == null) {
                                                    i17++;
                                                    str5 = str2;
                                                    str4 = str;
                                                    i16 = i6;
                                                }
                                                sQLiteDatabase.close();
                                                i17++;
                                                str5 = str2;
                                                str4 = str;
                                                i16 = i6;
                                            } catch (SQLiteFullException e20) {
                                                e = e20;
                                                str2 = str5;
                                                i12 = i18;
                                                cursor = null;
                                                w2 w2Var322 = y3Var2.C;
                                                y3.k(w2Var322);
                                                w2Var322.f32925z.c(e, str2);
                                                q10.f32825x = true;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    i18 = i12;
                                                    sQLiteDatabase.close();
                                                    i17++;
                                                    str5 = str2;
                                                    str4 = str;
                                                    i16 = i6;
                                                }
                                                i18 = i12;
                                                i17++;
                                                str5 = str2;
                                                str4 = str;
                                                i16 = i6;
                                            } catch (SQLiteException e21) {
                                                e = e21;
                                                cursor = null;
                                                if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                                w2 w2Var2222 = y3Var2.C;
                                                y3.k(w2Var2222);
                                                w2Var2222.f32925z.c(e, str5);
                                                q10.f32825x = true;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                str2 = str5;
                                                if (sQLiteDatabase == null) {
                                                    i12 = i18;
                                                    i18 = i12;
                                                    i17++;
                                                    str5 = str2;
                                                    str4 = str;
                                                    i16 = i6;
                                                }
                                                sQLiteDatabase.close();
                                                i17++;
                                                str5 = str2;
                                                str4 = str;
                                                i16 = i6;
                                            }
                                        }
                                        throw th;
                                        break loop0;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    i6 = i16;
                                    str = str4;
                                    cursor3 = null;
                                }
                            }
                            th = th2;
                        } catch (SQLiteDatabaseLockedException unused11) {
                            i6 = i16;
                            str = str4;
                            str2 = str5;
                            i13 = i18;
                            cursor = null;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e22) {
                            e = e22;
                            i6 = i16;
                            str = str4;
                            str2 = str5;
                            i12 = i18;
                            cursor = null;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e23) {
                            e = e23;
                            i6 = i16;
                            str = str4;
                            cursor = null;
                            sQLiteDatabase = null;
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteDatabase = null;
                        }
                        cursor2 = null;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                    i6 = i16;
                    w2 w2Var10 = y3Var2.C;
                    y3.k(w2Var10);
                    w2Var10.C.b("Failed to read events from database in reasonable time");
                    arrayList = null;
                    if (arrayList != null) {
                        arrayList2.addAll(arrayList);
                        i10 = arrayList.size();
                    } else {
                        i10 = 0;
                    }
                    i14 = 100;
                    if (aVar != null && i10 < 100) {
                        arrayList2.add(aVar);
                    }
                    size = arrayList2.size();
                    for (i11 = 0; i11 < size; i11++) {
                        w9.a aVar2 = (w9.a) arrayList2.get(i11);
                        boolean z10 = aVar2 instanceof s;
                        w2 w2Var11 = y3Var.C;
                        if (z10) {
                            try {
                                m2Var.s0((s) aVar2, m6Var);
                            } catch (RemoteException e24) {
                                y3.k(w2Var11);
                                w2Var11.f32925z.c(e24, "Failed to send event to the service");
                            }
                        } else if (aVar2 instanceof g6) {
                            try {
                                m2Var.q1((g6) aVar2, m6Var);
                            } catch (RemoteException e25) {
                                y3.k(w2Var11);
                                w2Var11.f32925z.c(e25, "Failed to send user property to the service");
                            }
                        } else if (aVar2 instanceof c) {
                            try {
                                m2Var.e1((c) aVar2, m6Var);
                            } catch (RemoteException e26) {
                                y3.k(w2Var11);
                                w2Var11.f32925z.c(e26, "Failed to send conditional user property to the service");
                            }
                        } else {
                            y3.k(w2Var11);
                            w2Var11.f32925z.b("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i16 = i6 + 1;
                    i15 = i10;
                } else {
                    i6 = i16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                i14 = 100;
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
                size = arrayList2.size();
                while (i11 < size) {
                }
                i16 = i6 + 1;
                i15 = i10;
            }
            i6 = i16;
            arrayList = null;
            if (arrayList != null) {
            }
            i14 = 100;
            if (aVar != null) {
            }
            size = arrayList2.size();
            while (i11 < size) {
            }
            i16 = i6 + 1;
            i15 = i10;
        }
    }

    public final void m(c cVar) {
        boolean o10;
        h();
        i();
        y3 y3Var = this.f32943u;
        y3Var.getClass();
        q2 q10 = y3Var.q();
        y3 y3Var2 = q10.f32943u;
        k6 k6Var = y3Var2.F;
        y3.i(k6Var);
        k6Var.getClass();
        byte[] X = k6.X(cVar);
        if (X.length > 131072) {
            w2 w2Var = y3Var2.C;
            y3.k(w2Var);
            w2Var.A.b("Conditional user property too long for local database. Sending directly to service");
            o10 = false;
        } else {
            o10 = q10.o(X, 2);
        }
        t(new r9.i(this, q(true), o10, new c(cVar), cVar, 4));
    }

    public final boolean n() {
        h();
        i();
        if (this.f32730x != null) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        h();
        i();
        if (!p()) {
            return true;
        }
        k6 k6Var = this.f32943u.F;
        y3.i(k6Var);
        if (k6Var.h0() >= ((Integer) j2.e0.a(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p() {
        Boolean valueOf;
        h();
        i();
        if (this.f32731y == null) {
            h();
            i();
            j3 j3Var = this.f32943u.B;
            y3.i(j3Var);
            j3Var.h();
            boolean z10 = false;
            if (!j3Var.l().contains("use_service")) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(j3Var.l().getBoolean("use_service", false));
            }
            boolean z11 = true;
            if (valueOf == null || !valueOf.booleanValue()) {
                this.f32943u.getClass();
                n2 p10 = this.f32943u.p();
                p10.i();
                if (p10.E != 1) {
                    w2 w2Var = this.f32943u.C;
                    y3.k(w2Var);
                    w2Var.H.b("Checking service availability");
                    k6 k6Var = this.f32943u.F;
                    y3.i(k6Var);
                    k6Var.getClass();
                    int b10 = s9.f.f31339b.b(12451000, k6Var.f32943u.f32953u);
                    if (b10 != 0) {
                        if (b10 != 1) {
                            if (b10 != 2) {
                                if (b10 != 3) {
                                    if (b10 != 9) {
                                        if (b10 != 18) {
                                            w2 w2Var2 = this.f32943u.C;
                                            y3.k(w2Var2);
                                            w2Var2.C.c(Integer.valueOf(b10), "Unexpected service status");
                                        } else {
                                            w2 w2Var3 = this.f32943u.C;
                                            y3.k(w2Var3);
                                            w2Var3.C.b("Service updating");
                                        }
                                    } else {
                                        w2 w2Var4 = this.f32943u.C;
                                        y3.k(w2Var4);
                                        w2Var4.C.b("Service invalid");
                                    }
                                } else {
                                    w2 w2Var5 = this.f32943u.C;
                                    y3.k(w2Var5);
                                    w2Var5.C.b("Service disabled");
                                }
                            } else {
                                w2 w2Var6 = this.f32943u.C;
                                y3.k(w2Var6);
                                w2Var6.G.b("Service container out of date");
                                k6 k6Var2 = this.f32943u.F;
                                y3.i(k6Var2);
                                if (k6Var2.h0() >= 17443) {
                                }
                            }
                            z11 = false;
                            z10 = z11;
                            z11 = false;
                        } else {
                            w2 w2Var7 = this.f32943u.C;
                            y3.k(w2Var7);
                            w2Var7.H.b("Service missing");
                        }
                        if (z10 && this.f32943u.A.u()) {
                            w2 w2Var8 = this.f32943u.C;
                            y3.k(w2Var8);
                            w2Var8.f32925z.b("No way to upload. Consider using the full version of Analytics");
                        } else if (z11) {
                            j3 j3Var2 = this.f32943u.B;
                            y3.i(j3Var2);
                            j3Var2.h();
                            SharedPreferences.Editor edit = j3Var2.l().edit();
                            edit.putBoolean("use_service", z10);
                            edit.apply();
                        }
                        z11 = z10;
                    } else {
                        w2 w2Var9 = this.f32943u.C;
                        y3.k(w2Var9);
                        w2Var9.H.b("Service available");
                    }
                }
                z10 = true;
                if (z10) {
                }
                if (z11) {
                }
                z11 = z10;
            }
            this.f32731y = Boolean.valueOf(z11);
        }
        return this.f32731y.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m6 q(boolean z10) {
        long j10;
        long j11;
        Class<?> loadClass;
        long j12;
        String str;
        Object invoke;
        String str2;
        long a10;
        long min;
        Boolean p10;
        boolean z11;
        Boolean p11;
        Boolean valueOf;
        String str3;
        String str4;
        long abs;
        Pair pair;
        y3 y3Var = this.f32943u;
        y3Var.getClass();
        n2 p12 = y3Var.p();
        String str5 = null;
        if (z10) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            y3 y3Var2 = w2Var.f32943u;
            j3 j3Var = y3Var2.B;
            y3.i(j3Var);
            if (j3Var.f32678x != null) {
                j3 j3Var2 = y3Var2.B;
                y3.i(j3Var2);
                h3 h3Var = j3Var2.f32678x;
                j3 j3Var3 = h3Var.f32591e;
                j3Var3.h();
                j3Var3.h();
                long j13 = h3Var.f32591e.l().getLong(h3Var.f32587a, 0L);
                if (j13 == 0) {
                    h3Var.a();
                    abs = 0;
                } else {
                    j3Var3.f32943u.H.getClass();
                    abs = Math.abs(j13 - System.currentTimeMillis());
                }
                long j14 = h3Var.f32590d;
                if (abs >= j14) {
                    if (abs > j14 + j14) {
                        h3Var.a();
                    } else {
                        String string = j3Var3.l().getString(h3Var.f32589c, null);
                        long j15 = j3Var3.l().getLong(h3Var.f32588b, 0L);
                        h3Var.a();
                        if (string != null && j15 > 0) {
                            pair = new Pair(string, Long.valueOf(j15));
                        } else {
                            pair = j3.R;
                        }
                        if (pair != null && pair != j3.R) {
                            str5 = defpackage.d.f(String.valueOf(pair.second), ":", (String) pair.first);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    str5 = defpackage.d.f(String.valueOf(pair.second), ":", (String) pair.first);
                }
            }
        }
        String str6 = str5;
        p12.h();
        String m10 = p12.m();
        String n10 = p12.n();
        p12.i();
        String str7 = p12.f32761x;
        p12.i();
        long j16 = p12.f32762y;
        p12.i();
        v9.o.h(p12.f32763z);
        String str8 = p12.f32763z;
        y3 y3Var3 = p12.f32943u;
        y3Var3.A.m();
        p12.i();
        p12.h();
        long j17 = p12.A;
        k6 k6Var = y3Var3.F;
        Context context = y3Var3.f32953u;
        if (j17 == 0) {
            y3.i(k6Var);
            String packageName = context.getPackageName();
            k6Var.h();
            v9.o.e(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest p13 = k6.p();
            y3 y3Var4 = k6Var.f32943u;
            if (p13 == null) {
                w2 w2Var2 = y3Var4.C;
                y3.k(w2Var2);
                w2Var2.f32925z.b("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                    } catch (PackageManager.NameNotFoundException e10) {
                        w2 w2Var3 = y3Var4.C;
                        y3.k(w2Var3);
                        w2Var3.f32925z.c(e10, "Package name not found");
                    }
                    if (!k6Var.R(context, packageName)) {
                        Signature[] signatureArr = ca.c.a(context).b(64, y3Var4.f32953u.getPackageName()).signatures;
                        if (signatureArr != null && signatureArr.length > 0) {
                            j10 = k6.i0(p13.digest(signatureArr[0].toByteArray()));
                            p12.A = j10;
                        } else {
                            w2 w2Var4 = y3Var4.C;
                            y3.k(w2Var4);
                            w2Var4.C.b("Could not get signatures");
                        }
                    }
                }
                j10 = 0;
                p12.A = j10;
            }
            j10 = -1;
            p12.A = j10;
        } else {
            j10 = j17;
        }
        boolean g5 = y3Var3.g();
        j3 j3Var4 = y3Var3.B;
        y3.i(j3Var4);
        boolean z12 = !j3Var4.J;
        p12.h();
        boolean g10 = y3Var3.g();
        f fVar = y3Var3.A;
        if (!g10) {
            j11 = j10;
        } else {
            ((ja) ia.f8432v.f8433u.a()).a();
            j11 = j10;
            boolean q10 = fVar.q(null, j2.f32640a0);
            w2 w2Var5 = y3Var3.C;
            if (q10) {
                y3.k(w2Var5);
                w2Var5.H.b("Disabled IID for tests.");
            } else {
                try {
                    loadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        Class<?>[] clsArr = new Class[1];
                        str = str8;
                        try {
                            clsArr[0] = Context.class;
                            Method declaredMethod = loadClass.getDeclaredMethod("getInstance", clsArr);
                            Object[] objArr = new Object[1];
                            j12 = j16;
                            try {
                                objArr[0] = context;
                                invoke = declaredMethod.invoke(null, objArr);
                            } catch (Exception unused2) {
                                y3.k(w2Var5);
                                w2Var5.D.b("Failed to obtain Firebase Analytics instance");
                                str2 = null;
                                a10 = j3Var4.f32679y.a();
                                long j18 = y3Var3.f32952a0;
                                if (a10 != 0) {
                                }
                                p12.i();
                                int i6 = p12.E;
                                p10 = fVar.p("google_analytics_adid_collection_enabled");
                                if (p10 == null) {
                                }
                                z11 = true;
                                j3Var4.h();
                                boolean z13 = j3Var4.l().getBoolean("deferred_analytics_collection", false);
                                p12.i();
                                String str9 = p12.G;
                                if (fVar.p("google_analytics_default_allow_ad_personalization_signals") != null) {
                                }
                                Boolean bool = valueOf;
                                long j19 = p12.B;
                                List list = p12.C;
                                String e11 = j3Var4.n().e();
                                if (p12.D == null) {
                                }
                                String str10 = p12.D;
                                ca.c();
                                if (!fVar.q(null, j2.f32653i0)) {
                                }
                                return new m6(m10, n10, str7, j12, str, 74029L, j11, str6, g5, z12, str2, min, i6, z11, z13, str3, bool, j19, list, e11, str10, str4);
                            }
                        } catch (Exception unused3) {
                            j12 = j16;
                        }
                    } catch (Exception unused4) {
                        j12 = j16;
                        str = str8;
                    }
                    if (invoke != null) {
                        try {
                            str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                        } catch (Exception unused5) {
                            y3.k(w2Var5);
                            w2Var5.E.b("Failed to retrieve Firebase Instance Id");
                        }
                        a10 = j3Var4.f32679y.a();
                        long j182 = y3Var3.f32952a0;
                        if (a10 != 0) {
                            min = j182;
                        } else {
                            min = Math.min(j182, a10);
                        }
                        p12.i();
                        int i62 = p12.E;
                        p10 = fVar.p("google_analytics_adid_collection_enabled");
                        if (p10 == null && !p10.booleanValue()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        j3Var4.h();
                        boolean z132 = j3Var4.l().getBoolean("deferred_analytics_collection", false);
                        p12.i();
                        String str92 = p12.G;
                        if (fVar.p("google_analytics_default_allow_ad_personalization_signals") != null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(!p11.booleanValue());
                        }
                        Boolean bool2 = valueOf;
                        long j192 = p12.B;
                        List list2 = p12.C;
                        String e112 = j3Var4.n().e();
                        if (p12.D == null) {
                            if (fVar.q(null, j2.f32659l0)) {
                                y3.i(k6Var);
                                p12.D = k6Var.n();
                            } else {
                                p12.D = "";
                            }
                        }
                        String str102 = p12.D;
                        ca.c();
                        if (!fVar.q(null, j2.f32653i0)) {
                            p12.h();
                            if (p12.I == 0) {
                                str3 = str92;
                            } else {
                                y3Var3.H.getClass();
                                str3 = str92;
                                long currentTimeMillis = System.currentTimeMillis() - p12.I;
                                if (p12.H != null && currentTimeMillis > 86400000 && p12.J == null) {
                                    p12.o();
                                }
                            }
                            if (p12.H == null) {
                                p12.o();
                            }
                            str4 = p12.H;
                        } else {
                            str3 = str92;
                            str4 = null;
                        }
                        return new m6(m10, n10, str7, j12, str, 74029L, j11, str6, g5, z12, str2, min, i62, z11, z132, str3, bool2, j192, list2, e112, str102, str4);
                    }
                    str2 = null;
                    a10 = j3Var4.f32679y.a();
                    long j1822 = y3Var3.f32952a0;
                    if (a10 != 0) {
                    }
                    p12.i();
                    int i622 = p12.E;
                    p10 = fVar.p("google_analytics_adid_collection_enabled");
                    if (p10 == null) {
                    }
                    z11 = true;
                    j3Var4.h();
                    boolean z1322 = j3Var4.l().getBoolean("deferred_analytics_collection", false);
                    p12.i();
                    String str922 = p12.G;
                    if (fVar.p("google_analytics_default_allow_ad_personalization_signals") != null) {
                    }
                    Boolean bool22 = valueOf;
                    long j1922 = p12.B;
                    List list22 = p12.C;
                    String e1122 = j3Var4.n().e();
                    if (p12.D == null) {
                    }
                    String str1022 = p12.D;
                    ca.c();
                    if (!fVar.q(null, j2.f32653i0)) {
                    }
                    return new m6(m10, n10, str7, j12, str, 74029L, j11, str6, g5, z12, str2, min, i622, z11, z1322, str3, bool22, j1922, list22, e1122, str1022, str4);
                }
            }
        }
        j12 = j16;
        str = str8;
        str2 = null;
        a10 = j3Var4.f32679y.a();
        long j18222 = y3Var3.f32952a0;
        if (a10 != 0) {
        }
        p12.i();
        int i6222 = p12.E;
        p10 = fVar.p("google_analytics_adid_collection_enabled");
        if (p10 == null) {
        }
        z11 = true;
        j3Var4.h();
        boolean z13222 = j3Var4.l().getBoolean("deferred_analytics_collection", false);
        p12.i();
        String str9222 = p12.G;
        if (fVar.p("google_analytics_default_allow_ad_personalization_signals") != null) {
        }
        Boolean bool222 = valueOf;
        long j19222 = p12.B;
        List list222 = p12.C;
        String e11222 = j3Var4.n().e();
        if (p12.D == null) {
        }
        String str10222 = p12.D;
        ca.c();
        if (!fVar.q(null, j2.f32653i0)) {
        }
        return new m6(m10, n10, str7, j12, str, 74029L, j11, str6, g5, z12, str2, min, i6222, z11, z13222, str3, bool222, j19222, list222, e11222, str10222, str4);
    }

    public final void r() {
        h();
        y3 y3Var = this.f32943u;
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        ArrayList arrayList = this.B;
        w2Var.H.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                w2 w2Var2 = y3Var.C;
                y3.k(w2Var2);
                w2Var2.f32925z.c(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.C.a();
    }

    public final void s() {
        h();
        fs.c cVar = this.A;
        ((kotlin.jvm.internal.b0) ((aa.c) cVar.f15849b)).getClass();
        cVar.f15848a = SystemClock.elapsedRealtime();
        this.f32943u.getClass();
        this.f32732z.c(((Long) j2.J.a(null)).longValue());
    }

    public final void t(Runnable runnable) {
        h();
        if (n()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        y3 y3Var = this.f32943u;
        y3Var.getClass();
        if (size >= 1000) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.f32925z.b("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.C.c(60000L);
        w();
    }

    public final Boolean u() {
        return this.f32731y;
    }

    public final void w() {
        h();
        i();
        if (n()) {
            return;
        }
        if (!p()) {
            if (!this.f32943u.A.u()) {
                this.f32943u.getClass();
                List<ResolveInfo> queryIntentServices = this.f32943u.f32953u.getPackageManager().queryIntentServices(new Intent().setClassName(this.f32943u.f32953u, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(this.f32943u.f32953u, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f32729w.b(intent);
                    return;
                }
                w2 w2Var = this.f32943u.C;
                y3.k(w2Var);
                w2Var.f32925z.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        k5 k5Var = this.f32729w;
        k5Var.f32697w.h();
        Context context = k5Var.f32697w.f32943u.f32953u;
        synchronized (k5Var) {
            if (k5Var.f32695u) {
                w2 w2Var2 = k5Var.f32697w.f32943u.C;
                y3.k(w2Var2);
                w2Var2.H.b("Connection attempt already in progress");
            } else if (k5Var.f32696v != null && (k5Var.f32696v.d() || k5Var.f32696v.j())) {
                w2 w2Var3 = k5Var.f32697w.f32943u.C;
                y3.k(w2Var3);
                w2Var3.H.b("Already awaiting connection attempt");
            } else {
                k5Var.f32696v = new s2(context, Looper.getMainLooper(), k5Var, k5Var);
                w2 w2Var4 = k5Var.f32697w.f32943u.C;
                y3.k(w2Var4);
                w2Var4.H.b("Connecting to remote service");
                k5Var.f32695u = true;
                v9.o.h(k5Var.f32696v);
                k5Var.f32696v.q();
            }
        }
    }

    public final void x() {
        h();
        i();
        k5 k5Var = this.f32729w;
        if (k5Var.f32696v != null && (k5Var.f32696v.j() || k5Var.f32696v.d())) {
            k5Var.f32696v.h();
        }
        k5Var.f32696v = null;
        try {
            z9.a.b().c(this.f32943u.f32953u, this.f32729w);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f32730x = null;
    }

    public final void y(AtomicReference atomicReference) {
        h();
        i();
        t(new k9.d0(this, atomicReference, q(false), 9));
    }
}
