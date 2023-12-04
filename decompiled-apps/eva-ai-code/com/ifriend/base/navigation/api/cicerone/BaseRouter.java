package com.ifriend.base.navigation.api.cicerone;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BaseRouter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0004¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ifriend/base/navigation/api/cicerone/BaseRouter;", "", "()V", "commandBuffer", "Lcom/ifriend/base/navigation/api/cicerone/CommandBuffer;", "getCommandBuffer$api", "()Lcom/ifriend/base/navigation/api/cicerone/CommandBuffer;", "resultWire", "Lcom/ifriend/base/navigation/api/cicerone/ResultWire;", "executeCommands", "", "commands", "", "Lcom/ifriend/base/navigation/api/cicerone/Command;", "([Lcom/ifriend/base/navigation/api/cicerone/Command;)V", "getLocalStack", "", "", "sendResult", "key", "data", "setResultListener", "Lcom/ifriend/base/navigation/api/cicerone/ResultListenerHandler;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ifriend/base/navigation/api/cicerone/ResultListener;", "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseRouter {
    private final CommandBuffer commandBuffer = new CommandBuffer();
    private final ResultWire resultWire = new ResultWire();

    public final CommandBuffer getCommandBuffer$api() {
        return this.commandBuffer;
    }

    public final ResultListenerHandler setResultListener(String key, ResultListener listener) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.resultWire.setResultListener(key, listener);
    }

    public final void sendResult(String key, Object data) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        this.resultWire.sendResult(key, data);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void executeCommands(Command... commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        this.commandBuffer.executeCommands(commands);
    }

    public final List<String> getLocalStack() {
        Navigator navigator$api = this.commandBuffer.getNavigator$api();
        if (navigator$api != null) {
            return navigator$api.getLocalStack();
        }
        return null;
    }
}
