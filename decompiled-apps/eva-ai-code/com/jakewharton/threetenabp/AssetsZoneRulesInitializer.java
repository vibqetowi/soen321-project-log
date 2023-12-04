package com.jakewharton.threetenabp;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.TzdbZoneRulesProvider;
import org.threeten.bp.zone.ZoneRulesInitializer;
import org.threeten.bp.zone.ZoneRulesProvider;
/* loaded from: classes4.dex */
final class AssetsZoneRulesInitializer extends ZoneRulesInitializer {
    private final String assetPath;
    private final Context context;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AssetsZoneRulesInitializer(Context context, String str) {
        this.context = context;
        this.assetPath = str;
    }

    @Override // org.threeten.bp.zone.ZoneRulesInitializer
    protected void initializeProviders() {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.context.getAssets().open(this.assetPath);
                TzdbZoneRulesProvider tzdbZoneRulesProvider = new TzdbZoneRulesProvider(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                ZoneRulesProvider.registerProvider(tzdbZoneRulesProvider);
            } catch (IOException e) {
                throw new IllegalStateException(this.assetPath + " missing from assets", e);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
