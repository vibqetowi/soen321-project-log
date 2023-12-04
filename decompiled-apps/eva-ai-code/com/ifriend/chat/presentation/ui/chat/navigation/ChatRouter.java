package com.ifriend.chat.presentation.ui.chat.navigation;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.cicerone.BackTo;
import com.ifriend.base.navigation.api.cicerone.Command;
import com.ifriend.base.navigation.api.cicerone.Forward;
import com.ifriend.base.navigation.api.cicerone.Screen;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
/* compiled from: ChatRouter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatRouter;", "Lcom/ifriend/base/navigation/api/AppRouter;", "()V", "finishChain", "", "newRootChain", "screens", "", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "([Lcom/ifriend/base/navigation/api/cicerone/Screen;)V", "newRootScreen", "screen", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatRouter extends AppRouter {
    public static final int $stable = 0;

    @Override // com.ifriend.base.navigation.api.cicerone.Router
    public void newRootScreen(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        executeCommands(new BackTo(null), new Forward(screen));
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Router
    public void finishChain() {
        executeCommands(new BackTo(null));
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Router
    public void newRootChain(Screen... screens) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        ArrayList arrayList = new ArrayList(screens.length);
        for (Screen screen : screens) {
            arrayList.add(new Forward(screen));
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(new BackTo(null));
        spreadBuilder.addSpread(arrayList.toArray(new Forward[0]));
        executeCommands((Command[]) spreadBuilder.toArray(new Command[spreadBuilder.size()]));
    }
}
