package com.ifriend.chat.new_chat.list.adapter.delegates;

import com.google.android.material.imageview.ShapeableImageView;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemGiftUserMessageBinding;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.ui.model.GiftUserMessageUiModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: GiftMessageDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.adapter.delegates.GiftMessageDelegateKt$giftMessageUserDelegate$2$1$1$1", f = "GiftMessageDelegate.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class GiftMessageDelegateKt$giftMessageUserDelegate$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImageLoader $imageLoader;
    final /* synthetic */ AdapterDelegateViewBindingViewHolder<GiftUserMessageUiModel, ItemGiftUserMessageBinding> $this_adapterDelegateViewBinding;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftMessageDelegateKt$giftMessageUserDelegate$2$1$1$1(ImageLoader imageLoader, AdapterDelegateViewBindingViewHolder<GiftUserMessageUiModel, ItemGiftUserMessageBinding> adapterDelegateViewBindingViewHolder, Continuation<? super GiftMessageDelegateKt$giftMessageUserDelegate$2$1$1$1> continuation) {
        super(2, continuation);
        this.$imageLoader = imageLoader;
        this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GiftMessageDelegateKt$giftMessageUserDelegate$2$1$1$1(this.$imageLoader, this.$this_adapterDelegateViewBinding, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GiftMessageDelegateKt$giftMessageUserDelegate$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ImageLoader imageLoader = this.$imageLoader;
            ShapeableImageView itemGiftUserView = this.$this_adapterDelegateViewBinding.getBinding().itemGiftUserView;
            Intrinsics.checkNotNullExpressionValue(itemGiftUserView, "itemGiftUserView");
            this.label = 1;
            if (ImageLoader.DefaultImpls.load$default(imageLoader, itemGiftUserView, this.$this_adapterDelegateViewBinding.getItem().getImageUrl(), null, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
