package com.theinnerhour.b2b.utils;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.DispatcherProvider;
import kotlin.Metadata;
import kotlinx.coroutines.a0;
/* compiled from: DispatcherProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/theinnerhour/b2b/utils/DefaultDispatcherProvider;", "Lcom/theinnerhour/b2b/utils/DispatcherProvider;", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class DefaultDispatcherProvider implements DispatcherProvider {
    @Override // com.theinnerhour.b2b.utils.DispatcherProvider
    /* renamed from: default  reason: not valid java name */
    public a0 mo11default() {
        return DispatcherProvider.DefaultImpls.m12default(this);
    }

    @Override // com.theinnerhour.b2b.utils.DispatcherProvider
    public a0 io() {
        return DispatcherProvider.DefaultImpls.io(this);
    }

    @Override // com.theinnerhour.b2b.utils.DispatcherProvider
    public a0 main() {
        return DispatcherProvider.DefaultImpls.main(this);
    }

    @Override // com.theinnerhour.b2b.utils.DispatcherProvider
    public a0 unconfined() {
        return DispatcherProvider.DefaultImpls.unconfined(this);
    }
}
