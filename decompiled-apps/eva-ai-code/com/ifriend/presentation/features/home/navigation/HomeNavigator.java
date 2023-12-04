package com.ifriend.presentation.features.home.navigation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeNavigator.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\n¢\u0006\u0002\u0010\u000bJ\u001f\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006HÆ\u0003J\u001f\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\nHÆ\u0003J]\u0010\u0014\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00062\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00062\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\nHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001b\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ifriend/presentation/features/home/navigation/HomeNavigator;", "", "goToChat", "Lkotlin/Function1;", "", "", "Lcom/ifriend/ui/tools/NavigationArgAction;", "goToChatsStore", "goToConfirmEmail", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/NavigationAction;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "getGoToChat", "()Lkotlin/jvm/functions/Function1;", "getGoToChatsStore", "getGoToConfirmEmail", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeNavigator {
    public static final int $stable = 0;
    private final Function1<String, Unit> goToChat;
    private final Function1<String, Unit> goToChatsStore;
    private final Function0<Unit> goToConfirmEmail;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeNavigator copy$default(HomeNavigator homeNavigator, Function1 function1, Function1 function12, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = homeNavigator.goToChat;
        }
        if ((i & 2) != 0) {
            function12 = homeNavigator.goToChatsStore;
        }
        if ((i & 4) != 0) {
            function0 = homeNavigator.goToConfirmEmail;
        }
        return homeNavigator.copy(function1, function12, function0);
    }

    public final Function1<String, Unit> component1() {
        return this.goToChat;
    }

    public final Function1<String, Unit> component2() {
        return this.goToChatsStore;
    }

    public final Function0<Unit> component3() {
        return this.goToConfirmEmail;
    }

    public final HomeNavigator copy(Function1<? super String, Unit> goToChat, Function1<? super String, Unit> goToChatsStore, Function0<Unit> goToConfirmEmail) {
        Intrinsics.checkNotNullParameter(goToChat, "goToChat");
        Intrinsics.checkNotNullParameter(goToChatsStore, "goToChatsStore");
        Intrinsics.checkNotNullParameter(goToConfirmEmail, "goToConfirmEmail");
        return new HomeNavigator(goToChat, goToChatsStore, goToConfirmEmail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeNavigator) {
            HomeNavigator homeNavigator = (HomeNavigator) obj;
            return Intrinsics.areEqual(this.goToChat, homeNavigator.goToChat) && Intrinsics.areEqual(this.goToChatsStore, homeNavigator.goToChatsStore) && Intrinsics.areEqual(this.goToConfirmEmail, homeNavigator.goToConfirmEmail);
        }
        return false;
    }

    public int hashCode() {
        return (((this.goToChat.hashCode() * 31) + this.goToChatsStore.hashCode()) * 31) + this.goToConfirmEmail.hashCode();
    }

    public String toString() {
        Function1<String, Unit> function1 = this.goToChat;
        Function1<String, Unit> function12 = this.goToChatsStore;
        Function0<Unit> function0 = this.goToConfirmEmail;
        return "HomeNavigator(goToChat=" + function1 + ", goToChatsStore=" + function12 + ", goToConfirmEmail=" + function0 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeNavigator(Function1<? super String, Unit> goToChat, Function1<? super String, Unit> goToChatsStore, Function0<Unit> goToConfirmEmail) {
        Intrinsics.checkNotNullParameter(goToChat, "goToChat");
        Intrinsics.checkNotNullParameter(goToChatsStore, "goToChatsStore");
        Intrinsics.checkNotNullParameter(goToConfirmEmail, "goToConfirmEmail");
        this.goToChat = goToChat;
        this.goToChatsStore = goToChatsStore;
        this.goToConfirmEmail = goToConfirmEmail;
    }

    public final Function1<String, Unit> getGoToChat() {
        return this.goToChat;
    }

    public final Function1<String, Unit> getGoToChatsStore() {
        return this.goToChatsStore;
    }

    public final Function0<Unit> getGoToConfirmEmail() {
        return this.goToConfirmEmail;
    }
}
