package com.ifriend.base.navigation.impl;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.CiceroneHolder;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RouterProviderImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0016H\u0016R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ifriend/base/navigation/impl/RouterProviderImpl;", "Lcom/ifriend/base/navigation/api/RouterProvider;", "Lcom/ifriend/base/navigation/api/CiceroneHolder;", "appCicerone", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/AppRouter;", "(Lcom/ifriend/base/navigation/api/cicerone/Cicerone;)V", "appRouter", "getAppRouter", "()Lcom/ifriend/base/navigation/api/AppRouter;", "chatRouter", "getChatRouter", "containers", "", "", "route", "getRoute", "clearCicerone", "", "containerTag", "getCicerone", "defaultValue", "Lkotlin/Function0;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RouterProviderImpl implements RouterProvider, CiceroneHolder {
    private final AppRouter appRouter;
    private final Map<String, Cicerone<AppRouter>> containers;

    @Inject
    public RouterProviderImpl(Cicerone<AppRouter> appCicerone) {
        Intrinsics.checkNotNullParameter(appCicerone, "appCicerone");
        this.containers = new LinkedHashMap();
        this.appRouter = appCicerone.getRouter();
    }

    @Override // com.ifriend.base.navigation.api.RouterProvider
    public AppRouter getAppRouter() {
        return this.appRouter;
    }

    @Override // com.ifriend.base.navigation.api.RouterProvider
    public AppRouter getChatRouter() {
        Cicerone<AppRouter> cicerone = this.containers.get(RouterProviderImplKt.CHAT_CICERONE_TAG);
        if (cicerone != null) {
            return cicerone.getRouter();
        }
        return null;
    }

    @Override // com.ifriend.base.navigation.api.RouterProvider
    public AppRouter getRoute() {
        AppRouter chatRouter = getChatRouter();
        return chatRouter == null ? getAppRouter() : chatRouter;
    }

    @Override // com.ifriend.base.navigation.api.CiceroneHolder
    public Cicerone<AppRouter> getCicerone(String containerTag, Function0<Cicerone<AppRouter>> defaultValue) {
        Intrinsics.checkNotNullParameter(containerTag, "containerTag");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Map<String, Cicerone<AppRouter>> map = this.containers;
        Cicerone<AppRouter> cicerone = map.get(containerTag);
        if (cicerone == null) {
            cicerone = defaultValue.invoke();
            map.put(containerTag, cicerone);
        }
        return cicerone;
    }

    @Override // com.ifriend.base.navigation.api.CiceroneHolder
    public void clearCicerone(String containerTag) {
        Intrinsics.checkNotNullParameter(containerTag, "containerTag");
        this.containers.remove(containerTag);
    }
}
