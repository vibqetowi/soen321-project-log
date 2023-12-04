package com.ifriend.internal_notifications.register;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SimpleHandlersRegister.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/internal_notifications/register/SimpleHandlersRegister;", "Lcom/ifriend/internal_notifications/register/InternalNotificationHandlersRegister;", "()V", "handlers", "", "Lcom/ifriend/internal_notifications/register/SimpleHandlersRegister$HandlerNode;", "getHandlers$internal_notifications", "()Ljava/util/List;", "register", "", ViewHierarchyConstants.TAG_KEY, "", "handler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "registeredHandlers", "", "unregister", "HandlerNode", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleHandlersRegister implements InternalNotificationHandlersRegister {
    private final List<HandlerNode> handlers = new ArrayList();

    public final List<HandlerNode> getHandlers$internal_notifications() {
        return this.handlers;
    }

    @Override // com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister
    public List<InternalNotificationHandler> registeredHandlers() {
        List<HandlerNode> list = this.handlers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (HandlerNode handlerNode : list) {
            arrayList.add(handlerNode.getHandler());
        }
        return arrayList;
    }

    @Override // com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister
    public void register(String tag, InternalNotificationHandler handler) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handlers.add(new HandlerNode(tag, handler));
    }

    @Override // com.ifriend.internal_notifications.register.InternalNotificationHandlersRegister
    public void unregister(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        CollectionsKt.removeAll((List) this.handlers, (Function1) new SimpleHandlersRegister$unregister$1(tag));
    }

    /* compiled from: SimpleHandlersRegister.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ifriend/internal_notifications/register/SimpleHandlersRegister$HandlerNode;", "", "id", "", "handler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "(Ljava/lang/String;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;)V", "getHandler", "()Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "getId", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "internal_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class HandlerNode {
        private final InternalNotificationHandler handler;
        private final String id;

        public HandlerNode(String id, InternalNotificationHandler handler) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.id = id;
            this.handler = handler;
        }

        public final String getId() {
            return this.id;
        }

        public final InternalNotificationHandler getHandler() {
            return this.handler;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ifriend.internal_notifications.register.SimpleHandlersRegister.HandlerNode");
                return Intrinsics.areEqual(this.id, ((HandlerNode) obj).id);
            }
            return false;
        }

        public int hashCode() {
            return this.id.hashCode();
        }
    }
}
