package com.ifriend.ui.utils.composables;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00012\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "R", "P1", "P2", "p1", "p2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes4.dex */
final class RememberKt$rememberFunction$2$1 extends Lambda implements Function2<P1, P2, R> {
    final /* synthetic */ Function2<P1, P2, R> $function;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberKt$rememberFunction$2$1(Function2<? super P1, ? super P2, ? extends R> function2) {
        super(2);
        this.$function = function2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final R invoke(P1 p1, P2 p2) {
        return this.$function.invoke(p1, p2);
    }
}
