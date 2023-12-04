package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzw {
    final /* synthetic */ zzaa zza;
    private com.google.android.gms.internal.measurement.zzft zzb;
    private Long zzc;
    private long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzw(zzaa zzaaVar, zzv zzvVar) {
        this.zza = zzaaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
        if (r12 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fc, code lost:
        if (r12 == null) goto L51;
     */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01e2: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:69:0x01e2 */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.measurement.zzft zza(String str, com.google.android.gms.internal.measurement.zzft zzftVar) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Pair pair;
        String zzh = zzftVar.zzh();
        List zzi = zzftVar.zzi();
        this.zza.zzf.zzu();
        Long l = (Long) zzlj.zzD(zzftVar, "_eid");
        if (l != null) {
            if (zzh.equals("_ep")) {
                Preconditions.checkNotNull(l);
                this.zza.zzf.zzu();
                String str2 = (String) zzlj.zzD(zzftVar, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.zza.zzt.zzaA().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l.longValue() != this.zzc.longValue()) {
                    zzak zzh2 = this.zza.zzf.zzh();
                    zzh2.zzg();
                    zzh2.zzW();
                    try {
                        try {
                            cursor2 = zzh2.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                            } catch (SQLiteException e) {
                                e = e;
                                zzh2.zzt.zzaA().zzd().zzb("Error selecting main event", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                    if (cursor2.moveToFirst()) {
                        try {
                            pair = Pair.create((com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzlj.zzm(com.google.android.gms.internal.measurement.zzft.zze(), cursor2.getBlob(0))).zzaD(), Long.valueOf(cursor2.getLong(1)));
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                        } catch (IOException e3) {
                            zzh2.zzt.zzaA().zzd().zzd("Failed to merge main event. appId, eventId", zzet.zzn(str), l, e3);
                        }
                        if (pair != null) {
                        }
                        this.zza.zzt.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                    zzh2.zzt.zzaA().zzj().zza("Main event not found");
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    pair = null;
                    if (pair != null || pair.first == null) {
                        this.zza.zzt.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                    this.zzb = (com.google.android.gms.internal.measurement.zzft) pair.first;
                    this.zzd = ((Long) pair.second).longValue();
                    this.zza.zzf.zzu();
                    this.zzc = (Long) zzlj.zzD(this.zzb, "_eid");
                }
                long j = this.zzd - 1;
                this.zzd = j;
                if (j <= 0) {
                    zzak zzh3 = this.zza.zzf.zzh();
                    zzh3.zzg();
                    zzh3.zzt.zzaA().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzh3.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        zzh3.zzt.zzaA().zzd().zzb("Error clearing complex main event", e4);
                    }
                } else {
                    this.zza.zzf.zzh().zzJ(str, l, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar : this.zzb.zzi()) {
                    this.zza.zzf.zzu();
                    if (zzlj.zzC(zzftVar, zzfxVar.zzg()) == null) {
                        arrayList.add(zzfxVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzt.zzaA().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(zzi);
                    zzi = arrayList;
                }
                zzh = str2;
            } else {
                this.zzc = l;
                this.zzb = zzftVar;
                this.zza.zzf.zzu();
                Object zzD = zzlj.zzD(zzftVar, "_epc");
                long longValue = ((Long) (zzD != null ? zzD : 0L)).longValue();
                this.zzd = longValue;
                if (longValue <= 0) {
                    this.zza.zzt.zzaA().zzh().zzb("Complex event with zero extra param count. eventName", zzh);
                } else {
                    this.zza.zzf.zzh().zzJ(str, (Long) Preconditions.checkNotNull(l), this.zzd, zzftVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzftVar.zzbB();
        zzfsVar.zzi(zzh);
        zzfsVar.zzg();
        zzfsVar.zzd(zzi);
        return (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD();
    }
}
