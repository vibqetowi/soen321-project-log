package com.ifriend.internal_notifications.register;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AutoRemoveTerminatedHandlersRegister.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/internal_notifications/register/AutoRemoveTerminatedHandlersRegister;", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "delegate", "(Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;)V", "register", "", ViewHierarchyConstants.TAG_KEY, "", "handler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "registeredHandlers", "", "unregister", "RemoveHandlerListener", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoRemoveTerminatedHandlersRegister implements InternalNotificationHandlersRegister {
    private final InternalNotificationHandlersRegister delegate;

    public AutoRemoveTerminatedHandlersRegister() {
        this(null, 1, null);
    }

    @Override // com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister
    public List<InternalNotificationHandler> registeredHandlers() {
        return this.delegate.registeredHandlers();
    }

    @Override // com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister
    public void unregister(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.delegate.unregister(tag);
    }

    public AutoRemoveTerminatedHandlersRegister(InternalNotificationHandlersRegister delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public /* synthetic */ AutoRemoveTerminatedHandlersRegister(SimpleHandlersRegister simpleHandlersRegister, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SimpleHandlersRegister() : simpleHandlersRegister);
    }

    @Override // com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister
    public void register(String tag, InternalNotificationHandler handler) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.delegate.register(tag, handler);
        handler.addListener(new RemoveHandlerListener(new AutoRemoveTerminatedHandlersRegister$register$1(this, tag)));
    }

    /* compiled from: AutoRemoveTerminatedHandlersRegister.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/internal_notifications/register/AutoRemoveTerminatedHandlersRegister$RemoveHandlerListener;", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$OnStateChangedListener;", "deleteHandler", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onStateChanged", "newState", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler$State;", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class RemoveHandlerListener implements InternalNotificationHandler.OnStateChangedListener {
        private final Function0<Unit> deleteHandler;

        public RemoveHandlerListener(Function0<Unit> deleteHandler) {
            Intrinsics.checkNotNullParameter(deleteHandler, "deleteHandler");
            this.deleteHandler = deleteHandler;
        }

        @Override // com.ifriend.internal_notifications.handler.InternalNotificationHandler.OnStateChangedListener
        public void onStateChanged(InternalNotificationHandler.State newState) {
            Intrinsics.checkNotNullParameter(newState, "newState");
            if (newState == InternalNotificationHandler.State.TERMINATED) {
                this.deleteHandler.invoke();
            }
        }
    }
}
