package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "e", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ExceptionsConstructorKt$safeCtor$1 extends Lambda implements Function1<Throwable, Throwable> {
    final /* synthetic */ Function1<Throwable, Throwable> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExceptionsConstructorKt$safeCtor$1(Function1<? super Throwable, ? extends Throwable> function1) {
        super(1);
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(Throwable th) {
        Object m7271constructorimpl;
        Function1<Throwable, Throwable> function1 = this.$block;
        try {
            Result.Companion companion = Result.Companion;
            Throwable invoke = function1.invoke(th);
            if (!Intrinsics.areEqual(th.getMessage(), invoke.getMessage()) && !Intrinsics.areEqual(invoke.getMessage(), th.toString())) {
                invoke = null;
            }
            m7271constructorimpl = Result.m7271constructorimpl(invoke);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th2));
        }
        return Result.m7277isFailureimpl(m7271constructorimpl) ? null : m7271constructorimpl;
    }
}
