package com.ifriend.ui.utils.composables;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes4.dex */
final class RememberKt$rememberAction$2$1 extends Lambda implements Function0<R> {
    final /* synthetic */ Function0<R> $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberKt$rememberAction$2$1(Function0<? extends R> function0) {
        super(0);
        this.$action = function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final R invoke() {
        return this.$action.invoke();
    }
}
