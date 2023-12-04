package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzak implements com.google.android.play.core.splitinstall.zzh {
    private final Context zza;
    private final com.google.android.play.core.splitcompat.zze zzb;
    private final zzam zzc;
    private final Executor zzd;
    private final com.google.android.play.core.splitcompat.zzs zze;

    public zzak(Context context, Executor executor, zzam zzamVar, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitcompat.zzs zzsVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzeVar;
        this.zzc = zzamVar;
        this.zzd = executor;
        this.zze = zzsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzak zzakVar, List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        Integer zze = zzakVar.zze(list);
        if (zze == null) {
            return;
        }
        if (zze.intValue() == 0) {
            zzfVar.zzc();
        } else {
            zzfVar.zzb(zze.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzak zzakVar, com.google.android.play.core.splitinstall.zzf zzfVar) {
        try {
            if (!SplitCompat.zzd(zzbr.zza(zzakVar.zza))) {
                Log.e("SplitCompat", "Emulating splits failed.");
                zzfVar.zzb(-12);
                return;
            }
            Log.i("SplitCompat", "Splits installed.");
            zzfVar.zza();
        } catch (Exception e) {
            Log.e("SplitCompat", "Error emulating splits.", e);
            zzfVar.zzb(-12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0132 A[Catch: Exception -> 0x0136, TRY_LEAVE, TryCatch #7 {Exception -> 0x0136, blocks: (B:3:0x0004, B:79:0x0132, B:5:0x0016, B:11:0x0021, B:12:0x002a, B:14:0x0031, B:16:0x005a, B:21:0x006d, B:23:0x0079, B:32:0x0098, B:45:0x00af, B:44:0x00ac, B:19:0x0067, B:46:0x00b0, B:47:0x00b5, B:49:0x00c1, B:51:0x00c9, B:53:0x00d1, B:54:0x00df, B:56:0x00e3, B:58:0x00f4, B:70:0x011d, B:60:0x00fb, B:61:0x0101, B:63:0x0108, B:66:0x0110, B:68:0x0117), top: B:87:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Integer zze(List list) {
        FileLock fileLock;
        int i;
        File[] listFiles;
        try {
            FileChannel channel = new RandomAccessFile(this.zzb.zzd(), "rw").getChannel();
            Integer num = null;
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                fileLock = null;
            }
            if (fileLock != null) {
                try {
                    Log.i("SplitCompat", "Copying splits.");
                    Iterator it = list.iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Intent intent = (Intent) it.next();
                        String stringExtra = intent.getStringExtra("split_id");
                        AssetFileDescriptor openAssetFileDescriptor = this.zza.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                        File zze = this.zzb.zze(stringExtra);
                        if ((!zze.exists() || zze.length() == openAssetFileDescriptor.getLength()) && zze.exists()) {
                        }
                        if (this.zzb.zzg(stringExtra).exists()) {
                            continue;
                        } else {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(zze);
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.close();
                                bufferedInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        }
                    }
                    Log.i("SplitCompat", "Splits copied.");
                    try {
                        listFiles = this.zzb.zzb().listFiles();
                        try {
                        } catch (Exception e) {
                            Log.e("SplitCompat", "Error verifying splits.", e);
                        }
                    } catch (IOException e2) {
                        Log.e("SplitCompat", "Cannot access directory for unverified splits.", e2);
                    }
                } catch (Exception e3) {
                    Log.e("SplitCompat", "Error copying splits.", e3);
                }
                if (this.zzc.zzc(listFiles)) {
                    if (this.zzc.zza(listFiles)) {
                        try {
                            File[] listFiles2 = this.zzb.zzb().listFiles();
                            Arrays.sort(listFiles2);
                            int length = listFiles2.length;
                            while (true) {
                                length--;
                                if (length < 0) {
                                    break;
                                }
                                com.google.android.play.core.splitcompat.zze.zzm(listFiles2[length]);
                                File file = listFiles2[length];
                                file.renameTo(this.zzb.zzf(file));
                            }
                            Log.i("SplitCompat", "Splits verified.");
                        } catch (IOException e4) {
                            Log.e("SplitCompat", "Cannot write verified split.", e4);
                            i = -13;
                            num = Integer.valueOf(i);
                            fileLock.release();
                            if (channel != null) {
                            }
                            return num;
                        }
                        num = Integer.valueOf(i);
                        fileLock.release();
                    }
                }
                Log.e("SplitCompat", "Split verification failed.");
                i = -11;
                num = Integer.valueOf(i);
                fileLock.release();
            }
            if (channel != null) {
                channel.close();
            }
            return num;
        } catch (Exception e5) {
            Log.e("SplitCompat", "Error locking files.", e5);
            return -13;
        }
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    public final void zzd(List list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!SplitCompat.zze()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.zzd.execute(new zzaj(this, list, zzfVar));
    }
}
