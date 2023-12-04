package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.selects.SelectInstance;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "", "", ExifInterface.LONGITUDE_EAST, "select", "Lkotlinx/coroutines/selects/SelectInstance;", "<anonymous parameter 1>", "", "element", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1 extends Lambda implements Function3<SelectInstance<?>, Object, Object, Function1<? super Throwable, ? extends Unit>> {
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1(BufferedChannel<E> bufferedChannel) {
        super(3);
        this.this$0 = bufferedChannel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Object $element;
        final /* synthetic */ SelectInstance<?> $select;
        final /* synthetic */ BufferedChannel<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj, BufferedChannel<E> bufferedChannel, SelectInstance<?> selectInstance) {
            super(1);
            this.$element = obj;
            this.this$0 = bufferedChannel;
            this.$select = selectInstance;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.$element != BufferedChannelKt.getCHANNEL_CLOSED()) {
                OnUndeliveredElementKt.callUndeliveredElement(this.this$0.onUndeliveredElement, this.$element, this.$select.getContext());
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Function1<Throwable, Unit> invoke(SelectInstance<?> selectInstance, Object obj, Object obj2) {
        return new AnonymousClass1(obj2, this.this$0, selectInstance);
    }
}
