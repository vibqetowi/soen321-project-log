package com.ifriend.chat.new_chat.list.ui.recycler.animator;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemGiftUserMessageBinding;
import com.ifriend.chat.new_chat.databinding.ItemTextBotMessageBinding;
import com.ifriend.chat.new_chat.databinding.ItemTextUserMessageBinding;
import com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation.FadeInAnimation;
import com.ifriend.chat.new_chat.list.ui.model.GiftUserMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TextMessageBotUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TextMessageUserUiModel;
import com.ifriend.ui.textView.typer.ExperienceChangeTextView;
import com.ifriend.ui.textView.typer.TypingSettings;
import com.ifriend.ui.utils.Animations;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatItemAnimator.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0014J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/recycler/animator/ChatItemAnimator;", "Lcom/ifriend/chat/new_chat/list/ui/recycler/animator/OurDefaultItemAnimator;", "()V", "playedNewMsgAnimation", "", "", "typingAnimationList", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "animateAddImpl", "", "holder", "animateChange", "", "oldHolder", "newHolder", "preInfo", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;", "postInfo", "isRunning", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatItemAnimator extends OurDefaultItemAnimator {
    private final Set<String> playedNewMsgAnimation = new LinkedHashSet();
    private final Set<RecyclerView.ViewHolder> typingAnimationList = new LinkedHashSet();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TypingSettings typingSettings = new TypingSettings(new TypingSettings.Speed.SpeedUp(), new TypingSettings.Growth.FirstWordsByCharsThenByWords(new TypingSettings.Growth.ByChars(1), new TypingSettings.Growth.ByWords(true), 1));

    /* compiled from: ChatItemAnimator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/recycler/animator/ChatItemAnimator$Companion;", "", "()V", "typingSettings", "Lcom/ifriend/ui/textView/typer/TypingSettings;", "getTypingSettings", "()Lcom/ifriend/ui/textView/typer/TypingSettings;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TypingSettings getTypingSettings() {
            return ChatItemAnimator.typingSettings;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.chat.new_chat.list.ui.recycler.animator.OurDefaultItemAnimator
    public void animateAddImpl(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder = holder instanceof AdapterDelegateViewBindingViewHolder ? (AdapterDelegateViewBindingViewHolder) holder : null;
        Object item = adapterDelegateViewBindingViewHolder != null ? adapterDelegateViewBindingViewHolder.getItem() : null;
        TextMessageBotUiModel textMessageBotUiModel = item instanceof TextMessageBotUiModel ? (TextMessageBotUiModel) item : null;
        Object binding = adapterDelegateViewBindingViewHolder != null ? adapterDelegateViewBindingViewHolder.getBinding() : null;
        ItemTextBotMessageBinding itemTextBotMessageBinding = binding instanceof ItemTextBotMessageBinding ? (ItemTextBotMessageBinding) binding : null;
        if (adapterDelegateViewBindingViewHolder == null || textMessageBotUiModel == null || itemTextBotMessageBinding == null) {
            super.animateAddImpl(holder);
            return;
        }
        String tag = textMessageBotUiModel.getTag();
        if (!(textMessageBotUiModel.isNeedToAnimate() && !this.playedNewMsgAnimation.contains(tag))) {
            super.animateAddImpl(holder);
            return;
        }
        if (textMessageBotUiModel.getAnimation() instanceof FadeInAnimation) {
            Animations animations = Animations.INSTANCE;
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            animations.showWithAnimation(itemView, 300L);
        } else {
            holder.itemView.setAlpha(1.0f);
        }
        this.playedNewMsgAnimation.add(tag);
        dispatchAddFinished(holder);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder oldHolder, RecyclerView.ViewHolder newHolder, RecyclerView.ItemAnimator.ItemHolderInfo preInfo, RecyclerView.ItemAnimator.ItemHolderInfo postInfo) {
        ExperienceChangeTextView experienceChangeTextView;
        ExperienceChangeTextView experienceChangeTextView2;
        ExperienceChangeTextView experienceChangeTextView3;
        Intrinsics.checkNotNullParameter(oldHolder, "oldHolder");
        Intrinsics.checkNotNullParameter(newHolder, "newHolder");
        Intrinsics.checkNotNullParameter(preInfo, "preInfo");
        Intrinsics.checkNotNullParameter(postInfo, "postInfo");
        super.animateChange(oldHolder, newHolder, preInfo, postInfo);
        AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder = newHolder instanceof AdapterDelegateViewBindingViewHolder ? (AdapterDelegateViewBindingViewHolder) newHolder : null;
        Object item = adapterDelegateViewBindingViewHolder != null ? adapterDelegateViewBindingViewHolder.getItem() : null;
        TextMessageUserUiModel textMessageUserUiModel = item instanceof TextMessageUserUiModel ? (TextMessageUserUiModel) item : null;
        ViewBinding binding = adapterDelegateViewBindingViewHolder != null ? adapterDelegateViewBindingViewHolder.getBinding() : null;
        ItemTextUserMessageBinding itemTextUserMessageBinding = binding instanceof ItemTextUserMessageBinding ? (ItemTextUserMessageBinding) binding : null;
        if ((textMessageUserUiModel != null ? textMessageUserUiModel.getExperienceChange() : null) != null) {
            if (itemTextUserMessageBinding != null && (experienceChangeTextView3 = itemTextUserMessageBinding.experienceChange) != null) {
                experienceChangeTextView3.setExp(textMessageUserUiModel.getExperienceChange().intValue());
            }
            if (itemTextUserMessageBinding != null && (experienceChangeTextView2 = itemTextUserMessageBinding.experienceChange) != null) {
                ChatItemAnimatorKt.playExperienceAnimation$default(experienceChangeTextView2, 0L, 1, null);
            }
            return true;
        }
        if ((adapterDelegateViewBindingViewHolder != null ? adapterDelegateViewBindingViewHolder.getItem() : null) instanceof GiftUserMessageUiModel) {
            Object item2 = adapterDelegateViewBindingViewHolder != null ? adapterDelegateViewBindingViewHolder.getItem() : null;
            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.ifriend.chat.new_chat.list.ui.model.GiftUserMessageUiModel");
            GiftUserMessageUiModel giftUserMessageUiModel = (GiftUserMessageUiModel) item2;
            if (giftUserMessageUiModel.getExperienceChange() != null) {
                ViewBinding binding2 = adapterDelegateViewBindingViewHolder != null ? adapterDelegateViewBindingViewHolder.getBinding() : null;
                ItemGiftUserMessageBinding itemGiftUserMessageBinding = binding2 instanceof ItemGiftUserMessageBinding ? (ItemGiftUserMessageBinding) binding2 : null;
                if (itemGiftUserMessageBinding != null && (experienceChangeTextView = itemGiftUserMessageBinding.experienceChange) != null) {
                    experienceChangeTextView.setExp(giftUserMessageUiModel.getExperienceChange().intValue());
                    ChatItemAnimatorKt.playExperienceAnimation(experienceChangeTextView, 2000L);
                }
            }
            return true;
        }
        ExperienceChangeTextView experienceChangeTextView4 = itemTextUserMessageBinding != null ? itemTextUserMessageBinding.experienceChange : null;
        if (experienceChangeTextView4 != null) {
            experienceChangeTextView4.setVisibility(8);
        }
        return true;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.recycler.animator.OurDefaultItemAnimator, androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return super.isRunning() || (this.typingAnimationList.isEmpty() ^ true);
    }
}
