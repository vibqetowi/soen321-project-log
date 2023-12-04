package com.ifriend.chat.new_chat.list.player;

import android.net.Uri;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AudioMedia.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioMedia;", "Ljava/io/Serializable;", "audioUrl", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "getAudioUrl", "()Landroid/net/Uri;", "Lcom/ifriend/chat/new_chat/list/player/AudioMessage;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AudioMedia implements Serializable {
    public static final int $stable = 8;
    private final Uri audioUrl;

    public /* synthetic */ AudioMedia(Uri uri, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri);
    }

    private AudioMedia(Uri uri) {
        this.audioUrl = uri;
    }

    public Uri getAudioUrl() {
        return this.audioUrl;
    }
}
