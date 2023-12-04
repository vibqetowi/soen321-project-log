package com.ifriend.chat.new_chat.list.adapter.delegates;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.imageview.ShapeableImageView;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemImageUserMessageBinding;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.ui.model.ChatPhotoMessageUi;
import com.ifriend.chat.new_chat.list.ui.model.ChatPhotoUserMessageUi;
import com.ifriend.chat.new_chat.list.viewModel.ListItemsClick;
import com.ifriend.ui.utils.ViewCoroutineScopeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: ImageMessageUserDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "Lcom/ifriend/chat/new_chat/list/ui/model/ChatPhotoUserMessageUi;", "Lcom/ifriend/chat/new_chat/databinding/ItemImageUserMessageBinding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ImageMessageUserDelegateKt$imageMessageUserDelegate$2 extends Lambda implements Function1<AdapterDelegateViewBindingViewHolder<ChatPhotoUserMessageUi, ItemImageUserMessageBinding>, Unit> {
    final /* synthetic */ ImageLoader $imageLoader;
    final /* synthetic */ ListItemsClick $itemsClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageMessageUserDelegateKt$imageMessageUserDelegate$2(ListItemsClick listItemsClick, ImageLoader imageLoader) {
        super(1);
        this.$itemsClick = listItemsClick;
        this.$imageLoader = imageLoader;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<ChatPhotoUserMessageUi, ItemImageUserMessageBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ListItemsClick itemsClick, AdapterDelegateViewBindingViewHolder this_adapterDelegateViewBinding, View view) {
        Intrinsics.checkNotNullParameter(itemsClick, "$itemsClick");
        Intrinsics.checkNotNullParameter(this_adapterDelegateViewBinding, "$this_adapterDelegateViewBinding");
        itemsClick.onPhotoClick((ChatPhotoMessageUi) this_adapterDelegateViewBinding.getItem());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<ChatPhotoUserMessageUi, ItemImageUserMessageBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ShapeableImageView shapeableImageView = adapterDelegateViewBinding.getBinding().itemImageUserView;
        final ListItemsClick listItemsClick = this.$itemsClick;
        shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.new_chat.list.adapter.delegates.ImageMessageUserDelegateKt$imageMessageUserDelegate$2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageMessageUserDelegateKt$imageMessageUserDelegate$2.invoke$lambda$0(ListItemsClick.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, this.$imageLoader));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageMessageUserDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ ImageLoader $imageLoader;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<ChatPhotoUserMessageUi, ItemImageUserMessageBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<ChatPhotoUserMessageUi, ItemImageUserMessageBinding> adapterDelegateViewBindingViewHolder, ImageLoader imageLoader) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$imageLoader = imageLoader;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FrameLayout root = this.$this_adapterDelegateViewBinding.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            final FrameLayout frameLayout = root;
            final ImageLoader imageLoader = this.$imageLoader;
            final AdapterDelegateViewBindingViewHolder<ChatPhotoUserMessageUi, ItemImageUserMessageBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            if (ViewCompat.isAttachedToWindow(frameLayout)) {
                BuildersKt__Builders_commonKt.launch$default(ViewCoroutineScopeKt.getViewScope(frameLayout), null, null, new ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2$1$1(imageLoader, adapterDelegateViewBindingViewHolder, null), 3, null);
            } else {
                frameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.ifriend.chat.new_chat.list.adapter.delegates.ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2$invoke$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        frameLayout.removeOnAttachStateChangeListener(this);
                        BuildersKt__Builders_commonKt.launch$default(ViewCoroutineScopeKt.getViewScope(view), null, null, new ImageMessageUserDelegateKt$imageMessageUserDelegate$2$2$1$1(imageLoader, adapterDelegateViewBindingViewHolder, null), 3, null);
                    }
                });
            }
        }
    }
}
