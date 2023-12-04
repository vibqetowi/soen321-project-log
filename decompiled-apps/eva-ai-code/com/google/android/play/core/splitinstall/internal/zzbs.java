package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzbs {
    private final Context zza;

    public zzbs(Context context) {
        this.zza = context;
    }

    private static String zzb(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : "_".concat(String.valueOf(locale.getCountry())));
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zza() {
        LocaleList locales;
        int size;
        int size2;
        Locale locale;
        Configuration configuration = this.zza.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size2; i++) {
                locale = locales.get(i);
                arrayList.add(zzb(locale));
            }
            return arrayList;
        }
        return Collections.singletonList(zzb(configuration.locale));
    }
}
