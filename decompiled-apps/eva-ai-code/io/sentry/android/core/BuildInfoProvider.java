package io.sentry.android.core;

import android.os.Build;
/* loaded from: classes4.dex */
public final class BuildInfoProvider implements IBuildInfoProvider {
    @Override // io.sentry.android.core.IBuildInfoProvider
    public int getSdkInfoVersion() {
        return Build.VERSION.SDK_INT;
    }

    @Override // io.sentry.android.core.IBuildInfoProvider
    public String getBuildTags() {
        return Build.TAGS;
    }
}
