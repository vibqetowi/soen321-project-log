package com.ifriend.base.navigation.api.cicerone;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ResultWire.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/base/navigation/api/cicerone/ResultWire;", "", "()V", "listeners", "", "", "Lcom/ifriend/base/navigation/api/cicerone/ResultListener;", "sendResult", "", "key", "data", "setResultListener", "Lcom/ifriend/base/navigation/api/cicerone/ResultListenerHandler;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResultWire {
    private final Map<String, ResultListener> listeners = new LinkedHashMap();

    public final ResultListenerHandler setResultListener(final String key, ResultListener listener) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.put(key, listener);
        return new ResultListenerHandler() { // from class: com.ifriend.base.navigation.api.cicerone.ResultWire$$ExternalSyntheticLambda0
            @Override // com.ifriend.base.navigation.api.cicerone.ResultListenerHandler
            public final void dispose() {
                ResultWire.setResultListener$lambda$0(ResultWire.this, key);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setResultListener$lambda$0(ResultWire this$0, String key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        this$0.listeners.remove(key);
    }

    public final void sendResult(String key, Object data) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        ResultListener remove = this.listeners.remove(key);
        if (remove != null) {
            remove.onResult(data);
        }
    }
}
