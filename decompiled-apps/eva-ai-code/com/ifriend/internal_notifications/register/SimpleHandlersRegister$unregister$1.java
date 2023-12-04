package com.ifriend.internal_notifications.register;

import com.ifriend.internal_notifications.register.SimpleHandlersRegister;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SimpleHandlersRegister.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/internal_notifications/register/SimpleHandlersRegister$HandlerNode;", "invoke", "(Lcom/ifriend/internal_notifications/register/SimpleHandlersRegister$HandlerNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SimpleHandlersRegister$unregister$1 extends Lambda implements Function1<SimpleHandlersRegister.HandlerNode, Boolean> {
    final /* synthetic */ String $tag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleHandlersRegister$unregister$1(String str) {
        super(1);
        this.$tag = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SimpleHandlersRegister.HandlerNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.areEqual(it.getId(), this.$tag));
    }
}
