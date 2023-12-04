package com.ifriend.ui.utils.composables;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "R", "P", TtmlNode.TAG_P, "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes4.dex */
final class RememberKt$rememberFunction$1$1 extends Lambda implements Function1<P, R> {
    final /* synthetic */ Function1<P, R> $function;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberKt$rememberFunction$1$1(Function1<? super P, ? extends R> function1) {
        super(1);
        this.$function = function1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [R, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final R invoke(P p) {
        return this.$function.invoke(p);
    }
}
