package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.data.BuildConfig;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConnectivityModule.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ConnectivityModule$provideInternetConnection$1 extends Lambda implements Function0<String> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityModule$provideInternetConnection$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return String.valueOf(this.$context.getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0).getString(OkHttpClientProviderKt.API_URL_KEY, BuildConfig.API_URL));
    }
}
