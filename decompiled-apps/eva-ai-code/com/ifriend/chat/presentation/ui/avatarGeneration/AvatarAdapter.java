package com.ifriend.chat.presentation.ui.avatarGeneration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.ifriend.chat.presentation.R;
import com.ifriend.chat.presentation.ui.avatarGeneration.AvatarAdapter;
import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.ui.utils.Modification;
import com.ifriend.ui.utils.UIUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AvatarAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB=\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0016R0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R>\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/AvatarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/AvatarAdapter$AvatarVH;", "onItemClickListener", "Lkotlin/Function2;", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "Lkotlin/ParameterName;", "name", "generatedAvatar", "", "position", "", "(Lkotlin/jvm/functions/Function2;)V", "value", "", "generatedAvatars", "getGeneratedAvatars", "()Ljava/util/List;", "setGeneratedAvatars", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AvatarVH", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AvatarAdapter extends RecyclerView.Adapter<AvatarVH> {
    public static final int $stable = 8;
    private List<GeneratedAvatar> generatedAvatars;
    private final Function2<GeneratedAvatar, Integer, Unit> onItemClickListener;

    /* JADX WARN: Multi-variable type inference failed */
    public AvatarAdapter(Function2<? super GeneratedAvatar, ? super Integer, Unit> onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.onItemClickListener = onItemClickListener;
        this.generatedAvatars = CollectionsKt.emptyList();
    }

    public final List<GeneratedAvatar> getGeneratedAvatars() {
        return this.generatedAvatars;
    }

    public final void setGeneratedAvatars(List<GeneratedAvatar> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.generatedAvatars = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public AvatarVH onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_avatar, parent, false);
        Intrinsics.checkNotNull(inflate);
        return new AvatarVH(inflate, this.onItemClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AvatarVH holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.generatedAvatars.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.generatedAvatars.size();
    }

    /* compiled from: AvatarAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0002\u0010\rJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/AvatarAdapter$AvatarVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClickListener", "Lkotlin/Function2;", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "Lkotlin/ParameterName;", "name", "generatedAvatar", "", "position", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;)V", "avatarImage", "Landroid/widget/ImageView;", "item", "bind", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AvatarVH extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final ImageView avatarImage;
        private GeneratedAvatar item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarVH(View itemView, final Function2<? super GeneratedAvatar, ? super Integer, Unit> onItemClickListener) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
            itemView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.AvatarAdapter$AvatarVH$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AvatarAdapter.AvatarVH._init_$lambda$1(AvatarAdapter.AvatarVH.this, onItemClickListener, view);
                }
            });
            Modification.INSTANCE.onTouchOpacity(itemView);
            View findViewById = itemView.findViewById(R.id.image);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            this.avatarImage = (ImageView) findViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(AvatarVH this$0, Function2 onItemClickListener, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(onItemClickListener, "$onItemClickListener");
            GeneratedAvatar generatedAvatar = this$0.item;
            if (generatedAvatar != null) {
                onItemClickListener.invoke(generatedAvatar, Integer.valueOf(this$0.getAdapterPosition()));
            }
        }

        public final void bind(GeneratedAvatar generatedAvatar) {
            Intrinsics.checkNotNullParameter(generatedAvatar, "generatedAvatar");
            this.item = generatedAvatar;
            RequestOptions optionalTransform = new RequestOptions().optionalTransform(new RoundedCorners((int) UIUtils.INSTANCE.getToPx((Number) 30)));
            Intrinsics.checkNotNullExpressionValue(optionalTransform, "run(...)");
            Glide.with(this.avatarImage.getContext()).load(generatedAvatar.getImageAvatarUri()).apply((BaseRequestOptions<?>) optionalTransform).into(this.avatarImage);
        }
    }
}
