package com.google.android.play.core.splitinstall.testing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzbs;
import com.google.android.play.core.splitinstall.internal.zzbw;
import com.google.android.play.core.splitinstall.internal.zzbx;
import com.google.android.play.core.splitinstall.internal.zzby;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public class FakeSplitInstallManager implements SplitInstallManager {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.SECONDS.toMillis(1);
    private final Handler zzc;
    private final Context zzd;
    private final com.google.android.play.core.splitinstall.zzs zze;
    private final zzby zzf;
    private final zzbs zzg;
    private final com.google.android.play.core.splitinstall.internal.zzt zzh;
    private final com.google.android.play.core.splitinstall.internal.zzt zzi;
    private final Executor zzj;
    private final com.google.android.play.core.splitinstall.zzg zzk;
    private final File zzl;
    private final AtomicReference zzm;
    private final Set zzn;
    private final Set zzo;
    private final AtomicBoolean zzp;
    private final zzj zzq;

    @Deprecated
    public FakeSplitInstallManager(Context context, File file) {
        this(context, file, new com.google.android.play.core.splitinstall.zzs(context, context.getPackageName()), zze.zza);
    }

    private final Task zzk(final int i) {
        zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzp
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                int i2 = i;
                int i3 = FakeSplitInstallManager.zza;
                if (splitInstallSessionState == null) {
                    return null;
                }
                return SplitInstallSessionState.create(splitInstallSessionState.sessionId(), 6, i2, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
            }
        });
        return Tasks.forException(new SplitInstallException(i));
    }

    private final com.google.android.play.core.splitinstall.zzk zzl() {
        try {
            com.google.android.play.core.splitinstall.zzk zza2 = this.zze.zza(this.zzd.getPackageManager().getPackageInfo(this.zzd.getPackageName(), 128).applicationInfo.metaData);
            if (zza2 != null) {
                return zza2;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("App is not found in PackageManager", e);
        }
    }

    private final SplitInstallSessionState zzm() {
        return (SplitInstallSessionState) this.zzm.get();
    }

    private final synchronized SplitInstallSessionState zzn(zzr zzrVar) {
        SplitInstallSessionState zzm = zzm();
        SplitInstallSessionState zza2 = zzrVar.zza(zzm);
        AtomicReference atomicReference = this.zzm;
        while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, zzm, zza2)) {
            if (atomicReference.get() != zzm) {
                return null;
            }
        }
        return zza2;
    }

    private static String zzo(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(List list, List list2, List list3, long j, boolean z) {
        this.zzk.zza().zzd(list, new zzq(this, list2, list3, j, z, list));
    }

    private final void zzq(final SplitInstallSessionState splitInstallSessionState) {
        this.zzc.post(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzf
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplitInstallManager.this.zzg(splitInstallSessionState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzr(List list, List list2, long j) {
        this.zzn.addAll(list);
        this.zzo.addAll(list2);
        Long valueOf = Long.valueOf(j);
        zzs(5, 0, valueOf, valueOf, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzs(final int i, final int i2, final Long l, final Long l2, final List list, final Integer num, final List list2) {
        SplitInstallSessionState zzn = zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzg
            @Override // com.google.android.play.core.splitinstall.testing.zzr
            public final SplitInstallSessionState zza(SplitInstallSessionState splitInstallSessionState) {
                long longValue;
                Integer num2 = num;
                int i3 = i;
                int i4 = i2;
                Long l3 = l;
                Long l4 = l2;
                List<String> list3 = list;
                List<String> list4 = list2;
                int i5 = FakeSplitInstallManager.zza;
                SplitInstallSessionState create = splitInstallSessionState == null ? SplitInstallSessionState.create(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : splitInstallSessionState;
                int sessionId = num2 == null ? create.sessionId() : num2.intValue();
                long bytesDownloaded = l3 == null ? create.bytesDownloaded() : l3.longValue();
                if (l4 == null) {
                    longValue = create.totalBytesToDownload();
                } else {
                    longValue = l4.longValue();
                }
                return SplitInstallSessionState.create(sessionId, i3, i4, bytesDownloaded, longValue, list3 == null ? create.moduleNames() : list3, list4 == null ? create.languages() : list4);
            }
        });
        if (zzn != null) {
            zzq(zzn);
            return true;
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> cancelInstall(final int i) {
        try {
            SplitInstallSessionState zzn = zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzh
                @Override // com.google.android.play.core.splitinstall.testing.zzr
                public final SplitInstallSessionState zza(final SplitInstallSessionState splitInstallSessionState) {
                    final int i2 = i;
                    return (SplitInstallSessionState) zzbx.zzc(new Callable() { // from class: com.google.android.play.core.splitinstall.testing.zzo
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int status;
                            SplitInstallSessionState splitInstallSessionState2 = SplitInstallSessionState.this;
                            int i3 = i2;
                            int i4 = FakeSplitInstallManager.zza;
                            if (splitInstallSessionState2 == null || i3 != splitInstallSessionState2.sessionId() || ((status = splitInstallSessionState2.status()) != 1 && status != 2 && status != 8 && status != 9 && status != 7)) {
                                throw new SplitInstallException(-3);
                            }
                            return SplitInstallSessionState.create(i3, 7, splitInstallSessionState2.errorCode(), splitInstallSessionState2.bytesDownloaded(), splitInstallSessionState2.totalBytesToDownload(), splitInstallSessionState2.moduleNames(), splitInstallSessionState2.languages());
                        }
                    });
                }
            });
            if (zzn != null) {
                zzq(zzn);
            }
            return Tasks.forResult(null);
        } catch (zzbx e) {
            return Tasks.forException(e.zzb(SplitInstallException.class));
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredUninstall(List<String> list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        HashSet hashSet = new HashSet();
        if (this.zze.zzd() != null) {
            hashSet.addAll(this.zze.zzd());
        }
        hashSet.addAll(this.zzo);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.zze.zzc());
        hashSet.addAll(this.zzn);
        return hashSet;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<SplitInstallSessionState> getSessionState(int i) {
        SplitInstallSessionState zzm = zzm();
        if (zzm == null || zzm.sessionId() != i) {
            return Tasks.forException(new SplitInstallException(-4));
        }
        return Tasks.forResult(zzm);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        SplitInstallSessionState zzm = zzm();
        return Tasks.forResult(zzm != null ? Collections.singletonList(zzm) : Collections.emptyList());
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zza(splitInstallStateUpdatedListener);
    }

    public void setShouldNetworkError(boolean z) {
        this.zzp.set(z);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) throws IntentSender.SendIntentException {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int i) throws IntentSender.SendIntentException {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
        if (r0.contains(r6) == false) goto L51;
     */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Task<Integer> startInstall(final SplitInstallRequest splitInstallRequest) {
        Integer zza2;
        int i;
        File[] fileArr;
        int i2;
        int i3;
        try {
            SplitInstallSessionState zzn = zzn(new zzr() { // from class: com.google.android.play.core.splitinstall.testing.zzk
                @Override // com.google.android.play.core.splitinstall.testing.zzr
                public final SplitInstallSessionState zza(final SplitInstallSessionState splitInstallSessionState) {
                    final SplitInstallRequest splitInstallRequest2 = SplitInstallRequest.this;
                    return (SplitInstallSessionState) zzbx.zzc(new Callable() { // from class: com.google.android.play.core.splitinstall.testing.zzn
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SplitInstallSessionState splitInstallSessionState2 = SplitInstallSessionState.this;
                            SplitInstallRequest splitInstallRequest3 = splitInstallRequest2;
                            int i4 = FakeSplitInstallManager.zza;
                            if (splitInstallSessionState2 == null || splitInstallSessionState2.hasTerminalStatus()) {
                                return SplitInstallSessionState.create(splitInstallSessionState2 != null ? 1 + splitInstallSessionState2.sessionId() : 1, 1, 0, 0L, 0L, splitInstallRequest3.getModuleNames(), new ArrayList());
                            }
                            throw new SplitInstallException(-1);
                        }
                    });
                }
            });
            if (zzn != null) {
                int sessionId = zzn.sessionId();
                final ArrayList arrayList = new ArrayList();
                for (Locale locale : splitInstallRequest.getLanguages()) {
                    arrayList.add(locale.getLanguage());
                }
                HashSet hashSet = new HashSet();
                final ArrayList arrayList2 = new ArrayList();
                File[] listFiles = this.zzl.listFiles(zzl.zza);
                if (listFiles == null) {
                    Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                    return zzk(-5);
                }
                int length = listFiles.length;
                int i4 = 0;
                long j = 0;
                while (i4 < length) {
                    File file = listFiles[i4];
                    String zza3 = zzbw.zza(file);
                    String zzo = zzo(zza3);
                    hashSet.add(zza3);
                    if (splitInstallRequest.getModuleNames().contains(zzo)) {
                        String zzo2 = zzo(zza3);
                        HashSet hashSet2 = new HashSet(this.zzg.zza());
                        Map zza4 = zzl().zza(Arrays.asList(zzo2));
                        HashSet hashSet3 = new HashSet();
                        for (Set set : zza4.values()) {
                            hashSet3.addAll(set);
                            listFiles = listFiles;
                        }
                        fileArr = listFiles;
                        HashSet hashSet4 = new HashSet();
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            int i5 = length;
                            String str = (String) it.next();
                            Iterator it2 = it;
                            if (str.contains("_")) {
                                i3 = sessionId;
                                str = str.split("_", -1)[0];
                            } else {
                                i3 = sessionId;
                            }
                            hashSet4.add(str);
                            it = it2;
                            length = i5;
                            sessionId = i3;
                        }
                        i = sessionId;
                        i2 = length;
                        hashSet4.addAll(this.zzo);
                        hashSet4.addAll(arrayList);
                        HashSet hashSet5 = new HashSet();
                        for (Map.Entry entry : zza4.entrySet()) {
                            if (hashSet4.contains(entry.getKey())) {
                                hashSet5.addAll((Collection) entry.getValue());
                            }
                        }
                        if (hashSet3.contains(zza3)) {
                        }
                        j += file.length();
                        arrayList2.add(file);
                        break;
                        i4++;
                        length = i2;
                        listFiles = fileArr;
                        sessionId = i;
                    } else {
                        i = sessionId;
                        fileArr = listFiles;
                        i2 = length;
                    }
                    List<Locale> languages = splitInstallRequest.getLanguages();
                    ArrayList arrayList3 = new ArrayList(this.zzn);
                    arrayList3.addAll(Arrays.asList("", TtmlNode.RUBY_BASE));
                    Map zza5 = zzl().zza(arrayList3);
                    for (Locale locale2 : languages) {
                        if (zza5.containsKey(locale2.getLanguage()) && ((Set) zza5.get(locale2.getLanguage())).contains(zza3)) {
                            j += file.length();
                            arrayList2.add(file);
                            break;
                        }
                    }
                    i4++;
                    length = i2;
                    listFiles = fileArr;
                    sessionId = i;
                }
                int i6 = sessionId;
                String obj = hashSet.toString();
                String valueOf = String.valueOf(splitInstallRequest.getModuleNames());
                Log.i("FakeSplitInstallManager", "availableSplits " + obj + " want " + valueOf);
                if (splitInstallRequest.getModuleNames().size() != 1 || (zza2 = (Integer) ((zzv) this.zzf.zza()).zzb().get(splitInstallRequest.getModuleNames().get(0))) == null) {
                    zza2 = ((zzv) this.zzf.zza()).zza();
                }
                if (zza2 != null) {
                    return zzk(zza2.intValue());
                }
                if (!hashSet.containsAll(new HashSet(splitInstallRequest.getModuleNames()))) {
                    return zzk(-2);
                }
                Long valueOf2 = Long.valueOf(j);
                List<String> moduleNames = splitInstallRequest.getModuleNames();
                Integer valueOf3 = Integer.valueOf(i6);
                zzs(1, 0, 0L, valueOf2, moduleNames, valueOf3, arrayList);
                this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzm
                    @Override // java.lang.Runnable
                    public final void run() {
                        FakeSplitInstallManager.this.zzi(arrayList2, arrayList);
                    }
                });
                return Tasks.forResult(valueOf3);
            }
            return zzk(-100);
        } catch (zzbx e) {
            return zzk(((SplitInstallException) e.zzb(SplitInstallException.class)).getErrorCode());
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzi.zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zza(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzh.zzb(splitInstallStateUpdatedListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File zzc() {
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(final long j, final List list, final List list2, final List list3) {
        long j2 = j / 3;
        long j3 = 0;
        for (int i = 0; i < 3; i++) {
            j3 = Math.min(j, j3 + j2);
            zzs(2, 0, Long.valueOf(j3), Long.valueOf(j), null, null, null);
            SystemClock.sleep(zzb);
            SplitInstallSessionState zzm = zzm();
            if (zzm.status() == 9 || zzm.status() == 7 || zzm.status() == 6) {
                return;
            }
        }
        this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzd
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplitInstallManager.this.zzh(list, list2, list3, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(SplitInstallSessionState splitInstallSessionState) {
        this.zzh.zzc(splitInstallSessionState);
        this.zzi.zzc(splitInstallSessionState);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(List list, List list2, List list3, long j) {
        if (this.zzp.get()) {
            zzs(6, -6, null, null, null, null, null);
        } else if (this.zzk.zza() != null) {
            zzp(list, list2, list3, j, false);
        } else {
            zzr(list2, list3, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String zza2 = zzbw.zza(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, this.zzd.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", zzo(zza2));
            intent.putExtra("split_id", zza2);
            arrayList.add(intent);
            arrayList2.add(zzo(zzbw.zza(file)));
        }
        SplitInstallSessionState zzm = zzm();
        if (zzm == null) {
            return;
        }
        final long j = zzm.totalBytesToDownload();
        this.zzj.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzi
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplitInstallManager.this.zzf(j, arrayList, arrayList2, list2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FakeSplitInstallManager(Context context, File file, com.google.android.play.core.splitinstall.zzs zzsVar, zzby zzbyVar) {
        Executor zza2 = com.google.android.play.core.splitcompat.zzd.zza();
        zzbs zzbsVar = new zzbs(context);
        zzj zzjVar = zzj.zza;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzm = new AtomicReference();
        this.zzn = Collections.synchronizedSet(new HashSet());
        this.zzo = Collections.synchronizedSet(new HashSet());
        this.zzp = new AtomicBoolean(false);
        this.zzd = context;
        this.zzl = file;
        this.zze = zzsVar;
        this.zzf = zzbyVar;
        this.zzj = zza2;
        this.zzg = zzbsVar;
        this.zzq = zzjVar;
        this.zzi = new com.google.android.play.core.splitinstall.internal.zzt();
        this.zzh = new com.google.android.play.core.splitinstall.internal.zzt();
        this.zzk = com.google.android.play.core.splitinstall.zzo.INSTANCE;
    }
}
