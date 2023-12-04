package com.ifriend.base.navigation.api.cicerone;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
/* compiled from: Router.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\f\"\u00020\u0006¢\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\f\"\u00020\u0006H\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/base/navigation/api/cicerone/Router;", "Lcom/ifriend/base/navigation/api/cicerone/BaseRouter;", "()V", "backTo", "", "screen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "exit", "finishChain", "navigateTo", "newChain", "screens", "", "([Lcom/ifriend/base/navigation/api/cicerone/Screen;)V", "newRootChain", "newRootScreen", "replaceScreen", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class Router extends BaseRouter {
    public final void navigateTo(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        executeCommands(new Forward(screen));
    }

    public void newRootScreen(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        executeCommands(new BackTo(null), new Replace(screen));
    }

    public final void replaceScreen(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        executeCommands(new Replace(screen));
    }

    public final void backTo(Screen screen) {
        executeCommands(new BackTo(screen));
    }

    public void finishChain() {
        executeCommands(new BackTo(null), new Back());
    }

    public final void exit() {
        executeCommands(new Back());
    }

    public final void newChain(Screen... screens) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        ArrayList arrayList = new ArrayList(screens.length);
        for (Screen screen : screens) {
            arrayList.add(new Forward(screen));
        }
        Forward[] forwardArr = (Forward[]) arrayList.toArray(new Forward[0]);
        executeCommands((Command[]) Arrays.copyOf(forwardArr, forwardArr.length));
    }

    public void newRootChain(Screen... screens) {
        Command forward;
        Intrinsics.checkNotNullParameter(screens, "screens");
        ArrayList arrayList = new ArrayList(screens.length);
        int length = screens.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Screen screen = screens[i];
            int i3 = i2 + 1;
            if (i2 == 0) {
                forward = new Replace(screen);
            } else {
                forward = new Forward(screen);
            }
            arrayList.add(forward);
            i++;
            i2 = i3;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(new BackTo(null));
        spreadBuilder.addSpread(arrayList.toArray(new Command[0]));
        executeCommands((Command[]) spreadBuilder.toArray(new Command[spreadBuilder.size()]));
    }
}
