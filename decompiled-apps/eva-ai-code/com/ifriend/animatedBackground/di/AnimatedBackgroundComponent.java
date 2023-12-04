package com.ifriend.animatedBackground.di;

import android.content.Context;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.animatedBackground.droplet.DropletBackgroundView;
import com.ifriend.animatedBackground.droplet.JsExecutor;
import com.ifriend.base.di.BaseComponent;
import com.ifriend.base.di.Feature;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedBackgroundComponent.kt */
@Component(dependencies = {BaseComponent.class})
@Feature
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00072\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ifriend/animatedBackground/di/AnimatedBackgroundComponent;", "", "inject", "", ViewHierarchyConstants.VIEW_KEY, "Lcom/ifriend/animatedBackground/droplet/DropletBackgroundView;", "Builder", "Companion", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnimatedBackgroundComponent {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: AnimatedBackgroundComponent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ifriend/animatedBackground/di/AnimatedBackgroundComponent$Builder;", "", "build", "Lcom/ifriend/animatedBackground/di/AnimatedBackgroundComponent;", "context", "Landroid/content/Context;", "coreComponent", "core", "Lcom/ifriend/base/di/BaseComponent;", "jsExecutor", "Lcom/ifriend/animatedBackground/droplet/JsExecutor;", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Component.Builder
    /* loaded from: classes6.dex */
    public interface Builder {
        AnimatedBackgroundComponent build();

        Builder context(@BindsInstance @AnimatedBackgroundQualifier Context context);

        Builder coreComponent(BaseComponent baseComponent);

        Builder jsExecutor(@BindsInstance JsExecutor jsExecutor);
    }

    void inject(DropletBackgroundView dropletBackgroundView);

    /* compiled from: AnimatedBackgroundComponent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/animatedBackground/di/AnimatedBackgroundComponent$Companion;", "", "()V", "build", "Lcom/ifriend/animatedBackground/di/AnimatedBackgroundComponent;", "core", "Lcom/ifriend/base/di/BaseComponent;", "context", "Landroid/content/Context;", "jsExecutor", "Lcom/ifriend/animatedBackground/droplet/JsExecutor;", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AnimatedBackgroundComponent build(BaseComponent core, Context context, JsExecutor jsExecutor) {
            Intrinsics.checkNotNullParameter(core, "core");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(jsExecutor, "jsExecutor");
            return DaggerAnimatedBackgroundComponent.builder().coreComponent(core).context(context).jsExecutor(jsExecutor).build();
        }
    }
}
