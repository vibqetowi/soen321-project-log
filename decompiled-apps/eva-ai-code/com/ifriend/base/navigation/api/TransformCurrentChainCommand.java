package com.ifriend.base.navigation.api;

import com.ifriend.base.navigation.api.cicerone.Command;
import com.ifriend.base.navigation.api.cicerone.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppNavigationCommands.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/base/navigation/api/TransformCurrentChainCommand;", "Lcom/ifriend/base/navigation/api/cicerone/Command;", "chain", "", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "(Ljava/util/List;)V", "getChain", "()Ljava/util/List;", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformCurrentChainCommand implements Command {
    private final List<Screen> chain;

    /* JADX WARN: Multi-variable type inference failed */
    public TransformCurrentChainCommand(List<? extends Screen> chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.chain = chain;
    }

    public final List<Screen> getChain() {
        return this.chain;
    }
}
