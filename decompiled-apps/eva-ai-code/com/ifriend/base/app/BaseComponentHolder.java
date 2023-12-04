package com.ifriend.base.app;

import com.ifriend.base.di.BaseComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BaseApp.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ifriend/base/app/BaseComponentHolder;", "", "()V", "component", "Lcom/ifriend/base/di/BaseComponent;", "getComponent", "()Lcom/ifriend/base/di/BaseComponent;", "setComponent", "(Lcom/ifriend/base/di/BaseComponent;)V", "get", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BaseComponentHolder {
    public static final BaseComponentHolder INSTANCE = new BaseComponentHolder();
    public static BaseComponent component;

    private BaseComponentHolder() {
    }

    public final BaseComponent getComponent() {
        BaseComponent baseComponent = component;
        if (baseComponent != null) {
            return baseComponent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        return null;
    }

    public final void setComponent(BaseComponent baseComponent) {
        Intrinsics.checkNotNullParameter(baseComponent, "<set-?>");
        component = baseComponent;
    }

    public final BaseComponent get() {
        return getComponent();
    }
}
