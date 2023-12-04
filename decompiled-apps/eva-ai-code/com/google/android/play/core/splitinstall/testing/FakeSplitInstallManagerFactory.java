package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.internal.zzby;
import java.io.File;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class FakeSplitInstallManagerFactory {
    private static FakeSplitInstallManager zza;

    private FakeSplitInstallManagerFactory() {
    }

    public static FakeSplitInstallManager create(Context context) {
        try {
            File zzb = com.google.android.play.core.splitinstall.zzu.zza(context).zzb();
            if (zzb == null) {
                throw new LocalTestingException("Failed to retrieve local testing directory path");
            }
            if (!zzb.exists()) {
                throw new LocalTestingException(String.format("Local testing directory not found: %s", zzb));
            }
            return create(context, zzb);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static FakeSplitInstallManager createNewInstance(Context context, final File file) {
        SplitCompat.install(context);
        return new FakeSplitInstallManager(context, file, new com.google.android.play.core.splitinstall.zzs(context, context.getPackageName()), new zzby() { // from class: com.google.android.play.core.splitinstall.testing.zzs
            @Override // com.google.android.play.core.splitinstall.internal.zzby
            public final Object zza() {
                return zzaa.zza(file);
            }
        });
    }

    public static synchronized FakeSplitInstallManager create(Context context, File file) {
        FakeSplitInstallManager fakeSplitInstallManager;
        synchronized (FakeSplitInstallManagerFactory.class) {
            FakeSplitInstallManager fakeSplitInstallManager2 = zza;
            if (fakeSplitInstallManager2 == null) {
                zza = createNewInstance(context, file);
            } else if (!fakeSplitInstallManager2.zzc().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", zza.zzc().getAbsolutePath(), file.getAbsolutePath()));
            }
            fakeSplitInstallManager = zza;
        }
        return fakeSplitInstallManager;
    }
}
