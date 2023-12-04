package com.ifriend.base.navigation.api;

import com.ifriend.base.navigation.api.cicerone.Router;
import com.ifriend.base.navigation.api.cicerone.Screen;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppRouter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J!\u0010\u0007\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/base/navigation/api/AppRouter;", "Lcom/ifriend/base/navigation/api/cicerone/Router;", "()V", "forwardIfNotInStack", "", "screen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "transformCurrentChain", "screens", "", "([Lcom/ifriend/base/navigation/api/cicerone/Screen;)V", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AppRouter extends Router {
    public final void transformCurrentChain(Screen... screens) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        executeCommands(new TransformCurrentChainCommand(ArraysKt.toList(screens)));
    }

    public final void forwardIfNotInStack(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        executeCommands(new ForwardIfNotInStack(screen));
    }
}
