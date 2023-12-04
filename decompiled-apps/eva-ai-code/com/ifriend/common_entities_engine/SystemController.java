package com.ifriend.common_entities_engine;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.common_entities_engine.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SystemController.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ\u0014\u0010\u000e\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ)\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/ifriend/common_entities_engine/SystemController;", ExifInterface.LATITUDE_SOUTH, "Lcom/ifriend/common_entities_engine/State;", "", "()V", "handle", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "system", "Lcom/ifriend/common_entities_engine/System;", "(Lcom/ifriend/common_entities_engine/Event;Lcom/ifriend/common_entities_engine/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TtmlNode.START, "", "stop", "updateState", "state", "updateState$common_entities_engine", "(Lcom/ifriend/common_entities_engine/State;Lcom/ifriend/common_entities_engine/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SystemController<S extends State> {
    public final void start(System<S> system) {
        Intrinsics.checkNotNullParameter(system, "system");
        if (system.isStarted()) {
            return;
        }
        system.setStarted$common_entities_engine(true);
        system.onStart();
    }

    public final void stop(System<S> system) {
        Intrinsics.checkNotNullParameter(system, "system");
        if (system.isStarted()) {
            system.setStarted$common_entities_engine(false);
            system.onStop();
        }
    }

    public final Object updateState$common_entities_engine(S s, System<S> system, Continuation<? super S> continuation) {
        if (system.isStarted()) {
            Object onUpdateState = system.onUpdateState(s, continuation);
            return onUpdateState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? onUpdateState : (State) onUpdateState;
        }
        return s;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handle(Event event, System<S> system, Continuation<? super Boolean> continuation) {
        SystemController$handle$1 systemController$handle$1;
        int i;
        boolean z;
        if (continuation instanceof SystemController$handle$1) {
            systemController$handle$1 = (SystemController$handle$1) continuation;
            if ((systemController$handle$1.label & Integer.MIN_VALUE) != 0) {
                systemController$handle$1.label -= Integer.MIN_VALUE;
                Object obj = systemController$handle$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = systemController$handle$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!system.isStarted()) {
                        z = false;
                        return Boxing.boxBoolean(z);
                    }
                    systemController$handle$1.label = 1;
                    obj = system.onHandleEvent(event, systemController$handle$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                z = ((Boolean) obj).booleanValue();
                return Boxing.boxBoolean(z);
            }
        }
        systemController$handle$1 = new SystemController$handle$1(this, continuation);
        Object obj2 = systemController$handle$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = systemController$handle$1.label;
        if (i != 0) {
        }
        z = ((Boolean) obj2).booleanValue();
        return Boxing.boxBoolean(z);
    }
}
