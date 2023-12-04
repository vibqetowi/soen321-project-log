package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.recyclerView.audio.RecyclerExtensionKt;
import com.ifriend.ui.utils.Modification;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AvatarGenerationDescriptionOptionsAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0014\u0010\u0013\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/AvatarGenerationDescriptionOptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/AvatarGenerationDescriptionOptionsAdapter$AvatarGenerationDescriptionOptionViewHolder;", "onItemClick", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", FirebaseAnalytics.Param.ITEMS, "", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "AvatarGenerationDescriptionOptionViewHolder", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarGenerationDescriptionOptionsAdapter extends RecyclerView.Adapter<AvatarGenerationDescriptionOptionViewHolder> {
    public static final int $stable = 8;
    private List<String> items;
    private final Function1<Integer, Unit> onItemClick;

    /* JADX WARN: Multi-variable type inference failed */
    public AvatarGenerationDescriptionOptionsAdapter(Function1<? super Integer, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.onItemClick = onItemClick;
        this.items = CollectionsKt.emptyList();
    }

    /* compiled from: AvatarGenerationDescriptionOptionsAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/generateBotAvatar/AvatarGenerationDescriptionOptionsAdapter$AvatarGenerationDescriptionOptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/View;", "(Landroid/view/View;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AvatarGenerationDescriptionOptionViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarGenerationDescriptionOptionViewHolder(View parent) {
            super(parent);
            Intrinsics.checkNotNullParameter(parent, "parent");
            View findViewById = parent.findViewById(R.id.title);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            this.textView = (TextView) findViewById;
        }

        public final TextView getTextView() {
            return this.textView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public AvatarGenerationDescriptionOptionViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new AvatarGenerationDescriptionOptionViewHolder(RecyclerExtensionKt.inflateLayout(parent, R.layout.item_avatar_description));
    }

    public final void updateData(List<String> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = CollectionsKt.toList(items);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AvatarGenerationDescriptionOptionViewHolder holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextView textView = holder.getTextView();
        textView.setText(this.items.get(i));
        Modification.INSTANCE.onTouchOpacity(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.AvatarGenerationDescriptionOptionsAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvatarGenerationDescriptionOptionsAdapter.onBindViewHolder$lambda$1$lambda$0(AvatarGenerationDescriptionOptionsAdapter.this, i, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(AvatarGenerationDescriptionOptionsAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onItemClick.invoke(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }
}
