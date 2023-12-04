package com.ifriend.base.navigation.api.cicerone;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
/* compiled from: CommandBuffer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/base/navigation/api/cicerone/CommandBuffer;", "Lcom/ifriend/base/navigation/api/cicerone/NavigatorHolder;", "()V", "mainHandler", "Lkotlinx/coroutines/CoroutineScope;", "navigator", "Lcom/ifriend/base/navigation/api/cicerone/Navigator;", "getNavigator$api", "()Lcom/ifriend/base/navigation/api/cicerone/Navigator;", "setNavigator$api", "(Lcom/ifriend/base/navigation/api/cicerone/Navigator;)V", "pendingCommands", "", "", "Lcom/ifriend/base/navigation/api/cicerone/Command;", "executeCommands", "", "commands", "([Lcom/ifriend/base/navigation/api/cicerone/Command;)V", "removeNavigator", "setNavigator", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommandBuffer implements NavigatorHolder {
    private Navigator navigator;
    private final List<Command[]> pendingCommands = new ArrayList();
    private final CoroutineScope mainHandler = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));

    public final Navigator getNavigator$api() {
        return this.navigator;
    }

    public final void setNavigator$api(Navigator navigator) {
        this.navigator = navigator;
    }

    @Override // com.ifriend.base.navigation.api.cicerone.NavigatorHolder
    public void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.navigator = navigator;
        for (Command[] commandArr : this.pendingCommands) {
            navigator.applyCommands(commandArr);
        }
        this.pendingCommands.clear();
    }

    @Override // com.ifriend.base.navigation.api.cicerone.NavigatorHolder
    public void removeNavigator() {
        this.navigator = null;
    }

    public final void executeCommands(Command[] commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        BuildersKt__Builders_commonKt.launch$default(this.mainHandler, null, null, new CommandBuffer$executeCommands$1(this, commands, null), 3, null);
    }
}
