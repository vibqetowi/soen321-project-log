package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.ui.base.mvvm.BaseState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SelectGeneratedAvatarState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "generatedAvatars", "", "Lcom/ifriend/domain/models/avatar/GeneratedAvatar;", "avatarDescription", "", "tryAgainPrice", "", "isLoading", "", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/Integer;Z)V", "getAvatarDescription", "()Ljava/lang/CharSequence;", "getGeneratedAvatars", "()Ljava/util/List;", "()Z", "getTryAgainPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/Integer;Z)Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "equals", "other", "", "hashCode", "toString", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectGeneratedAvatarState extends BaseState {
    private final CharSequence avatarDescription;
    private final List<GeneratedAvatar> generatedAvatars;
    private final boolean isLoading;
    private final Integer tryAgainPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectGeneratedAvatarState copy$default(SelectGeneratedAvatarState selectGeneratedAvatarState, List list, CharSequence charSequence, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = selectGeneratedAvatarState.generatedAvatars;
        }
        if ((i & 2) != 0) {
            charSequence = selectGeneratedAvatarState.avatarDescription;
        }
        if ((i & 4) != 0) {
            num = selectGeneratedAvatarState.tryAgainPrice;
        }
        if ((i & 8) != 0) {
            z = selectGeneratedAvatarState.isLoading;
        }
        return selectGeneratedAvatarState.copy(list, charSequence, num, z);
    }

    public final List<GeneratedAvatar> component1() {
        return this.generatedAvatars;
    }

    public final CharSequence component2() {
        return this.avatarDescription;
    }

    public final Integer component3() {
        return this.tryAgainPrice;
    }

    public final boolean component4() {
        return this.isLoading;
    }

    public final SelectGeneratedAvatarState copy(List<GeneratedAvatar> generatedAvatars, CharSequence avatarDescription, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(generatedAvatars, "generatedAvatars");
        Intrinsics.checkNotNullParameter(avatarDescription, "avatarDescription");
        return new SelectGeneratedAvatarState(generatedAvatars, avatarDescription, num, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectGeneratedAvatarState) {
            SelectGeneratedAvatarState selectGeneratedAvatarState = (SelectGeneratedAvatarState) obj;
            return Intrinsics.areEqual(this.generatedAvatars, selectGeneratedAvatarState.generatedAvatars) && Intrinsics.areEqual(this.avatarDescription, selectGeneratedAvatarState.avatarDescription) && Intrinsics.areEqual(this.tryAgainPrice, selectGeneratedAvatarState.tryAgainPrice) && this.isLoading == selectGeneratedAvatarState.isLoading;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.generatedAvatars.hashCode() * 31) + this.avatarDescription.hashCode()) * 31;
        Integer num = this.tryAgainPrice;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.isLoading;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        List<GeneratedAvatar> list = this.generatedAvatars;
        CharSequence charSequence = this.avatarDescription;
        Integer num = this.tryAgainPrice;
        boolean z = this.isLoading;
        return "SelectGeneratedAvatarState(generatedAvatars=" + list + ", avatarDescription=" + ((Object) charSequence) + ", tryAgainPrice=" + num + ", isLoading=" + z + ")";
    }

    public final List<GeneratedAvatar> getGeneratedAvatars() {
        return this.generatedAvatars;
    }

    public final CharSequence getAvatarDescription() {
        return this.avatarDescription;
    }

    public final Integer getTryAgainPrice() {
        return this.tryAgainPrice;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /* compiled from: SelectGeneratedAvatarState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState$Companion;", "", "()V", "empty", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SelectGeneratedAvatarState empty() {
            return new SelectGeneratedAvatarState(CollectionsKt.emptyList(), "", null, false);
        }
    }

    public SelectGeneratedAvatarState(List<GeneratedAvatar> generatedAvatars, CharSequence avatarDescription, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(generatedAvatars, "generatedAvatars");
        Intrinsics.checkNotNullParameter(avatarDescription, "avatarDescription");
        this.generatedAvatars = generatedAvatars;
        this.avatarDescription = avatarDescription;
        this.tryAgainPrice = num;
        this.isLoading = z;
    }
}
