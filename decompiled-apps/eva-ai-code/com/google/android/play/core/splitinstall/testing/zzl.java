package com.google.android.play.core.splitinstall.testing;

import java.io.File;
import java.io.FileFilter;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzl implements FileFilter {
    public static final /* synthetic */ zzl zza = new zzl();

    private /* synthetic */ zzl() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = FakeSplitInstallManager.zza;
        return file.getName().endsWith(".apk");
    }
}
