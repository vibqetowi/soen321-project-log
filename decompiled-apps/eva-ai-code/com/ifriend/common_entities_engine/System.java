package com.ifriend.common_entities_engine;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_entities_engine.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: System.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u000f\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0004¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0019\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0005¢\u0006\u0002\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0004¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0004¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u000eR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/ifriend/common_entities_engine/System;", ExifInterface.LATITUDE_SOUTH, "Lcom/ifriend/common_entities_engine/State;", "", "()V", "binder", "Lcom/ifriend/common_entities_engine/SystemBinder;", "<set-?>", "", "isStarted", "()Z", "setStarted$common_entities_engine", "(Z)V", "bind", "", "currentState", "()Lcom/ifriend/common_entities_engine/State;", "onHandleEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "onStop", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEvent", "(Lcom/ifriend/common_entities_engine/Event;)Lkotlin/Unit;", "reportUpdateState", "()Lkotlin/Unit;", "throwException", "exception", "", "(Ljava/lang/Throwable;)Lkotlin/Unit;", "unbind", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class System<S extends State> {
    private SystemBinder<S> binder;
    private boolean isStarted;

    static /* synthetic */ <S extends State> Object onUpdateState$suspendImpl(System<S> system, S s, Continuation<? super S> continuation) {
        return s;
    }

    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public Object onUpdateState(S s, Continuation<? super S> continuation) {
        return onUpdateState$suspendImpl(this, s, continuation);
    }

    public final boolean isStarted() {
        return this.isStarted;
    }

    public final void setStarted$common_entities_engine(boolean z) {
        this.isStarted = z;
    }

    public final void bind(SystemBinder<S> binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.binder = binder;
    }

    public final void unbind() {
        this.binder = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Unit postEvent(Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        SystemBinder<S> systemBinder = this.binder;
        if (systemBinder != null) {
            systemBinder.postEvent(event);
            return Unit.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Unit throwException(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        SystemBinder<S> systemBinder = this.binder;
        if (systemBinder != null) {
            systemBinder.throwException(this, exception);
            return Unit.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S currentState() {
        SystemBinder<S> systemBinder = this.binder;
        if (systemBinder != null) {
            return systemBinder.currentState();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Unit reportUpdateState() {
        SystemBinder<S> systemBinder = this.binder;
        if (systemBinder != null) {
            systemBinder.reportUpdateState(this);
            return Unit.INSTANCE;
        }
        return null;
    }
}
