package com.ifriend.data.socket.generator;

import android.content.Context;
import com.ifriend.domain.models.profile.user.UserToken;
import com.ifriend.domain.storage.token.UserTokenProvider;
import com.ifriend.domain.storage.token.UserTokenStorageKt;
import com.ifriend.infrastructure.audio.player.MediaPlayerPlaybackController;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MediaPlayerPlaybackControllerGenerator.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0011\u0010\u000b\u001a\u00020\fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ifriend/data/socket/generator/MediaPlayerPlaybackControllerGenerator;", "", "context", "Landroid/content/Context;", "tokenProvider", "Lcom/ifriend/domain/storage/token/UserTokenProvider;", "(Landroid/content/Context;Lcom/ifriend/domain/storage/token/UserTokenProvider;)V", "generateHeaders", "", "", "accessToken", "invoke", "Lcom/ifriend/infrastructure/audio/player/MediaPlayerPlaybackController;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaPlayerPlaybackControllerGenerator {
    private final Context context;
    private final UserTokenProvider tokenProvider;

    public MediaPlayerPlaybackControllerGenerator(Context context, UserTokenProvider tokenProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.context = context;
        this.tokenProvider = tokenProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Continuation<? super MediaPlayerPlaybackController> continuation) {
        MediaPlayerPlaybackControllerGenerator$invoke$1 mediaPlayerPlaybackControllerGenerator$invoke$1;
        int i;
        MediaPlayerPlaybackControllerGenerator mediaPlayerPlaybackControllerGenerator;
        if (continuation instanceof MediaPlayerPlaybackControllerGenerator$invoke$1) {
            mediaPlayerPlaybackControllerGenerator$invoke$1 = (MediaPlayerPlaybackControllerGenerator$invoke$1) continuation;
            if ((mediaPlayerPlaybackControllerGenerator$invoke$1.label & Integer.MIN_VALUE) != 0) {
                mediaPlayerPlaybackControllerGenerator$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = mediaPlayerPlaybackControllerGenerator$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mediaPlayerPlaybackControllerGenerator$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UserTokenProvider userTokenProvider = this.tokenProvider;
                    mediaPlayerPlaybackControllerGenerator$invoke$1.L$0 = this;
                    mediaPlayerPlaybackControllerGenerator$invoke$1.label = 1;
                    obj = UserTokenStorageKt.current(userTokenProvider, mediaPlayerPlaybackControllerGenerator$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mediaPlayerPlaybackControllerGenerator = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mediaPlayerPlaybackControllerGenerator = (MediaPlayerPlaybackControllerGenerator) mediaPlayerPlaybackControllerGenerator$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return MediaPlayerPlaybackController.Companion.instance(mediaPlayerPlaybackControllerGenerator.context, mediaPlayerPlaybackControllerGenerator.generateHeaders(((UserToken) obj).formatted()));
            }
        }
        mediaPlayerPlaybackControllerGenerator$invoke$1 = new MediaPlayerPlaybackControllerGenerator$invoke$1(this, continuation);
        Object obj2 = mediaPlayerPlaybackControllerGenerator$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaPlayerPlaybackControllerGenerator$invoke$1.label;
        if (i != 0) {
        }
        return MediaPlayerPlaybackController.Companion.instance(mediaPlayerPlaybackControllerGenerator.context, mediaPlayerPlaybackControllerGenerator.generateHeaders(((UserToken) obj2).formatted()));
    }

    private final Map<String, String> generateHeaders(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Authorization", str);
        return hashMap;
    }
}
