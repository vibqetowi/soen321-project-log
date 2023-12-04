package com.google.android.play.core.splitinstall.internal;

import android.util.Log;
import java.io.File;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzbc implements zzar {
    @Override // com.google.android.play.core.splitinstall.internal.zzar
    public final boolean zza(Object obj, File file, File file2) {
        try {
            return !((Boolean) zzbk.zzf(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
