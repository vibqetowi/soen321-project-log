package com.ifriend.ui.components.providers;

import coil.ImageLoader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppLocalProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcoil/ImageLoader;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AppLocalProviderKt$LocalAppImageLoaderProvider$1 extends Lambda implements Function0<ImageLoader> {
    public static final AppLocalProviderKt$LocalAppImageLoaderProvider$1 INSTANCE = new AppLocalProviderKt$LocalAppImageLoaderProvider$1();

    AppLocalProviderKt$LocalAppImageLoaderProvider$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageLoader invoke() {
        throw new IllegalStateException("ImageLoader no found!".toString());
    }
}
