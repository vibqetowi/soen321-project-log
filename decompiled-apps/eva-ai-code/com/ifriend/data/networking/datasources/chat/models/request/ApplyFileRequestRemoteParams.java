package com.ifriend.data.networking.datasources.chat.models.request;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ApplyFileRequestRemoteParams.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/request/ApplyFileRequestRemoteParams;", "", "reference", "", ViewHierarchyConstants.TAG_KEY, "meta", "Lcom/ifriend/data/networking/datasources/chat/models/request/ApplyFileRequestRemoteParams$Meta;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/datasources/chat/models/request/ApplyFileRequestRemoteParams$Meta;)V", "getMeta", "()Lcom/ifriend/data/networking/datasources/chat/models/request/ApplyFileRequestRemoteParams$Meta;", "getReference", "()Ljava/lang/String;", "getTag", "Companion", "Meta", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplyFileRequestRemoteParams {
    public static final Companion Companion = new Companion(null);
    private final Meta meta;
    private final String reference;
    private final String tag;

    public ApplyFileRequestRemoteParams(String reference, String tag, Meta meta) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.reference = reference;
        this.tag = tag;
        this.meta = meta;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getTag() {
        return this.tag;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    /* compiled from: ApplyFileRequestRemoteParams.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/request/ApplyFileRequestRemoteParams$Meta;", "", "isAudioSpeech", "", "isImageForRecognition", "(ZZ)V", "()Z", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Meta {
        private final boolean isAudioSpeech;
        private final boolean isImageForRecognition;

        public Meta() {
            this(false, false, 3, null);
        }

        public Meta(boolean z, boolean z2) {
            this.isAudioSpeech = z;
            this.isImageForRecognition = z2;
        }

        public /* synthetic */ Meta(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean isAudioSpeech() {
            return this.isAudioSpeech;
        }

        public final boolean isImageForRecognition() {
            return this.isImageForRecognition;
        }
    }

    /* compiled from: ApplyFileRequestRemoteParams.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/request/ApplyFileRequestRemoteParams$Companion;", "", "()V", "createAudio", "Lcom/ifriend/data/networking/datasources/chat/models/request/ApplyFileRequestRemoteParams;", "fileName", "", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "createImage", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ApplyFileRequestRemoteParams createAudio(String fileName, MessageTag tag) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new ApplyFileRequestRemoteParams("audio:" + fileName, tag.getValue(), new Meta(true, false, 2, null));
        }

        public final ApplyFileRequestRemoteParams createImage(String fileName, MessageTag tag) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new ApplyFileRequestRemoteParams("photo:" + fileName, tag.getValue(), new Meta(false, true, 1, null));
        }
    }
}
