package com.ifriend.ui.recyclerView.audio.audioView;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatAudioPermission.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/audioView/ChatAudioPermission;", "", "isAudioAvailable", "", "onNoPermissionClick", "Lkotlin/Function0;", "", "(ZLkotlin/jvm/functions/Function0;)V", "()Z", "getOnNoPermissionClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatAudioPermission {
    public static final int $stable = 0;
    private final boolean isAudioAvailable;
    private final Function0<Unit> onNoPermissionClick;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatAudioPermission copy$default(ChatAudioPermission chatAudioPermission, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatAudioPermission.isAudioAvailable;
        }
        if ((i & 2) != 0) {
            function0 = chatAudioPermission.onNoPermissionClick;
        }
        return chatAudioPermission.copy(z, function0);
    }

    public final boolean component1() {
        return this.isAudioAvailable;
    }

    public final Function0<Unit> component2() {
        return this.onNoPermissionClick;
    }

    public final ChatAudioPermission copy(boolean z, Function0<Unit> function0) {
        return new ChatAudioPermission(z, function0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatAudioPermission) {
            ChatAudioPermission chatAudioPermission = (ChatAudioPermission) obj;
            return this.isAudioAvailable == chatAudioPermission.isAudioAvailable && Intrinsics.areEqual(this.onNoPermissionClick, chatAudioPermission.onNoPermissionClick);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isAudioAvailable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Function0<Unit> function0 = this.onNoPermissionClick;
        return i + (function0 == null ? 0 : function0.hashCode());
    }

    public String toString() {
        boolean z = this.isAudioAvailable;
        Function0<Unit> function0 = this.onNoPermissionClick;
        return "ChatAudioPermission(isAudioAvailable=" + z + ", onNoPermissionClick=" + function0 + ")";
    }

    public ChatAudioPermission(boolean z, Function0<Unit> function0) {
        this.isAudioAvailable = z;
        this.onNoPermissionClick = function0;
    }

    public final boolean isAudioAvailable() {
        return this.isAudioAvailable;
    }

    public final Function0<Unit> getOnNoPermissionClick() {
        return this.onNoPermissionClick;
    }
}
