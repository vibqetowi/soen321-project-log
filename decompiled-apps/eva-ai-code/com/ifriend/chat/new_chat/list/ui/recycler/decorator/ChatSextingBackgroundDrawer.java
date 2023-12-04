package com.ifriend.chat.new_chat.list.ui.recycler.decorator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemTextBotSextingMessageBinding;
import com.ifriend.chat.new_chat.list.ui.model.PaidTextMessageFromBotUi;
import com.ifriend.ui.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: ChatSextingBackgroundDrawer.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0015\u0010\u001b\u001a\u00020\u001c\"\u0006\b\u0000\u0010\u001d\u0018\u0001*\u00020\rH\u0082\bR.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b`\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/ChatSextingBackgroundDrawer;", "", "chatDecorationRule", "Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/ChatDecorationRule;", "(Lcom/ifriend/chat/new_chat/list/ui/recycler/decorator/ChatDecorationRule;)V", "animators", "Ljava/util/HashMap;", "", "Landroid/animation/ValueAnimator;", "Lkotlin/collections/HashMap;", "castViewHolderIfValid", "Lcom/ifriend/chat/new_chat/databinding/ItemTextBotSextingMessageBinding;", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "draw", "", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "canvas", "Landroid/graphics/Canvas;", "drawSingleItem", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getAnimatorDeltaY", "initAnimatorIfRequired", "releaseAnimator", "releaseAnimatorIfRequired", "contains", "", ExifInterface.GPS_DIRECTION_TRUE, "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSextingBackgroundDrawer {
    public static final int $stable = 8;
    private HashMap<Integer, ValueAnimator> animators;
    private final ChatDecorationRule chatDecorationRule;

    public ChatSextingBackgroundDrawer(ChatDecorationRule chatDecorationRule) {
        Intrinsics.checkNotNullParameter(chatDecorationRule, "chatDecorationRule");
        this.chatDecorationRule = chatDecorationRule;
        this.animators = new HashMap<>();
    }

    public final void draw(RecyclerView parent, Canvas canvas) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            drawSingleItem(parent, childAt, canvas);
        }
    }

    private final void drawSingleItem(RecyclerView recyclerView, View view, Canvas canvas) {
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        Intrinsics.checkNotNullExpressionValue(childViewHolder, "getChildViewHolder(...)");
        ItemTextBotSextingMessageBinding castViewHolderIfValid = castViewHolderIfValid(childViewHolder);
        if (castViewHolderIfValid == null) {
            return;
        }
        initAnimatorIfRequired(view, recyclerView);
        releaseAnimatorIfRequired(view);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R.drawable.bg_sexting);
        int animatorDeltaY = getAnimatorDeltaY(view);
        if (drawable != null) {
            drawable.setBounds(castViewHolderIfValid.getRoot().getLeft() - (this.chatDecorationRule.getMarginLeft() * 2), (castViewHolderIfValid.getRoot().getTop() - (this.chatDecorationRule.getMarginTop() * 6)) + animatorDeltaY, castViewHolderIfValid.getRoot().getLeft() + castViewHolderIfValid.itemSextingMessageBotText.getRight() + (this.chatDecorationRule.getMarginRight() * 2), castViewHolderIfValid.getRoot().getBottom() + (this.chatDecorationRule.getMarginBottom() * 6) + animatorDeltaY);
        }
        if (drawable != null) {
            drawable.setAlpha(MathKt.roundToInt(view.getAlpha() * 255));
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    private final ItemTextBotSextingMessageBinding castViewHolderIfValid(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder = viewHolder instanceof AdapterDelegateViewBindingViewHolder ? (AdapterDelegateViewBindingViewHolder) viewHolder : null;
        if ((adapterDelegateViewBindingViewHolder != null ? adapterDelegateViewBindingViewHolder.getItem() : null) instanceof PaidTextMessageFromBotUi) {
            ViewBinding binding = adapterDelegateViewBindingViewHolder.getBinding();
            if (binding instanceof ItemTextBotSextingMessageBinding) {
                return (ItemTextBotSextingMessageBinding) binding;
            }
            return null;
        }
        return null;
    }

    private final /* synthetic */ <T> boolean contains(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder = viewHolder instanceof AdapterDelegateViewBindingViewHolder ? (AdapterDelegateViewBindingViewHolder) viewHolder : null;
        Object item = adapterDelegateViewBindingViewHolder != null ? adapterDelegateViewBindingViewHolder.getItem() : null;
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        return item instanceof Object;
    }

    private final void initAnimatorIfRequired(final View view, RecyclerView recyclerView) {
        if (this.animators.get(Integer.valueOf(view.hashCode())) != null) {
            ValueAnimator valueAnimator = this.animators.get(Integer.valueOf(view.hashCode()));
            if (!((valueAnimator == null || valueAnimator.isRunning()) ? false : true)) {
                return;
            }
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null && itemAnimator.isRunning()) {
            Integer valueOf = Integer.valueOf(view.hashCode());
            ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getTranslationY());
            ofFloat.setDuration(2000L);
            Intrinsics.checkNotNull(ofFloat);
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ifriend.chat.new_chat.list.ui.recycler.decorator.ChatSextingBackgroundDrawer$initAnimatorIfRequired$lambda$2$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animator");
                    ChatSextingBackgroundDrawer.this.releaseAnimator(view);
                }
            });
            ofFloat.start();
            this.animators.put(valueOf, ofFloat);
        }
    }

    private final void releaseAnimatorIfRequired(View view) {
        if (view.getTranslationY() == 0.0f) {
            releaseAnimator(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseAnimator(View view) {
        ValueAnimator valueAnimator = this.animators.get(Integer.valueOf(view.hashCode()));
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animators.put(Integer.valueOf(view.hashCode()), null);
        this.animators.remove(Integer.valueOf(view.hashCode()));
    }

    private final int getAnimatorDeltaY(View view) {
        float abs = Math.abs(view.getTranslationY());
        ValueAnimator valueAnimator = this.animators.get(Integer.valueOf(view.hashCode()));
        Float f = (Float) (valueAnimator != null ? valueAnimator.getAnimatedValue() : null);
        if (abs >= Math.abs(f != null ? f.floatValue() : 0.0f)) {
            float translationY = view.getTranslationY();
            ValueAnimator valueAnimator2 = this.animators.get(Integer.valueOf(view.hashCode()));
            Float f2 = (Float) (valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null);
            return (int) (translationY - (f2 != null ? f2.floatValue() : 0.0f));
        }
        return 0;
    }
}
