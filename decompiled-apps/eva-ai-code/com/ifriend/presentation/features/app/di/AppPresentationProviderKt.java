package com.ifriend.presentation.features.app.di;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
/* compiled from: AppPresentationProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalAppPresentationProvider", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/ifriend/presentation/features/app/di/AppPresentationProvider;", "getLocalAppPresentationProvider", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppPresentationProviderKt {
    private static final ProvidableCompositionLocal<AppPresentationProvider> LocalAppPresentationProvider = CompositionLocalKt.compositionLocalOf$default(null, AppPresentationProviderKt$LocalAppPresentationProvider$1.INSTANCE, 1, null);

    public static final ProvidableCompositionLocal<AppPresentationProvider> getLocalAppPresentationProvider() {
        return LocalAppPresentationProvider;
    }
}
