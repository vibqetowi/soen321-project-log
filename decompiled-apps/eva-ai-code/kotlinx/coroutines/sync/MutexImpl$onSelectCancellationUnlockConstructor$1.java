package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.selects.SelectInstance;
/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "", "", "<anonymous parameter 0>", "Lkotlinx/coroutines/selects/SelectInstance;", "owner", "", "<anonymous parameter 2>", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class MutexImpl$onSelectCancellationUnlockConstructor$1 extends Lambda implements Function3<SelectInstance<?>, Object, Object, Function1<? super Throwable, ? extends Unit>> {
    final /* synthetic */ MutexImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutexImpl$onSelectCancellationUnlockConstructor$1(MutexImpl mutexImpl) {
        super(3);
        this.this$0 = mutexImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Object $owner;
        final /* synthetic */ MutexImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutexImpl mutexImpl, Object obj) {
            super(1);
            this.this$0 = mutexImpl;
            this.$owner = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.this$0.unlock(this.$owner);
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Function1<Throwable, Unit> invoke(SelectInstance<?> selectInstance, Object obj, Object obj2) {
        return new AnonymousClass1(this.this$0, obj);
    }
}
