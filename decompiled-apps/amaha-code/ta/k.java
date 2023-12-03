package ta;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s8;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class k extends y5 {

    /* renamed from: x  reason: collision with root package name */
    public final j f32687x;

    /* renamed from: y  reason: collision with root package name */
    public final fs.c f32688y;

    /* renamed from: z  reason: collision with root package name */
    public static final String[] f32686z = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] A = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] B = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    public static final String[] C = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] D = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] E = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] F = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] G = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    public k(d6 d6Var) {
        super(d6Var);
        this.f32688y = new fs.c(this.f32943u.H);
        this.f32943u.getClass();
        this.f32687x = new j(this, this.f32943u.f32953u);
    }

    public static final void u(ContentValues contentValues, Object obj) {
        v9.o.e("value");
        v9.o.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final SQLiteDatabase A() {
        h();
        try {
            return this.f32687x.getWritableDatabase();
        } catch (SQLiteException e10) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.C.c(e10, "Error opening database");
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0232: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:62:0x0232 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134 A[Catch: SQLiteException -> 0x01f1, all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:4:0x0063, B:8:0x006d, B:10:0x00d0, B:15:0x00da, B:19:0x0123, B:23:0x0139, B:25:0x0168, B:30:0x0172, B:34:0x0183, B:38:0x01a0, B:40:0x01ab, B:41:0x01bd, B:43:0x01ca, B:45:0x01d4, B:48:0x01f3, B:50:0x0203, B:37:0x019c, B:22:0x0134, B:57:0x021b), top: B:66:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c A[Catch: SQLiteException -> 0x01f1, all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:4:0x0063, B:8:0x006d, B:10:0x00d0, B:15:0x00da, B:19:0x0123, B:23:0x0139, B:25:0x0168, B:30:0x0172, B:34:0x0183, B:38:0x01a0, B:40:0x01ab, B:41:0x01bd, B:43:0x01ca, B:45:0x01d4, B:48:0x01f3, B:50:0x0203, B:37:0x019c, B:22:0x0134, B:57:0x021b), top: B:66:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ab A[Catch: SQLiteException -> 0x01f1, all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:4:0x0063, B:8:0x006d, B:10:0x00d0, B:15:0x00da, B:19:0x0123, B:23:0x0139, B:25:0x0168, B:30:0x0172, B:34:0x0183, B:38:0x01a0, B:40:0x01ab, B:41:0x01bd, B:43:0x01ca, B:45:0x01d4, B:48:0x01f3, B:50:0x0203, B:37:0x019c, B:22:0x0134, B:57:0x021b), top: B:66:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ca A[Catch: SQLiteException -> 0x01f1, all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:4:0x0063, B:8:0x006d, B:10:0x00d0, B:15:0x00da, B:19:0x0123, B:23:0x0139, B:25:0x0168, B:30:0x0172, B:34:0x0183, B:38:0x01a0, B:40:0x01ab, B:41:0x01bd, B:43:0x01ca, B:45:0x01d4, B:48:0x01f3, B:50:0x0203, B:37:0x019c, B:22:0x0134, B:57:0x021b), top: B:66:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0203 A[Catch: SQLiteException -> 0x01f1, all -> 0x0231, TRY_LEAVE, TryCatch #0 {all -> 0x0231, blocks: (B:4:0x0063, B:8:0x006d, B:10:0x00d0, B:15:0x00da, B:19:0x0123, B:23:0x0139, B:25:0x0168, B:30:0x0172, B:34:0x0183, B:38:0x01a0, B:40:0x01ab, B:41:0x01bd, B:43:0x01ca, B:45:0x01d4, B:48:0x01f3, B:50:0x0203, B:37:0x019c, B:22:0x0134, B:57:0x021b), top: B:66:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l4 B(String str) {
        Cursor cursor;
        Cursor cursor2;
        boolean z10;
        long j10;
        boolean z11;
        long j11;
        boolean z12;
        boolean z13;
        long j12;
        y3 y3Var = this.f32943u;
        v9.o.e(str);
        h();
        i();
        Cursor cursor3 = null;
        try {
            try {
                cursor = A().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    l4 l4Var = new l4(this.f32947v.F, str);
                    y3 y3Var2 = l4Var.f32705a;
                    l4Var.b(cursor.getString(0));
                    l4Var.p(cursor.getString(1));
                    l4Var.w(cursor.getString(2));
                    l4Var.t(cursor.getLong(3));
                    l4Var.u(cursor.getLong(4));
                    l4Var.s(cursor.getLong(5));
                    l4Var.d(cursor.getString(6));
                    l4Var.c(cursor.getString(7));
                    l4Var.q(cursor.getLong(8));
                    l4Var.m(cursor.getLong(9));
                    if (!cursor.isNull(10) && cursor.getInt(10) == 0) {
                        z10 = false;
                        l4Var.v(z10);
                        l4Var.l(cursor.getLong(11));
                        l4Var.j(cursor.getLong(12));
                        l4Var.i(cursor.getLong(13));
                        l4Var.g(cursor.getLong(14));
                        l4Var.f(cursor.getLong(15));
                        j10 = cursor.getLong(16);
                        w3 w3Var = y3Var2.D;
                        y3.k(w3Var);
                        w3Var.h();
                        boolean z14 = l4Var.C;
                        if (l4Var.E == j10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        l4Var.C = z14 | z11;
                        l4Var.E = j10;
                        if (!cursor.isNull(17)) {
                            j11 = -2147483648L;
                        } else {
                            j11 = cursor.getInt(17);
                        }
                        l4Var.e(j11);
                        l4Var.o(cursor.getString(18));
                        l4Var.h(cursor.getLong(19));
                        l4Var.k(cursor.getLong(20));
                        l4Var.r(cursor.getString(21));
                        if (!cursor.isNull(23) && cursor.getInt(23) == 0) {
                            z12 = false;
                            w3 w3Var2 = y3Var2.D;
                            y3.k(w3Var2);
                            w3Var2.h();
                            boolean z15 = l4Var.C;
                            if (l4Var.f32719p == z12) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            l4Var.C = z15 | z13;
                            l4Var.f32719p = z12;
                            l4Var.a(cursor.getString(24));
                            if (!cursor.isNull(25)) {
                                j12 = 0;
                            } else {
                                j12 = cursor.getLong(25);
                            }
                            l4Var.n(j12);
                            if (!cursor.isNull(26)) {
                                l4Var.x(Arrays.asList(cursor.getString(26).split(",", -1)));
                            }
                            ca.c();
                            if (y3Var.A.q(null, j2.f32651h0) && y3Var.A.q(str, j2.f32655j0)) {
                                String string = cursor.getString(28);
                                w3 w3Var3 = y3Var2.D;
                                y3.k(w3Var3);
                                w3Var3.h();
                                l4Var.C = (true ^ kotlin.jvm.internal.h.q0(l4Var.f32723u, string)) | l4Var.C;
                                l4Var.f32723u = string;
                            }
                            w3 w3Var4 = y3Var2.D;
                            y3.k(w3Var4);
                            w3Var4.h();
                            l4Var.C = false;
                            if (cursor.moveToNext()) {
                                w2 w2Var = y3Var.C;
                                y3.k(w2Var);
                                w2Var.f32925z.c(w2.q(str), "Got multiple records for app, expected one. appId");
                            }
                            cursor.close();
                            return l4Var;
                        }
                        z12 = true;
                        w3 w3Var22 = y3Var2.D;
                        y3.k(w3Var22);
                        w3Var22.h();
                        boolean z152 = l4Var.C;
                        if (l4Var.f32719p == z12) {
                        }
                        l4Var.C = z152 | z13;
                        l4Var.f32719p = z12;
                        l4Var.a(cursor.getString(24));
                        if (!cursor.isNull(25)) {
                        }
                        l4Var.n(j12);
                        if (!cursor.isNull(26)) {
                        }
                        ca.c();
                        if (y3Var.A.q(null, j2.f32651h0)) {
                            String string2 = cursor.getString(28);
                            w3 w3Var32 = y3Var2.D;
                            y3.k(w3Var32);
                            w3Var32.h();
                            l4Var.C = (true ^ kotlin.jvm.internal.h.q0(l4Var.f32723u, string2)) | l4Var.C;
                            l4Var.f32723u = string2;
                        }
                        w3 w3Var42 = y3Var2.D;
                        y3.k(w3Var42);
                        w3Var42.h();
                        l4Var.C = false;
                        if (cursor.moveToNext()) {
                        }
                        cursor.close();
                        return l4Var;
                    }
                    z10 = true;
                    l4Var.v(z10);
                    l4Var.l(cursor.getLong(11));
                    l4Var.j(cursor.getLong(12));
                    l4Var.i(cursor.getLong(13));
                    l4Var.g(cursor.getLong(14));
                    l4Var.f(cursor.getLong(15));
                    j10 = cursor.getLong(16);
                    w3 w3Var5 = y3Var2.D;
                    y3.k(w3Var5);
                    w3Var5.h();
                    boolean z142 = l4Var.C;
                    if (l4Var.E == j10) {
                    }
                    l4Var.C = z142 | z11;
                    l4Var.E = j10;
                    if (!cursor.isNull(17)) {
                    }
                    l4Var.e(j11);
                    l4Var.o(cursor.getString(18));
                    l4Var.h(cursor.getLong(19));
                    l4Var.k(cursor.getLong(20));
                    l4Var.r(cursor.getString(21));
                    if (!cursor.isNull(23)) {
                        z12 = false;
                        w3 w3Var222 = y3Var2.D;
                        y3.k(w3Var222);
                        w3Var222.h();
                        boolean z1522 = l4Var.C;
                        if (l4Var.f32719p == z12) {
                        }
                        l4Var.C = z1522 | z13;
                        l4Var.f32719p = z12;
                        l4Var.a(cursor.getString(24));
                        if (!cursor.isNull(25)) {
                        }
                        l4Var.n(j12);
                        if (!cursor.isNull(26)) {
                        }
                        ca.c();
                        if (y3Var.A.q(null, j2.f32651h0)) {
                        }
                        w3 w3Var422 = y3Var2.D;
                        y3.k(w3Var422);
                        w3Var422.h();
                        l4Var.C = false;
                        if (cursor.moveToNext()) {
                        }
                        cursor.close();
                        return l4Var;
                    }
                    z12 = true;
                    w3 w3Var2222 = y3Var2.D;
                    y3.k(w3Var2222);
                    w3Var2222.h();
                    boolean z15222 = l4Var.C;
                    if (l4Var.f32719p == z12) {
                    }
                    l4Var.C = z15222 | z13;
                    l4Var.f32719p = z12;
                    l4Var.a(cursor.getString(24));
                    if (!cursor.isNull(25)) {
                    }
                    l4Var.n(j12);
                    if (!cursor.isNull(26)) {
                    }
                    ca.c();
                    if (y3Var.A.q(null, j2.f32651h0)) {
                    }
                    w3 w3Var4222 = y3Var2.D;
                    y3.k(w3Var4222);
                    w3Var4222.h();
                    l4Var.C = false;
                    if (cursor.moveToNext()) {
                    }
                    cursor.close();
                    return l4Var;
                } catch (SQLiteException e10) {
                    e = e10;
                    w2 w2Var2 = y3Var.C;
                    y3.k(w2Var2);
                    w2Var2.f32925z.d("Error querying app. appId", w2.q(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c C(String str, String str2) {
        Cursor cursor;
        boolean z10;
        d6 d6Var = this.f32947v;
        y3 y3Var = this.f32943u;
        v9.o.e(str);
        v9.o.e(str2);
        h();
        i();
        Cursor cursor2 = null;
        try {
            cursor = A().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object H = H(1, cursor);
                    if (cursor.getInt(2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String string2 = cursor.getString(3);
                    long j10 = cursor.getLong(4);
                    f6 f6Var = d6Var.A;
                    f6 f6Var2 = d6Var.A;
                    d6.H(f6Var);
                    byte[] blob = cursor.getBlob(5);
                    Parcelable.Creator<s> creator = s.CREATOR;
                    long j11 = cursor.getLong(6);
                    d6.H(f6Var2);
                    long j12 = cursor.getLong(8);
                    long j13 = cursor.getLong(9);
                    d6.H(f6Var2);
                    c cVar = new c(str, str3, new g6(j12, H, str2, str3), j11, z10, string2, (s) f6Var.x(blob, creator), j10, (s) f6Var2.x(cursor.getBlob(7), creator), j13, (s) f6Var2.x(cursor.getBlob(10), creator));
                    if (cursor.moveToNext()) {
                        w2 w2Var = y3Var.C;
                        y3.k(w2Var);
                        w2Var.f32925z.d("Got multiple records for conditional property, expected one", w2.q(str), y3Var.G.f(str2));
                    }
                    cursor.close();
                    return cVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    w2 w2Var2 = y3Var.C;
                    y3.k(w2Var2);
                    w2Var2.f32925z.e("Error querying conditional property", w2.q(str), y3Var.G.f(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final i D(long j10, String str, boolean z10, boolean z11) {
        return E(j10, str, 1L, false, false, z10, false, z11);
    }

    public final i E(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        y3 y3Var = this.f32943u;
        v9.o.e(str);
        h();
        i();
        String[] strArr = {str};
        i iVar = new i();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase A2 = A();
                Cursor query = A2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.C.c(w2.q(str), "Not updating daily counts, app is not known. appId");
                    query.close();
                    return iVar;
                }
                if (query.getLong(0) == j10) {
                    iVar.f32608b = query.getLong(1);
                    iVar.f32607a = query.getLong(2);
                    iVar.f32609c = query.getLong(3);
                    iVar.f32610d = query.getLong(4);
                    iVar.f32611e = query.getLong(5);
                }
                if (z10) {
                    iVar.f32608b += j11;
                }
                if (z11) {
                    iVar.f32607a += j11;
                }
                if (z12) {
                    iVar.f32609c += j11;
                }
                if (z13) {
                    iVar.f32610d += j11;
                }
                if (z14) {
                    iVar.f32611e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(iVar.f32607a));
                contentValues.put("daily_events_count", Long.valueOf(iVar.f32608b));
                contentValues.put("daily_conversions_count", Long.valueOf(iVar.f32609c));
                contentValues.put("daily_error_events_count", Long.valueOf(iVar.f32610d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(iVar.f32611e));
                A2.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return iVar;
            } catch (SQLiteException e10) {
                w2 w2Var2 = y3Var.C;
                y3.k(w2Var2);
                w2Var2.f32925z.d("Error updating daily counts. appId", w2.q(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return iVar;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p F(String str, String str2) {
        y3 y3Var;
        Cursor cursor;
        Cursor cursor2;
        long j10;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Boolean bool;
        long j11;
        y3 y3Var2 = this.f32943u;
        v9.o.e(str);
        v9.o.e(str2);
        h();
        i();
        Cursor cursor3 = null;
        try {
            boolean z10 = false;
            Cursor query = A().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    query.close();
                    return null;
                }
                long j12 = query.getLong(0);
                long j13 = query.getLong(1);
                long j14 = query.getLong(2);
                if (query.isNull(3)) {
                    j10 = 0;
                } else {
                    j10 = query.getLong(3);
                }
                if (query.isNull(4)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(query.getLong(4));
                }
                if (query.isNull(5)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(query.getLong(5));
                }
                if (query.isNull(6)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(query.getLong(6));
                }
                if (!query.isNull(7)) {
                    if (query.getLong(7) == 1) {
                        z10 = true;
                    }
                    bool = Boolean.valueOf(z10);
                } else {
                    bool = null;
                }
                if (query.isNull(8)) {
                    j11 = 0;
                } else {
                    j11 = query.getLong(8);
                }
                y3Var = y3Var2;
                cursor2 = query;
                try {
                    p pVar = new p(str, str2, j12, j13, j11, j14, j10, valueOf, valueOf2, valueOf3, bool);
                    if (cursor2.moveToNext()) {
                        w2 w2Var = y3Var.C;
                        y3.k(w2Var);
                        w2Var.f32925z.c(w2.q(str), "Got multiple records for event aggregates, expected one. appId");
                    }
                    cursor2.close();
                    return pVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor = cursor2;
                    try {
                        w2 w2Var2 = y3Var.C;
                        y3.k(w2Var2);
                        w2Var2.f32925z.e("Error querying events. appId", w2.q(str), y3Var.G.d(str2), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                y3Var = y3Var2;
                cursor2 = query;
            } catch (Throwable th4) {
                th = th4;
                cursor2 = query;
            }
        } catch (SQLiteException e12) {
            e = e12;
            y3Var = y3Var2;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i6 G(String str, String str2) {
        Cursor cursor;
        y3 y3Var = this.f32943u;
        v9.o.e(str);
        v9.o.e(str2);
        h();
        i();
        Cursor cursor2 = null;
        try {
            cursor = A().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j10 = cursor.getLong(0);
                    Object H = H(1, cursor);
                    if (H == null) {
                        cursor.close();
                        return null;
                    }
                    i6 i6Var = new i6(str, cursor.getString(2), str2, j10, H);
                    if (cursor.moveToNext()) {
                        w2 w2Var = y3Var.C;
                        y3.k(w2Var);
                        w2Var.f32925z.c(w2.q(str), "Got multiple records for user property, expected one. appId");
                    }
                    cursor.close();
                    return i6Var;
                } catch (SQLiteException e10) {
                    e = e10;
                    w2 w2Var2 = y3Var.C;
                    y3.k(w2Var2);
                    w2Var2.f32925z.e("Error querying user property. appId", w2.q(str), y3Var.G.f(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final Object H(int i6, Cursor cursor) {
        int type = cursor.getType(i6);
        y3 y3Var = this.f32943u;
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            w2 w2Var = y3Var.C;
                            y3.k(w2Var);
                            w2Var.f32925z.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        w2 w2Var2 = y3Var.C;
                        y3.k(w2Var2);
                        w2Var2.f32925z.b("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i6);
                }
                return Double.valueOf(cursor.getDouble(i6));
            }
            return Long.valueOf(cursor.getLong(i6));
        }
        w2 w2Var3 = y3Var.C;
        y3.k(w2Var3);
        w2Var3.f32925z.b("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String I() {
        SQLiteException e10;
        Cursor cursor;
        SQLiteDatabase A2 = A();
        ?? r12 = 0;
        try {
            try {
                cursor = A2.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                    cursor.close();
                    return null;
                } catch (SQLiteException e11) {
                    e10 = e11;
                    w2 w2Var = this.f32943u.C;
                    y3.k(w2Var);
                    w2Var.f32925z.c(e10, "Database error getting next bundle app id");
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                r12 = A2;
                th = th2;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r12 != 0) {
            }
            throw th;
        }
    }

    public final List J(String str, String str2, String str3) {
        v9.o.e(str);
        h();
        i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return K(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
        r0 = r2.C;
        ta.y3.k(r0);
        r0.f32925z.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List K(String str, String[] strArr) {
        boolean z10;
        d6 d6Var = this.f32947v;
        y3 y3Var = this.f32943u;
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase A2 = A();
                String[] strArr2 = {"app_id", "origin", SessionManager.KEY_NAME, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                y3Var.getClass();
                cursor = A2.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() < 1000) {
                            String string = cursor.getString(0);
                            String string2 = cursor.getString(1);
                            String string3 = cursor.getString(2);
                            Object H = H(3, cursor);
                            if (cursor.getInt(4) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            String string4 = cursor.getString(5);
                            long j10 = cursor.getLong(6);
                            f6 f6Var = d6Var.A;
                            f6 f6Var2 = d6Var.A;
                            d6.H(f6Var);
                            byte[] blob = cursor.getBlob(7);
                            Parcelable.Creator<s> creator = s.CREATOR;
                            long j11 = cursor.getLong(8);
                            d6.H(f6Var2);
                            long j12 = cursor.getLong(10);
                            long j13 = cursor.getLong(11);
                            d6.H(f6Var2);
                            arrayList.add(new c(string, string2, new g6(j12, H, string3, string2), j11, z10, string4, (s) f6Var.x(blob, creator), j10, (s) f6Var2.x(cursor.getBlob(9), creator), j13, (s) f6Var2.x(cursor.getBlob(12), creator)));
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    cursor.close();
                    return arrayList;
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.f32925z.c(e10, "Error querying conditional user property value");
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final List L(String str) {
        y3 y3Var = this.f32943u;
        v9.o.e(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                y3Var.getClass();
                cursor = A().query("user_attributes", new String[]{SessionManager.KEY_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j10 = cursor.getLong(2);
                        Object H = H(3, cursor);
                        if (H == null) {
                            w2 w2Var = y3Var.C;
                            y3.k(w2Var);
                            w2Var.f32925z.c(w2.q(str), "Read invalid user property value, ignoring it. appId");
                        } else {
                            arrayList.add(new i6(str, str2, string, j10, H));
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    return arrayList;
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                w2 w2Var2 = y3Var.C;
                y3.k(w2Var2);
                w2Var2.f32925z.d("Error querying user properties. appId", w2.q(str), e10);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
        ta.y3.k(r6);
        r6.f32925z.c(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List M(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        y3 y3Var = this.f32943u;
        v9.o.e(str);
        h();
        i();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb2 = new StringBuilder("app_id=?");
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(str2);
                        sb2.append(" and origin=?");
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb2.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    SQLiteDatabase A2 = A();
                    String[] strArr2 = {SessionManager.KEY_NAME, "set_timestamp", "value", "origin"};
                    String sb3 = sb2.toString();
                    y3Var.getClass();
                    cursor = A2.query("user_attributes", strArr2, sb3, strArr, null, null, "rowid", "1001");
                } catch (SQLiteException e10) {
                    e = e10;
                    str4 = str2;
                    cursor = null;
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.f32925z.e("(2)Error querying user properties", w2.q(str), str4, e);
                    List emptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyList;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return arrayList;
                    }
                    str4 = str2;
                    while (true) {
                        try {
                            int size = arrayList.size();
                            w2 w2Var2 = y3Var.C;
                            if (size < 1000) {
                                String string = cursor.getString(0);
                                long j10 = cursor.getLong(1);
                                Object H = H(2, cursor);
                                str4 = cursor.getString(3);
                                if (H == null) {
                                    y3.k(w2Var2);
                                    w2Var2.f32925z.e("(2)Read invalid user property value, ignoring it", w2.q(str), str4, str3);
                                } else {
                                    arrayList.add(new i6(str, str4, string, j10, H));
                                }
                                if (!cursor.moveToNext()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            w2 w2Var3 = y3Var.C;
                            y3.k(w2Var3);
                            w2Var3.f32925z.e("(2)Error querying user properties", w2.q(str), str4, e);
                            List emptyList2 = Collections.emptyList();
                            if (cursor != null) {
                            }
                            return emptyList2;
                        }
                    }
                    cursor.close();
                    return arrayList;
                } catch (SQLiteException e12) {
                    e = e12;
                    str4 = str2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e = e13;
        }
    }

    public final void N() {
        i();
        A().beginTransaction();
    }

    public final void O() {
        i();
        A().endTransaction();
    }

    public final void P(List list) {
        h();
        i();
        if (list.size() != 0) {
            if (!p()) {
                return;
            }
            String m10 = defpackage.b.m("(", TextUtils.join(",", list), ")");
            long v10 = v("SELECT COUNT(1) FROM queue WHERE rowid IN " + m10 + " AND retry_count =  2147483647 LIMIT 1", null);
            y3 y3Var = this.f32943u;
            if (v10 > 0) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.C.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase A2 = A();
                A2.execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + m10 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
                return;
            } catch (SQLiteException e10) {
                w2 w2Var2 = y3Var.C;
                y3.k(w2Var2);
                w2Var2.f32925z.c(e10, "Error incrementing retry count. error");
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public final void Q() {
        h();
        i();
        if (p()) {
            d6 d6Var = this.f32947v;
            long a10 = d6Var.C.f32771y.a();
            y3 y3Var = this.f32943u;
            y3Var.H.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a10) > ((Long) j2.f32675y.a(null)).longValue()) {
                d6Var.C.f32771y.b(elapsedRealtime);
                h();
                i();
                if (p()) {
                    SQLiteDatabase A2 = A();
                    y3Var.H.getClass();
                    int delete = A2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) j2.D.a(null)).longValue())});
                    if (delete > 0) {
                        w2 w2Var = y3Var.C;
                        y3.k(w2Var);
                        w2Var.H.c(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void l(String str, String str2) {
        v9.o.e(str);
        v9.o.e(str2);
        h();
        i();
        try {
            A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            y3 y3Var = this.f32943u;
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.f32925z.e("Error deleting user property. appId", w2.q(str), y3Var.G.f(str2), e10);
        }
    }

    public final void m() {
        i();
        A().setTransactionSuccessful();
    }

    public final void n(l4 l4Var) {
        h();
        i();
        String D2 = l4Var.D();
        v9.o.h(D2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", D2);
        contentValues.put("app_instance_id", l4Var.E());
        contentValues.put("gmp_app_id", l4Var.H());
        y3 y3Var = l4Var.f32705a;
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        w3Var.h();
        contentValues.put("resettable_device_id_hash", l4Var.f32709e);
        w3 w3Var2 = y3Var.D;
        y3.k(w3Var2);
        w3Var2.h();
        contentValues.put("last_bundle_index", Long.valueOf(l4Var.f32710g));
        w3 w3Var3 = y3Var.D;
        y3.k(w3Var3);
        w3Var3.h();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(l4Var.f32711h));
        w3 w3Var4 = y3Var.D;
        y3.k(w3Var4);
        w3Var4.h();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(l4Var.f32712i));
        contentValues.put("app_version", l4Var.F());
        w3 w3Var5 = y3Var.D;
        y3.k(w3Var5);
        w3Var5.h();
        contentValues.put("app_store", l4Var.f32715l);
        w3 w3Var6 = y3Var.D;
        y3.k(w3Var6);
        w3Var6.h();
        contentValues.put("gmp_version", Long.valueOf(l4Var.f32716m));
        w3 w3Var7 = y3Var.D;
        y3.k(w3Var7);
        w3Var7.h();
        contentValues.put("dev_cert_hash", Long.valueOf(l4Var.f32717n));
        w3 w3Var8 = y3Var.D;
        y3.k(w3Var8);
        w3Var8.h();
        contentValues.put("measurement_enabled", Boolean.valueOf(l4Var.f32718o));
        w3 w3Var9 = y3Var.D;
        y3.k(w3Var9);
        w3Var9.h();
        contentValues.put("day", Long.valueOf(l4Var.f32724v));
        w3 w3Var10 = y3Var.D;
        y3.k(w3Var10);
        w3Var10.h();
        contentValues.put("daily_public_events_count", Long.valueOf(l4Var.f32725w));
        y3.k(w3Var10);
        w3Var10.h();
        contentValues.put("daily_events_count", Long.valueOf(l4Var.f32726x));
        y3.k(w3Var10);
        w3Var10.h();
        contentValues.put("daily_conversions_count", Long.valueOf(l4Var.f32727y));
        w3 w3Var11 = y3Var.D;
        y3.k(w3Var11);
        w3Var11.h();
        contentValues.put("config_fetched_time", Long.valueOf(l4Var.D));
        w3 w3Var12 = y3Var.D;
        y3.k(w3Var12);
        w3Var12.h();
        contentValues.put("failed_config_fetch_time", Long.valueOf(l4Var.E));
        contentValues.put("app_version_int", Long.valueOf(l4Var.z()));
        contentValues.put("firebase_instance_id", l4Var.G());
        y3.k(w3Var10);
        w3Var10.h();
        contentValues.put("daily_error_events_count", Long.valueOf(l4Var.f32728z));
        y3.k(w3Var10);
        w3Var10.h();
        contentValues.put("daily_realtime_events_count", Long.valueOf(l4Var.A));
        y3.k(w3Var10);
        w3Var10.h();
        contentValues.put("health_monitor_sample", l4Var.B);
        w3 w3Var13 = y3Var.D;
        y3.k(w3Var13);
        w3Var13.h();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(l4Var.y()));
        contentValues.put("admob_app_id", l4Var.B());
        contentValues.put("dynamite_version", Long.valueOf(l4Var.A()));
        w3 w3Var14 = y3Var.D;
        y3.k(w3Var14);
        w3Var14.h();
        contentValues.put("session_stitching_token", l4Var.f32723u);
        w3 w3Var15 = y3Var.D;
        y3.k(w3Var15);
        w3Var15.h();
        ArrayList arrayList = l4Var.f32722t;
        y3 y3Var2 = this.f32943u;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                w2 w2Var = y3Var2.C;
                y3.k(w2Var);
                w2Var.C.c(D2, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((s8) r8.f8580v.f8581u.a()).a();
        f fVar = y3Var2.A;
        w2 w2Var2 = y3Var2.C;
        if (fVar.q(null, j2.f32647f0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase A2 = A();
            if (A2.update("apps", contentValues, "app_id = ?", new String[]{D2}) == 0 && A2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                y3.k(w2Var2);
                w2Var2.f32925z.c(w2.q(D2), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            y3.k(w2Var2);
            w2Var2.f32925z.d("Error storing app. appId", w2.q(D2), e10);
        }
    }

    public final void o(p pVar) {
        Long l2;
        y3 y3Var = this.f32943u;
        v9.o.h(pVar);
        h();
        i();
        ContentValues contentValues = new ContentValues();
        String str = pVar.f32792a;
        contentValues.put("app_id", str);
        contentValues.put(SessionManager.KEY_NAME, pVar.f32793b);
        contentValues.put("lifetime_count", Long.valueOf(pVar.f32794c));
        contentValues.put("current_bundle_count", Long.valueOf(pVar.f32795d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pVar.f32797g));
        contentValues.put("last_bundled_day", pVar.f32798h);
        contentValues.put("last_sampled_complex_event_id", pVar.f32799i);
        contentValues.put("last_sampling_rate", pVar.f32800j);
        contentValues.put("current_session_count", Long.valueOf(pVar.f32796e));
        Boolean bool = pVar.f32801k;
        if (bool != null && bool.booleanValue()) {
            l2 = 1L;
        } else {
            l2 = null;
        }
        contentValues.put("last_exempt_from_sampling", l2);
        try {
            if (A().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.f32925z.c(w2.q(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.f32925z.d("Error storing event aggregates. appId", w2.q(str), e10);
        }
    }

    public final boolean p() {
        y3 y3Var = this.f32943u;
        Context context = y3Var.f32953u;
        y3Var.getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void q(String str, Long l2, long j10, com.google.android.gms.internal.measurement.m2 m2Var) {
        h();
        i();
        v9.o.h(m2Var);
        v9.o.e(str);
        byte[] g5 = m2Var.g();
        y3 y3Var = this.f32943u;
        w2 w2Var = y3Var.C;
        w2 w2Var2 = y3Var.C;
        y3.k(w2Var);
        w2Var.H.d("Saving complex main event, appId, data size", y3Var.G.d(str), Integer.valueOf(g5.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", g5);
        try {
            if (A().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                y3.k(w2Var2);
                w2Var2.f32925z.c(w2.q(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            y3.k(w2Var2);
            w2Var2.f32925z.d("Error storing complex main event. appId", w2.q(str), e10);
        }
    }

    public final boolean r(c cVar) {
        h();
        i();
        String str = cVar.f32491u;
        v9.o.h(str);
        i6 G2 = G(str, cVar.f32493w.f32578v);
        y3 y3Var = this.f32943u;
        if (G2 == null) {
            long v10 = v("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            y3Var.getClass();
            if (v10 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", cVar.f32492v);
        contentValues.put(SessionManager.KEY_NAME, cVar.f32493w.f32578v);
        Object f02 = cVar.f32493w.f0();
        v9.o.h(f02);
        u(contentValues, f02);
        contentValues.put("active", Boolean.valueOf(cVar.f32495y));
        contentValues.put("trigger_event_name", cVar.f32496z);
        contentValues.put("trigger_timeout", Long.valueOf(cVar.B));
        k6 k6Var = y3Var.F;
        w2 w2Var = y3Var.C;
        y3.i(k6Var);
        k6Var.getClass();
        contentValues.put("timed_out_event", k6.X(cVar.A));
        contentValues.put("creation_timestamp", Long.valueOf(cVar.f32494x));
        k6 k6Var2 = y3Var.F;
        y3.i(k6Var2);
        s sVar = cVar.C;
        k6Var2.getClass();
        contentValues.put("triggered_event", k6.X(sVar));
        contentValues.put("triggered_timestamp", Long.valueOf(cVar.f32493w.f32579w));
        contentValues.put("time_to_live", Long.valueOf(cVar.D));
        y3.i(k6Var2);
        k6Var2.getClass();
        contentValues.put("expired_event", k6.X(cVar.E));
        try {
            if (A().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                y3.k(w2Var);
                w2Var.f32925z.c(w2.q(str), "Failed to insert/update conditional user property (got -1)");
            }
        } catch (SQLiteException e10) {
            y3.k(w2Var);
            w2Var.f32925z.d("Error storing conditional user property", w2.q(str), e10);
        }
        return true;
    }

    public final boolean s(i6 i6Var) {
        h();
        i();
        String str = i6Var.f32631a;
        String str2 = i6Var.f32633c;
        i6 G2 = G(str, str2);
        y3 y3Var = this.f32943u;
        String str3 = i6Var.f32632b;
        if (G2 == null) {
            if (k6.T(str2)) {
                if (v("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(y3Var.A.l(str, j2.G), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long v10 = v("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                y3Var.getClass();
                if (v10 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put(SessionManager.KEY_NAME, str2);
        contentValues.put("set_timestamp", Long.valueOf(i6Var.f32634d));
        u(contentValues, i6Var.f32635e);
        try {
            if (A().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.f32925z.c(w2.q(str), "Failed to insert/update user property (got -1). appId");
            }
        } catch (SQLiteException e10) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.f32925z.d("Error storing user property. appId", w2.q(str), e10);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(long j10, long j11, b6 b6Var) {
        Cursor cursor;
        SQLiteDatabase A2;
        String str;
        String string;
        String str2;
        String[] strArr;
        y3 y3Var = this.f32943u;
        h();
        i();
        Cursor cursor2 = null;
        String str3 = null;
        String str4 = null;
        try {
            A2 = A();
            str = "";
        } catch (SQLiteException e10) {
            e = e10;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (TextUtils.isEmpty(null)) {
                int i6 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                String[] strArr2 = i6 != 0 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                if (i6 != 0) {
                    str = "rowid <= ? and ";
                }
                Cursor rawQuery = A2.rawQuery("select app_id, metadata_fingerprint from raw_events where " + str + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", strArr2);
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                    return;
                }
                str3 = rawQuery.getString(0);
                string = rawQuery.getString(1);
                rawQuery.close();
            } else {
                int i10 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                String[] strArr3 = i10 != 0 ? new String[]{null, String.valueOf(j11)} : new String[]{null};
                if (i10 != 0) {
                    str = " and rowid <= ?";
                }
                Cursor rawQuery2 = A2.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + str + " order by rowid limit 1;", strArr3);
                if (!rawQuery2.moveToFirst()) {
                    rawQuery2.close();
                    return;
                } else {
                    string = rawQuery2.getString(0);
                    rawQuery2.close();
                }
            }
            Cursor query = A2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
            if (!query.moveToFirst()) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.f32925z.c(w2.q(str3), "Raw event metadata record is missing. appId");
                query.close();
                return;
            }
            try {
                com.google.android.gms.internal.measurement.v2 v2Var = (com.google.android.gms.internal.measurement.v2) ((com.google.android.gms.internal.measurement.u2) f6.z(com.google.android.gms.internal.measurement.v2.D1(), query.getBlob(0))).f();
                if (query.moveToNext()) {
                    w2 w2Var2 = y3Var.C;
                    y3.k(w2Var2);
                    w2Var2.C.c(w2.q(str3), "Get multiple raw event metadata records, expected one. appId");
                }
                query.close();
                b6Var.f32486a = v2Var;
                if (j11 != -1) {
                    str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    strArr = new String[]{str3, string, String.valueOf(j11)};
                } else {
                    str2 = "app_id = ? and metadata_fingerprint = ?";
                    strArr = new String[]{str3, string};
                }
                Cursor query2 = A2.query("raw_events", new String[]{"rowid", SessionManager.KEY_NAME, ServerValues.NAME_OP_TIMESTAMP, "data"}, str2, strArr, null, null, "rowid", null);
                if (query2.moveToFirst()) {
                    do {
                        long j12 = query2.getLong(0);
                        try {
                            com.google.android.gms.internal.measurement.l2 l2Var = (com.google.android.gms.internal.measurement.l2) f6.z(com.google.android.gms.internal.measurement.m2.y(), query2.getBlob(3));
                            String string2 = query2.getString(1);
                            l2Var.i();
                            com.google.android.gms.internal.measurement.m2.I((com.google.android.gms.internal.measurement.m2) l2Var.f8613v, string2);
                            long j13 = query2.getLong(2);
                            l2Var.i();
                            com.google.android.gms.internal.measurement.m2.J(j13, (com.google.android.gms.internal.measurement.m2) l2Var.f8613v);
                            if (!b6Var.a(j12, (com.google.android.gms.internal.measurement.m2) l2Var.f())) {
                                query2.close();
                                return;
                            }
                        } catch (IOException e11) {
                            w2 w2Var3 = y3Var.C;
                            y3.k(w2Var3);
                            w2Var3.f32925z.d("Data loss. Failed to merge raw event. appId", w2.q(str3), e11);
                        }
                    } while (query2.moveToNext());
                    query2.close();
                    return;
                }
                w2 w2Var4 = y3Var.C;
                y3.k(w2Var4);
                w2Var4.C.c(w2.q(str3), "Raw event data disappeared while in transaction. appId");
                query2.close();
            } catch (IOException e12) {
                w2 w2Var5 = y3Var.C;
                y3.k(w2Var5);
                w2Var5.f32925z.d("Data loss. Failed to merge raw event metadata. appId", w2.q(str3), e12);
                query.close();
            }
        } catch (SQLiteException e13) {
            e = e13;
            str4 = null;
            cursor = "select metadata_fingerprint from raw_events where app_id = ?";
            try {
                w2 w2Var6 = y3Var.C;
                y3.k(w2Var6);
                w2Var6.f32925z.d("Data loss. Error selecting raw event. appId", w2.q(str4), e);
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor2 = "select metadata_fingerprint from raw_events where app_id = ?";
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final long v(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = A().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                w2 w2Var = this.f32943u.C;
                y3.k(w2Var);
                w2Var.f32925z.d("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final void w(String str, String str2) {
        v9.o.e(str);
        v9.o.e(str2);
        h();
        i();
        try {
            A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            y3 y3Var = this.f32943u;
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.f32925z.e("Error deleting conditional property", w2.q(str), y3Var.G.f(str2), e10);
        }
    }

    public final long x(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = A().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j11 = cursor.getLong(0);
                    cursor.close();
                    return j11;
                }
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                w2 w2Var = this.f32943u.C;
                y3.k(w2Var);
                w2Var.f32925z.d("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long y(String str) {
        long x10;
        y3 y3Var = this.f32943u;
        v9.o.e(str);
        v9.o.e("first_open_count");
        h();
        i();
        SQLiteDatabase A2 = A();
        A2.beginTransaction();
        long j10 = 0;
        try {
            try {
                x10 = x("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (x10 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (A2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        w2 w2Var = y3Var.C;
                        y3.k(w2Var);
                        w2Var.f32925z.d("Failed to insert column (got -1). appId", w2.q(str), "first_open_count");
                        return -1L;
                    }
                    x10 = 0;
                }
            } catch (SQLiteException e10) {
                e = e10;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(x10 + 1));
                if (A2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    w2 w2Var2 = y3Var.C;
                    y3.k(w2Var2);
                    w2Var2.f32925z.d("Failed to update column (got 0). appId", w2.q(str), "first_open_count");
                    return -1L;
                }
                A2.setTransactionSuccessful();
                return x10;
            } catch (SQLiteException e11) {
                e = e11;
                j10 = x10;
                w2 w2Var3 = y3Var.C;
                y3.k(w2Var3);
                w2Var3.f32925z.e("Error inserting column. appId", w2.q(str), "first_open_count", e);
                A2.endTransaction();
                return j10;
            }
        } finally {
            A2.endTransaction();
        }
    }

    public final long z(String str) {
        v9.o.e(str);
        return x("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @Override // ta.y5
    public final void k() {
    }
}
