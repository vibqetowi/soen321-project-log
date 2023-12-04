package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ifriend.analytics.AnalyticsConstants;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzak extends zzku {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzaj zzj;
    private final zzkq zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzak(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzk = new zzkq(this.zzt.zzax());
        this.zzt.zzf();
        this.zzj = new zzaj(this, this.zzt.zzaw(), "google_app_measurement.db");
    }

    static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
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

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzd("Error deleting user property. appId", zzet.zzn(str), this.zzt.zzj().zzf(str2), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0345, code lost:
        if (zzh().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0347, code lost:
        r23.zzt.zzaA().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x035b, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0360, code lost:
        r23.zzt.zzaA().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzet.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0373, code lost:
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = zzh();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03aa, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0178, code lost:
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0184, code lost:
        if (r11.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0190, code lost:
        if (((com.google.android.gms.internal.measurement.zzet) r11.next()).zzj() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
        r23.zzt.zzaA().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzet.zzn(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ab, code lost:
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c1, code lost:
        if (r11.hasNext() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c3, code lost:
        r12 = (com.google.android.gms.internal.measurement.zzek) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01dd, code lost:
        if (r12.zzg().isEmpty() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01df, code lost:
        r0 = r23.zzt.zzaA().zzk();
        r9 = com.google.android.gms.measurement.internal.zzet.zzn(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f7, code lost:
        if (r12.zzp() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f9, code lost:
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0204, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0206, code lost:
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0211, code lost:
        r3 = r12.zzbx();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022a, code lost:
        if (r12.zzp() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022c, code lost:
        r9 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0235, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0236, code lost:
        r7.put("filter_id", r9);
        r7.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0246, code lost:
        if (r12.zzq() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
        r9 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0251, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0252, code lost:
        r7.put("session_scoped", r9);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0266, code lost:
        if (zzh().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0268, code lost:
        r23.zzt.zzaA().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzet.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x027b, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0281, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0282, code lost:
        r23.zzt.zzaA().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzet.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0297, code lost:
        r21 = r7;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a5, code lost:
        if (r0.hasNext() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a7, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzet) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c1, code lost:
        if (r3.zze().isEmpty() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c3, code lost:
        r0 = r23.zzt.zzaA().zzk();
        r8 = com.google.android.gms.measurement.internal.zzet.zzn(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02db, code lost:
        if (r3.zzj() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02dd, code lost:
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02e6, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02e7, code lost:
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
        r7 = r3.zzbx();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0307, code lost:
        if (r3.zzj() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0309, code lost:
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0312, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0313, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0325, code lost:
        if (r3.zzk() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0327, code lost:
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0330, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0331, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzB(String str, List list) {
        boolean z;
        String str2 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(list);
        int i = 0;
        while (i < list.size()) {
            com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) ((com.google.android.gms.internal.measurement.zzei) list.get(i)).zzbB();
            if (zzehVar.zza() != 0) {
                int i2 = 0;
                while (i2 < zzehVar.zza()) {
                    com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) zzehVar.zze(i2).zzbB();
                    com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) zzejVar.zzav();
                    String zzb2 = zzhc.zzb(zzejVar.zze());
                    if (zzb2 != null) {
                        zzejVar2.zzb(zzb2);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < zzejVar.zza()) {
                        com.google.android.gms.internal.measurement.zzem zzd2 = zzejVar.zzd(i3);
                        com.google.android.gms.internal.measurement.zzej zzejVar3 = zzejVar;
                        String str3 = str2;
                        String zzb3 = zziq.zzb(zzd2.zze(), zzhd.zza, zzhd.zzb);
                        if (zzb3 != null) {
                            com.google.android.gms.internal.measurement.zzel zzelVar = (com.google.android.gms.internal.measurement.zzel) zzd2.zzbB();
                            zzelVar.zza(zzb3);
                            zzejVar2.zzc(i3, (com.google.android.gms.internal.measurement.zzem) zzelVar.zzaD());
                            z = true;
                        }
                        i3++;
                        zzejVar = zzejVar3;
                        str2 = str3;
                    }
                    String str4 = str2;
                    if (z) {
                        zzehVar.zzc(i2, zzejVar2);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaD());
                    }
                    i2++;
                    str2 = str4;
                }
            }
            String str5 = str2;
            if (zzehVar.zzb() != 0) {
                for (int i4 = 0; i4 < zzehVar.zzb(); i4++) {
                    com.google.android.gms.internal.measurement.zzet zzf = zzehVar.zzf(i4);
                    String zzb4 = zziq.zzb(zzf.zze(), zzhe.zza, zzhe.zzb);
                    if (zzb4 != null) {
                        com.google.android.gms.internal.measurement.zzes zzesVar = (com.google.android.gms.internal.measurement.zzes) zzf.zzbB();
                        zzesVar.zza(zzb4);
                        zzehVar.zzd(i4, zzesVar);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaD());
                    }
                }
            }
            i++;
            str2 = str5;
        }
        String str6 = str2;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            zzW();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase zzh3 = zzh();
            zzh3.delete("property_filters", "app_id=?", new String[]{str});
            zzh3.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) it.next();
                zzW();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzeiVar);
                if (!zzeiVar.zzk()) {
                    this.zzt.zzaA().zzk().zzb("Audience with no ID. appId", zzet.zzn(str));
                } else {
                    int zza2 = zzeiVar.zza();
                    Iterator it2 = zzeiVar.zzg().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzek) it2.next()).zzp()) {
                                this.zzt.zzaA().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzet.zzn(str), Integer.valueOf(zza2));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar2 = (com.google.android.gms.internal.measurement.zzei) it3.next();
                arrayList.add(zzeiVar2.zzk() ? Integer.valueOf(zzeiVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzW();
            zzg();
            SQLiteDatabase zzh4 = zzh();
            try {
                long zzZ = zzZ("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(2000, this.zzt.zzf().zze(str, zzeg.zzF)));
                if (zzZ > max) {
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 < arrayList.size()) {
                            Integer num = (Integer) arrayList.get(i5);
                            if (num == null) {
                                break;
                            }
                            arrayList2.add(Integer.toString(num.intValue()));
                            i5++;
                        } else {
                            zzh4.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList2) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(max)});
                            break;
                        }
                    }
                }
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Database error querying filters. appId", zzet.zzn(str), e);
            }
            zzh2.setTransactionSuccessful();
        } finally {
            zzh2.endTransaction();
        }
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String zzv = zzhVar.zzv();
        Preconditions.checkNotNull(zzv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzv);
        contentValues.put("app_instance_id", zzhVar.zzw());
        contentValues.put("gmp_app_id", zzhVar.zzA());
        contentValues.put("resettable_device_id_hash", zzhVar.zzC());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzy());
        contentValues.put("app_store", zzhVar.zzx());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzan()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzz());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzB());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzam()));
        contentValues.put("admob_app_id", zzhVar.zzt());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzD());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzap()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzr()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzq()));
        List zzE = zzhVar.zzE();
        if (zzE != null) {
            if (zzE.isEmpty()) {
                this.zzt.zzaA().zzk().zzb("Safelisted events should not be an empty list. appId", zzv);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzE));
            }
        }
        zzop.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzak) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzv}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update app (got -1). appId", zzet.zzn(zzv));
            }
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing app. appId", zzet.zzn(zzv), e);
        }
    }

    public final void zzE(zzaq zzaqVar) {
        Preconditions.checkNotNull(zzaqVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaqVar.zza);
        contentValues.put("name", zzaqVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzaqVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzaqVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzaqVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzaqVar.zzg));
        contentValues.put("last_bundled_day", zzaqVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzaqVar.zzi);
        contentValues.put("last_sampling_rate", zzaqVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzaqVar.zze));
        Boolean bool = zzaqVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzet.zzn(zzaqVar.zza));
            }
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing event aggregates. appId", zzet.zzn(zzaqVar.zza), e);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean zzI() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l, long j, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbx = zzftVar.zzbx();
        this.zzt.zzaA().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbx);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert complex main event (got -1). appId", zzet.zzn(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing complex main event. appId", zzet.zzn(str), e);
            return false;
        }
    }

    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzt.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzt.zzv().zzap(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzt.zzv().zzap(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzt.zzv().zzap(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzet.zzn(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing conditional user property", zzet.zzn(str), e);
            return true;
        }
    }

    public final boolean zzL(zzlm zzlmVar) {
        Preconditions.checkNotNull(zzlmVar);
        zzg();
        zzW();
        if (zzp(zzlmVar.zza, zzlmVar.zzc) == null) {
            if (zzlp.zzak(zzlmVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlmVar.zza}) >= this.zzt.zzf().zzf(zzlmVar.zza, zzeg.zzG, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzlmVar.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlmVar.zza, zzlmVar.zzb});
                this.zzt.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlmVar.zza);
        contentValues.put("origin", zzlmVar.zzb);
        contentValues.put("name", zzlmVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlmVar.zzd));
        zzV(contentValues, "value", zzlmVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update user property (got -1). appId", zzet.zzn(zzlmVar.zza));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing user property. appId", zzet.zzn(zzlmVar.zza), e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0223  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzU(String str, long j, long j2, zzle zzleVar) {
        String string;
        char c;
        char c2;
        String[] strArr;
        String str2;
        ?? r3 = "select metadata_fingerprint from raw_events where app_id = ?";
        Preconditions.checkNotNull(zzleVar);
        zzg();
        zzW();
        Cursor cursor = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                try {
                    if (TextUtils.isEmpty(null)) {
                        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        Cursor rawQuery = zzh2.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (i != 0 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", i != 0 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)});
                        if (!rawQuery.moveToFirst()) {
                            if (rawQuery != null) {
                                rawQuery.close();
                                return;
                            }
                            return;
                        }
                        str3 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        Cursor rawQuery2 = zzh2.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (i2 != 0 ? " and rowid <= ?" : "") + " order by rowid limit 1;", i2 != 0 ? new String[]{null, String.valueOf(j2)} : new String[]{null});
                        if (!rawQuery2.moveToFirst()) {
                            if (rawQuery2 != null) {
                                rawQuery2.close();
                                return;
                            }
                            return;
                        }
                        string = rawQuery2.getString(0);
                        rawQuery2.close();
                    }
                    Cursor query = zzh2.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", ExifInterface.GPS_MEASUREMENT_2D);
                    if (!query.moveToFirst()) {
                        this.zzt.zzaA().zzd().zzb("Raw event metadata record is missing. appId", zzet.zzn(str3));
                        if (query != null) {
                            query.close();
                            return;
                        }
                        return;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((com.google.android.gms.internal.measurement.zzgc) zzlj.zzm(com.google.android.gms.internal.measurement.zzgd.zzu(), query.getBlob(0))).zzaD();
                        if (query.moveToNext()) {
                            this.zzt.zzaA().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzet.zzn(str3));
                        }
                        query.close();
                        Preconditions.checkNotNull(zzgdVar);
                        zzleVar.zza = zzgdVar;
                        if (j2 != -1) {
                            c2 = 1;
                            c = 2;
                            str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                            strArr = new String[]{str3, string, String.valueOf(j2)};
                        } else {
                            c = 2;
                            c2 = 1;
                            strArr = new String[]{str3, string};
                            str2 = "app_id = ? and metadata_fingerprint = ?";
                        }
                        String[] strArr2 = new String[4];
                        strArr2[0] = "rowid";
                        strArr2[c2] = "name";
                        strArr2[c] = AnalyticsConstants.TIMESTAMP;
                        strArr2[3] = "data";
                        Cursor query2 = zzh2.query("raw_events", strArr2, str2, strArr, null, null, "rowid", null);
                        if (!query2.moveToFirst()) {
                            this.zzt.zzaA().zzk().zzb("Raw event data disappeared while in transaction. appId", zzet.zzn(str3));
                            if (query2 != null) {
                                query2.close();
                                return;
                            }
                            return;
                        }
                        do {
                            long j3 = query2.getLong(0);
                            try {
                                com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzlj.zzm(com.google.android.gms.internal.measurement.zzft.zze(), query2.getBlob(3));
                                zzfsVar.zzi(query2.getString(1));
                                zzfsVar.zzm(query2.getLong(2));
                                if (!zzleVar.zza(j3, (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD())) {
                                    if (query2 != null) {
                                        query2.close();
                                        return;
                                    }
                                    return;
                                }
                            } catch (IOException e) {
                                this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event. appId", zzet.zzn(str3), e);
                            }
                        } while (query2.moveToNext());
                        if (query2 != null) {
                            query2.close();
                        }
                    } catch (IOException e2) {
                        this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzet.zzn(str3), e2);
                        if (query != null) {
                            query.close();
                        }
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    this.zzt.zzaA().zzd().zzc("Data loss. Error selecting raw event. appId", zzet.zzn(null), e);
                    if (r3 != 0) {
                        r3.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor = "select metadata_fingerprint from raw_events where app_id = ?";
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            r3 = 0;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzd("Error deleting conditional property", zzet.zzn(str), this.zzt.zzj().zzf(str2), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    protected final boolean zzb() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzc(String str, String str2) {
        SQLiteException e;
        long j;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            try {
                j = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.zzt.zzaA().zzd().zzc("Failed to insert column (got -1). appId", zzet.zzn(str), "first_open_count");
                        return -1L;
                    }
                    j = 0;
                }
            } catch (SQLiteException e2) {
                e = e2;
                j = 0;
            }
            try {
                contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Long.valueOf(1 + j));
            } catch (SQLiteException e3) {
                e = e3;
                this.zzt.zzaA().zzd().zzd("Error inserting column. appId", zzet.zzn(str), "first_open_count", e);
                return j;
            }
            if (zzh2.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.zzt.zzaA().zzd().zzc("Failed to update column (got 0). appId", zzet.zzn(str), "first_open_count");
                return -1L;
            }
            zzh2.setTransactionSuccessful();
            return j;
        } finally {
            zzh2.endTransaction();
        }
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00db: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:48:0x00db */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzi(String str) {
        Cursor cursor;
        Cursor cursor2;
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzh().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursor.moveToFirst()) {
                        this.zzt.zzaA().zzj().zza("Default event parameters not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzlj.zzm(com.google.android.gms.internal.measurement.zzft.zze(), cursor.getBlob(0))).zzaD();
                        this.zzf.zzu();
                        List<com.google.android.gms.internal.measurement.zzfx> zzi2 = zzftVar.zzi();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzi2) {
                            String zzg2 = zzfxVar.zzg();
                            if (zzfxVar.zzu()) {
                                bundle.putDouble(zzg2, zzfxVar.zza());
                            } else if (zzfxVar.zzv()) {
                                bundle.putFloat(zzg2, zzfxVar.zzb());
                            } else if (zzfxVar.zzy()) {
                                bundle.putString(zzg2, zzfxVar.zzh());
                            } else if (zzfxVar.zzw()) {
                                bundle.putLong(zzg2, zzfxVar.zzd());
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return bundle;
                    } catch (IOException e) {
                        this.zzt.zzaA().zzd().zzc("Failed to retrieve default event parameters. appId", zzet.zzn(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzaA().zzd().zzb("Error selecting default event parameters", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ab A[Catch: SQLiteException -> 0x02bf, all -> 0x02de, TryCatch #2 {SQLiteException -> 0x02bf, blocks: (B:4:0x00f0, B:9:0x00fc, B:11:0x015c, B:16:0x0166, B:20:0x01b0, B:22:0x01df, B:27:0x01e9, B:31:0x0204, B:33:0x020f, B:34:0x0221, B:36:0x0232, B:39:0x0249, B:41:0x025a, B:43:0x0262, B:46:0x0269, B:47:0x026c, B:49:0x027d, B:50:0x0286, B:52:0x0294, B:53:0x029d, B:55:0x02a6, B:38:0x0240, B:30:0x0200, B:19:0x01ab), top: B:74:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0200 A[Catch: SQLiteException -> 0x02bf, all -> 0x02de, TryCatch #2 {SQLiteException -> 0x02bf, blocks: (B:4:0x00f0, B:9:0x00fc, B:11:0x015c, B:16:0x0166, B:20:0x01b0, B:22:0x01df, B:27:0x01e9, B:31:0x0204, B:33:0x020f, B:34:0x0221, B:36:0x0232, B:39:0x0249, B:41:0x025a, B:43:0x0262, B:46:0x0269, B:47:0x026c, B:49:0x027d, B:50:0x0286, B:52:0x0294, B:53:0x029d, B:55:0x02a6, B:38:0x0240, B:30:0x0200, B:19:0x01ab), top: B:74:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x020f A[Catch: SQLiteException -> 0x02bf, all -> 0x02de, TryCatch #2 {SQLiteException -> 0x02bf, blocks: (B:4:0x00f0, B:9:0x00fc, B:11:0x015c, B:16:0x0166, B:20:0x01b0, B:22:0x01df, B:27:0x01e9, B:31:0x0204, B:33:0x020f, B:34:0x0221, B:36:0x0232, B:39:0x0249, B:41:0x025a, B:43:0x0262, B:46:0x0269, B:47:0x026c, B:49:0x027d, B:50:0x0286, B:52:0x0294, B:53:0x029d, B:55:0x02a6, B:38:0x0240, B:30:0x0200, B:19:0x01ab), top: B:74:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0232 A[Catch: SQLiteException -> 0x02bf, all -> 0x02de, TryCatch #2 {SQLiteException -> 0x02bf, blocks: (B:4:0x00f0, B:9:0x00fc, B:11:0x015c, B:16:0x0166, B:20:0x01b0, B:22:0x01df, B:27:0x01e9, B:31:0x0204, B:33:0x020f, B:34:0x0221, B:36:0x0232, B:39:0x0249, B:41:0x025a, B:43:0x0262, B:46:0x0269, B:47:0x026c, B:49:0x027d, B:50:0x0286, B:52:0x0294, B:53:0x029d, B:55:0x02a6, B:38:0x0240, B:30:0x0200, B:19:0x01ab), top: B:74:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x025a A[Catch: SQLiteException -> 0x02bf, all -> 0x02de, TryCatch #2 {SQLiteException -> 0x02bf, blocks: (B:4:0x00f0, B:9:0x00fc, B:11:0x015c, B:16:0x0166, B:20:0x01b0, B:22:0x01df, B:27:0x01e9, B:31:0x0204, B:33:0x020f, B:34:0x0221, B:36:0x0232, B:39:0x0249, B:41:0x025a, B:43:0x0262, B:46:0x0269, B:47:0x026c, B:49:0x027d, B:50:0x0286, B:52:0x0294, B:53:0x029d, B:55:0x02a6, B:38:0x0240, B:30:0x0200, B:19:0x01ab), top: B:74:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027d A[Catch: SQLiteException -> 0x02bf, all -> 0x02de, TryCatch #2 {SQLiteException -> 0x02bf, blocks: (B:4:0x00f0, B:9:0x00fc, B:11:0x015c, B:16:0x0166, B:20:0x01b0, B:22:0x01df, B:27:0x01e9, B:31:0x0204, B:33:0x020f, B:34:0x0221, B:36:0x0232, B:39:0x0249, B:41:0x025a, B:43:0x0262, B:46:0x0269, B:47:0x026c, B:49:0x027d, B:50:0x0286, B:52:0x0294, B:53:0x029d, B:55:0x02a6, B:38:0x0240, B:30:0x0200, B:19:0x01ab), top: B:74:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0294 A[Catch: SQLiteException -> 0x02bf, all -> 0x02de, TryCatch #2 {SQLiteException -> 0x02bf, blocks: (B:4:0x00f0, B:9:0x00fc, B:11:0x015c, B:16:0x0166, B:20:0x01b0, B:22:0x01df, B:27:0x01e9, B:31:0x0204, B:33:0x020f, B:34:0x0221, B:36:0x0232, B:39:0x0249, B:41:0x025a, B:43:0x0262, B:46:0x0269, B:47:0x026c, B:49:0x027d, B:50:0x0286, B:52:0x0294, B:53:0x029d, B:55:0x02a6, B:38:0x0240, B:30:0x0200, B:19:0x01ab), top: B:74:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a6 A[Catch: SQLiteException -> 0x02bf, all -> 0x02de, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x02bf, blocks: (B:4:0x00f0, B:9:0x00fc, B:11:0x015c, B:16:0x0166, B:20:0x01b0, B:22:0x01df, B:27:0x01e9, B:31:0x0204, B:33:0x020f, B:34:0x0221, B:36:0x0232, B:39:0x0249, B:41:0x025a, B:43:0x0262, B:46:0x0269, B:47:0x026c, B:49:0x027d, B:50:0x0286, B:52:0x0294, B:53:0x029d, B:55:0x02a6, B:38:0x0240, B:30:0x0200, B:19:0x01ab), top: B:74:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzj(String str) {
        Cursor cursor;
        boolean z;
        boolean z2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            boolean z3 = false;
            cursor = zzh().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    zzh zzhVar = new zzh(this.zzf.zzp(), str);
                    zzhVar.zzJ(cursor.getString(0));
                    zzhVar.zzY(cursor.getString(1));
                    zzhVar.zzag(cursor.getString(2));
                    zzhVar.zzac(cursor.getLong(3));
                    zzhVar.zzad(cursor.getLong(4));
                    zzhVar.zzab(cursor.getLong(5));
                    zzhVar.zzL(cursor.getString(6));
                    zzhVar.zzK(cursor.getString(7));
                    zzhVar.zzZ(cursor.getLong(8));
                    zzhVar.zzU(cursor.getLong(9));
                    if (!cursor.isNull(10) && cursor.getInt(10) == 0) {
                        z = false;
                        zzhVar.zzae(z);
                        zzhVar.zzT(cursor.getLong(11));
                        zzhVar.zzR(cursor.getLong(12));
                        zzhVar.zzQ(cursor.getLong(13));
                        zzhVar.zzO(cursor.getLong(14));
                        zzhVar.zzN(cursor.getLong(15));
                        zzhVar.zzW(cursor.getLong(16));
                        zzhVar.zzM(!cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                        zzhVar.zzX(cursor.getString(18));
                        zzhVar.zzP(cursor.getLong(19));
                        zzhVar.zzS(cursor.getLong(20));
                        zzhVar.zzaa(cursor.getString(21));
                        if (!cursor.isNull(23) && cursor.getInt(23) == 0) {
                            z2 = false;
                            zzhVar.zzI(z2);
                            zzhVar.zzH(cursor.getString(24));
                            zzhVar.zzV(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                            if (!cursor.isNull(26)) {
                                zzhVar.zzah(Arrays.asList(cursor.getString(26).split(",", -1)));
                            }
                            zzqu.zzc();
                            if (!this.zzt.zzf().zzs(str, zzeg.zzao) || this.zzt.zzf().zzs(null, zzeg.zzam)) {
                                zzhVar.zzai(cursor.getString(28));
                            }
                            zzrd.zzc();
                            if (this.zzt.zzf().zzs(null, zzeg.zzaq)) {
                                if (!cursor.isNull(29) && cursor.getInt(29) != 0) {
                                    z3 = true;
                                }
                                zzhVar.zzak(z3);
                            }
                            zzpz.zzc();
                            if (this.zzt.zzf().zzs(null, zzeg.zzaE)) {
                                zzhVar.zzal(cursor.getLong(30));
                            }
                            if (this.zzt.zzf().zzs(null, zzeg.zzaH)) {
                                zzhVar.zzaj(cursor.getLong(31));
                            }
                            zzhVar.zzF();
                            if (cursor.moveToNext()) {
                                this.zzt.zzaA().zzd().zzb("Got multiple records for app, expected one. appId", zzet.zzn(str));
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return zzhVar;
                        }
                        z2 = true;
                        zzhVar.zzI(z2);
                        zzhVar.zzH(cursor.getString(24));
                        zzhVar.zzV(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                        if (!cursor.isNull(26)) {
                        }
                        zzqu.zzc();
                        if (!this.zzt.zzf().zzs(str, zzeg.zzao)) {
                        }
                        zzhVar.zzai(cursor.getString(28));
                        zzrd.zzc();
                        if (this.zzt.zzf().zzs(null, zzeg.zzaq)) {
                        }
                        zzpz.zzc();
                        if (this.zzt.zzf().zzs(null, zzeg.zzaE)) {
                        }
                        if (this.zzt.zzf().zzs(null, zzeg.zzaH)) {
                        }
                        zzhVar.zzF();
                        if (cursor.moveToNext()) {
                        }
                        if (cursor != null) {
                        }
                        return zzhVar;
                    }
                    z = true;
                    zzhVar.zzae(z);
                    zzhVar.zzT(cursor.getLong(11));
                    zzhVar.zzR(cursor.getLong(12));
                    zzhVar.zzQ(cursor.getLong(13));
                    zzhVar.zzO(cursor.getLong(14));
                    zzhVar.zzN(cursor.getLong(15));
                    zzhVar.zzW(cursor.getLong(16));
                    zzhVar.zzM(!cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                    zzhVar.zzX(cursor.getString(18));
                    zzhVar.zzP(cursor.getLong(19));
                    zzhVar.zzS(cursor.getLong(20));
                    zzhVar.zzaa(cursor.getString(21));
                    if (!cursor.isNull(23)) {
                        z2 = false;
                        zzhVar.zzI(z2);
                        zzhVar.zzH(cursor.getString(24));
                        zzhVar.zzV(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                        if (!cursor.isNull(26)) {
                        }
                        zzqu.zzc();
                        if (!this.zzt.zzf().zzs(str, zzeg.zzao)) {
                        }
                        zzhVar.zzai(cursor.getString(28));
                        zzrd.zzc();
                        if (this.zzt.zzf().zzs(null, zzeg.zzaq)) {
                        }
                        zzpz.zzc();
                        if (this.zzt.zzf().zzs(null, zzeg.zzaE)) {
                        }
                        if (this.zzt.zzf().zzs(null, zzeg.zzaH)) {
                        }
                        zzhVar.zzF();
                        if (cursor.moveToNext()) {
                        }
                        if (cursor != null) {
                        }
                        return zzhVar;
                    }
                    z2 = true;
                    zzhVar.zzI(z2);
                    zzhVar.zzH(cursor.getString(24));
                    zzhVar.zzV(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                    if (!cursor.isNull(26)) {
                    }
                    zzqu.zzc();
                    if (!this.zzt.zzf().zzs(str, zzeg.zzao)) {
                    }
                    zzhVar.zzai(cursor.getString(28));
                    zzrd.zzc();
                    if (this.zzt.zzf().zzs(null, zzeg.zzaq)) {
                    }
                    zzpz.zzc();
                    if (this.zzt.zzf().zzs(null, zzeg.zzaE)) {
                    }
                    if (this.zzt.zzf().zzs(null, zzeg.zzaH)) {
                    }
                    zzhVar.zzF();
                    if (cursor.moveToNext()) {
                    }
                    if (cursor != null) {
                    }
                    return zzhVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzaA().zzd().zzc("Error querying app. appId", zzet.zzn(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac zzk(String str, String str2) {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            cursor = zzh().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object zzq = zzq(cursor, 1);
                    zzac zzacVar = new zzac(str, str3, new zzlk(str2, cursor.getLong(8), zzq, str3), cursor.getLong(6), cursor.getInt(2) != 0, cursor.getString(3), (zzau) this.zzf.zzu().zzi(cursor.getBlob(5), zzau.CREATOR), cursor.getLong(4), (zzau) this.zzf.zzu().zzi(cursor.getBlob(7), zzau.CREATOR), cursor.getLong(9), (zzau) this.zzf.zzu().zzi(cursor.getBlob(10), zzau.CREATOR));
                    if (cursor.moveToNext()) {
                        this.zzt.zzaA().zzd().zzc("Got multiple records for conditional property, expected one", zzet.zzn(str), this.zzt.zzj().zzf(str2));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzacVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzaA().zzd().zzd("Error querying conditional property", zzet.zzn(str), this.zzt.zzj().zzf(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final zzai zzl(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzm(j, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzai zzm(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzai zzaiVar = new zzai();
        try {
            SQLiteDatabase zzh2 = zzh();
            Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    this.zzt.zzaA().zzk().zzb("Not updating daily counts, app is not known. appId", zzet.zzn(str));
                    if (query != null) {
                        query.close();
                    }
                    return zzaiVar;
                }
                if (query.getLong(0) == j) {
                    zzaiVar.zzb = query.getLong(1);
                    zzaiVar.zza = query.getLong(2);
                    zzaiVar.zzc = query.getLong(3);
                    zzaiVar.zzd = query.getLong(4);
                    zzaiVar.zze = query.getLong(5);
                }
                if (z) {
                    zzaiVar.zzb += j2;
                }
                if (z2) {
                    zzaiVar.zza += j2;
                }
                if (z3) {
                    zzaiVar.zzc += j2;
                }
                if (z4) {
                    zzaiVar.zzd += j2;
                }
                if (z5) {
                    zzaiVar.zze += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaiVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaiVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaiVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaiVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaiVar.zze));
                zzh2.update("apps", contentValues, "app_id=?", strArr);
                if (query != null) {
                    query.close();
                }
                return zzaiVar;
            } catch (SQLiteException e) {
                e = e;
                cursor = query;
                try {
                    this.zzt.zzaA().zzd().zzc("Error updating daily counts. appId", zzet.zzn(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzaiVar;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaq zzn(String str, String str2) {
        Cursor cursor;
        Boolean bool;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            cursor = zzh().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    long j = cursor.getLong(0);
                    long j2 = cursor.getLong(1);
                    long j3 = cursor.getLong(2);
                    long j4 = cursor.isNull(3) ? 0L : cursor.getLong(3);
                    Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
                    Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
                    Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
                    if (cursor.isNull(7)) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(cursor.getLong(7) == 1);
                    }
                    zzaq zzaqVar = new zzaq(str, str2, j, j2, cursor.isNull(8) ? 0L : cursor.getLong(8), j3, j4, valueOf, valueOf2, valueOf3, bool);
                    if (cursor.moveToNext()) {
                        this.zzt.zzaA().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzet.zzn(str));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzaqVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzaA().zzd().zzd("Error querying events. appId", zzet.zzn(str), this.zzt.zzj().zzd(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00aa: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:31:0x00aa */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzlm zzp(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzh().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    long j = cursor.getLong(0);
                    Object zzq = zzq(cursor, 1);
                    if (zzq == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    zzlm zzlmVar = new zzlm(str, cursor.getString(2), str2, j, zzq);
                    if (cursor.moveToNext()) {
                        this.zzt.zzaA().zzd().zzb("Got multiple records for user property, expected one. appId", zzet.zzn(str));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzlmVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzaA().zzd().zzd("Error querying user property. appId", zzet.zzn(str), this.zzt.zzj().zzf(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    final Object zzq(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.zzt.zzaA().zzd().zza("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        this.zzt.zzaA().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    this.zzt.zzaA().zzd().zza("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzr() {
        SQLiteException e;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = zzh().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzaA().zzd().zzb("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                cursor2 = cursor;
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0096, code lost:
        r3 = r43.zzt.zzaA().zzd();
        r43.zzt.zzf();
        r3.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzt(String str, String[] strArr) {
        Cursor cursor;
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase zzh2 = zzh();
            String[] strArr2 = {"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
            this.zzt.zzf();
            int i = 4;
            Cursor query = zzh2.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
            try {
                if (!query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    this.zzt.zzf();
                    if (size >= 1000) {
                        break;
                    }
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    String string3 = query.getString(2);
                    Object zzq = zzq(query, 3);
                    arrayList.add(new zzac(string, string2, new zzlk(string3, query.getLong(10), zzq, string2), query.getLong(8), query.getInt(i) != 0, query.getString(5), (zzau) this.zzf.zzu().zzi(query.getBlob(7), zzau.CREATOR), query.getLong(6), (zzau) this.zzf.zzu().zzi(query.getBlob(9), zzau.CREATOR), query.getLong(11), (zzau) this.zzf.zzu().zzi(query.getBlob(12), zzau.CREATOR)));
                    if (!query.moveToNext()) {
                        break;
                    }
                    i = 4;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = query;
                try {
                    this.zzt.zzaA().zzd().zzb("Error querying conditional user property value", e);
                    List emptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzt.zzf();
                cursor = zzh().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursor.getLong(2);
                    Object zzq = zzq(cursor, 3);
                    if (zzq == null) {
                        this.zzt.zzaA().zzd().zzb("Read invalid user property value, ignoring it. appId", zzet.zzn(str));
                    } else {
                        arrayList.add(new zzlm(str, str2, string, j, zzq));
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Error querying user properties. appId", zzet.zzn(str), e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
        r0 = r20.zzt.zzaA().zzd();
        r20.zzt.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzv(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        ArrayList arrayList;
        Cursor query;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList2 = new ArrayList();
        try {
            try {
                arrayList = new ArrayList(3);
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
        } catch (SQLiteException e) {
            e = e;
        }
        try {
            arrayList.add(str);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (TextUtils.isEmpty(str2)) {
                str4 = str2;
            } else {
                str4 = str2;
                try {
                    arrayList.add(str4);
                    sb.append(" and origin=?");
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = null;
                    try {
                        this.zzt.zzaA().zzd().zzd("(2)Error querying user properties", zzet.zzn(str), str4, e);
                        List emptyList = Collections.emptyList();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return emptyList;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(str3 + WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD);
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            String sb2 = sb.toString();
            this.zzt.zzf();
            query = zzh().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2, strArr, null, null, "rowid", "1001");
        } catch (SQLiteException e3) {
            e = e3;
            str4 = str2;
            cursor = null;
            this.zzt.zzaA().zzd().zzd("(2)Error querying user properties", zzet.zzn(str), str4, e);
            List emptyList2 = Collections.emptyList();
            if (cursor != null) {
            }
            return emptyList2;
        }
        try {
            if (!query.moveToFirst()) {
                if (query != null) {
                    query.close();
                }
                return arrayList2;
            }
            while (true) {
                int size = arrayList2.size();
                this.zzt.zzf();
                if (size < 1000) {
                    String string = query.getString(0);
                    long j = query.getLong(1);
                    Object zzq = zzq(query, 2);
                    str4 = query.getString(3);
                    if (zzq == null) {
                        this.zzt.zzaA().zzd().zzd("(2)Read invalid user property value, ignoring it", zzet.zzn(str), str4, str3);
                    } else {
                        arrayList2.add(new zzlm(str, str4, string, j, zzq));
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (query != null) {
                query.close();
            }
            return arrayList2;
        } catch (SQLiteException e4) {
            e = e4;
            cursor = query;
            this.zzt.zzaA().zzd().zzd("(2)Error querying user properties", zzet.zzn(str), str4, e);
            List emptyList22 = Collections.emptyList();
            if (cursor != null) {
            }
            return emptyList22;
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzZ("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.zzt.zzaA().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzt.zzf();
            if (abs > ((Long) zzeg.zzy.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    String valueOf = String.valueOf(this.zzt.zzax().currentTimeMillis());
                    this.zzt.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzt.zzaA().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
