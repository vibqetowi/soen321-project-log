package com.ifriend.chat.new_chat.backstack;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.offline.DownloadService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatBackStackChangedListener.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/new_chat/backstack/ChatBackStackChangedListener;", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "chatForegroundListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", DownloadService.KEY_FOREGROUND, "", "(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function1;)V", "onBackStackChanged", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBackStackChangedListener implements FragmentManager.OnBackStackChangedListener {
    public static final int $stable = 8;
    private final Function1<Boolean, Unit> chatForegroundListener;
    private final FragmentManager fragmentManager;

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
        FragmentManager.OnBackStackChangedListener.CC.$default$onBackStackChangeCommitted(this, fragment, z);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
        FragmentManager.OnBackStackChangedListener.CC.$default$onBackStackChangeStarted(this, fragment, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatBackStackChangedListener(FragmentManager fragmentManager, Function1<? super Boolean, Unit> chatForegroundListener) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(chatForegroundListener, "chatForegroundListener");
        this.fragmentManager = fragmentManager;
        this.chatForegroundListener = chatForegroundListener;
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public void onBackStackChanged() {
        this.chatForegroundListener.invoke(Boolean.valueOf(ChatBackStackChangedListenerKt.isChatFragmentForeground(this.fragmentManager)));
    }
}
