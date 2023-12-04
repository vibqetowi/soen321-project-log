package com.ifriend.app;

import com.ifriend.app.di.AppComponent;
import com.ifriend.app.di.DaggerAppComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: App.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/app/di/AppComponent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class App$appComponent$2 extends Lambda implements Function0<AppComponent> {
    final /* synthetic */ App this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public App$appComponent$2(App app) {
        super(0);
        this.this$0 = app;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppComponent invoke() {
        return DaggerAppComponent.builder().context(this.this$0).build();
    }
}
