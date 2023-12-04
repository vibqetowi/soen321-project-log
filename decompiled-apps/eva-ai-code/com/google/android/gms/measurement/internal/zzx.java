package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzoy;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzx extends zzy {
    final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzek zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzaa zzaaVar, String str, int i, com.google.android.gms.internal.measurement.zzek zzekVar) {
        super(str, i);
        this.zza = zzaaVar;
        this.zzh = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzy
    public final int zza() {
        return this.zzh.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzb() {
        return this.zzh.zzo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzc() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0406 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0407  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(Long l, Long l2, com.google.android.gms.internal.measurement.zzft zzftVar, long j, zzaq zzaqVar, boolean z) {
        Boolean zzi;
        zzoy.zzc();
        boolean zzs = this.zza.zzt.zzf().zzs(this.zzb, zzeg.zzY);
        long j2 = this.zzh.zzn() ? zzaqVar.zze : j;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        Boolean bool = null;
        if (Log.isLoggable(this.zza.zzt.zzaA().zzr(), 2)) {
            this.zza.zzt.zzaA().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null, this.zza.zzt.zzj().zzd(this.zzh.zzg()));
            this.zza.zzt.zzaA().zzj().zzb("Filter definition", this.zza.zzf.zzu().zzp(this.zzh));
        }
        if (!this.zzh.zzp() || this.zzh.zzb() > 256) {
            this.zza.zzt.zzaA().zzk().zzc("Invalid event filter ID. appId, id", zzet.zzn(this.zzb), String.valueOf(this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null));
            return false;
        }
        Object[] objArr = (this.zzh.zzk() || this.zzh.zzm() || this.zzh.zzn()) ? 1 : null;
        if (!z || objArr != null) {
            com.google.android.gms.internal.measurement.zzek zzekVar = this.zzh;
            String zzh = zzftVar.zzh();
            if (zzekVar.zzo()) {
                Boolean zzh2 = zzh(j2, zzekVar.zzf());
                if (zzh2 != null) {
                    if (!zzh2.booleanValue()) {
                        bool = false;
                    }
                }
                this.zza.zzt.zzaA().zzj().zzb("Event filter result", bool != null ? AbstractJsonLexerKt.NULL : bool);
                if (bool != null) {
                    return false;
                }
                this.zzd = true;
                if (bool.booleanValue()) {
                    this.zze = true;
                    if (objArr != null && zzftVar.zzu()) {
                        Long valueOf = Long.valueOf(zzftVar.zzd());
                        if (this.zzh.zzm()) {
                            if (zzs && this.zzh.zzo()) {
                                valueOf = l;
                            }
                            this.zzg = valueOf;
                        } else {
                            if (zzs && this.zzh.zzo()) {
                                valueOf = l2;
                            }
                            this.zzf = valueOf;
                        }
                    }
                    return true;
                }
                return true;
            }
            HashSet hashSet = new HashSet();
            Iterator it = zzekVar.zzh().iterator();
            while (true) {
                if (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzem zzemVar = (com.google.android.gms.internal.measurement.zzem) it.next();
                    if (!zzemVar.zze().isEmpty()) {
                        hashSet.add(zzemVar.zze());
                    } else {
                        this.zza.zzt.zzaA().zzk().zzb("null or empty param name in filter. event", this.zza.zzt.zzj().zzd(zzh));
                        break;
                    }
                } else {
                    ArrayMap arrayMap = new ArrayMap();
                    Iterator it2 = zzftVar.zzi().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                            if (hashSet.contains(zzfxVar.zzg())) {
                                if (zzfxVar.zzw()) {
                                    arrayMap.put(zzfxVar.zzg(), zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                                } else if (zzfxVar.zzu()) {
                                    arrayMap.put(zzfxVar.zzg(), zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                                } else if (zzfxVar.zzy()) {
                                    arrayMap.put(zzfxVar.zzg(), zzfxVar.zzh());
                                } else {
                                    this.zza.zzt.zzaA().zzk().zzc("Unknown value for param. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zzfxVar.zzg()));
                                    break;
                                }
                            }
                        } else {
                            Iterator it3 = zzekVar.zzh().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzem zzemVar2 = (com.google.android.gms.internal.measurement.zzem) it3.next();
                                    boolean z2 = zzemVar2.zzh() && zzemVar2.zzg();
                                    String zze = zzemVar2.zze();
                                    if (!zze.isEmpty()) {
                                        Object obj = arrayMap.get(zze);
                                        if (obj instanceof Long) {
                                            if (zzemVar2.zzi()) {
                                                Boolean zzh3 = zzh(((Long) obj).longValue(), zzemVar2.zzc());
                                                if (zzh3 == null) {
                                                    break;
                                                } else if (zzh3.booleanValue() == z2) {
                                                    bool = false;
                                                    break;
                                                }
                                            } else {
                                                this.zza.zzt.zzaA().zzk().zzc("No number filter for long param. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                                break;
                                            }
                                        } else if (obj instanceof Double) {
                                            if (zzemVar2.zzi()) {
                                                Boolean zzg = zzg(((Double) obj).doubleValue(), zzemVar2.zzc());
                                                if (zzg == null) {
                                                    break;
                                                } else if (zzg.booleanValue() == z2) {
                                                    bool = false;
                                                    break;
                                                }
                                            } else {
                                                this.zza.zzt.zzaA().zzk().zzc("No number filter for double param. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                                break;
                                            }
                                        } else if (obj instanceof String) {
                                            if (zzemVar2.zzk()) {
                                                zzi = zzf((String) obj, zzemVar2.zzd(), this.zza.zzt.zzaA());
                                            } else if (zzemVar2.zzi()) {
                                                String str = (String) obj;
                                                if (zzlj.zzy(str)) {
                                                    zzi = zzi(str, zzemVar2.zzc());
                                                } else {
                                                    this.zza.zzt.zzaA().zzk().zzc("Invalid param value for number filter. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                                    break;
                                                }
                                            } else {
                                                this.zza.zzt.zzaA().zzk().zzc("No filter for String param. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                                break;
                                            }
                                            if (zzi == null) {
                                                break;
                                            } else if (zzi.booleanValue() == z2) {
                                                bool = false;
                                                break;
                                            }
                                        } else if (obj == null) {
                                            this.zza.zzt.zzaA().zzj().zzc("Missing param for filter. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                            bool = false;
                                        } else {
                                            this.zza.zzt.zzaA().zzk().zzc("Unknown param type. event, param", this.zza.zzt.zzj().zzd(zzh), this.zza.zzt.zzj().zze(zze));
                                        }
                                    } else {
                                        this.zza.zzt.zzaA().zzk().zzb("Event has empty param name. event", this.zza.zzt.zzj().zzd(zzh));
                                        break;
                                    }
                                } else {
                                    bool = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            this.zza.zzt.zzaA().zzj().zzb("Event filter result", bool != null ? AbstractJsonLexerKt.NULL : bool);
            if (bool != null) {
            }
        } else {
            this.zza.zzt.zzaA().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null);
            return true;
        }
    }
}
