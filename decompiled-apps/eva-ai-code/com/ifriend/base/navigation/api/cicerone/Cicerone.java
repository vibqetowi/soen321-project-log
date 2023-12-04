package com.ifriend.base.navigation.api.cicerone;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.base.navigation.api.cicerone.BaseRouter;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Cicerone.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/base/navigation/api/cicerone/BaseRouter;", "", "router", "(Lcom/ifriend/base/navigation/api/cicerone/BaseRouter;)V", "getRouter", "()Lcom/ifriend/base/navigation/api/cicerone/BaseRouter;", "Lcom/ifriend/base/navigation/api/cicerone/BaseRouter;", "getNavigatorHolder", "Lcom/ifriend/base/navigation/api/cicerone/NavigatorHolder;", "Companion", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Cicerone<T extends BaseRouter> {
    public static final Companion Companion = new Companion(null);
    private final T router;

    public /* synthetic */ Cicerone(BaseRouter baseRouter, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseRouter);
    }

    @JvmStatic
    public static final Cicerone<Router> create() {
        return Companion.create();
    }

    @JvmStatic
    public static final <T extends BaseRouter> Cicerone<T> create(T t) {
        return Companion.create(t);
    }

    private Cicerone(T t) {
        this.router = t;
    }

    public final T getRouter() {
        return this.router;
    }

    public final NavigatorHolder getNavigatorHolder() {
        return this.router.getCommandBuffer$api();
    }

    /* compiled from: Cicerone.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J%\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0006H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/ifriend/base/navigation/api/cicerone/Cicerone$Companion;", "", "()V", "create", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/cicerone/Router;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/base/navigation/api/cicerone/BaseRouter;", "customRouter", "(Lcom/ifriend/base/navigation/api/cicerone/BaseRouter;)Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final Cicerone<Router> create() {
            return create(new Router());
        }

        @JvmStatic
        public final <T extends BaseRouter> Cicerone<T> create(T customRouter) {
            Intrinsics.checkNotNullParameter(customRouter, "customRouter");
            return new Cicerone<>(customRouter, null);
        }
    }
}
