package com.ifriend.chat.new_chat.list.adapter.delegates;

import com.google.android.material.imageview.ShapeableImageView;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemImageUserMessageBinding;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.ui.model.ChatPhotoUserMessageUi;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ImageMessageUserDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.adapter.delegates.ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2$1$1", f = "ImageMessageUserDelegate.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImageLoader $imageLoader;
    final /* synthetic */ AdapterDelegateViewBindingViewHolder<ChatPhotoUserMessageUi, ItemImageUserMessageBinding> $this_adapterDelegateViewBinding;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2$1$1(ImageLoader imageLoader, AdapterDelegateViewBindingViewHolder<ChatPhotoUserMessageUi, ItemImageUserMessageBinding> adapterDelegateViewBindingViewHolder, Continuation<? super ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2$1$1> continuation) {
        super(2, continuation);
        this.$imageLoader = imageLoader;
        this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2$1$1(this.$imageLoader, this.$this_adapterDelegateViewBinding, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ImageLoader imageLoader = this.$imageLoader;
            ShapeableImageView itemImageUserView = this.$this_adapterDelegateViewBinding.getBinding().itemImageUserView;
            Intrinsics.checkNotNullExpressionValue(itemImageUserView, "itemImageUserView");
            this.label = 1;
            if (imageLoader.load(itemImageUserView, this.$this_adapterDelegateViewBinding.getItem().getPreviewImageUrl(), Boxing.boxInt(R.drawable.placeholder_bot_image), this) == coroutine_suspended) {
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
