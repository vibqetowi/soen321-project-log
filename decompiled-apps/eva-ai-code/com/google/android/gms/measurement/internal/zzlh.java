package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzlh implements zzgy {
    private static volatile zzlh zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzir zzD;
    private String zzE;
    long zza;
    private final zzfu zzc;
    private final zzez zzd;
    private zzak zze;
    private zzfb zzf;
    private zzks zzg;
    private zzaa zzh;
    private final zzlj zzi;
    private zzip zzj;
    private zzkb zzk;
    private final zzkw zzl;
    private zzfl zzm;
    private final zzgd zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzlo zzF = new zzlc(this);

    zzlh(zzli zzliVar, zzgd zzgdVar) {
        Preconditions.checkNotNull(zzliVar);
        this.zzn = zzgd.zzp(zzliVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzkw(this);
        zzlj zzljVar = new zzlj(this);
        zzljVar.zzX();
        this.zzi = zzljVar;
        zzez zzezVar = new zzez(this);
        zzezVar.zzX();
        this.zzd = zzezVar;
        zzfu zzfuVar = new zzfu(this);
        zzfuVar.zzX();
        this.zzc = zzfuVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaB().zzp(new zzkx(this, zzliVar));
    }

    static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i, String str) {
        List zzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < zzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj("_err");
        zze.zzi(Long.valueOf(i).longValue());
        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        zzfsVar.zzf((com.google.android.gms.internal.measurement.zzfx) zze.zzaD());
        zzfsVar.zzf((com.google.android.gms.internal.measurement.zzfx) zze2.zzaD());
    }

    static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        List zzp = zzfsVar.zzp();
        for (int i = 0; i < zzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i)).zzg())) {
                zzfsVar.zzh(i);
                return;
            }
        }
    }

    private final zzq zzac(String str) {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzj = zzakVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzy())) {
            zzaA().zzc().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean zzad = zzad(zzj);
        if (zzad == null || zzad.booleanValue()) {
            String zzA = zzj.zzA();
            String zzy = zzj.zzy();
            long zzb2 = zzj.zzb();
            String zzx = zzj.zzx();
            long zzm = zzj.zzm();
            long zzj2 = zzj.zzj();
            boolean zzan = zzj.zzan();
            String zzz = zzj.zzz();
            zzj.zza();
            return new zzq(str, zzA, zzy, zzb2, zzx, zzm, zzj2, (String) null, zzan, false, zzz, 0L, 0L, 0, zzj.zzam(), false, zzj.zzt(), zzj.zzs(), zzj.zzk(), zzj.zzE(), (String) null, zzq(str).zzi(), "", (String) null, zzj.zzap(), zzj.zzr());
        }
        zzaA().zzd().zzb("App version does not match; dropping. appId", zzet.zzn(str));
        return null;
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() == -2147483648L) {
                String str = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzv(), 0).versionName;
                String zzy = zzhVar.zzy();
                if (zzy != null && zzy.equals(str)) {
                    return true;
                }
            } else {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzv(), 0).versionCode) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaB().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzaA().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzaA().zzj().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzq;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j, boolean z) {
        zzlm zzlmVar;
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        String str = true != z ? "_lte" : "_se";
        zzlm zzp = zzakVar.zzp(zzgcVar.zzaq(), str);
        if (zzp == null || zzp.zze == null) {
            zzlmVar = new zzlm(zzgcVar.zzaq(), "auto", str, zzax().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzlmVar = new zzlm(zzgcVar.zzaq(), "auto", str, zzax().currentTimeMillis(), Long.valueOf(((Long) zzp.zze).longValue() + j));
        }
        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzd.zzf(str);
        zzd.zzg(zzax().currentTimeMillis());
        zzd.zze(((Long) zzlmVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaD();
        int zza = zzlj.zza(zzgcVar, str);
        if (zza < 0) {
            zzgcVar.zzm(zzgmVar);
        } else {
            zzgcVar.zzan(zza, zzgmVar);
        }
        if (j > 0) {
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            zzakVar2.zzL(zzlmVar);
            zzaA().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzlmVar.zze);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzag() {
        long max;
        long j;
        zzaB().zzg();
        zzB();
        if (this.zza > 0) {
            long abs = 3600000 - Math.abs(zzax().elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzaA().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzl().zzc();
                zzks zzksVar = this.zzg;
                zzal(zzksVar);
                zzksVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzai()) {
            zzaA().zzj().zza("Nothing to upload or uploading impossible");
            zzl().zzc();
            zzks zzksVar2 = this.zzg;
            zzal(zzksVar2);
            zzksVar2.zza();
            return;
        }
        long currentTimeMillis = zzax().currentTimeMillis();
        zzg();
        long max2 = Math.max(0L, ((Long) zzeg.zzA.zza(null)).longValue());
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        boolean z = true;
        if (!zzakVar.zzH()) {
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            if (!zzakVar2.zzG()) {
                z = false;
            }
        }
        if (z) {
            String zzl = zzg().zzl();
            if (TextUtils.isEmpty(zzl) || ".none.".equals(zzl)) {
                zzg();
                max = Math.max(0L, ((Long) zzeg.zzu.zza(null)).longValue());
            } else {
                zzg();
                max = Math.max(0L, ((Long) zzeg.zzv.zza(null)).longValue());
            }
        } else {
            zzg();
            max = Math.max(0L, ((Long) zzeg.zzt.zza(null)).longValue());
        }
        long zza = this.zzk.zzc.zza();
        long zza2 = this.zzk.zzd.zza();
        zzak zzakVar3 = this.zze;
        zzal(zzakVar3);
        boolean z2 = z;
        long zzd = zzakVar3.zzd();
        zzak zzakVar4 = this.zze;
        zzal(zzakVar4);
        long max3 = Math.max(zzd, zzakVar4.zze());
        if (max3 != 0) {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            j = abs2 + max2;
            long max4 = Math.max(abs3, abs4);
            if (z2 && max4 > 0) {
                j = Math.min(abs2, max4) + max;
            }
            zzlj zzljVar = this.zzi;
            zzal(zzljVar);
            if (!zzljVar.zzx(max4, max)) {
                j = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i = 0;
                while (true) {
                    zzg();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzeg.zzC.zza(null)).intValue()))) {
                        break;
                    }
                    zzg();
                    j += Math.max(0L, ((Long) zzeg.zzB.zza(null)).longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    }
                    i++;
                }
            }
            if (j == 0) {
                zzez zzezVar = this.zzd;
                zzal(zzezVar);
                if (zzezVar.zza()) {
                    long zza3 = this.zzk.zzb.zza();
                    zzg();
                    long max5 = Math.max(0L, ((Long) zzeg.zzr.zza(null)).longValue());
                    zzlj zzljVar2 = this.zzi;
                    zzal(zzljVar2);
                    if (!zzljVar2.zzx(zza3, max5)) {
                        j = Math.max(j, zza3 + max5);
                    }
                    zzl().zzc();
                    long currentTimeMillis2 = j - zzax().currentTimeMillis();
                    if (currentTimeMillis2 <= 0) {
                        zzg();
                        currentTimeMillis2 = Math.max(0L, ((Long) zzeg.zzw.zza(null)).longValue());
                        this.zzk.zzc.zzb(zzax().currentTimeMillis());
                    }
                    zzaA().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
                    zzks zzksVar3 = this.zzg;
                    zzal(zzksVar3);
                    zzksVar3.zzd(currentTimeMillis2);
                    return;
                }
                zzaA().zzj().zza("No network");
                zzl().zzb();
                zzks zzksVar4 = this.zzg;
                zzal(zzksVar4);
                zzksVar4.zza();
                return;
            }
            zzaA().zzj().zza("Next upload time is 0");
            zzl().zzc();
            zzks zzksVar5 = this.zzg;
            zzal(zzksVar5);
            zzksVar5.zza();
            return;
        }
        j = 0;
        if (j == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x0b37, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.zzag.zzA() + r8)) goto L384;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0448 A[Catch: all -> 0x0ccb, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048a A[Catch: all -> 0x0ccb, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07d8 A[Catch: all -> 0x0ccb, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0821 A[Catch: all -> 0x0ccb, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0844 A[Catch: all -> 0x0ccb, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08c5 A[Catch: all -> 0x0ccb, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x08f1 A[Catch: all -> 0x0ccb, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b27 A[Catch: all -> 0x0ccb, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0bae A[Catch: all -> 0x0ccb, TRY_LEAVE, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0bca A[Catch: SQLiteException -> 0x0be2, all -> 0x0ccb, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0be2, blocks: (B:360:0x0bbb, B:362:0x0bca), top: B:397:0x0bbb, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0383 A[Catch: all -> 0x0ccb, TryCatch #3 {all -> 0x0ccb, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ef, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x039a, B:107:0x03bd, B:104:0x03ac, B:129:0x043c, B:131:0x0448, B:134:0x045d, B:136:0x046e, B:138:0x047a, B:153:0x04db, B:141:0x048a, B:143:0x0496, B:146:0x04ab, B:148:0x04bc, B:150:0x04c8, B:111:0x03c5, B:113:0x03d1, B:115:0x03dd, B:127:0x0422, B:119:0x03fa, B:122:0x040c, B:124:0x0412, B:126:0x041c, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0507, B:159:0x0515, B:161:0x0520, B:172:0x0552, B:162:0x0528, B:164:0x0533, B:166:0x0539, B:169:0x0545, B:171:0x054d, B:173:0x0555, B:174:0x0561, B:177:0x0569, B:179:0x057b, B:180:0x0587, B:182:0x058f, B:186:0x05b4, B:188:0x05d9, B:190:0x05ea, B:192:0x05f0, B:194:0x05fc, B:195:0x062d, B:197:0x0633, B:199:0x0641, B:200:0x0645, B:201:0x0648, B:202:0x064b, B:203:0x0659, B:205:0x065f, B:207:0x066f, B:208:0x0676, B:210:0x0682, B:211:0x0689, B:212:0x068c, B:214:0x06cc, B:215:0x06df, B:217:0x06e5, B:220:0x06ff, B:222:0x071a, B:224:0x0733, B:226:0x0738, B:228:0x073c, B:230:0x0740, B:232:0x074a, B:233:0x0754, B:235:0x0758, B:237:0x075e, B:238:0x076c, B:239:0x0775, B:307:0x09ca, B:241:0x0781, B:243:0x0798, B:249:0x07b4, B:251:0x07d8, B:252:0x07e0, B:254:0x07e6, B:256:0x07f8, B:263:0x0821, B:264:0x0844, B:266:0x0850, B:268:0x0865, B:270:0x08a6, B:274:0x08be, B:276:0x08c5, B:278:0x08d4, B:280:0x08d8, B:282:0x08dc, B:284:0x08e0, B:285:0x08ec, B:286:0x08f1, B:288:0x08f7, B:290:0x0913, B:291:0x0918, B:306:0x09c7, B:292:0x0932, B:294:0x093a, B:298:0x0961, B:300:0x098f, B:301:0x0999, B:302:0x09ab, B:304:0x09b7, B:295:0x0947, B:261:0x080c, B:247:0x079f, B:308:0x09d5, B:310:0x09e2, B:311:0x09e8, B:312:0x09f0, B:314:0x09f6, B:316:0x0a0c, B:318:0x0a1d, B:338:0x0a91, B:340:0x0a97, B:342:0x0aaf, B:345:0x0ab6, B:350:0x0ae5, B:352:0x0b27, B:355:0x0b5c, B:356:0x0b60, B:357:0x0b6b, B:359:0x0bae, B:360:0x0bbb, B:362:0x0bca, B:366:0x0be4, B:368:0x0bfd, B:354:0x0b39, B:346:0x0abe, B:348:0x0aca, B:349:0x0ace, B:369:0x0c15, B:370:0x0c2d, B:373:0x0c35, B:374:0x0c3a, B:375:0x0c4a, B:377:0x0c64, B:378:0x0c7f, B:379:0x0c88, B:384:0x0ca7, B:383:0x0c94, B:319:0x0a35, B:321:0x0a3b, B:323:0x0a45, B:325:0x0a4c, B:331:0x0a5c, B:333:0x0a63, B:335:0x0a82, B:337:0x0a89, B:336:0x0a86, B:332:0x0a60, B:324:0x0a49, B:183:0x0594, B:185:0x059a, B:387:0x0cb9), top: B:399:0x000e, inners: #0, #1, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzah(String str, long j) {
        int i;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        zzak zzakVar;
        com.google.android.gms.internal.measurement.zzgd zzgdVar;
        long currentTimeMillis;
        long zzk;
        ContentValues contentValues;
        long parseLong;
        int zzc;
        long j2;
        SecureRandom secureRandom;
        Long l;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        HashMap hashMap;
        ArrayList arrayList;
        long zzr;
        HashMap hashMap2;
        ArrayList arrayList2;
        com.google.android.gms.internal.measurement.zzgc zzgcVar3;
        String str2;
        int i2;
        int i3;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        String str3;
        com.google.android.gms.internal.measurement.zzgc zzgcVar4;
        String str4;
        com.google.android.gms.internal.measurement.zzgc zzgcVar5;
        String str5;
        int i4;
        String str6 = "_npa";
        String str7 = "_ai";
        zzak zzakVar2 = this.zze;
        zzal(zzakVar2);
        zzakVar2.zzw();
        try {
            zzle zzleVar = new zzle(this, null);
            zzak zzakVar3 = this.zze;
            zzal(zzakVar3);
            zzakVar3.zzU(null, j, this.zzA, zzleVar);
            List list = zzleVar.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgc zzgcVar6 = (com.google.android.gms.internal.measurement.zzgc) zzleVar.zza.zzbB();
                zzgcVar6.zzr();
                com.google.android.gms.internal.measurement.zzfs zzfsVar2 = null;
                com.google.android.gms.internal.measurement.zzfs zzfsVar3 = null;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = -1;
                int i9 = -1;
                while (true) {
                    String str8 = "_fr";
                    String str9 = "_et";
                    i = i7;
                    int i10 = i8;
                    com.google.android.gms.internal.measurement.zzfs zzfsVar4 = zzfsVar3;
                    if (i5 >= zzleVar.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfs zzfsVar5 = (com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzft) zzleVar.zzc.get(i5)).zzbB();
                    zzfu zzfuVar = this.zzc;
                    zzal(zzfuVar);
                    String str10 = str6;
                    if (zzfuVar.zzr(zzleVar.zza.zzy(), zzfsVar5.zzo())) {
                        zzaA().zzk().zzc("Dropping blocked raw event. appId", zzet.zzn(zzleVar.zza.zzy()), this.zzn.zzj().zzd(zzfsVar5.zzo()));
                        zzfu zzfuVar2 = this.zzc;
                        zzal(zzfuVar2);
                        if (!zzfuVar2.zzp(zzleVar.zza.zzy())) {
                            zzfu zzfuVar3 = this.zzc;
                            zzal(zzfuVar3);
                            if (!zzfuVar3.zzs(zzleVar.zza.zzy()) && !"_err".equals(zzfsVar5.zzo())) {
                                zzv().zzO(this.zzF, zzleVar.zza.zzy(), 11, "_ev", zzfsVar5.zzo(), 0);
                            }
                        }
                        str2 = str7;
                        i4 = i5;
                        zzfsVar = zzfsVar2;
                        i7 = i;
                        i8 = i10;
                        zzfsVar3 = zzfsVar4;
                        zzgcVar4 = zzgcVar6;
                    } else {
                        if (zzfsVar5.zzo().equals(zzhc.zza(str7))) {
                            zzfsVar5.zzi(str7);
                            zzaA().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzaA().zzr(), 5)) {
                                int i11 = 0;
                                while (i11 < zzfsVar5.zza()) {
                                    String str11 = str7;
                                    if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzfsVar5.zzn(i11).zzg()) && !zzfsVar5.zzn(i11).zzh().isEmpty() && "admob".equalsIgnoreCase(zzfsVar5.zzn(i11).zzh())) {
                                        zzaA().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i11++;
                                    str7 = str11;
                                }
                            }
                        }
                        str2 = str7;
                        zzfu zzfuVar4 = this.zzc;
                        zzal(zzfuVar4);
                        boolean zzq = zzfuVar4.zzq(zzleVar.zza.zzy(), zzfsVar5.zzo());
                        if (zzq) {
                            i2 = i5;
                            i3 = i6;
                        } else {
                            zzal(this.zzi);
                            String zzo = zzfsVar5.zzo();
                            Preconditions.checkNotEmpty(zzo);
                            i3 = i6;
                            i2 = i5;
                            if (((zzo.hashCode() == 95027 && zzo.equals("_ui")) ? (char) 0 : (char) 65535) != 0) {
                                str4 = "_fr";
                                str3 = "_et";
                                zzfsVar = zzfsVar2;
                                zzq = false;
                                zzgcVar4 = zzgcVar6;
                                if (zzq) {
                                    ArrayList arrayList3 = new ArrayList(zzfsVar5.zzp());
                                    int i12 = -1;
                                    int i13 = -1;
                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                        if ("value".equals(((com.google.android.gms.internal.measurement.zzfx) arrayList3.get(i14)).zzg())) {
                                            i12 = i14;
                                        } else if (FirebaseAnalytics.Param.CURRENCY.equals(((com.google.android.gms.internal.measurement.zzfx) arrayList3.get(i14)).zzg())) {
                                            i13 = i14;
                                        }
                                    }
                                    if (i12 != -1) {
                                        if (((com.google.android.gms.internal.measurement.zzfx) arrayList3.get(i12)).zzw() || ((com.google.android.gms.internal.measurement.zzfx) arrayList3.get(i12)).zzu()) {
                                            if (i13 != -1) {
                                                String zzh = ((com.google.android.gms.internal.measurement.zzfx) arrayList3.get(i13)).zzh();
                                                if (zzh.length() == 3) {
                                                    int i15 = 0;
                                                    while (i15 < zzh.length()) {
                                                        int codePointAt = zzh.codePointAt(i15);
                                                        if (Character.isLetter(codePointAt)) {
                                                            i15 += Character.charCount(codePointAt);
                                                        }
                                                    }
                                                }
                                            }
                                            zzaA().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                            zzfsVar5.zzh(i12);
                                            zzab(zzfsVar5, "_c");
                                            zzaa(zzfsVar5, 19, FirebaseAnalytics.Param.CURRENCY);
                                            break;
                                        }
                                        zzaA().zzl().zza("Value must be specified with a numeric type.");
                                        zzfsVar5.zzh(i12);
                                        zzab(zzfsVar5, "_c");
                                        zzaa(zzfsVar5, 18, "value");
                                    }
                                    if ("_e".equals(zzfsVar5.zzo())) {
                                        zzal(this.zzi);
                                        if (zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaD(), str4) == null) {
                                            if (zzfsVar4 != null && Math.abs(zzfsVar4.zzc() - zzfsVar5.zzc()) <= 1000) {
                                                com.google.android.gms.internal.measurement.zzfs zzfsVar6 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar4.zzav();
                                                if (zzaj(zzfsVar5, zzfsVar6)) {
                                                    zzgcVar4.zzS(i9, zzfsVar6);
                                                    i8 = i10;
                                                    zzfsVar3 = null;
                                                    zzfsVar = null;
                                                    i4 = i2;
                                                    zzleVar.zzc.set(i4, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaD());
                                                    i6 = i3 + 1;
                                                    zzgcVar4.zzk(zzfsVar5);
                                                    i7 = i;
                                                }
                                            }
                                            zzfsVar = zzfsVar5;
                                            zzfsVar3 = zzfsVar4;
                                            i8 = i3;
                                            i4 = i2;
                                            zzleVar.zzc.set(i4, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaD());
                                            i6 = i3 + 1;
                                            zzgcVar4.zzk(zzfsVar5);
                                            i7 = i;
                                        }
                                        i8 = i10;
                                        zzfsVar3 = zzfsVar4;
                                        i4 = i2;
                                        zzleVar.zzc.set(i4, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaD());
                                        i6 = i3 + 1;
                                        zzgcVar4.zzk(zzfsVar5);
                                        i7 = i;
                                    } else {
                                        if ("_vs".equals(zzfsVar5.zzo())) {
                                            zzal(this.zzi);
                                            if (zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaD(), str3) == null) {
                                                if (zzfsVar != null && Math.abs(zzfsVar.zzc() - zzfsVar5.zzc()) <= 1000) {
                                                    com.google.android.gms.internal.measurement.zzfs zzfsVar7 = (com.google.android.gms.internal.measurement.zzfs) zzfsVar.zzav();
                                                    if (zzaj(zzfsVar7, zzfsVar5)) {
                                                        zzgcVar4.zzS(i10, zzfsVar7);
                                                        i8 = i10;
                                                        zzfsVar3 = null;
                                                        zzfsVar = null;
                                                        i4 = i2;
                                                        zzleVar.zzc.set(i4, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaD());
                                                        i6 = i3 + 1;
                                                        zzgcVar4.zzk(zzfsVar5);
                                                        i7 = i;
                                                    }
                                                }
                                                i8 = i10;
                                                zzfsVar3 = zzfsVar5;
                                                i9 = i3;
                                                i4 = i2;
                                                zzleVar.zzc.set(i4, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaD());
                                                i6 = i3 + 1;
                                                zzgcVar4.zzk(zzfsVar5);
                                                i7 = i;
                                            }
                                        }
                                        i8 = i10;
                                        zzfsVar3 = zzfsVar4;
                                        i4 = i2;
                                        zzleVar.zzc.set(i4, (com.google.android.gms.internal.measurement.zzft) zzfsVar5.zzaD());
                                        i6 = i3 + 1;
                                        zzgcVar4.zzk(zzfsVar5);
                                        i7 = i;
                                    }
                                }
                                if ("_e".equals(zzfsVar5.zzo())) {
                                }
                            }
                        }
                        zzfsVar = zzfsVar2;
                        int i16 = 0;
                        boolean z = false;
                        boolean z2 = false;
                        while (true) {
                            str3 = str9;
                            if (i16 >= zzfsVar5.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfsVar5.zzn(i16).zzg())) {
                                com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zzfsVar5.zzn(i16).zzbB();
                                zzgcVar5 = zzgcVar6;
                                str5 = str8;
                                zzfwVar.zzi(1L);
                                zzfsVar5.zzk(i16, (com.google.android.gms.internal.measurement.zzfx) zzfwVar.zzaD());
                                z = true;
                            } else {
                                zzgcVar5 = zzgcVar6;
                                str5 = str8;
                                if ("_r".equals(zzfsVar5.zzn(i16).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zzfsVar5.zzn(i16).zzbB();
                                    zzfwVar2.zzi(1L);
                                    zzfsVar5.zzk(i16, (com.google.android.gms.internal.measurement.zzfx) zzfwVar2.zzaD());
                                    z2 = true;
                                }
                            }
                            i16++;
                            zzgcVar6 = zzgcVar5;
                            str9 = str3;
                            str8 = str5;
                        }
                        zzgcVar4 = zzgcVar6;
                        str4 = str8;
                        if (!z && zzq) {
                            zzaA().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfsVar5.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze.zzj("_c");
                            zze.zzi(1L);
                            zzfsVar5.zze(zze);
                        }
                        if (!z2) {
                            zzaA().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfsVar5.zzo()));
                            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze2.zzj("_r");
                            zze2.zzi(1L);
                            zzfsVar5.zze(zze2);
                        }
                        zzak zzakVar4 = this.zze;
                        zzal(zzakVar4);
                        if (zzakVar4.zzl(zza(), zzleVar.zza.zzy(), false, false, false, false, true).zze > zzg().zze(zzleVar.zza.zzy(), zzeg.zzo)) {
                            zzab(zzfsVar5, "_r");
                        } else {
                            i = 1;
                        }
                        if (zzlp.zzak(zzfsVar5.zzo()) && zzq) {
                            zzak zzakVar5 = this.zze;
                            zzal(zzakVar5);
                            if (zzakVar5.zzl(zza(), zzleVar.zza.zzy(), false, false, true, false, false).zzc > zzg().zze(zzleVar.zza.zzy(), zzeg.zzn)) {
                                zzaA().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzet.zzn(zzleVar.zza.zzy()));
                                com.google.android.gms.internal.measurement.zzfw zzfwVar3 = null;
                                boolean z3 = false;
                                int i17 = -1;
                                for (int i18 = 0; i18 < zzfsVar5.zza(); i18++) {
                                    com.google.android.gms.internal.measurement.zzfx zzn = zzfsVar5.zzn(i18);
                                    if ("_c".equals(zzn.zzg())) {
                                        zzfwVar3 = (com.google.android.gms.internal.measurement.zzfw) zzn.zzbB();
                                        i17 = i18;
                                    } else if ("_err".equals(zzn.zzg())) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    if (zzfwVar3 != null) {
                                        zzfsVar5.zzh(i17);
                                    } else {
                                        zzfwVar3 = null;
                                    }
                                }
                                if (zzfwVar3 != null) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVar4 = (com.google.android.gms.internal.measurement.zzfw) zzfwVar3.zzav();
                                    zzfwVar4.zzj("_err");
                                    zzfwVar4.zzi(10L);
                                    zzfsVar5.zzk(i17, (com.google.android.gms.internal.measurement.zzfx) zzfwVar4.zzaD());
                                } else {
                                    zzaA().zzd().zzb("Did not find conversion parameter. appId", zzet.zzn(zzleVar.zza.zzy()));
                                }
                            }
                        }
                        if (zzq) {
                        }
                        if ("_e".equals(zzfsVar5.zzo())) {
                        }
                    }
                    i5 = i4 + 1;
                    zzgcVar6 = zzgcVar4;
                    str6 = str10;
                    str7 = str2;
                    zzfsVar2 = zzfsVar;
                }
                String str12 = str6;
                com.google.android.gms.internal.measurement.zzgc zzgcVar7 = zzgcVar6;
                long j3 = 0;
                int i19 = 0;
                while (i19 < i6) {
                    com.google.android.gms.internal.measurement.zzft zze3 = zzgcVar7.zze(i19);
                    if ("_e".equals(zze3.zzh())) {
                        zzal(this.zzi);
                        if (zzlj.zzC(zze3, "_fr") != null) {
                            zzgcVar7.zzA(i19);
                            i6--;
                            i19--;
                            i19++;
                        }
                    }
                    zzal(this.zzi);
                    com.google.android.gms.internal.measurement.zzfx zzC = zzlj.zzC(zze3, "_et");
                    if (zzC != null) {
                        Long valueOf = zzC.zzw() ? Long.valueOf(zzC.zzd()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j3 += valueOf.longValue();
                        }
                    }
                    i19++;
                }
                zzaf(zzgcVar7, j3, false);
                Iterator it = zzgcVar7.zzat().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it.next()).zzh())) {
                            zzak zzakVar6 = this.zze;
                            zzal(zzakVar6);
                            zzakVar6.zzA(zzgcVar7.zzaq(), "_se");
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (zzlj.zza(zzgcVar7, "_sid") >= 0) {
                    zzaf(zzgcVar7, j3, true);
                } else {
                    int zza = zzlj.zza(zzgcVar7, "_se");
                    if (zza >= 0) {
                        zzgcVar7.zzB(zza);
                        zzaA().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzet.zzn(zzleVar.zza.zzy()));
                    }
                }
                zzlj zzljVar = this.zzi;
                zzal(zzljVar);
                zzljVar.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                zzfu zzfuVar5 = zzljVar.zzf.zzc;
                zzal(zzfuVar5);
                if (zzfuVar5.zzn(zzgcVar7.zzaq())) {
                    zzak zzakVar7 = zzljVar.zzf.zze;
                    zzal(zzakVar7);
                    zzh zzj = zzakVar7.zzj(zzgcVar7.zzaq());
                    if (zzj != null && zzj.zzam() && zzljVar.zzt.zzg().zze()) {
                        zzljVar.zzt.zzaA().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzd.zzf(str12);
                        zzd.zzg(zzljVar.zzt.zzg().zza());
                        zzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaD();
                        int i20 = 0;
                        while (true) {
                            if (i20 >= zzgcVar7.zzb()) {
                                zzgcVar7.zzm(zzgmVar);
                                break;
                            } else if (str12.equals(zzgcVar7.zzap(i20).zzf())) {
                                zzgcVar7.zzan(i20, zzgmVar);
                                break;
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                zzgcVar7.zzai(Long.MAX_VALUE);
                zzgcVar7.zzQ(Long.MIN_VALUE);
                for (int i21 = 0; i21 < zzgcVar7.zza(); i21++) {
                    com.google.android.gms.internal.measurement.zzft zze4 = zzgcVar7.zze(i21);
                    if (zze4.zzd() < zzgcVar7.zzd()) {
                        zzgcVar7.zzai(zze4.zzd());
                    }
                    if (zze4.zzd() > zzgcVar7.zzc()) {
                        zzgcVar7.zzQ(zze4.zzd());
                    }
                }
                zzgcVar7.zzz();
                zzgcVar7.zzo();
                zzaa zzaaVar = this.zzh;
                zzal(zzaaVar);
                zzgcVar7.zzf(zzaaVar.zza(zzgcVar7.zzaq(), zzgcVar7.zzat(), zzgcVar7.zzau(), Long.valueOf(zzgcVar7.zzd()), Long.valueOf(zzgcVar7.zzc())));
                if (zzg().zzw(zzleVar.zza.zzy())) {
                    HashMap hashMap3 = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    SecureRandom zzG = zzv().zzG();
                    int i22 = 0;
                    while (i22 < zzgcVar7.zza()) {
                        com.google.android.gms.internal.measurement.zzfs zzfsVar8 = (com.google.android.gms.internal.measurement.zzfs) zzgcVar7.zze(i22).zzbB();
                        if (zzfsVar8.zzo().equals("_ep")) {
                            zzal(this.zzi);
                            String str13 = (String) zzlj.zzD((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD(), "_en");
                            zzaq zzaqVar = (zzaq) hashMap3.get(str13);
                            if (zzaqVar == null) {
                                zzak zzakVar8 = this.zze;
                                zzal(zzakVar8);
                                zzaqVar = zzakVar8.zzn(zzleVar.zza.zzy(), (String) Preconditions.checkNotNull(str13));
                                if (zzaqVar != null) {
                                    hashMap3.put(str13, zzaqVar);
                                }
                            }
                            if (zzaqVar != null && zzaqVar.zzi == null) {
                                Long l2 = zzaqVar.zzj;
                                if (l2 != null && l2.longValue() > 1) {
                                    zzal(this.zzi);
                                    zzlj.zzA(zzfsVar8, "_sr", zzaqVar.zzj);
                                }
                                Boolean bool = zzaqVar.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzal(this.zzi);
                                    zzlj.zzA(zzfsVar8, "_efs", 1L);
                                }
                                arrayList4.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                            }
                            zzgcVar7.zzS(i22, zzfsVar8);
                        } else {
                            zzfu zzfuVar6 = this.zzc;
                            zzal(zzfuVar6);
                            String zzy = zzleVar.zza.zzy();
                            String zza2 = zzfuVar6.zza(zzy, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(zza2)) {
                                try {
                                    parseLong = Long.parseLong(zza2);
                                } catch (NumberFormatException e) {
                                    zzfuVar6.zzt.zzaA().zzk().zzc("Unable to parse timezone offset. appId", zzet.zzn(zzy), e);
                                }
                                long zzr2 = zzv().zzr(zzfsVar8.zzc(), parseLong);
                                com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD();
                                Long l3 = 1L;
                                long j4 = parseLong;
                                if (!TextUtils.isEmpty("_dbg")) {
                                    Iterator it2 = zzftVar.zzi().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it2.next();
                                        Iterator it3 = it2;
                                        if (!"_dbg".equals(zzfxVar.zzg())) {
                                            it2 = it3;
                                        } else if (l3.equals(Long.valueOf(zzfxVar.zzd()))) {
                                            zzc = 1;
                                        }
                                    }
                                }
                                zzfu zzfuVar7 = this.zzc;
                                zzal(zzfuVar7);
                                zzc = zzfuVar7.zzc(zzleVar.zza.zzy(), zzfsVar8.zzo());
                                if (zzc > 0) {
                                    zzaA().zzk().zzc("Sample rate must be positive. event, rate", zzfsVar8.zzo(), Integer.valueOf(zzc));
                                    arrayList4.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                                    zzgcVar7.zzS(i22, zzfsVar8);
                                } else {
                                    zzaq zzaqVar2 = (zzaq) hashMap3.get(zzfsVar8.zzo());
                                    if (zzaqVar2 == null) {
                                        zzak zzakVar9 = this.zze;
                                        zzal(zzakVar9);
                                        zzaqVar2 = zzakVar9.zzn(zzleVar.zza.zzy(), zzfsVar8.zzo());
                                        if (zzaqVar2 == null) {
                                            j2 = zzr2;
                                            zzaA().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzleVar.zza.zzy(), zzfsVar8.zzo());
                                            zzaqVar2 = new zzaq(zzleVar.zza.zzy(), zzfsVar8.zzo(), 1L, 1L, 1L, zzfsVar8.zzc(), 0L, null, null, null, null);
                                            zzal(this.zzi);
                                            Long l4 = (Long) zzlj.zzD((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD(), "_eid");
                                            Boolean valueOf2 = Boolean.valueOf(l4 == null);
                                            if (zzc != 1) {
                                                arrayList4.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                                                if (valueOf2.booleanValue() && (zzaqVar2.zzi != null || zzaqVar2.zzj != null || zzaqVar2.zzk != null)) {
                                                    hashMap3.put(zzfsVar8.zzo(), zzaqVar2.zza(null, null, null));
                                                }
                                                zzgcVar7.zzS(i22, zzfsVar8);
                                            } else {
                                                if (zzG.nextInt(zzc) == 0) {
                                                    zzal(this.zzi);
                                                    Long valueOf3 = Long.valueOf(zzc);
                                                    zzlj.zzA(zzfsVar8, "_sr", valueOf3);
                                                    arrayList4.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                                                    if (valueOf2.booleanValue()) {
                                                        zzaqVar2 = zzaqVar2.zza(null, valueOf3, null);
                                                    }
                                                    hashMap3.put(zzfsVar8.zzo(), zzaqVar2.zzb(zzfsVar8.zzc(), j2));
                                                    arrayList2 = arrayList4;
                                                    secureRandom = zzG;
                                                    zzgcVar3 = zzgcVar7;
                                                    hashMap2 = hashMap3;
                                                } else {
                                                    long j5 = j2;
                                                    secureRandom = zzG;
                                                    Long l5 = zzaqVar2.zzh;
                                                    if (l5 != null) {
                                                        zzr = l5.longValue();
                                                        hashMap = hashMap3;
                                                        arrayList = arrayList4;
                                                        l = l4;
                                                        zzgcVar2 = zzgcVar7;
                                                    } else {
                                                        l = l4;
                                                        zzgcVar2 = zzgcVar7;
                                                        hashMap = hashMap3;
                                                        arrayList = arrayList4;
                                                        zzr = zzv().zzr(zzfsVar8.zzb(), j4);
                                                    }
                                                    if (zzr != j5) {
                                                        zzal(this.zzi);
                                                        zzlj.zzA(zzfsVar8, "_efs", 1L);
                                                        zzal(this.zzi);
                                                        Long valueOf4 = Long.valueOf(zzc);
                                                        zzlj.zzA(zzfsVar8, "_sr", valueOf4);
                                                        arrayList2 = arrayList;
                                                        arrayList2.add((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD());
                                                        if (valueOf2.booleanValue()) {
                                                            zzaqVar2 = zzaqVar2.zza(null, valueOf4, true);
                                                        }
                                                        hashMap2 = hashMap;
                                                        hashMap2.put(zzfsVar8.zzo(), zzaqVar2.zzb(zzfsVar8.zzc(), j5));
                                                    } else {
                                                        hashMap2 = hashMap;
                                                        arrayList2 = arrayList;
                                                        if (valueOf2.booleanValue()) {
                                                            hashMap2.put(zzfsVar8.zzo(), zzaqVar2.zza(l, null, null));
                                                        }
                                                    }
                                                    zzgcVar3 = zzgcVar2;
                                                }
                                                zzgcVar3.zzS(i22, zzfsVar8);
                                                i22++;
                                                zzgcVar7 = zzgcVar3;
                                                hashMap3 = hashMap2;
                                                arrayList4 = arrayList2;
                                                zzG = secureRandom;
                                            }
                                        }
                                    }
                                    j2 = zzr2;
                                    zzal(this.zzi);
                                    Long l42 = (Long) zzlj.zzD((com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD(), "_eid");
                                    Boolean valueOf22 = Boolean.valueOf(l42 == null);
                                    if (zzc != 1) {
                                    }
                                }
                            }
                            parseLong = 0;
                            long zzr22 = zzv().zzr(zzfsVar8.zzc(), parseLong);
                            com.google.android.gms.internal.measurement.zzft zzftVar2 = (com.google.android.gms.internal.measurement.zzft) zzfsVar8.zzaD();
                            Long l32 = 1L;
                            long j42 = parseLong;
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            zzfu zzfuVar72 = this.zzc;
                            zzal(zzfuVar72);
                            zzc = zzfuVar72.zzc(zzleVar.zza.zzy(), zzfsVar8.zzo());
                            if (zzc > 0) {
                            }
                        }
                        arrayList2 = arrayList4;
                        secureRandom = zzG;
                        zzgcVar3 = zzgcVar7;
                        hashMap2 = hashMap3;
                        i22++;
                        zzgcVar7 = zzgcVar3;
                        hashMap3 = hashMap2;
                        arrayList4 = arrayList2;
                        zzG = secureRandom;
                    }
                    HashMap hashMap4 = hashMap3;
                    ArrayList arrayList5 = arrayList4;
                    zzgcVar = zzgcVar7;
                    if (arrayList5.size() < zzgcVar.zza()) {
                        zzgcVar.zzr();
                        zzgcVar.zzg(arrayList5);
                    }
                    for (Map.Entry entry : hashMap4.entrySet()) {
                        zzak zzakVar10 = this.zze;
                        zzal(zzakVar10);
                        zzakVar10.zzE((zzaq) entry.getValue());
                    }
                } else {
                    zzgcVar = zzgcVar7;
                }
                String zzy2 = zzleVar.zza.zzy();
                zzak zzakVar11 = this.zze;
                zzal(zzakVar11);
                zzh zzj2 = zzakVar11.zzj(zzy2);
                if (zzj2 == null) {
                    zzaA().zzd().zzb("Bundling raw events w/o app info. appId", zzet.zzn(zzleVar.zza.zzy()));
                } else if (zzgcVar.zza() > 0) {
                    long zzn2 = zzj2.zzn();
                    if (zzn2 != 0) {
                        zzgcVar.zzab(zzn2);
                    } else {
                        zzgcVar.zzv();
                    }
                    long zzp = zzj2.zzp();
                    if (zzp != 0) {
                        zzn2 = zzp;
                    }
                    if (zzn2 != 0) {
                        zzgcVar.zzac(zzn2);
                    } else {
                        zzgcVar.zzw();
                    }
                    zzj2.zzG();
                    zzgcVar.zzI((int) zzj2.zzo());
                    zzj2.zzad(zzgcVar.zzd());
                    zzj2.zzab(zzgcVar.zzc());
                    String zzu = zzj2.zzu();
                    if (zzu != null) {
                        zzgcVar.zzW(zzu);
                    } else {
                        zzgcVar.zzs();
                    }
                    zzak zzakVar12 = this.zze;
                    zzal(zzakVar12);
                    zzakVar12.zzD(zzj2);
                }
                if (zzgcVar.zza() > 0) {
                    this.zzn.zzay();
                    zzfu zzfuVar8 = this.zzc;
                    zzal(zzfuVar8);
                    com.google.android.gms.internal.measurement.zzff zze5 = zzfuVar8.zze(zzleVar.zza.zzy());
                    try {
                        try {
                            if (zze5 != null && zze5.zzu()) {
                                zzgcVar.zzK(zze5.zzc());
                                zzakVar = this.zze;
                                zzal(zzakVar);
                                zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaD();
                                zzakVar.zzg();
                                zzakVar.zzW();
                                Preconditions.checkNotNull(zzgdVar);
                                Preconditions.checkNotEmpty(zzgdVar.zzy());
                                Preconditions.checkState(zzgdVar.zzbg());
                                zzakVar.zzz();
                                currentTimeMillis = zzakVar.zzt.zzax().currentTimeMillis();
                                zzk = zzgdVar.zzk();
                                zzakVar.zzt.zzf();
                                if (zzk >= currentTimeMillis - zzag.zzA()) {
                                    long zzk2 = zzgdVar.zzk();
                                    zzakVar.zzt.zzf();
                                }
                                zzakVar.zzt.zzaA().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzet.zzn(zzgdVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                                byte[] zzbx = zzgdVar.zzbx();
                                zzlj zzljVar2 = zzakVar.zzf.zzi;
                                zzal(zzljVar2);
                                byte[] zzz = zzljVar2.zzz(zzbx);
                                zzakVar.zzt.zzaA().zzj().zzb("Saving bundle, size", Integer.valueOf(zzz.length));
                                contentValues = new ContentValues();
                                contentValues.put("app_id", zzgdVar.zzy());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                                contentValues.put("data", zzz);
                                contentValues.put("has_realtime", Integer.valueOf(i));
                                if (zzgdVar.zzbm()) {
                                    contentValues.put("retry_count", Integer.valueOf(zzgdVar.zze()));
                                }
                                if (zzakVar.zzh().insert("queue", null, contentValues) == -1) {
                                    zzakVar.zzt.zzaA().zzd().zzb("Failed to insert bundle (got -1). appId", zzet.zzn(zzgdVar.zzy()));
                                }
                            }
                            if (zzakVar.zzh().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e2) {
                            zzakVar.zzt.zzaA().zzd().zzc("Error storing bundle. appId", zzet.zzn(zzgdVar.zzy()), e2);
                        }
                        zzlj zzljVar22 = zzakVar.zzf.zzi;
                        zzal(zzljVar22);
                        byte[] zzz2 = zzljVar22.zzz(zzbx);
                        zzakVar.zzt.zzaA().zzj().zzb("Saving bundle, size", Integer.valueOf(zzz2.length));
                        contentValues = new ContentValues();
                        contentValues.put("app_id", zzgdVar.zzy());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                        contentValues.put("data", zzz2);
                        contentValues.put("has_realtime", Integer.valueOf(i));
                        if (zzgdVar.zzbm()) {
                        }
                    } catch (IOException e3) {
                        zzakVar.zzt.zzaA().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzet.zzn(zzgdVar.zzy()), e3);
                    }
                    if (zzleVar.zza.zzG().isEmpty()) {
                        zzgcVar.zzK(-1L);
                    } else {
                        zzaA().zzk().zzb("Did not find measurement config or missing version info. appId", zzet.zzn(zzleVar.zza.zzy()));
                    }
                    zzakVar = this.zze;
                    zzal(zzakVar);
                    zzgdVar = (com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaD();
                    zzakVar.zzg();
                    zzakVar.zzW();
                    Preconditions.checkNotNull(zzgdVar);
                    Preconditions.checkNotEmpty(zzgdVar.zzy());
                    Preconditions.checkState(zzgdVar.zzbg());
                    zzakVar.zzz();
                    currentTimeMillis = zzakVar.zzt.zzax().currentTimeMillis();
                    zzk = zzgdVar.zzk();
                    zzakVar.zzt.zzf();
                    if (zzk >= currentTimeMillis - zzag.zzA()) {
                    }
                    zzakVar.zzt.zzaA().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzet.zzn(zzgdVar.zzy()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                    byte[] zzbx2 = zzgdVar.zzbx();
                }
                zzak zzakVar13 = this.zze;
                zzal(zzakVar13);
                List list2 = zzleVar.zzb;
                Preconditions.checkNotNull(list2);
                zzakVar13.zzg();
                zzakVar13.zzW();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i23 = 0; i23 < list2.size(); i23++) {
                    if (i23 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) list2.get(i23)).longValue());
                }
                sb.append(")");
                int delete = zzakVar13.zzh().delete("raw_events", sb.toString(), null);
                if (delete != list2.size()) {
                    zzakVar13.zzt.zzaA().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list2.size()));
                }
                zzak zzakVar14 = this.zze;
                zzal(zzakVar14);
                try {
                    zzakVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzy2, zzy2});
                } catch (SQLiteException e4) {
                    zzakVar14.zzt.zzaA().zzd().zzc("Failed to remove unused event metadata. appId", zzet.zzn(zzy2), e4);
                }
                zzak zzakVar15 = this.zze;
                zzal(zzakVar15);
                zzakVar15.zzC();
                zzak zzakVar16 = this.zze;
                zzal(zzakVar16);
                zzakVar16.zzx();
                return true;
            }
            zzak zzakVar17 = this.zze;
            zzal(zzakVar17);
            zzakVar17.zzC();
            zzak zzakVar18 = this.zze;
            zzal(zzakVar18);
            zzakVar18.zzx();
            return false;
        } catch (Throwable th) {
            zzak zzakVar19 = this.zze;
            zzal(zzakVar19);
            zzakVar19.zzx();
            throw th;
        }
    }

    private final boolean zzai() {
        zzaB().zzg();
        zzB();
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        if (zzakVar.zzF()) {
            return true;
        }
        zzak zzakVar2 = this.zze;
        zzal(zzakVar2);
        return !TextUtils.isEmpty(zzakVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_sc");
        String zzh = zzC == null ? null : zzC.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC2 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_pc");
        String zzh2 = zzC2 != null ? zzC2.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC3 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_et");
        if (zzC3 == null || !zzC3.zzw() || zzC3.zzd() <= 0) {
            return true;
        }
        long zzd = zzC3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC4 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_et");
        if (zzC4 != null && zzC4.zzd() > 0) {
            zzd += zzC4.zzd();
        }
        zzal(this.zzi);
        zzlj.zzA(zzfsVar2, "_et", Long.valueOf(zzd));
        zzal(this.zzi);
        zzlj.zzA(zzfsVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzku zzal(zzku zzkuVar) {
        if (zzkuVar != null) {
            if (zzkuVar.zzY()) {
                return zzkuVar;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(zzkuVar.getClass()))));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static zzlh zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzlh.class) {
                if (zzb == null) {
                    zzb = new zzlh((zzli) Preconditions.checkNotNull(new zzli(context)), null);
                }
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzy(zzlh zzlhVar, zzli zzliVar) {
        zzlhVar.zzaB().zzg();
        zzlhVar.zzm = new zzfl(zzlhVar);
        zzak zzakVar = new zzak(zzlhVar);
        zzakVar.zzX();
        zzlhVar.zze = zzakVar;
        zzlhVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzlhVar.zzc));
        zzkb zzkbVar = new zzkb(zzlhVar);
        zzkbVar.zzX();
        zzlhVar.zzk = zzkbVar;
        zzaa zzaaVar = new zzaa(zzlhVar);
        zzaaVar.zzX();
        zzlhVar.zzh = zzaaVar;
        zzip zzipVar = new zzip(zzlhVar);
        zzipVar.zzX();
        zzlhVar.zzj = zzipVar;
        zzks zzksVar = new zzks(zzlhVar);
        zzksVar.zzX();
        zzlhVar.zzg = zzksVar;
        zzlhVar.zzf = new zzfb(zzlhVar);
        if (zzlhVar.zzr != zzlhVar.zzs) {
            zzlhVar.zzaA().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzlhVar.zzr), Integer.valueOf(zzlhVar.zzs));
        }
        zzlhVar.zzo = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzA() {
        zzaB().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaB().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaA().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i = allocate.getInt();
                    } else if (read != -1) {
                        zzaA().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e) {
                    zzaA().zzd().zzb("Failed to read from channel", e);
                }
            }
            int zzi = this.zzn.zzh().zzi();
            zzaB().zzg();
            if (i > zzi) {
                zzaA().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
            } else if (i < zzi) {
                FileChannel fileChannel2 = this.zzx;
                zzaB().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaA().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(zzi);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaA().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaA().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                        return;
                    } catch (IOException e2) {
                        zzaA().zzd().zzb("Failed to write to channel", e2);
                    }
                }
                zzaA().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzC(String str, com.google.android.gms.internal.measurement.zzgc zzgcVar) {
        int zza;
        int indexOf;
        zzfu zzfuVar = this.zzc;
        zzal(zzfuVar);
        Set zzk = zzfuVar.zzk(str);
        if (zzk != null) {
            zzgcVar.zzi(zzk);
        }
        zzfu zzfuVar2 = this.zzc;
        zzal(zzfuVar2);
        if (zzfuVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfu zzfuVar3 = this.zzc;
        zzal(zzfuVar3);
        if (zzfuVar3.zzy(str)) {
            if (zzg().zzs(str, zzeg.zzar)) {
                String zzas = zzgcVar.zzas();
                if (!TextUtils.isEmpty(zzas) && (indexOf = zzas.indexOf(".")) != -1) {
                    zzgcVar.zzY(zzas.substring(0, indexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfu zzfuVar4 = this.zzc;
        zzal(zzfuVar4);
        if (zzfuVar4.zzz(str) && (zza = zzlj.zza(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(zza);
        }
        zzfu zzfuVar5 = this.zzc;
        zzal(zzfuVar5);
        if (zzfuVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfu zzfuVar6 = this.zzc;
        zzal(zzfuVar6);
        if (zzfuVar6.zzu(str)) {
            zzgcVar.zzn();
            zzlg zzlgVar = (zzlg) this.zzC.get(str);
            if (zzlgVar == null || zzlgVar.zzb + zzg().zzi(str, zzeg.zzT) < zzax().elapsedRealtime()) {
                zzlgVar = new zzlg(this);
                this.zzC.put(str, zzlgVar);
            }
            zzgcVar.zzR(zzlgVar.zza);
        }
        zzfu zzfuVar7 = this.zzc;
        zzal(zzfuVar7);
        if (zzfuVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    final void zzD(zzh zzhVar) {
        zzaB().zzg();
        if (!TextUtils.isEmpty(zzhVar.zzA()) || !TextUtils.isEmpty(zzhVar.zzt())) {
            zzkw zzkwVar = this.zzl;
            Uri.Builder builder = new Uri.Builder();
            String zzA = zzhVar.zzA();
            if (TextUtils.isEmpty(zzA)) {
                zzA = zzhVar.zzt();
            }
            ArrayMap arrayMap = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) zzeg.zze.zza(null)).encodedAuthority((String) zzeg.zzf.zza(null)).path("config/app/".concat(String.valueOf(zzA))).appendQueryParameter("platform", "android");
            zzkwVar.zzt.zzf().zzh();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(79000L)).appendQueryParameter("runtime_version", "0");
            String uri = builder.build().toString();
            try {
                String str = (String) Preconditions.checkNotNull(zzhVar.zzv());
                URL url = new URL(uri);
                zzaA().zzj().zzb("Fetching remote configuration", str);
                zzfu zzfuVar = this.zzc;
                zzal(zzfuVar);
                com.google.android.gms.internal.measurement.zzff zze = zzfuVar.zze(str);
                zzfu zzfuVar2 = this.zzc;
                zzal(zzfuVar2);
                String zzh = zzfuVar2.zzh(str);
                if (zze != null) {
                    if (!TextUtils.isEmpty(zzh)) {
                        ArrayMap arrayMap2 = new ArrayMap();
                        arrayMap2.put("If-Modified-Since", zzh);
                        arrayMap = arrayMap2;
                    }
                    zzfu zzfuVar3 = this.zzc;
                    zzal(zzfuVar3);
                    String zzf = zzfuVar3.zzf(str);
                    if (!TextUtils.isEmpty(zzf)) {
                        if (arrayMap == null) {
                            arrayMap = new ArrayMap();
                        }
                        arrayMap.put("If-None-Match", zzf);
                    }
                }
                this.zzt = true;
                zzez zzezVar = this.zzd;
                zzal(zzezVar);
                zzkz zzkzVar = new zzkz(this);
                zzezVar.zzg();
                zzezVar.zzW();
                Preconditions.checkNotNull(url);
                Preconditions.checkNotNull(zzkzVar);
                zzezVar.zzt.zzaB().zzo(new zzey(zzezVar, str, url, null, arrayMap, zzkzVar));
                return;
            } catch (MalformedURLException unused) {
                zzaA().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzet.zzn(zzhVar.zzv()), uri);
                return;
            }
        }
        zzI((String) Preconditions.checkNotNull(zzhVar.zzv()), 204, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzE(zzau zzauVar, zzq zzqVar) {
        zzau zzauVar2;
        List<zzac> zzt;
        List<zzac> zzt2;
        List<zzac> zzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaB().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j = zzauVar.zzd;
        zzeu zzb2 = zzeu.zzb(zzauVar);
        zzaB().zzg();
        zzir zzirVar = null;
        if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
            zzirVar = this.zzD;
        }
        zzlp.zzK(zzirVar, zzb2.zzd, false);
        zzau zza = zzb2.zza();
        zzal(this.zzi);
        if (zzlj.zzB(zza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzauVar2 = zza;
            } else if (list.contains(zza.zza)) {
                Bundle zzc = zza.zzb.zzc();
                zzc.putLong("ga_safelisted", 1L);
                zzauVar2 = new zzau(zza.zza, new zzas(zzc), zza.zzc, zza.zzd);
            } else {
                zzaA().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zza.zza, zza.zzc);
                return;
            }
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                Preconditions.checkNotEmpty(str2);
                zzakVar2.zzg();
                zzakVar2.zzW();
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i < 0) {
                    zzakVar2.zzt.zzaA().zzk().zzc("Invalid time querying timed out conditional properties", zzet.zzn(str2), Long.valueOf(j));
                    zzt = Collections.emptyList();
                } else {
                    zzt = zzakVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzac zzacVar : zzt) {
                    if (zzacVar != null) {
                        zzaA().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzau zzauVar3 = zzacVar.zzg;
                        if (zzauVar3 != null) {
                            zzY(new zzau(zzauVar3, j), zzqVar);
                        }
                        zzak zzakVar3 = this.zze;
                        zzal(zzakVar3);
                        zzakVar3.zza(str2, zzacVar.zzc.zzb);
                    }
                }
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                Preconditions.checkNotEmpty(str2);
                zzakVar4.zzg();
                zzakVar4.zzW();
                if (i < 0) {
                    zzakVar4.zzt.zzaA().zzk().zzc("Invalid time querying expired conditional properties", zzet.zzn(str2), Long.valueOf(j));
                    zzt2 = Collections.emptyList();
                } else {
                    zzt2 = zzakVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList<zzau> arrayList = new ArrayList(zzt2.size());
                for (zzac zzacVar2 : zzt2) {
                    if (zzacVar2 != null) {
                        zzaA().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzak zzakVar5 = this.zze;
                        zzal(zzakVar5);
                        zzakVar5.zzA(str2, zzacVar2.zzc.zzb);
                        zzau zzauVar4 = zzacVar2.zzk;
                        if (zzauVar4 != null) {
                            arrayList.add(zzauVar4);
                        }
                        zzak zzakVar6 = this.zze;
                        zzal(zzakVar6);
                        zzakVar6.zza(str2, zzacVar2.zzc.zzb);
                    }
                }
                for (zzau zzauVar5 : arrayList) {
                    zzY(new zzau(zzauVar5, j), zzqVar);
                }
                zzak zzakVar7 = this.zze;
                zzal(zzakVar7);
                String str3 = zzauVar2.zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzakVar7.zzg();
                zzakVar7.zzW();
                if (i < 0) {
                    zzakVar7.zzt.zzaA().zzk().zzd("Invalid time querying triggered conditional properties", zzet.zzn(str2), zzakVar7.zzt.zzj().zzd(str3), Long.valueOf(j));
                    zzt3 = Collections.emptyList();
                } else {
                    zzt3 = zzakVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList<zzau> arrayList2 = new ArrayList(zzt3.size());
                for (zzac zzacVar3 : zzt3) {
                    if (zzacVar3 != null) {
                        zzlk zzlkVar = zzacVar3.zzc;
                        zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzlkVar.zzb, j, Preconditions.checkNotNull(zzlkVar.zza()));
                        zzak zzakVar8 = this.zze;
                        zzal(zzakVar8);
                        if (zzakVar8.zzL(zzlmVar)) {
                            zzaA().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                        } else {
                            zzaA().zzd().zzd("Too many active user properties, ignoring", zzet.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                        }
                        zzau zzauVar6 = zzacVar3.zzi;
                        if (zzauVar6 != null) {
                            arrayList2.add(zzauVar6);
                        }
                        zzacVar3.zzc = new zzlk(zzlmVar);
                        zzacVar3.zze = true;
                        zzak zzakVar9 = this.zze;
                        zzal(zzakVar9);
                        zzakVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzauVar2, zzqVar);
                for (zzau zzauVar7 : arrayList2) {
                    zzY(new zzau(zzauVar7, j), zzqVar);
                }
                zzak zzakVar10 = this.zze;
                zzal(zzakVar10);
                zzakVar10.zzC();
            } finally {
                zzak zzakVar11 = this.zze;
                zzal(zzakVar11);
                zzakVar11.zzx();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF(zzau zzauVar, String str) {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzj = zzakVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzy())) {
            zzaA().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean zzad = zzad(zzj);
        if (zzad == null) {
            if (!"_ui".equals(zzauVar.zza)) {
                zzaA().zzk().zzb("Could not find package. appId", zzet.zzn(str));
            }
        } else if (!zzad.booleanValue()) {
            zzaA().zzd().zzb("App version does not match; dropping event. appId", zzet.zzn(str));
            return;
        }
        String zzA = zzj.zzA();
        String zzy = zzj.zzy();
        long zzb2 = zzj.zzb();
        String zzx = zzj.zzx();
        long zzm = zzj.zzm();
        long zzj2 = zzj.zzj();
        boolean zzan = zzj.zzan();
        String zzz = zzj.zzz();
        zzj.zza();
        zzG(zzauVar, new zzq(str, zzA, zzy, zzb2, zzx, zzm, zzj2, (String) null, zzan, false, zzz, 0L, 0L, 0, zzj.zzam(), false, zzj.zzt(), zzj.zzs(), zzj.zzk(), zzj.zzE(), (String) null, zzq(str).zzi(), "", (String) null, zzj.zzap(), zzj.zzr()));
    }

    final void zzG(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzeu zzb2 = zzeu.zzb(zzauVar);
        zzlp zzv = zzv();
        Bundle bundle = zzb2.zzd;
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzv.zzL(bundle, zzakVar.zzi(zzqVar.zza));
        zzv().zzN(zzb2, zzg().zzd(zzqVar.zza));
        zzau zza = zzb2.zza();
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zza.zza) && "referrer API v2".equals(zza.zzb.zzg("_cis"))) {
            String zzg = zza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg)) {
                zzW(new zzlk("_lgclid", zza.zzd, zzg, "auto"), zzqVar);
            }
        }
        zzE(zza, zzqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzH() {
        this.zzs++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0180, blocks: (B:4:0x0010, B:5:0x0012, B:62:0x0168, B:6:0x002c, B:16:0x0049, B:61:0x0160, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:60:0x015d, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:71:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0180, blocks: (B:4:0x0010, B:5:0x0012, B:62:0x0168, B:6:0x002c, B:16:0x0049, B:61:0x0160, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:60:0x015d, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:71:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0180, blocks: (B:4:0x0010, B:5:0x0012, B:62:0x0168, B:6:0x002c, B:16:0x0049, B:61:0x0160, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:60:0x015d, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:71:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzI(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        zzez zzezVar;
        zzaB().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzt = false;
                zzae();
            }
        }
        zzer zzj = zzaA().zzj();
        Integer valueOf = Integer.valueOf(bArr.length);
        zzj.zzb("onConfigFetched. Response size", valueOf);
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzakVar.zzw();
        zzak zzakVar2 = this.zze;
        zzal(zzakVar2);
        zzh zzj2 = zzakVar2.zzj(str);
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            z = false;
            if (zzj2 == null) {
                zzaA().zzk().zzb("App does not exist in onConfigFetched. appId", zzet.zzn(str));
            } else {
                if (!z && i != 404) {
                    zzj2.zzW(zzax().currentTimeMillis());
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    zzakVar3.zzD(zzj2);
                    zzaA().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                    zzfu zzfuVar = this.zzc;
                    zzal(zzfuVar);
                    zzfuVar.zzl(str);
                    this.zzk.zzd.zzb(zzax().currentTimeMillis());
                    if (i == 503 || i == 429) {
                        this.zzk.zzb.zzb(zzax().currentTimeMillis());
                    }
                    zzag();
                }
                List list = map != null ? (List) map.get("Last-Modified") : null;
                String str2 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                List list2 = map != null ? (List) map.get("ETag") : null;
                String str3 = (list2 == null || list2.isEmpty()) ? null : (String) list2.get(0);
                if (i != 404 && i != 304) {
                    zzfu zzfuVar2 = this.zzc;
                    zzal(zzfuVar2);
                    zzfuVar2.zzt(str, bArr, str2, str3);
                    zzj2.zzN(zzax().currentTimeMillis());
                    zzak zzakVar4 = this.zze;
                    zzal(zzakVar4);
                    zzakVar4.zzD(zzj2);
                    if (i != 404) {
                        zzaA().zzl().zzb("Config not found. Using empty config. appId", str);
                    } else {
                        zzaA().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                    }
                    zzezVar = this.zzd;
                    zzal(zzezVar);
                    if (zzezVar.zza() || !zzai()) {
                        zzag();
                    } else {
                        zzX();
                    }
                }
                zzfu zzfuVar3 = this.zzc;
                zzal(zzfuVar3);
                if (zzfuVar3.zze(str) == null) {
                    zzfu zzfuVar4 = this.zzc;
                    zzal(zzfuVar4);
                    zzfuVar4.zzt(str, null, null, null);
                }
                zzj2.zzN(zzax().currentTimeMillis());
                zzak zzakVar42 = this.zze;
                zzal(zzakVar42);
                zzakVar42.zzD(zzj2);
                if (i != 404) {
                }
                zzezVar = this.zzd;
                zzal(zzezVar);
                if (zzezVar.zza()) {
                }
                zzag();
            }
            zzak zzakVar5 = this.zze;
            zzal(zzakVar5);
            zzakVar5.zzC();
            zzak zzakVar6 = this.zze;
            zzal(zzakVar6);
            zzakVar6.zzx();
        }
        if (th == null) {
            z = true;
            if (zzj2 == null) {
            }
            zzak zzakVar52 = this.zze;
            zzal(zzakVar52);
            zzakVar52.zzC();
            zzak zzakVar62 = this.zze;
            zzal(zzakVar62);
            zzakVar62.zzx();
        }
        z = false;
        if (zzj2 == null) {
        }
        zzak zzakVar522 = this.zze;
        zzal(zzakVar522);
        zzakVar522.zzC();
        zzak zzakVar622 = this.zze;
        zzal(zzakVar622);
        zzakVar622.zzx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzJ(boolean z) {
        zzag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzK(int i, Throwable th, byte[] bArr, String str) {
        zzak zzakVar;
        long longValue;
        zzaB().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzae();
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzax().currentTimeMillis());
            if (i != 503 || i == 429) {
                this.zzk.zzb.zzb(zzax().currentTimeMillis());
            }
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            zzakVar2.zzy(list);
            zzag();
        }
        if (th == null) {
            try {
                this.zzk.zzc.zzb(zzax().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzak zzakVar3 = this.zze;
                zzal(zzakVar3);
                zzakVar3.zzw();
            } catch (SQLiteException e) {
                zzaA().zzd().zzb("Database error while trying to delete uploaded bundles", e);
                this.zza = zzax().elapsedRealtime();
                zzaA().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            try {
                for (Long l : list) {
                    try {
                        zzakVar = this.zze;
                        zzal(zzakVar);
                        longValue = l.longValue();
                        zzakVar.zzg();
                        zzakVar.zzW();
                    } catch (SQLiteException e2) {
                        List list2 = this.zzz;
                        if (list2 == null || !list2.contains(l)) {
                            throw e2;
                        }
                    }
                    try {
                        if (zzakVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    } catch (SQLiteException e3) {
                        zzakVar.zzt.zzaA().zzd().zzb("Failed to delete a bundle in a queue table", e3);
                        throw e3;
                        break;
                    }
                }
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                zzakVar4.zzC();
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzx();
                this.zzz = null;
                zzez zzezVar = this.zzd;
                zzal(zzezVar);
                if (zzezVar.zza() && zzai()) {
                    zzX();
                } else {
                    this.zzA = -1L;
                    zzag();
                }
                this.zza = 0L;
            } catch (Throwable th2) {
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                zzakVar6.zzx();
                throw th2;
            }
        }
        zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.zzk.zzd.zzb(zzax().currentTimeMillis());
        if (i != 503) {
        }
        this.zzk.zzb.zzb(zzax().currentTimeMillis());
        zzak zzakVar22 = this.zze;
        zzal(zzakVar22);
        zzakVar22.zzy(list);
        zzag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03df A[Catch: all -> 0x0579, TryCatch #4 {all -> 0x0579, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a5, B:52:0x01aa, B:54:0x01b0, B:56:0x01b9, B:68:0x01f3, B:70:0x01fe, B:74:0x020b, B:77:0x0219, B:81:0x0224, B:83:0x0227, B:84:0x0247, B:86:0x024c, B:89:0x026b, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03ab, B:135:0x03df, B:136:0x03e2, B:138:0x040b, B:177:0x04e4, B:178:0x04e7, B:186:0x0568, B:140:0x0420, B:145:0x0445, B:147:0x044d, B:149:0x0459, B:153:0x046c, B:157:0x047d, B:161:0x0489, B:164:0x04a0, B:167:0x04b1, B:169:0x04c5, B:171:0x04ca, B:172:0x04d1, B:174:0x04d7, B:155:0x0475, B:143:0x0431, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x032a, B:114:0x0330, B:116:0x0336, B:117:0x033b, B:119:0x0346, B:123:0x035d, B:129:0x0365, B:130:0x0379, B:131:0x038a, B:132:0x039b, B:179:0x04fe, B:181:0x052f, B:182:0x0532, B:183:0x0549, B:185:0x054d, B:87:0x025b, B:64:0x01d8, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:201:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040b A[Catch: all -> 0x0579, TRY_LEAVE, TryCatch #4 {all -> 0x0579, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a5, B:52:0x01aa, B:54:0x01b0, B:56:0x01b9, B:68:0x01f3, B:70:0x01fe, B:74:0x020b, B:77:0x0219, B:81:0x0224, B:83:0x0227, B:84:0x0247, B:86:0x024c, B:89:0x026b, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03ab, B:135:0x03df, B:136:0x03e2, B:138:0x040b, B:177:0x04e4, B:178:0x04e7, B:186:0x0568, B:140:0x0420, B:145:0x0445, B:147:0x044d, B:149:0x0459, B:153:0x046c, B:157:0x047d, B:161:0x0489, B:164:0x04a0, B:167:0x04b1, B:169:0x04c5, B:171:0x04ca, B:172:0x04d1, B:174:0x04d7, B:155:0x0475, B:143:0x0431, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x032a, B:114:0x0330, B:116:0x0336, B:117:0x033b, B:119:0x0346, B:123:0x035d, B:129:0x0365, B:130:0x0379, B:131:0x038a, B:132:0x039b, B:179:0x04fe, B:181:0x052f, B:182:0x0532, B:183:0x0549, B:185:0x054d, B:87:0x025b, B:64:0x01d8, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:201:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04e4 A[Catch: all -> 0x0579, TryCatch #4 {all -> 0x0579, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a5, B:52:0x01aa, B:54:0x01b0, B:56:0x01b9, B:68:0x01f3, B:70:0x01fe, B:74:0x020b, B:77:0x0219, B:81:0x0224, B:83:0x0227, B:84:0x0247, B:86:0x024c, B:89:0x026b, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03ab, B:135:0x03df, B:136:0x03e2, B:138:0x040b, B:177:0x04e4, B:178:0x04e7, B:186:0x0568, B:140:0x0420, B:145:0x0445, B:147:0x044d, B:149:0x0459, B:153:0x046c, B:157:0x047d, B:161:0x0489, B:164:0x04a0, B:167:0x04b1, B:169:0x04c5, B:171:0x04ca, B:172:0x04d1, B:174:0x04d7, B:155:0x0475, B:143:0x0431, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x032a, B:114:0x0330, B:116:0x0336, B:117:0x033b, B:119:0x0346, B:123:0x035d, B:129:0x0365, B:130:0x0379, B:131:0x038a, B:132:0x039b, B:179:0x04fe, B:181:0x052f, B:182:0x0532, B:183:0x0549, B:185:0x054d, B:87:0x025b, B:64:0x01d8, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:201:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0549 A[Catch: all -> 0x0579, TryCatch #4 {all -> 0x0579, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a5, B:52:0x01aa, B:54:0x01b0, B:56:0x01b9, B:68:0x01f3, B:70:0x01fe, B:74:0x020b, B:77:0x0219, B:81:0x0224, B:83:0x0227, B:84:0x0247, B:86:0x024c, B:89:0x026b, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03ab, B:135:0x03df, B:136:0x03e2, B:138:0x040b, B:177:0x04e4, B:178:0x04e7, B:186:0x0568, B:140:0x0420, B:145:0x0445, B:147:0x044d, B:149:0x0459, B:153:0x046c, B:157:0x047d, B:161:0x0489, B:164:0x04a0, B:167:0x04b1, B:169:0x04c5, B:171:0x04ca, B:172:0x04d1, B:174:0x04d7, B:155:0x0475, B:143:0x0431, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x032a, B:114:0x0330, B:116:0x0336, B:117:0x033b, B:119:0x0346, B:123:0x035d, B:129:0x0365, B:130:0x0379, B:131:0x038a, B:132:0x039b, B:179:0x04fe, B:181:0x052f, B:182:0x0532, B:183:0x0549, B:185:0x054d, B:87:0x025b, B:64:0x01d8, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:201:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0420 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3 A[Catch: all -> 0x0579, TryCatch #4 {all -> 0x0579, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a5, B:52:0x01aa, B:54:0x01b0, B:56:0x01b9, B:68:0x01f3, B:70:0x01fe, B:74:0x020b, B:77:0x0219, B:81:0x0224, B:83:0x0227, B:84:0x0247, B:86:0x024c, B:89:0x026b, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03ab, B:135:0x03df, B:136:0x03e2, B:138:0x040b, B:177:0x04e4, B:178:0x04e7, B:186:0x0568, B:140:0x0420, B:145:0x0445, B:147:0x044d, B:149:0x0459, B:153:0x046c, B:157:0x047d, B:161:0x0489, B:164:0x04a0, B:167:0x04b1, B:169:0x04c5, B:171:0x04ca, B:172:0x04d1, B:174:0x04d7, B:155:0x0475, B:143:0x0431, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x032a, B:114:0x0330, B:116:0x0336, B:117:0x033b, B:119:0x0346, B:123:0x035d, B:129:0x0365, B:130:0x0379, B:131:0x038a, B:132:0x039b, B:179:0x04fe, B:181:0x052f, B:182:0x0532, B:183:0x0549, B:185:0x054d, B:87:0x025b, B:64:0x01d8, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:201:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024c A[Catch: all -> 0x0579, TryCatch #4 {all -> 0x0579, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a5, B:52:0x01aa, B:54:0x01b0, B:56:0x01b9, B:68:0x01f3, B:70:0x01fe, B:74:0x020b, B:77:0x0219, B:81:0x0224, B:83:0x0227, B:84:0x0247, B:86:0x024c, B:89:0x026b, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03ab, B:135:0x03df, B:136:0x03e2, B:138:0x040b, B:177:0x04e4, B:178:0x04e7, B:186:0x0568, B:140:0x0420, B:145:0x0445, B:147:0x044d, B:149:0x0459, B:153:0x046c, B:157:0x047d, B:161:0x0489, B:164:0x04a0, B:167:0x04b1, B:169:0x04c5, B:171:0x04ca, B:172:0x04d1, B:174:0x04d7, B:155:0x0475, B:143:0x0431, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x032a, B:114:0x0330, B:116:0x0336, B:117:0x033b, B:119:0x0346, B:123:0x035d, B:129:0x0365, B:130:0x0379, B:131:0x038a, B:132:0x039b, B:179:0x04fe, B:181:0x052f, B:182:0x0532, B:183:0x0549, B:185:0x054d, B:87:0x025b, B:64:0x01d8, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:201:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025b A[Catch: all -> 0x0579, TryCatch #4 {all -> 0x0579, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a5, B:52:0x01aa, B:54:0x01b0, B:56:0x01b9, B:68:0x01f3, B:70:0x01fe, B:74:0x020b, B:77:0x0219, B:81:0x0224, B:83:0x0227, B:84:0x0247, B:86:0x024c, B:89:0x026b, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03ab, B:135:0x03df, B:136:0x03e2, B:138:0x040b, B:177:0x04e4, B:178:0x04e7, B:186:0x0568, B:140:0x0420, B:145:0x0445, B:147:0x044d, B:149:0x0459, B:153:0x046c, B:157:0x047d, B:161:0x0489, B:164:0x04a0, B:167:0x04b1, B:169:0x04c5, B:171:0x04ca, B:172:0x04d1, B:174:0x04d7, B:155:0x0475, B:143:0x0431, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x032a, B:114:0x0330, B:116:0x0336, B:117:0x033b, B:119:0x0346, B:123:0x035d, B:129:0x0365, B:130:0x0379, B:131:0x038a, B:132:0x039b, B:179:0x04fe, B:181:0x052f, B:182:0x0532, B:183:0x0549, B:185:0x054d, B:87:0x025b, B:64:0x01d8, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:201:0x00a6, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026b A[Catch: all -> 0x0579, TRY_LEAVE, TryCatch #4 {all -> 0x0579, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a5, B:52:0x01aa, B:54:0x01b0, B:56:0x01b9, B:68:0x01f3, B:70:0x01fe, B:74:0x020b, B:77:0x0219, B:81:0x0224, B:83:0x0227, B:84:0x0247, B:86:0x024c, B:89:0x026b, B:92:0x027e, B:94:0x02a5, B:97:0x02ad, B:99:0x02bc, B:133:0x03ab, B:135:0x03df, B:136:0x03e2, B:138:0x040b, B:177:0x04e4, B:178:0x04e7, B:186:0x0568, B:140:0x0420, B:145:0x0445, B:147:0x044d, B:149:0x0459, B:153:0x046c, B:157:0x047d, B:161:0x0489, B:164:0x04a0, B:167:0x04b1, B:169:0x04c5, B:171:0x04ca, B:172:0x04d1, B:174:0x04d7, B:155:0x0475, B:143:0x0431, B:101:0x02ce, B:103:0x02f9, B:104:0x0309, B:106:0x0310, B:108:0x0316, B:110:0x0320, B:112:0x032a, B:114:0x0330, B:116:0x0336, B:117:0x033b, B:119:0x0346, B:123:0x035d, B:129:0x0365, B:130:0x0379, B:131:0x038a, B:132:0x039b, B:179:0x04fe, B:181:0x052f, B:182:0x0532, B:183:0x0549, B:185:0x054d, B:87:0x025b, B:64:0x01d8, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:201:0x00a6, inners: #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzL(zzq zzqVar) {
        zzh zzj;
        String str;
        String str2;
        zzaq zzn;
        boolean z;
        long zzc;
        PackageInfo packageInfo;
        String str3;
        String str4;
        int i;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        boolean z2;
        SQLiteDatabase zzh;
        String[] strArr;
        int delete;
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzak(zzqVar)) {
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzh zzj2 = zzakVar.zzj(zzqVar.zza);
            if (zzj2 != null && TextUtils.isEmpty(zzj2.zzA()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzj2.zzN(0L);
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                zzakVar2.zzD(zzj2);
                zzfu zzfuVar = this.zzc;
                zzal(zzfuVar);
                zzfuVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long j = zzqVar.zzm;
            if (j == 0) {
                j = zzax().currentTimeMillis();
            }
            this.zzn.zzg().zzd();
            int i2 = zzqVar.zzn;
            if (i2 != 0 && i2 != 1) {
                zzaA().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzet.zzn(zzqVar.zza), Integer.valueOf(i2));
                i2 = 0;
            }
            zzak zzakVar3 = this.zze;
            zzal(zzakVar3);
            zzakVar3.zzw();
            try {
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                zzlm zzp = zzakVar4.zzp(zzqVar.zza, "_npa");
                if (zzp != null && !"auto".equals(zzp.zzb)) {
                    zzak zzakVar5 = this.zze;
                    zzal(zzakVar5);
                    zzj = zzakVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                    if (zzj == null && zzv().zzao(zzqVar.zzb, zzj.zzA(), zzqVar.zzq, zzj.zzt())) {
                        zzaA().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzet.zzn(zzj.zzv()));
                        zzak zzakVar6 = this.zze;
                        zzal(zzakVar6);
                        String zzv = zzj.zzv();
                        zzakVar6.zzW();
                        zzakVar6.zzg();
                        Preconditions.checkNotEmpty(zzv);
                        try {
                            zzh = zzakVar6.zzh();
                            strArr = new String[]{zzv};
                            delete = zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("apps", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("event_filters", "app_id=?", strArr) + zzh.delete("property_filters", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("consent_settings", "app_id=?", strArr);
                            zzpk.zzc();
                            str2 = "_sysu";
                            try {
                                str = "_pfo";
                            } catch (SQLiteException e) {
                                e = e;
                                str = "_pfo";
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            str = "_pfo";
                            str2 = "_sysu";
                        }
                        try {
                            if (zzakVar6.zzt.zzf().zzs(null, zzeg.zzat)) {
                                delete += zzh.delete("default_event_params", "app_id=?", strArr);
                            }
                            if (delete > 0) {
                                zzakVar6.zzt.zzaA().zzj().zzc("Deleted application data. app, records", zzv, Integer.valueOf(delete));
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            zzakVar6.zzt.zzaA().zzd().zzc("Error deleting application data. appId, error", zzet.zzn(zzv), e);
                            zzj = null;
                            if (zzj != null) {
                            }
                            zzd(zzqVar);
                            if (i2 == 0) {
                            }
                            if (zzn == null) {
                            }
                            zzak zzakVar7 = this.zze;
                            zzal(zzakVar7);
                            zzakVar7.zzC();
                        }
                        zzj = null;
                    } else {
                        str = "_pfo";
                        str2 = "_sysu";
                    }
                    if (zzj != null) {
                        boolean z3 = (zzj.zzb() == -2147483648L || zzj.zzb() == zzqVar.zzj) ? false : true;
                        String zzy = zzj.zzy();
                        if (((zzj.zzb() != -2147483648L || zzy == null || zzy.equals(zzqVar.zzc)) ? false : true) | z3) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_pv", zzy);
                            zzE(new zzau("_au", new zzas(bundle), "auto", j), zzqVar);
                        }
                    }
                    zzd(zzqVar);
                    if (i2 == 0) {
                        zzak zzakVar8 = this.zze;
                        zzal(zzakVar8);
                        zzn = zzakVar8.zzn(zzqVar.zza, "_f");
                        z = false;
                    } else {
                        zzak zzakVar9 = this.zze;
                        zzal(zzakVar9);
                        zzn = zzakVar9.zzn(zzqVar.zza, "_v");
                        z = true;
                    }
                    if (zzn == null) {
                        long j2 = ((j / 3600000) + 1) * 3600000;
                        if (z) {
                            zzW(new zzlk("_fvt", j, Long.valueOf(j2), "auto"), zzqVar);
                            zzaB().zzg();
                            zzB();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("_c", 1L);
                            bundle2.putLong("_r", 1L);
                            bundle2.putLong("_et", 1L);
                            if (zzqVar.zzp) {
                                bundle2.putLong("_dac", 1L);
                            }
                            zzG(new zzau("_v", new zzas(bundle2), "auto", j), zzqVar);
                        } else {
                            zzW(new zzlk("_fot", j, Long.valueOf(j2), "auto"), zzqVar);
                            zzaB().zzg();
                            zzfl zzflVar = (zzfl) Preconditions.checkNotNull(this.zzm);
                            String str5 = zzqVar.zza;
                            if (str5 != null && !str5.isEmpty()) {
                                zzflVar.zza.zzaB().zzg();
                                if (!zzflVar.zza()) {
                                    zzflVar.zza.zzaA().zzi().zza("Install Referrer Reporter is not available");
                                } else {
                                    zzfk zzfkVar = new zzfk(zzflVar, str5);
                                    zzflVar.zza.zzaB().zzg();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = zzflVar.zza.zzaw().getPackageManager();
                                    if (packageManager == null) {
                                        zzflVar.zza.zzaA().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            zzflVar.zza.zzaA().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ResolveInfo resolveInfo = queryIntentServices.get(0);
                                            if (resolveInfo.serviceInfo != null) {
                                                String str6 = resolveInfo.serviceInfo.packageName;
                                                if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str6) || !zzflVar.zza()) {
                                                    zzflVar.zza.zzaA().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                } else {
                                                    try {
                                                        try {
                                                            zzflVar.zza.zzaA().zzj().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzflVar.zza.zzaw(), new Intent(intent), zzfkVar, 1) ? "available" : "not available");
                                                        } catch (RuntimeException e4) {
                                                            e = e4;
                                                            zzflVar.zza.zzaA().zzd().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                            zzaB().zzg();
                                                            zzB();
                                                            Bundle bundle3 = new Bundle();
                                                            bundle3.putLong("_c", 1L);
                                                            bundle3.putLong("_r", 1L);
                                                            bundle3.putLong("_uwa", 0L);
                                                            String str7 = str;
                                                            bundle3.putLong(str7, 0L);
                                                            bundle3.putLong("_sys", 0L);
                                                            String str8 = str2;
                                                            bundle3.putLong(str8, 0L);
                                                            bundle3.putLong("_et", 1L);
                                                            if (zzqVar.zzp) {
                                                            }
                                                            String str9 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                                            zzak zzakVar10 = this.zze;
                                                            zzal(zzakVar10);
                                                            Preconditions.checkNotEmpty(str9);
                                                            zzakVar10.zzg();
                                                            zzakVar10.zzW();
                                                            zzc = zzakVar10.zzc(str9, "first_open_count");
                                                            if (this.zzn.zzaw().getPackageManager() == null) {
                                                            }
                                                            if (zzc >= 0) {
                                                            }
                                                            zzG(new zzau("_f", new zzas(bundle3), "auto", j), zzqVar);
                                                            zzak zzakVar72 = this.zze;
                                                            zzal(zzakVar72);
                                                            zzakVar72.zzC();
                                                        }
                                                    } catch (RuntimeException e5) {
                                                        e = e5;
                                                    }
                                                }
                                            }
                                        }
                                        zzaB().zzg();
                                        zzB();
                                        Bundle bundle32 = new Bundle();
                                        bundle32.putLong("_c", 1L);
                                        bundle32.putLong("_r", 1L);
                                        bundle32.putLong("_uwa", 0L);
                                        String str72 = str;
                                        bundle32.putLong(str72, 0L);
                                        bundle32.putLong("_sys", 0L);
                                        String str82 = str2;
                                        bundle32.putLong(str82, 0L);
                                        bundle32.putLong("_et", 1L);
                                        if (zzqVar.zzp) {
                                            bundle32.putLong("_dac", 1L);
                                        }
                                        String str92 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                        zzak zzakVar102 = this.zze;
                                        zzal(zzakVar102);
                                        Preconditions.checkNotEmpty(str92);
                                        zzakVar102.zzg();
                                        zzakVar102.zzW();
                                        zzc = zzakVar102.zzc(str92, "first_open_count");
                                        if (this.zzn.zzaw().getPackageManager() == null) {
                                            try {
                                                packageInfo = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(str92, 0);
                                            } catch (PackageManager.NameNotFoundException e6) {
                                                zzaA().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzet.zzn(str92), e6);
                                                packageInfo = null;
                                            }
                                            if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                                str3 = "_sys";
                                                str4 = str82;
                                                i = 1;
                                                applicationInfo = null;
                                            } else {
                                                str3 = "_sys";
                                                str4 = str82;
                                                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                                    applicationInfo = null;
                                                    if (!zzg().zzs(null, zzeg.zzad)) {
                                                        bundle32.putLong("_uwa", 1L);
                                                    } else if (zzc == 0) {
                                                        bundle32.putLong("_uwa", 1L);
                                                        zzc = 0;
                                                    }
                                                    z2 = false;
                                                } else {
                                                    applicationInfo = null;
                                                    z2 = true;
                                                }
                                                i = 1;
                                                zzW(new zzlk("_fi", j, Long.valueOf(true != z2 ? 0L : 1L), "auto"), zzqVar);
                                            }
                                            try {
                                                applicationInfo2 = Wrappers.packageManager(this.zzn.zzaw()).getApplicationInfo(str92, 0);
                                            } catch (PackageManager.NameNotFoundException e7) {
                                                zzaA().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzet.zzn(str92), e7);
                                                applicationInfo2 = applicationInfo;
                                            }
                                            if (applicationInfo2 != null) {
                                                if ((applicationInfo2.flags & i) != 0) {
                                                    bundle32.putLong(str3, 1L);
                                                }
                                                if ((applicationInfo2.flags & 128) != 0) {
                                                    bundle32.putLong(str4, 1L);
                                                }
                                            }
                                        } else {
                                            zzaA().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzet.zzn(str92));
                                        }
                                        if (zzc >= 0) {
                                            bundle32.putLong(str72, zzc);
                                        }
                                        zzG(new zzau("_f", new zzas(bundle32), "auto", j), zzqVar);
                                    }
                                }
                                zzaB().zzg();
                                zzB();
                                Bundle bundle322 = new Bundle();
                                bundle322.putLong("_c", 1L);
                                bundle322.putLong("_r", 1L);
                                bundle322.putLong("_uwa", 0L);
                                String str722 = str;
                                bundle322.putLong(str722, 0L);
                                bundle322.putLong("_sys", 0L);
                                String str822 = str2;
                                bundle322.putLong(str822, 0L);
                                bundle322.putLong("_et", 1L);
                                if (zzqVar.zzp) {
                                }
                                String str922 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                zzak zzakVar1022 = this.zze;
                                zzal(zzakVar1022);
                                Preconditions.checkNotEmpty(str922);
                                zzakVar1022.zzg();
                                zzakVar1022.zzW();
                                zzc = zzakVar1022.zzc(str922, "first_open_count");
                                if (this.zzn.zzaw().getPackageManager() == null) {
                                }
                                if (zzc >= 0) {
                                }
                                zzG(new zzau("_f", new zzas(bundle322), "auto", j), zzqVar);
                            }
                            zzflVar.zza.zzaA().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                            zzaB().zzg();
                            zzB();
                            Bundle bundle3222 = new Bundle();
                            bundle3222.putLong("_c", 1L);
                            bundle3222.putLong("_r", 1L);
                            bundle3222.putLong("_uwa", 0L);
                            String str7222 = str;
                            bundle3222.putLong(str7222, 0L);
                            bundle3222.putLong("_sys", 0L);
                            String str8222 = str2;
                            bundle3222.putLong(str8222, 0L);
                            bundle3222.putLong("_et", 1L);
                            if (zzqVar.zzp) {
                            }
                            String str9222 = (String) Preconditions.checkNotNull(zzqVar.zza);
                            zzak zzakVar10222 = this.zze;
                            zzal(zzakVar10222);
                            Preconditions.checkNotEmpty(str9222);
                            zzakVar10222.zzg();
                            zzakVar10222.zzW();
                            zzc = zzakVar10222.zzc(str9222, "first_open_count");
                            if (this.zzn.zzaw().getPackageManager() == null) {
                            }
                            if (zzc >= 0) {
                            }
                            zzG(new zzau("_f", new zzas(bundle3222), "auto", j), zzqVar);
                        }
                    } else if (zzqVar.zzi) {
                        zzG(new zzau("_cd", new zzas(new Bundle()), "auto", j), zzqVar);
                    }
                    zzak zzakVar722 = this.zze;
                    zzal(zzakVar722);
                    zzakVar722.zzC();
                }
                if (zzqVar.zzr != null) {
                    zzlk zzlkVar = new zzlk("_npa", j, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto");
                    if (zzp == null || !zzp.zze.equals(zzlkVar.zzd)) {
                        zzW(zzlkVar, zzqVar);
                    }
                } else if (zzp != null) {
                    zzP("_npa", zzqVar);
                }
                zzak zzakVar52 = this.zze;
                zzal(zzakVar52);
                zzj = zzakVar52.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzj == null) {
                }
                str = "_pfo";
                str2 = "_sysu";
                if (zzj != null) {
                }
                zzd(zzqVar);
                if (i2 == 0) {
                }
                if (zzn == null) {
                }
                zzak zzakVar7222 = this.zze;
                zzal(zzakVar7222);
                zzakVar7222.zzC();
            } finally {
                zzak zzakVar11 = this.zze;
                zzal(zzakVar11);
                zzakVar11.zzx();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzM() {
        this.zzr++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzN(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzO(zzacVar, zzac);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (zzqVar.zzh) {
                zzak zzakVar = this.zze;
                zzal(zzakVar);
                zzakVar.zzw();
                try {
                    zzd(zzqVar);
                    String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                    zzak zzakVar2 = this.zze;
                    zzal(zzakVar2);
                    zzac zzk = zzakVar2.zzk(str, zzacVar.zzc.zzb);
                    if (zzk != null) {
                        zzaA().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                        zzak zzakVar3 = this.zze;
                        zzal(zzakVar3);
                        zzakVar3.zza(str, zzacVar.zzc.zzb);
                        if (zzk.zze) {
                            zzak zzakVar4 = this.zze;
                            zzal(zzakVar4);
                            zzakVar4.zzA(str, zzacVar.zzc.zzb);
                        }
                        zzau zzauVar = zzacVar.zzk;
                        if (zzauVar != null) {
                            zzas zzasVar = zzauVar.zzb;
                            zzY((zzau) Preconditions.checkNotNull(zzv().zzz(str, ((zzau) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzasVar != null ? zzasVar.zzc() : null, zzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                        }
                    } else {
                        zzaA().zzk().zzc("Conditional user property doesn't exist", zzet.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    }
                    zzak zzakVar5 = this.zze;
                    zzal(zzakVar5);
                    zzakVar5.zzC();
                    return;
                } finally {
                    zzak zzakVar6 = this.zze;
                    zzal(zzakVar6);
                    zzakVar6.zzx();
                }
            }
            zzd(zzqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzP(String str, zzq zzqVar) {
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
            } else if (!"_npa".equals(str) || zzqVar.zzr == null) {
                zzaA().zzc().zzb("Removing user property", this.zzn.zzj().zzf(str));
                zzak zzakVar = this.zze;
                zzal(zzakVar);
                zzakVar.zzw();
                try {
                    zzd(zzqVar);
                    if ("_id".equals(str)) {
                        zzak zzakVar2 = this.zze;
                        zzal(zzakVar2);
                        zzakVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                    }
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    zzakVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), str);
                    zzak zzakVar4 = this.zze;
                    zzal(zzakVar4);
                    zzakVar4.zzC();
                    zzaA().zzc().zzb("User property removed", this.zzn.zzj().zzf(str));
                } finally {
                    zzak zzakVar5 = this.zze;
                    zzal(zzakVar5);
                    zzakVar5.zzx();
                }
            } else {
                zzaA().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzlk("_npa", zzax().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto"), zzqVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzakVar.zzg();
        zzakVar.zzW();
        try {
            SQLiteDatabase zzh = zzakVar.zzh();
            String[] strArr = {str};
            int delete = zzh.delete("apps", "app_id=?", strArr) + zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("queue", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("main_event_params", "app_id=?", strArr) + zzh.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzakVar.zzt.zzaA().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzakVar.zzt.zzaA().zzd().zzc("Error resetting analytics data. appId, error", zzet.zzn(str), e);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zzir zzirVar) {
        zzaB().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zzirVar != null) {
            this.zzE = str;
            this.zzD = zzirVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzS() {
        zzaB().zzg();
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzakVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzax().currentTimeMillis());
        }
        zzag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzT(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzU(zzacVar, zzac);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzU(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.zze = false;
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                zzac zzk = zzakVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzk != null && !zzk.zzb.equals(zzacVar2.zzb)) {
                    zzaA().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzk.zzb);
                }
                if (zzk == null || !zzk.zze) {
                    if (TextUtils.isEmpty(zzacVar2.zzf)) {
                        zzlk zzlkVar = zzacVar2.zzc;
                        zzacVar2.zzc = new zzlk(zzlkVar.zzb, zzacVar2.zzd, zzlkVar.zza(), zzacVar2.zzc.zzf);
                        zzacVar2.zze = true;
                        z = true;
                    }
                } else {
                    zzacVar2.zzb = zzk.zzb;
                    zzacVar2.zzd = zzk.zzd;
                    zzacVar2.zzh = zzk.zzh;
                    zzacVar2.zzf = zzk.zzf;
                    zzacVar2.zzi = zzk.zzi;
                    zzacVar2.zze = true;
                    zzlk zzlkVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlk(zzlkVar2.zzb, zzk.zzc.zzc, zzlkVar2.zza(), zzk.zzc.zzf);
                }
                if (zzacVar2.zze) {
                    zzlk zzlkVar3 = zzacVar2.zzc;
                    zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzlkVar3.zzb, zzlkVar3.zzc, Preconditions.checkNotNull(zzlkVar3.zza()));
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    if (zzakVar3.zzL(zzlmVar)) {
                        zzaA().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                    } else {
                        zzaA().zzd().zzd("(2)Too many active user properties, ignoring", zzet.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                    }
                    if (z && zzacVar2.zzi != null) {
                        zzY(new zzau(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                if (zzakVar4.zzK(zzacVar2)) {
                    zzaA().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                } else {
                    zzaA().zzd().zzd("Too many conditional properties, ignoring", zzet.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                }
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzC();
            } finally {
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                zzakVar6.zzx();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzV(String str, zzhb zzhbVar) {
        zzaB().zzg();
        zzB();
        this.zzB.put(str, zzhbVar);
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzhbVar);
        zzakVar.zzg();
        zzakVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzhbVar.zzi());
        try {
            if (zzakVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzakVar.zzt.zzaA().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzet.zzn(str));
            }
        } catch (SQLiteException e) {
            zzakVar.zzt.zzaA().zzd().zzc("Error storing consent setting. appId, error", zzet.zzn(str), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzW(zzlk zzlkVar, zzq zzqVar) {
        long j;
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int zzl = zzv().zzl(zzlkVar.zzb);
            int i = 0;
            if (zzl != 0) {
                zzlp zzv = zzv();
                String str = zzlkVar.zzb;
                zzg();
                String zzD = zzv.zzD(str, 24, true);
                String str2 = zzlkVar.zzb;
                zzv().zzO(this.zzF, zzqVar.zza, zzl, "_ev", zzD, str2 != null ? str2.length() : 0);
                return;
            }
            int zzd = zzv().zzd(zzlkVar.zzb, zzlkVar.zza());
            if (zzd != 0) {
                zzlp zzv2 = zzv();
                String str3 = zzlkVar.zzb;
                zzg();
                String zzD2 = zzv2.zzD(str3, 24, true);
                Object zza = zzlkVar.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    i = zza.toString().length();
                }
                zzv().zzO(this.zzF, zzqVar.zza, zzd, "_ev", zzD2, i);
                return;
            }
            Object zzB = zzv().zzB(zzlkVar.zzb, zzlkVar.zza());
            if (zzB == null) {
                return;
            }
            if ("_sid".equals(zzlkVar.zzb)) {
                long j2 = zzlkVar.zzc;
                String str4 = zzlkVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzak zzakVar = this.zze;
                zzal(zzakVar);
                zzlm zzp = zzakVar.zzp(str5, "_sno");
                if (zzp != null) {
                    Object obj = zzp.zze;
                    if (obj instanceof Long) {
                        j = ((Long) obj).longValue();
                        zzW(new zzlk("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
                    }
                }
                if (zzp != null) {
                    zzaA().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp.zze);
                }
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                zzaq zzn = zzakVar2.zzn(str5, "_s");
                if (zzn != null) {
                    j = zzn.zzc;
                    zzaA().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j));
                } else {
                    j = 0;
                }
                zzW(new zzlk("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
            }
            zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzlkVar.zzf), zzlkVar.zzb, zzlkVar.zzc, zzB);
            zzaA().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzlmVar.zzc), zzB);
            zzak zzakVar3 = this.zze;
            zzal(zzakVar3);
            zzakVar3.zzw();
            try {
                if ("_id".equals(zzlmVar.zzc)) {
                    zzak zzakVar4 = this.zze;
                    zzal(zzakVar4);
                    zzlm zzp2 = zzakVar4.zzp(zzqVar.zza, "_id");
                    if (zzp2 != null && !zzlmVar.zze.equals(zzp2.zze)) {
                        zzak zzakVar5 = this.zze;
                        zzal(zzakVar5);
                        zzakVar5.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                boolean zzL = zzakVar6.zzL(zzlmVar);
                if (zzg().zzs(null, zzeg.zzaH) && "_sid".equals(zzlkVar.zzb)) {
                    zzlj zzljVar = this.zzi;
                    zzal(zzljVar);
                    long zzd2 = zzljVar.zzd(zzqVar.zzx);
                    zzak zzakVar7 = this.zze;
                    zzal(zzakVar7);
                    zzh zzj = zzakVar7.zzj(zzqVar.zza);
                    if (zzj != null) {
                        zzj.zzaj(zzd2);
                        if (zzj.zzao()) {
                            zzak zzakVar8 = this.zze;
                            zzal(zzakVar8);
                            zzakVar8.zzD(zzj);
                        }
                    }
                }
                zzak zzakVar9 = this.zze;
                zzal(zzakVar9);
                zzakVar9.zzC();
                if (!zzL) {
                    zzaA().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                    zzv().zzO(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
            } finally {
                zzak zzakVar10 = this.zze;
                zzal(zzakVar10);
                zzakVar10.zzx();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04f6, code lost:
        if (r3 != null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04f8, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x051d, code lost:
        if (r3 == null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0520, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010c, code lost:
        if (r11 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
        if (r11 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012e, code lost:
        if (r11 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0131, code lost:
        r22.zzA = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b A[Catch: all -> 0x0542, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0542, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:68:0x013c, B:72:0x0164, B:76:0x016c, B:141:0x02aa, B:143:0x02b0, B:145:0x02bc, B:146:0x02c0, B:148:0x02c6, B:150:0x02da, B:154:0x02e3, B:156:0x02e9, B:162:0x030e, B:159:0x02fe, B:161:0x0308, B:163:0x0311, B:165:0x032c, B:169:0x033b, B:171:0x035f, B:173:0x0399, B:175:0x039e, B:177:0x03a6, B:178:0x03a9, B:180:0x03ae, B:181:0x03b1, B:183:0x03bd, B:184:0x03d3, B:185:0x03db, B:187:0x03ec, B:189:0x03fd, B:190:0x0412, B:192:0x041f, B:194:0x0434, B:196:0x043f, B:197:0x0448, B:193:0x042d, B:199:0x0497, B:128:0x027b, B:140:0x02a7, B:203:0x04b2, B:204:0x04b5, B:205:0x04b6, B:211:0x04f8, B:228:0x0521, B:230:0x0527, B:232:0x0532, B:216:0x0503, B:237:0x053e, B:238:0x0541), top: B:243:0x0010, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b0 A[Catch: all -> 0x0542, TryCatch #0 {all -> 0x0542, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:68:0x013c, B:72:0x0164, B:76:0x016c, B:141:0x02aa, B:143:0x02b0, B:145:0x02bc, B:146:0x02c0, B:148:0x02c6, B:150:0x02da, B:154:0x02e3, B:156:0x02e9, B:162:0x030e, B:159:0x02fe, B:161:0x0308, B:163:0x0311, B:165:0x032c, B:169:0x033b, B:171:0x035f, B:173:0x0399, B:175:0x039e, B:177:0x03a6, B:178:0x03a9, B:180:0x03ae, B:181:0x03b1, B:183:0x03bd, B:184:0x03d3, B:185:0x03db, B:187:0x03ec, B:189:0x03fd, B:190:0x0412, B:192:0x041f, B:194:0x0434, B:196:0x043f, B:197:0x0448, B:193:0x042d, B:199:0x0497, B:128:0x027b, B:140:0x02a7, B:203:0x04b2, B:204:0x04b5, B:205:0x04b6, B:211:0x04f8, B:228:0x0521, B:230:0x0527, B:232:0x0532, B:216:0x0503, B:237:0x053e, B:238:0x0541), top: B:243:0x0010, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138 A[Catch: all -> 0x0034, TryCatch #13 {all -> 0x0034, blocks: (B:5:0x0021, B:13:0x003e, B:18:0x0056, B:22:0x0067, B:26:0x0082, B:31:0x00b4, B:37:0x00c9, B:43:0x00f7, B:48:0x010e, B:62:0x0131, B:66:0x0138, B:67:0x013b, B:83:0x01a8), top: B:254:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzX() {
        boolean z;
        Boolean zzj;
        Cursor cursor;
        zzak zzakVar;
        long zzz;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        Cursor cursor4;
        List emptyList;
        String str;
        String str2;
        byte[] blob;
        zzlj zzljVar;
        Cursor cursor5;
        zzaB().zzg();
        zzB();
        int i = 1;
        this.zzv = true;
        int i2 = 0;
        try {
            this.zzn.zzay();
            zzj = this.zzn.zzt().zzj();
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            if (zzj == null) {
                zzaA().zzk().zza("Upload data called on the client side before use of service was decided");
                this.zzv = false;
            } else if (zzj.booleanValue()) {
                zzaA().zzd().zza("Upload called in the client side when service should be used");
                this.zzv = false;
            } else if (this.zza > 0) {
                zzag();
                this.zzv = false;
            } else {
                zzaB().zzg();
                if (this.zzy != null) {
                    zzaA().zzj().zza("Uploading requested multiple times");
                    this.zzv = false;
                } else {
                    zzez zzezVar = this.zzd;
                    zzal(zzezVar);
                    if (zzezVar.zza()) {
                        long currentTimeMillis = zzax().currentTimeMillis();
                        Cursor cursor6 = null;
                        int zze = zzg().zze(null, zzeg.zzR);
                        zzg();
                        long zzz2 = currentTimeMillis - zzag.zzz();
                        for (int i3 = 0; i3 < zze && zzah(null, zzz2); i3++) {
                        }
                        long zza = this.zzk.zzc.zza();
                        if (zza != 0) {
                            zzaA().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza)));
                        }
                        zzak zzakVar2 = this.zze;
                        zzal(zzakVar2);
                        String zzr = zzakVar2.zzr();
                        long j2 = -1;
                        if (TextUtils.isEmpty(zzr)) {
                            try {
                                this.zzA = -1L;
                                zzakVar = this.zze;
                                zzal(zzakVar);
                                zzg();
                                zzz = currentTimeMillis - zzag.zzz();
                                zzakVar.zzg();
                                zzakVar.zzW();
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = null;
                            }
                            try {
                                cursor2 = zzakVar.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(zzz)});
                                try {
                                } catch (SQLiteException e) {
                                    e = e;
                                    zzakVar.zzt.zzaA().zzd().zzb("Error selecting expired configs", e);
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                cursor2 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor = null;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                            if (cursor2.moveToFirst()) {
                                String str3 = cursor2.getString(0);
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    zzak zzakVar3 = this.zze;
                                    zzal(zzakVar3);
                                    zzh zzj2 = zzakVar3.zzj(str3);
                                    if (zzj2 != null) {
                                        zzD(zzj2);
                                    }
                                }
                            } else {
                                zzakVar.zzt.zzaA().zzj().zza("No expired configs for apps with pending events");
                            }
                        } else {
                            if (this.zzA == -1) {
                                zzak zzakVar4 = this.zze;
                                zzal(zzakVar4);
                                try {
                                    cursor5 = zzakVar4.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    try {
                                        try {
                                            if (cursor5.moveToFirst()) {
                                                j2 = cursor5.getLong(0);
                                            }
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            zzakVar4.zzt.zzaA().zzd().zzb("Error querying raw events", e);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor6 = cursor5;
                                        if (cursor6 != null) {
                                            cursor6.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    cursor5 = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (cursor6 != null) {
                                    }
                                    throw th;
                                }
                            }
                            int zze2 = zzg().zze(zzr, zzeg.zzg);
                            int max = Math.max(0, zzg().zze(zzr, zzeg.zzh));
                            zzak zzakVar5 = this.zze;
                            zzal(zzakVar5);
                            zzakVar5.zzg();
                            zzakVar5.zzW();
                            Preconditions.checkArgument(zze2 > 0);
                            Preconditions.checkArgument(max > 0);
                            Preconditions.checkNotEmpty(zzr);
                            try {
                                cursor4 = zzakVar5.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{zzr}, null, null, "rowid", String.valueOf(zze2));
                                try {
                                    try {
                                        if (cursor4.moveToFirst()) {
                                            ArrayList arrayList = new ArrayList();
                                            int i4 = 0;
                                            while (true) {
                                                long j3 = cursor4.getLong(i2);
                                                try {
                                                    blob = cursor4.getBlob(i);
                                                    zzljVar = zzakVar5.zzf.zzi;
                                                    zzal(zzljVar);
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    j = currentTimeMillis;
                                                }
                                                try {
                                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                    byte[] bArr = new byte[1024];
                                                    j = currentTimeMillis;
                                                    while (true) {
                                                        try {
                                                            try {
                                                                int read = gZIPInputStream.read(bArr);
                                                                if (read <= 0) {
                                                                    break;
                                                                }
                                                                byteArrayOutputStream.write(bArr, 0, read);
                                                            } catch (SQLiteException e6) {
                                                                e = e6;
                                                                zzakVar5.zzt.zzaA().zzd().zzc("Error querying bundles. appId", zzet.zzn(zzr), e);
                                                                emptyList = Collections.emptyList();
                                                                if (cursor4 != null) {
                                                                    cursor4.close();
                                                                }
                                                                if (!emptyList.isEmpty()) {
                                                                }
                                                                this.zzv = false;
                                                                zzae();
                                                            }
                                                        } catch (IOException e7) {
                                                            e = e7;
                                                            try {
                                                                zzljVar.zzt.zzaA().zzd().zzb("Failed to ungzip content", e);
                                                                throw e;
                                                                break;
                                                            } catch (IOException e8) {
                                                                e = e8;
                                                                zzakVar5.zzt.zzaA().zzd().zzc("Failed to unzip queued bundle. appId", zzet.zzn(zzr), e);
                                                                if (cursor4.moveToNext()) {
                                                                    break;
                                                                }
                                                                currentTimeMillis = j;
                                                                i = 1;
                                                                i2 = 0;
                                                                if (cursor4 != null) {
                                                                }
                                                                emptyList = arrayList;
                                                                if (!emptyList.isEmpty()) {
                                                                }
                                                                this.zzv = false;
                                                                zzae();
                                                            }
                                                        }
                                                    }
                                                    gZIPInputStream.close();
                                                    byteArrayInputStream.close();
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    if (!arrayList.isEmpty() && byteArray.length + i4 > max) {
                                                        break;
                                                    }
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzlj.zzm(com.google.android.gms.internal.measurement.zzgd.zzu(), byteArray);
                                                        if (!cursor4.isNull(2)) {
                                                            zzgcVar.zzaf(cursor4.getInt(2));
                                                        }
                                                        i4 += byteArray.length;
                                                        arrayList.add(Pair.create((com.google.android.gms.internal.measurement.zzgd) zzgcVar.zzaD(), Long.valueOf(j3)));
                                                    } catch (IOException e9) {
                                                        zzakVar5.zzt.zzaA().zzd().zzc("Failed to merge queued bundle. appId", zzet.zzn(zzr), e9);
                                                    }
                                                    if (cursor4.moveToNext() || i4 > max) {
                                                        break;
                                                        break;
                                                    }
                                                    currentTimeMillis = j;
                                                    i = 1;
                                                    i2 = 0;
                                                } catch (IOException e10) {
                                                    e = e10;
                                                    j = currentTimeMillis;
                                                }
                                            }
                                            if (cursor4 != null) {
                                                cursor4.close();
                                            }
                                            emptyList = arrayList;
                                        } else {
                                            emptyList = Collections.emptyList();
                                            if (cursor4 != null) {
                                                cursor4.close();
                                            }
                                            j = currentTimeMillis;
                                        }
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        j = currentTimeMillis;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor3 = cursor4;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                j = currentTimeMillis;
                                cursor4 = null;
                            } catch (Throwable th7) {
                                th = th7;
                                cursor3 = null;
                            }
                            if (!emptyList.isEmpty()) {
                                if (zzq(zzr).zzj(zzha.AD_STORAGE)) {
                                    Iterator it = emptyList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            str2 = null;
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((Pair) it.next()).first;
                                        if (!zzgdVar.zzK().isEmpty()) {
                                            str2 = zzgdVar.zzK();
                                            break;
                                        }
                                    }
                                    if (str2 != null) {
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= emptyList.size()) {
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzgd zzgdVar2 = (com.google.android.gms.internal.measurement.zzgd) ((Pair) emptyList.get(i5)).first;
                                            if (!zzgdVar2.zzK().isEmpty() && !zzgdVar2.zzK().equals(str2)) {
                                                emptyList = emptyList.subList(0, i5);
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                }
                                com.google.android.gms.internal.measurement.zzga zza2 = com.google.android.gms.internal.measurement.zzgb.zza();
                                int size = emptyList.size();
                                ArrayList arrayList2 = new ArrayList(emptyList.size());
                                boolean z2 = zzg().zzt(zzr) && zzq(zzr).zzj(zzha.AD_STORAGE);
                                boolean zzj3 = zzq(zzr).zzj(zzha.AD_STORAGE);
                                boolean zzj4 = zzq(zzr).zzj(zzha.ANALYTICS_STORAGE);
                                zzqu.zzc();
                                boolean zzs = zzg().zzs(zzr, zzeg.zzao);
                                int i6 = 0;
                                while (i6 < size) {
                                    com.google.android.gms.internal.measurement.zzgc zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgd) ((Pair) emptyList.get(i6)).first).zzbB();
                                    arrayList2.add((Long) ((Pair) emptyList.get(i6)).second);
                                    zzg().zzh();
                                    zzgcVar2.zzam(79000L);
                                    long j4 = j;
                                    zzgcVar2.zzal(j4);
                                    this.zzn.zzay();
                                    zzgcVar2.zzag(false);
                                    if (!z2) {
                                        zzgcVar2.zzq();
                                    }
                                    if (!zzj3) {
                                        zzgcVar2.zzx();
                                        zzgcVar2.zzt();
                                    }
                                    if (!zzj4) {
                                        zzgcVar2.zzn();
                                    }
                                    zzC(zzr, zzgcVar2);
                                    if (!zzs) {
                                        zzgcVar2.zzy();
                                    }
                                    if (zzg().zzs(zzr, zzeg.zzV)) {
                                        byte[] zzbx = ((com.google.android.gms.internal.measurement.zzgd) zzgcVar2.zzaD()).zzbx();
                                        zzlj zzljVar2 = this.zzi;
                                        zzal(zzljVar2);
                                        zzgcVar2.zzJ(zzljVar2.zzf(zzbx));
                                    }
                                    zza2.zza(zzgcVar2);
                                    i6++;
                                    j = j4;
                                }
                                long j5 = j;
                                if (Log.isLoggable(zzaA().zzr(), 2)) {
                                    zzlj zzljVar3 = this.zzi;
                                    zzal(zzljVar3);
                                    str = zzljVar3.zzo((com.google.android.gms.internal.measurement.zzgb) zza2.zzaD());
                                } else {
                                    str = null;
                                }
                                zzal(this.zzi);
                                byte[] zzbx2 = ((com.google.android.gms.internal.measurement.zzgb) zza2.zzaD()).zzbx();
                                zzkv zza3 = this.zzl.zza(zzr);
                                try {
                                    Preconditions.checkArgument(!arrayList2.isEmpty());
                                    if (this.zzy != null) {
                                        zzaA().zzd().zza("Set uploading progress before finishing the previous upload");
                                    } else {
                                        this.zzy = new ArrayList(arrayList2);
                                    }
                                    this.zzk.zzd.zzb(j5);
                                    zzaA().zzj().zzd("Uploading data. app, uncompressed size, data", size > 0 ? zza2.zzb(0).zzy() : "?", Integer.valueOf(zzbx2.length), str);
                                    this.zzu = true;
                                    zzez zzezVar2 = this.zzd;
                                    zzal(zzezVar2);
                                    URL url = new URL(zza3.zza());
                                    Map zzb2 = zza3.zzb();
                                    zzky zzkyVar = new zzky(this, zzr);
                                    zzezVar2.zzg();
                                    zzezVar2.zzW();
                                    Preconditions.checkNotNull(url);
                                    Preconditions.checkNotNull(zzbx2);
                                    Preconditions.checkNotNull(zzkyVar);
                                    zzezVar2.zzt.zzaB().zzo(new zzey(zzezVar2, zzr, url, zzbx2, zzb2, zzkyVar));
                                } catch (MalformedURLException unused) {
                                    zzaA().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzet.zzn(zzr), zza3.zza());
                                }
                            }
                        }
                        this.zzv = false;
                    } else {
                        zzaA().zzj().zza("Network not connected, ignoring upload request");
                        zzag();
                        this.zzv = false;
                    }
                }
            }
            zzae();
        } catch (Throwable th8) {
            th = th8;
            z = false;
            this.zzv = z;
            zzae();
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:93:0x02fd
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    final void zzY(com.google.android.gms.measurement.internal.zzau r37, com.google.android.gms.measurement.internal.zzq r38) {
        /*
            Method dump skipped, instructions count: 2918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzY(com.google.android.gms.measurement.internal.zzau, com.google.android.gms.measurement.internal.zzq):void");
    }

    final boolean zzZ() {
        zzaB().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock == null || !fileLock.isValid()) {
            this.zze.zzt.zzf();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.zzn.zzaw().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.zzx = channel;
                FileLock tryLock = channel.tryLock();
                this.zzw = tryLock;
                if (tryLock != null) {
                    zzaA().zzj().zza("Storage concurrent access okay");
                    return true;
                }
                zzaA().zzd().zza("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                zzaA().zzd().zzb("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                zzaA().zzd().zzb("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                zzaA().zzk().zzb("Storage lock already acquired", e3);
                return false;
            }
        }
        zzaA().zzj().zza("Storage concurrent access okay");
        return true;
    }

    final long zza() {
        long currentTimeMillis = zzax().currentTimeMillis();
        zzkb zzkbVar = this.zzk;
        zzkbVar.zzW();
        zzkbVar.zzg();
        long zza = zzkbVar.zze.zza();
        if (zza == 0) {
            zza = zzkbVar.zzt.zzv().zzG().nextInt(86400000) + 1;
            zzkbVar.zze.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzet zzaA() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaA();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzga zzaB() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaB();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Context zzaw() {
        return this.zzn.zzaw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Clock zzax() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzax();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzab zzay() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzh zzd(zzq zzqVar) {
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzlg(this, zzqVar.zzw));
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzj = zzakVar.zzj(zzqVar.zza);
        zzhb zzd = zzq(zzqVar.zza).zzd(zzhb.zzc(zzqVar.zzv, 100));
        String zzf = zzd.zzj(zzha.AD_STORAGE) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzj == null) {
            zzj = new zzh(this.zzn, zzqVar.zza);
            if (zzd.zzj(zzha.ANALYTICS_STORAGE)) {
                zzj.zzJ(zzw(zzd));
            }
            if (zzd.zzj(zzha.AD_STORAGE)) {
                zzj.zzag(zzf);
            }
        } else if (!zzd.zzj(zzha.AD_STORAGE) || zzf == null || zzf.equals(zzj.zzC())) {
            if (TextUtils.isEmpty(zzj.zzw()) && zzd.zzj(zzha.ANALYTICS_STORAGE)) {
                zzj.zzJ(zzw(zzd));
            }
        } else {
            zzj.zzag(zzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzd).first)) {
                zzj.zzJ(zzw(zzd));
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                if (zzakVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    if (zzakVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzlm zzlmVar = new zzlm(zzqVar.zza, "auto", "_lair", zzax().currentTimeMillis(), 1L);
                        zzak zzakVar4 = this.zze;
                        zzal(zzakVar4);
                        zzakVar4.zzL(zzlmVar);
                    }
                }
            }
        }
        zzj.zzY(zzqVar.zzb);
        zzj.zzH(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzj.zzX(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            zzj.zzZ(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzj.zzL(zzqVar.zzc);
        }
        zzj.zzM(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzj.zzK(str);
        }
        zzj.zzU(zzqVar.zzf);
        zzj.zzae(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzj.zzaa(zzqVar.zzg);
        }
        zzj.zzI(zzqVar.zzo);
        zzj.zzaf(zzqVar.zzr);
        zzj.zzV(zzqVar.zzs);
        zzqu.zzc();
        if (zzg().zzs(null, zzeg.zzam) || zzg().zzs(zzqVar.zza, zzeg.zzao)) {
            zzj.zzai(zzqVar.zzx);
        }
        zzop.zzc();
        if (!zzg().zzs(null, zzeg.zzal)) {
            zzop.zzc();
            if (zzg().zzs(null, zzeg.zzak)) {
                zzj.zzah(null);
            }
        } else {
            zzj.zzah(zzqVar.zzt);
        }
        zzrd.zzc();
        if (zzg().zzs(null, zzeg.zzaq)) {
            zzj.zzak(zzqVar.zzy);
        }
        zzpz.zzc();
        if (zzg().zzs(null, zzeg.zzaE)) {
            zzj.zzal(zzqVar.zzz);
        }
        if (zzj.zzao()) {
            zzak zzakVar5 = this.zze;
            zzal(zzakVar5);
            zzakVar5.zzD(zzj);
        }
        return zzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzak zzh() {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        return zzakVar;
    }

    public final zzeo zzi() {
        return this.zzn.zzj();
    }

    public final zzez zzj() {
        zzez zzezVar = this.zzd;
        zzal(zzezVar);
        return zzezVar;
    }

    public final zzfb zzl() {
        zzfb zzfbVar = this.zzf;
        if (zzfbVar != null) {
            return zzfbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfu zzm() {
        zzfu zzfuVar = this.zzc;
        zzal(zzfuVar);
        return zzfuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgd zzp() {
        return this.zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzhb zzq(String str) {
        String str2;
        zzhb zzhbVar = zzhb.zza;
        zzaB().zzg();
        zzB();
        zzhb zzhbVar2 = (zzhb) this.zzB.get(str);
        if (zzhbVar2 == null) {
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            Preconditions.checkNotNull(str);
            zzakVar.zzg();
            zzakVar.zzW();
            Cursor cursor = null;
            try {
                try {
                    cursor = zzakVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                    } else {
                        if (cursor != null) {
                            cursor.close();
                        }
                        str2 = "G1";
                    }
                    zzhb zzc = zzhb.zzc(str2, 100);
                    zzV(str, zzc);
                    return zzc;
                } catch (SQLiteException e) {
                    zzakVar.zzt.zzaA().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                    throw e;
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return zzhbVar2;
    }

    public final zzip zzr() {
        zzip zzipVar = this.zzj;
        zzal(zzipVar);
        return zzipVar;
    }

    public final zzkb zzs() {
        return this.zzk;
    }

    public final zzlj zzu() {
        zzlj zzljVar = this.zzi;
        zzal(zzljVar);
        return zzljVar;
    }

    public final zzlp zzv() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    final String zzw(zzhb zzhbVar) {
        if (zzhbVar.zzj(zzha.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzv().zzG().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzx(zzq zzqVar) {
        try {
            return (String) zzaB().zzh(new zzla(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaA().zzd().zzc("Failed to get app instance id. appId", zzet.zzn(zzqVar.zza), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzz(Runnable runnable) {
        zzaB().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
