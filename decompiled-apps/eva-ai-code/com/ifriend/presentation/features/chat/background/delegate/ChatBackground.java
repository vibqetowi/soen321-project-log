package com.ifriend.presentation.features.chat.background.delegate;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatBackgroundDelegate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackground;", "", "uri", "Landroid/net/Uri;", "loop", "", "(Landroid/net/Uri;Z)V", "getLoop", "()Z", "getUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBackground {
    public static final int $stable = 8;
    private final boolean loop;
    private final Uri uri;

    public static /* synthetic */ ChatBackground copy$default(ChatBackground chatBackground, Uri uri, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = chatBackground.uri;
        }
        if ((i & 2) != 0) {
            z = chatBackground.loop;
        }
        return chatBackground.copy(uri, z);
    }

    public final Uri component1() {
        return this.uri;
    }

    public final boolean component2() {
        return this.loop;
    }

    public final ChatBackground copy(Uri uri, boolean z) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new ChatBackground(uri, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatBackground) {
            ChatBackground chatBackground = (ChatBackground) obj;
            return Intrinsics.areEqual(this.uri, chatBackground.uri) && this.loop == chatBackground.loop;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.uri.hashCode() * 31;
        boolean z = this.loop;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        Uri uri = this.uri;
        boolean z = this.loop;
        return "ChatBackground(uri=" + uri + ", loop=" + z + ")";
    }

    public ChatBackground(Uri uri, boolean z) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        this.loop = z;
    }

    public final boolean getLoop() {
        return this.loop;
    }

    public final Uri getUri() {
        return this.uri;
    }
}
