package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public abstract class zzdc {
    public static final /* synthetic */ int zzd = 0;
    @Nullable
    private static volatile zzda zze = null;
    private static volatile boolean zzf = false;
    final zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;
    private static final Object zza = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzde zzh = new zzde(zzcu.zza, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z, zzdb zzdbVar) {
        if (zzczVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzb = zzczVar;
        this.zzc = str;
        this.zzj = obj;
        this.zzm = true;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zza;
            synchronized (obj) {
                if (zze == null) {
                    synchronized (obj) {
                        zzda zzdaVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzdaVar == null || zzdaVar.zza() != context) {
                            zzcg.zzd();
                            zzdd.zzc();
                            zzco.zze();
                            zze = new zzcd(context, zzdn.zza(new zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                                @Override // com.google.android.gms.internal.auth.zzdj
                                public final Object zza() {
                                    Context context2 = context;
                                    int i = zzdc.zzd;
                                    return zzcp.zza(context2);
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3 A[Catch: all -> 0x00df, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:24:0x0066, B:26:0x0070, B:42:0x00a5, B:44:0x00b5, B:46:0x00cb, B:47:0x00ce, B:48:0x00d2, B:30:0x0079, B:32:0x007f, B:36:0x0095, B:38:0x009b, B:41:0x00a3, B:35:0x0091, B:22:0x0056, B:49:0x00d7, B:50:0x00dc, B:51:0x00dd), top: B:58:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        zzcl zza2;
        String str;
        Object zzb;
        if (this.zzm || this.zzc != null) {
            int i = zzi.get();
            if (this.zzk < i) {
                synchronized (this) {
                    if (this.zzk < i) {
                        zzda zzdaVar = zze;
                        if (zzdaVar != null) {
                            zzcz zzczVar = this.zzb;
                            boolean z = zzczVar.zzf;
                            if (zzczVar.zzb != null) {
                                if (zzcq.zza(zzdaVar.zza(), this.zzb.zzb)) {
                                    boolean z2 = this.zzb.zzh;
                                    zza2 = zzcg.zza(zzdaVar.zza().getContentResolver(), this.zzb.zzb, zzcs.zza);
                                } else {
                                    zza2 = null;
                                }
                            } else {
                                Context zza3 = zzdaVar.zza();
                                String str2 = this.zzb.zza;
                                zza2 = zzdd.zza(zza3, null, zzcs.zza);
                            }
                            Object zza4 = (zza2 == null || (zzb = zza2.zzb(zzc())) == null) ? null : zza(zzb);
                            if (zza4 == null) {
                                zzcz zzczVar2 = this.zzb;
                                if (!zzczVar2.zze) {
                                    zzdg zzdgVar = zzczVar2.zzi;
                                    zzco zza5 = zzco.zza(zzdaVar.zza());
                                    zzcz zzczVar3 = this.zzb;
                                    if (zzczVar3.zze) {
                                        str = null;
                                    } else {
                                        String str3 = zzczVar3.zzc;
                                        str = this.zzc;
                                    }
                                    String zzb2 = zza5.zzb(str);
                                    if (zzb2 != null) {
                                        zza4 = zza(zzb2);
                                        if (zza4 == null) {
                                            zza4 = this.zzj;
                                        }
                                    }
                                }
                                zza4 = null;
                                if (zza4 == null) {
                                }
                            }
                            zzdh zzdhVar = (zzdh) zzdaVar.zzb().zza();
                            if (zzdhVar.zzb()) {
                                zzcz zzczVar4 = this.zzb;
                                Uri uri = zzczVar4.zzb;
                                String str4 = zzczVar4.zza;
                                String zza6 = ((zzci) zzdhVar.zza()).zza(uri, null, zzczVar4.zzd, this.zzc);
                                zza4 = zza6 == null ? this.zzj : zza(zza6);
                            }
                            this.zzl = zza4;
                            this.zzk = i;
                        } else {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                    }
                }
            }
            return this.zzl;
        }
        throw new NullPointerException("flagName must not be null");
    }

    public final String zzc() {
        String str = this.zzb.zzd;
        return this.zzc;
    }
}
